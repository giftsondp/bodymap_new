package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Service;
import bean.Annotation;
import bean.Disease;
import bean.Registration;


/**
 * Servlet implementation class GetAllAnnotations
 */
@WebServlet("/GetAllAnnotationsAction")
public class GetAllAnnotationsAction extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetAllAnnotationsAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Service service = new Service();
		
		Annotation[] annotation;
		Registration reg = new Registration();
		
		System.out.println("Servlet");
		
		int bid = Integer.parseInt(request.getParameter("bid"));
		String page=request.getParameter("page");
		Disease[] listOfDiseases;
		
		System.out.println("inservlet"+bid+page);
		
			/*to display diseases on the body map for both pages doc view and doc edit*/
			annotation = service.diseasesForReport(bid);
			
			/*to display side profile panel*/
			reg=service.getPatientDetails(bid);
			
			/*to be able to annotate after searching for a person, else in modal diseases will not populate*/
			listOfDiseases = service.getAllDiseases();
			
			
			
			System.out.println("inservlet Return");
			
			request.setAttribute("annotation", annotation);
			request.setAttribute("reg", reg);
			request.setAttribute("listOfDiseases", listOfDiseases);
			
			
			if(page.equals("view"))
				
			{
				String nextPage = "/DoctorViewMode.jsp";
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
				dispatcher.forward(request, response);
				
				
			}
			else if(page.equals("edit"))
			{
			
				String nextPage = "/DoctorEditMode.jsp";
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
				dispatcher.forward(request, response);
				
			}
			else if(page.equals("DPR"))
			{
			
				String nextPage = "/DoctorPrintReport.jsp";
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
				dispatcher.forward(request, response);
				
			}

			
		
	}
}
