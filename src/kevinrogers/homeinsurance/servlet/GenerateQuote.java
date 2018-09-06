package kevinrogers.homeinsurance.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.text.DecimalFormat;
import java.text.ParseException;
/**
 * Servlet implementation class GenerateQuote
 */
@WebServlet("/GenerateQuote")
public class GenerateQuote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerateQuote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			int quoteID = 1;
			HttpSession session = request.getSession(true);
			String sqFt = (String) session.getAttribute("SquareFeet");
			int squareFeet = Integer.parseInt(sqFt);
		
			DecimalFormat df = new DecimalFormat("0.00");
		
			double dwellingCoverage = squareFeet * 90;
			String dwellingCoverageHundredths = df.format(dwellingCoverage);
			double roundedDwellingCoverage = (Double)df.parse(dwellingCoverageHundredths);
		
			double premium = dwellingCoverage * 0.15;
			String premiumHundredths = df.format(premium);
			double roundedPremium = (Double)df.parse(premiumHundredths);
			
			double detachedStructures = dwellingCoverage * 0.1;
			String detachedStructuresHundredths = df.format(detachedStructures);
			double roundedDetachedStructures = (Double)df.parse(detachedStructuresHundredths);
			
			double personalProperty = dwellingCoverage * 0.07;
			String personalPropertyHundredths = df.format(personalProperty);
			double roundedPersonalProperty = (Double)df.parse(personalPropertyHundredths);
			
			double additionalExpenses = dwellingCoverage * 0.2;
			String additionalExpensesHundredths = df.format(additionalExpenses);
			double roundedAdditionalExpenses = (Double)df.parse(additionalExpensesHundredths);
			
			double medicalExpense = 5000.00;
			double deductible = 250.00;
			
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/CoverageDetails.jsp");
			rd.forward(request, response);
		
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			finally {
				
							
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
