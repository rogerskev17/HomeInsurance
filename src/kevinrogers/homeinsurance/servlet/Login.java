package kevinrogers.homeinsurance.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kevinrogers.homeinsurance.bo.UserBO;

/**
 * Servlet implementation class Login
 */

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
	/**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//
		//sess.setAttribute("InvalidPassword", "Invalid credentials. Please try again.");
//		RequestDispatcher rd = request.getRequestDispatcher("/JSP/Login.jsp");
//		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//        PrintWriter out = response.getWriter();
//		out.println("<html>servlet reached!</html>");
        
        //establish session w/ http session and remove error status
        HttpSession session = request.getSession(true);
        session.removeAttribute("InvalidPassword");
		
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");		
//		out.println("<html>User ID: </html>" + userId + "<html> Password: </html> " + password);
				
		//call business object to validate user
		UserBO uBo = new UserBO();
		
//		out.println("<html>code after UserBO reached!</html>");
		
		//check for database match
		try {
//			out.println("<html>code just inside try block reached!</html>");
			if(uBo.validateUser(username, password)) {
//				out.println("<html> valid password code reached!</html>");
				session.setAttribute("currentUser", username);
				
//				response.sendRedirect("./JSP/Home.jsp");				
				RequestDispatcher rd = request.getRequestDispatcher("/JSP/Home.jsp");
				rd.include(request, response);
			}
			
			else {			
//				out.println("<html>invalid password code reached!</html>");
				session.setAttribute("InvalidPassword", "Invalid credentials. Please try again.");
//				response.sendRedirect("./JSP/Login.jsp");
				RequestDispatcher rd = request.getRequestDispatcher("/JSP/Login.jsp");
				rd.include(request, response);
								
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
