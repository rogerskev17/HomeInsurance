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

import kevinrogers.homeinsurance.bo.UserBO;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
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
//		doGet(request, response);
//		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(true);
		session.removeAttribute("PasswordMismatch");
		
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		String rePassword = request.getParameter("Re-enter Password");
		UserBO uBo = new UserBO();					
		
		try {
			if ((uBo.registerUser(username, password)) && (password.equals(rePassword))) {
				session.setAttribute("currentUser", username);
				RequestDispatcher rd = request.getRequestDispatcher("/JSP/Home.jsp");
				rd.include(request, response);
			}
			else {				
				session.setAttribute("PasswordMismatch", "Passwords must match.");
				RequestDispatcher rd = request.getRequestDispatcher("/JSP/RegisterUser.jsp");
				rd.include(request, response);
			}
				
		}	
		
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			}
		
	}
}
