package kevinrogers.homeinsurance.bo;

import java.sql.SQLException;

import kevinrogers.homeinsurance.dao.HomeownerDAO;
import kevinrogers.homeinsurance.dao.LocationDAO;

public class HomeownerBO {
	
	public boolean submitHomeowner(int userId, String firstName, String lastName, java.sql.Date birthDate, byte retired, int ssn, String emailAddress) throws ClassNotFoundException, SQLException {
		HomeownerDAO hDao = new HomeownerDAO();
		if(hDao.submitHomeowner(userId, firstName, lastName, birthDate, retired, ssn, emailAddress))
		{
		return true;
	}
		else {		
		return false;
		}
	}
}
