package kevinrogers.homeinsurance.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kevinrogers.homeinsurance.bo.HomeownerBO;
import kevinrogers.homeinsurance.bo.UserBO;

/**
 * Servlet implementation class Homeowner
 */
@WebServlet("/Homeowner")
public class Homeowner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Homeowner() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doGet(request, response);
			HttpSession session = request.getSession(true);
		
			String currentUser = (String) session.getAttribute("currentUser");
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
		
			String birthDateYear = request.getParameter("birthDateYear");
			String birthDateMonth = request.getParameter("birthDateMonth");
			String birthDateDay = request.getParameter("birthDateDay");		
			String birthDate = birthDateYear + "-" + birthDateMonth + "-" + birthDateDay;
		
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");		
			java.util.Date date = dateFormat.parse(birthDate);		
			java.sql.Date sqlBirthDate = new java.sql.Date(date.getTime());		
		
			String retired = request.getParameter("retired");		
			byte isRetired = 0;
			if ("Yes".equals(retired)) {
				isRetired = 1;
			}
			else {
				isRetired = 0;
			}
		
			int ssn = Integer.parseInt(request.getParameter("ssn"));
				
			String eAddress = request.getParameter("emailAddress");
		
			HomeownerBO hBo = new HomeownerBO();
			UserBO uBo = new UserBO();
			try {
				int userId = uBo.getIdByUser(currentUser);
				if(hBo.submitHomeowner(userId, firstName, lastName, sqlBirthDate, isRetired, ssn, eAddress)) {
					RequestDispatcher rd = request.getRequestDispatcher("/JSP/PropertyDetails.jsp");
					rd.include(request, response);
				}
			} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
	}

}
