package service;

import dao.DatabaseConnection;

import java.util.*;

import bean.Annotation;
import bean.Disease;
import bean.Registration;

public class Service {
	DatabaseConnection db = new DatabaseConnection();
	
	public String createUser(Registration reg){
		String result = "";
		result = db.createUser(reg);		
		return result;
	}
	
	public Registration signIn(String emailId, String mdPassword) {
		Registration reg = new Registration();
		System.out.println("in Service"+emailId+mdPassword);
		reg = db.signIn(emailId, mdPassword);
		return reg;
	}
	
	public String addAnnotation(Annotation ann){
		String result = "";
		result = db.addAnnotation(ann);
		return result;
	}
	
	/*public String addDisease(Disease disease) {
		String result = "";
		result = db.addDisease(disease);
		return result;		
	}*/
	
	public Disease[] getAllDiseases() {
		ArrayList<Disease> diseases = new ArrayList<Disease>();
		diseases = db.getAllDiseases();
		
		Disease[] arrDiseases = new Disease[diseases.size()];

		for (int i = 0; i < diseases.size(); i++) {
			arrDiseases[i] = diseases.get(i);
		}	

		return arrDiseases;
	}
	
	public Annotation[] getAllAnnotations(int bid) {
		ArrayList<Annotation> annotations = new ArrayList<Annotation>();
		annotations = db.getAllAnnotations(bid);

		Annotation[] arrAnnotation = new Annotation[annotations.size()];

		for (int i = 0; i < annotations.size(); i++) {
			arrAnnotation[i] = annotations.get(i);
		}

		return arrAnnotation;
	}
	
	
	public Registration setFlag(int bID) {
		Registration reg = new Registration();
		reg = db.setFlag(bID);
		return reg;
	}
	
	
	/*Dinesh
	 * 
	 * 
	 * */
	
	public Registration[] getAllUserDetails() {
		System.out.println("Inside service 1");
		ArrayList<Registration> registration = new ArrayList<Registration>();
		System.out.println("Inside service 2 ---- going to call dao ");
		registration = db.getAllUserDetails();
		System.out.println("Inside service 3 ----- after dao output");
		Registration[] arrRegistration = new Registration[registration.size()];

		for (int i = 0; i < registration.size(); i++) {
			arrRegistration[i] = registration.get(i);
		}

		return arrRegistration;
	}
	
	
	
	public Annotation[] diseasesForReport(int BID) {
		System.out.println("Inside service 1");
		ArrayList<Annotation> annotationList = new ArrayList<Annotation>();
		System.out.println("Inside service 2 ---- going to call dao ");
		annotationList = db.diseasesForReport(BID);
		System.out.println("Inside service 3 ----- after dao output");
		Annotation[] arrDisease = new Annotation[annotationList.size()];
		System.out.println("Inside service 4 ----- bfore converting to array ");
		for (int i = 0; i < annotationList.size(); i++) {
			arrDisease[i] = annotationList.get(i);
			System.out.println("from array in service"+arrDisease[i].getDateOfDiag());
		}
		System.out.println("Inside service 5 ------ bfore returning to servlet");
		return arrDisease;
	}
	
	/*Giftson*/
	
	public Registration getPatientDetails(int bid) {
		Registration reg = new Registration();
		System.out.println("in Service"+bid);
		reg = db.getPatientDetails(bid);
		return reg;
	}
	
	/*Dinesh*/
	
	public String deleteUser(int BID)
	{
		String result = "";
		result = db.deleteUser(BID);
		return result;	
		
	}
	
	
}
