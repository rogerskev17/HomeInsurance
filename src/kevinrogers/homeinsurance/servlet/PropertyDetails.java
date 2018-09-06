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

import kevinrogers.homeinsurance.bo.PropertyBO;

/**
 * Servlet implementation class PropertyDetails
 */
@WebServlet("/PropertyDetails")
public class PropertyDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PropertyDetails() {
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
		HttpSession session = request.getSession(true);
		
//		PrintWriter out = response.getWriter();
		
		double marketValue = Double.parseDouble(request.getParameter("MarketValue"));
		int yearHomeBuilt = Integer.parseInt(request.getParameter("YearHomeBuilt"));
		int squareFeet = Integer.parseInt(request.getParameter("SquareFeet"));
		String dwellingStyle = request.getParameter("DwellingStyle");
		String roofMaterial = request.getParameter("RoofMaterial");
		String garageType = request.getParameter("GarageType");
		int numFullBaths = Integer.parseInt(request.getParameter("NumFullBaths"));
		int numHalfBaths = Integer.parseInt(request.getParameter("NumHalfBaths"));
		
		String pool = request.getParameter("Pool");
		byte hasPool = 0;
		if(pool.equals("Yes")) {
			hasPool = 1;
		}
		else {
			hasPool = 0;
		}
		
		String sqFt = Integer.toString(squareFeet);
		session.setAttribute("SquareFeet", sqFt);
		
		
		String locID = (String) session.getAttribute("LocationID");
		int locationID = Integer.parseInt(locID);
//		int test = locationID + 5;
//		out.println("<html>Location ID:</html>" + locID + "<html>  </html>" + test);
		
		
		PropertyBO pBo = new PropertyBO();
		try {
			if(pBo.submitPropertyDetails(locationID, marketValue, yearHomeBuilt, squareFeet, dwellingStyle, roofMaterial, garageType, numFullBaths, numHalfBaths, hasPool)) {
				RequestDispatcher rd = request.getRequestDispatcher("/GenerateQuote");
				rd.forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
