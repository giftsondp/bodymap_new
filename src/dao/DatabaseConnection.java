package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import javax.naming.*;
import javax.sql.*;

import bean.Annotation;
import bean.Disease;
import bean.Registration;

public class DatabaseConnection {
	Connection con = null;
	static ResultSet rs = null;
	Statement stmt = null;

	
	/*Uncomment when deployin in cloudbees*/
	/*public DatabaseConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bodymap", "root",
					"12345");
			
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mydb");
			 con = ds.getConnection();
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/CMPE297", "root",
					"root");
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	public DatabaseConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bodymap", "root",
					"12345");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	/* Sud start */

	public String createUser(Registration objUser) {
		String result = "";
		int rowcount;
		String bodyMap="No";

		try {
			// Check if a user with the same email already exists.
			
			Random rnd = new Random();
			int bID = 100000 + rnd.nextInt(900000);
			
			PreparedStatement stmt = con
					.prepareStatement("SELECT BID FROM registration WHERE Email=?");
			stmt.setString(1, objUser.getEmail());
			System.out.println(stmt.toString());
			rs = stmt.executeQuery();
			rs.last();
			rowcount = rs.getRow();
			if (rowcount > 0) {
				result = "The email ID is already registered. Please try another email ID";
			} else {
				// If the user does not exist, create a new user.
				String query = "INSERT INTO `registration`(`BID`,`FirstName`,`LastName`,"
						+ "`Age`,`Gender`,`Email`,`Password`,`BodyMap`,`Role`)"
						+ "VALUES('" + bID + "','" + objUser.getFirstName() + "', '"
						+ objUser.getLastName() + "', '"
						+ objUser.getAge() + "', '"
						+ objUser.getGender() + "', '" 
						+ objUser.getEmail() + "', MD5('"
						+ objUser.getPassword() + "'), '"
						+ bodyMap + "', '"
						+ objUser.getRole() + "');";
				
				rowcount = stmt.executeUpdate(query);

				if (rowcount > 0) {
					result = "true";
				} else {
					result = "false: The data could not be inserted into the database";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public Registration signIn(String emailId, String mdPassword) {
		ResultSet rs;
		Registration objLoggedInUser = new Registration();
		try {
			System.out.println("in DAO"+emailId+mdPassword);
			PreparedStatement stmt = con
					.prepareStatement("SELECT * FROM registration WHERE Email=? and Password=MD5(?)");
			stmt.setString(1, emailId);
			stmt.setString(2, mdPassword);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				String strPass = rs.getString("Password");
				
				System.out.println("insidewhile"+strPass);

		/*		if (strPass.equals(mdPassword)) {*/
					
			/*		System.out.println("equals"+strPass+"=="+mdPassword);*/
				/*	int bID = rs.getInt("BID");
					System.out.println(bID);
					objLoggedInUser.setBID(bID);*/
					
					objLoggedInUser.setFirstName(rs.getString("FirstName"));
					objLoggedInUser.setLastName(rs.getString("LastName"));
					objLoggedInUser.setAge(rs.getInt("Age"));
					objLoggedInUser.setBID(rs.getInt("BID"));
					objLoggedInUser.setBodyMap(rs.getString("BodyMap"));
					objLoggedInUser.setEmail(rs.getString("Email"));
					objLoggedInUser.setGender(rs.getString("Gender"));
					objLoggedInUser.setRole(rs.getString("Role"));
					
					
					
					System.out.println(objLoggedInUser.getLastName());
					return objLoggedInUser;
				/*}
				else
				{*/
					
					
				/*}*/				
			}
			
			objLoggedInUser=null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objLoggedInUser;

	}

	public String addAnnotation(Annotation ann) {

		Random rnd = new Random();
		int annID = rnd.nextInt(900000);

		String result = "";
		int rowcount;

		try {
			// Check if disease has been entered at specific co-ordinate.
			PreparedStatement stmt = con
					.prepareStatement("SELECT AnnotationID FROM annotation WHERE CoordinateX=? AND CoordinateY=? AND BID=?;");
			stmt.setFloat(1, ann.getX_Coord());
			stmt.setFloat(2, ann.getY_Coord());
			stmt.setFloat(3, ann.getBID());
			System.out.println(stmt.toString());
			rs = stmt.executeQuery();
			rs.last();
			rowcount = rs.getRow();
			if (rowcount > 0) {
				result = "A diesase has already been entered in this co-ordinate...";
			} else {
				// If the disease has not been entered
				String query = "INSERT INTO `annotation`(`AnnotationID`, `CoordinateX`,`CoordinateY`,"
						+ "`DateOfDiagnosis`,`DoctorID`,`DiseaseCode`,`DiseaseDescription`,`BID`)"
						+ "VALUES('" + annID +"', '"
						+ ann.getX_Coord() + "', '"
						+ ann.getY_Coord() + "', '"
						+ ann.getDateOfDiag() + "', '"
						+ ann.getDoctorId() + "', '"
						+ ann.getDiseaseCode()	+ "', '"
						+ ann.getDiseaseDesc() + "', '"
						+ ann.getBID() + "');";

				rowcount = stmt.executeUpdate(query);

				if (rowcount > 0) {
					result = "true";
				} else {
					result = "false: The data could not be inserted into the database";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/*public String addDisease(Disease disease) {
		String result = "";
		int rowcount;

		try {
			// Check if disease already exists in DB
			PreparedStatement stmt = con
					.prepareStatement("SELECT DiseaseCode FROM disease WHERE DiseaseCode=?");
			stmt.setString(1, disease.getDiseaseCode());
			System.out.println(stmt.toString());
			rs = stmt.executeQuery();
			rs.last();
			rowcount = rs.getRow();
			if (rowcount > 0) {
				result = "A diesase with saem Code already exists...";
			} else {
				// If the disease does not exist
				String query = "INSERT INTO `disease`(`DiseaseID`,`DiseaseDescription`)"
						+ "VALUES('" + disease.getDiseaseCode() + "', '"
						+ disease.getDiseaseName() + "');";
				
				rowcount = stmt.executeUpdate(query);

				if (rowcount > 0) {
					result = "true";
				} else {
					result = "false: The data could not be inserted into the database";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}*/

	public ArrayList<Disease> getAllDiseases() {
		String result = "";

		ArrayList<Disease> diseases = new ArrayList<Disease>();
		try {
			// Retrieve all diseases from the DB
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM disease;");
			ResultSet rs = stmt.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					Disease d = new Disease();
					d.setDiseaseCode(rs.getString("DiseaseCode"));
					d.setDiseaseName(rs.getString("DiseaseName"));
					diseases.add(d);
				}

				return diseases;
			} else {
				result = "No diseases found in DB";
				System.out.println(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public ArrayList<Annotation> getAllAnnotations(int bid) {
		String result = "";

		ArrayList<Annotation> annotations = new ArrayList<Annotation>();
		try {
			// Retrieve all annotations for particular user
			PreparedStatement stmt = con
					.prepareStatement("SELECT * FROM annotation WHERE BID=?");
			stmt.setInt(1, bid);

			ResultSet rs = stmt.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					Annotation ann = new Annotation();
					ann.setAnnotationID(rs.getInt("AnnotationID"));
					ann.setX_Coord(rs.getFloat("CoordinateX"));
					ann.setY_Coord(rs.getFloat("CoordinateY"));
					ann.setDateOfDiag(rs.getString("DateOfDiagnosis"));
					ann.setDoctorId(rs.getInt("DoctorID"));
					ann.setDiseaseCode(rs.getString("DiseaseCode"));
					ann.setDiseaseDesc(rs.getString("DiseaseDescription"));
					ann.setBID(rs.getInt("BID"));

					annotations.add(ann);
				}

				return annotations;
			} else {
				result = "No diseases found in DB";
				System.out.println(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	// Sud end
	
	
	/*
	 * Giftson 
	 * setFlag() 
	 * To set the flag(BodyMap) to Yes after clicking "Create Body Map" button in DoctorLandingPage.jsp
	 * */
	public Registration setFlag(int bID) {
		ResultSet rs1;
		Registration objPatient = new Registration();
		try {
			
			PreparedStatement stmt = con.prepareStatement("Update registration SET BodyMap=? WHERE BID=?");
			stmt.setString(1, "Yes");
			stmt.setInt(2, bID);
			
			stmt.executeUpdate();
			

				/*String strPass = rs.getString("Password");*/
				PreparedStatement stmt1 = con.prepareStatement("SELECT * FROM registration WHERE BID=?");
				stmt1.setInt(1, bID);
				rs1 = stmt1.executeQuery();
				while (rs1.next()) {
					
					objPatient.setBID(rs1.getInt("BID"));
					objPatient.setFirstName(rs1.getString("firstName"));
					objPatient.setLastName(rs1.getString("lastName"));
					objPatient.setAge(rs1.getInt("Age"));
					objPatient.setGender(rs1.getString("gender"));
					objPatient.setEmail(rs1.getString("email"));				
				
			

			
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objPatient;

	}
	
/*
 * Dinesh 
 * 
 * */	
	
	public ArrayList<Registration> getAllUserDetails() {
		String result = "";

		ArrayList<Registration> registration = new ArrayList<Registration>();
		try {
			System.out.println("inside dao ----------1");
			PreparedStatement stmt = con
					.prepareStatement("SELECT * FROM registration WHERE BodyMap=?");
			stmt.setString(1,"No");
			System.out.println("inside dao 2 - after executing prepared stmt");

			ResultSet rs = stmt.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					Registration reg = new Registration();
					reg.setFirstName(rs.getString("FirstName"));
					System.out.println(rs.getString("FirstName"));
					reg.setLastName(rs.getString("LastName"));
					System.out.println(rs.getString("LastName"));
					reg.setAge(rs.getInt("Age"));
					System.out.println(rs.getInt("Age"));
					reg.setBID(rs.getInt("BID"));
					System.out.println(rs.getInt("BID"));
					reg.setBodyMap(rs.getString("BodyMap"));
					System.out.println(rs.getString("BodyMap"));
					reg.setEmail(rs.getString("Email"));
					System.out.println(rs.getString("Email"));
					reg.setGender(rs.getString("Gender"));
					System.out.println(rs.getString("Gender"));
					reg.setPassword(rs.getString("Password"));
					System.out.println(rs.getString("Password"));
					reg.setRole(rs.getString("Role"));
					System.out.println(rs.getString("Role"));
					registration.add(reg);
				}

				return registration;
			} else {
				result = "No user details found in DB";
				System.out.println(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

/*
*
*Dinesh 
*DiseasesForReport
*
*
*/
	
	public ArrayList<Annotation> diseasesForReport(int BID) {
		String result = "";

		ArrayList<Annotation> annList = new ArrayList<Annotation>();
		try {
			System.out.println("inside dao ----------1");
			PreparedStatement stmt = con
					.prepareStatement("SELECT annotation.AnnotationID, annotation.CoordinateX, annotation.Coordinatey, annotation.DiseaseDescription, annotation.DiseaseCode, annotation.DateOfDiagnosis, annotation.BID, disease.DiseaseName FROM annotation INNER JOIN disease on (annotation.DiseaseCode=disease.DiseaseCode) where annotation.BID=?");
			System.out.println("inside dao 2 - after executing prepared stmt");
			stmt.setInt(1, BID);

			ResultSet rs = stmt.executeQuery();
			
					
			/*PreparedStatement stmt1 = con
					.prepareStatement("SELECT DiseaseName FROM disease WHERE DiseaseCode=?");
			stmt1.setString(1,"");
			System.out.println("inside dao 2 - after executing prepared stmt");
			ResultSet rs1 = stmt1.executeQuery();*/
			
			
			
			if (rs != null) {
				while (rs.next()) {
					Annotation ann = new Annotation();
					
					ann.setDiseaseCode(rs.getString("DiseaseCode"));
					System.out.println(rs.getString("DiseaseCode"));
					
					ann.setDiseaseDesc(rs.getString("DiseaseDescription"));
					System.out.println(rs.getString("DiseaseDescription"));
					
					ann.setDateOfDiag(rs.getString("DateOfDiagnosis"));
					System.out.println(rs.getString("DateOfDiagnosis"));
					
					ann.setBID(rs.getInt("BID"));
					System.out.println(rs.getInt("BID"));
					
					ann.setExtraDiseaseName(rs.getString("DiseaseName"));	
					System.out.println("dis name"+rs.getString("DiseaseName"));
					
					
					ann.setAnnotationID(rs.getInt("AnnotationID"));
					ann.setX_Coord(rs.getFloat("CoordinateX"));
					ann.setY_Coord(rs.getFloat("CoordinateY"));
						
					
					/*		if(rs1 != null)
					{
						while (rs1.next())
						{
							
							
						}
					}*/
					
					annList.add(ann);
				}

				return annList;
			} else {
				result = "No user details found in DB";
				System.out.println(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	

	
	/*Giftson
	 * 
	 * Gettin Patient details
	 * 
	 * 
	 * */
	
	public Registration getPatientDetails(int bid) {
		ResultSet rs;
		Registration objPatient = new Registration();
		try {
			System.out.println("in DAO"+bid);
			PreparedStatement stmt = con
					.prepareStatement("SELECT * FROM registration WHERE BID=?");
			stmt.setInt(1, bid);
		
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				objPatient.setFirstName(rs.getString("FirstName"));
				objPatient.setLastName(rs.getString("LastName"));
				objPatient.setAge(rs.getInt("Age"));
				objPatient.setBID(rs.getInt("BID"));
				objPatient.setBodyMap(rs.getString("BodyMap"));
				objPatient.setEmail(rs.getString("Email"));
				objPatient.setGender(rs.getString("Gender"));
				objPatient.setRole(rs.getString("Role"));
				
				/*Testing*/
				System.out.println(objPatient.getLastName());
				
			return objPatient;
					
			}
			
			objPatient=null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objPatient;

	}
	
	/*Dinesh*/
	
	public String deleteUser(int BID) {
		// TODO Auto-generated method stub
		
		String result = "";


		try {
			// Check if a user with the same email already exists.
			PreparedStatement stmt = con
					.prepareStatement("delete from registration where BID=?");
			stmt.setInt(1,BID);
			int res = stmt.executeUpdate();
			if (res > 0) {
				result = "Success";
			} else {
			result="failure- BID not present";	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		}

	
	
	
	
}