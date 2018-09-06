package kevinrogers.homeinsurance.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kevinrogers.homeinsurance.bo.LocationBO;
import kevinrogers.homeinsurance.bo.UserBO;

/**
 * Servlet implementation class GetQuote
 */
@WebServlet("/GetQuote")
public class GetQuote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetQuote() {
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
		
		String residenceType = request.getParameter("ResidenceType");
		String addressLine1 = request.getParameter("AddressLine1");
		String addressLine2 = request.getParameter("AddressLine2");
		String state = request.getParameter("State");
		String city = request.getParameter("City");
		int zip = Integer.parseInt(request.getParameter("Zip"));
		String residenceUse = request.getParameter("ResidenceUse");
		String currentUser = (String) session.getAttribute("currentUser");
//		PrintWriter out = response.getWriter();
//		out.println(currentUser);	
		
		UserBO uBo = new UserBO();		
		LocationBO lBo = new LocationBO();			
		
		
		int userId = uBo.getIdByUser(currentUser);
		if(lBo.submitLocation(userId, residenceType, addressLine1, addressLine2, city, state, zip, residenceUse)) {
			String locID = Integer.toString(lBo.retrieveLocationID());
			session.setAttribute("locationID", locID);				
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/Homeowner.jsp");
			rd.include(request, response);
		}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
