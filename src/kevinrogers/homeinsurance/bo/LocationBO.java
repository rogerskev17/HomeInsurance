package kevinrogers.homeinsurance.bo;

import java.sql.SQLException;

import kevinrogers.homeinsurance.dao.LocationDAO;
import kevinrogers.homeinsurance.model.Location;

public class LocationBO {
	
	public boolean submitLocation(int userId, String residenceType, String addressLine1, String addressLine2, String city, String state,  int zip, String residenceUse) throws ClassNotFoundException, SQLException {
		LocationDAO lDao = new LocationDAO();
		if(lDao.submitLocation(userId, residenceType, addressLine1, addressLine2, city, state, zip, residenceUse)) {
		return true;
	}
		else {		
		return false;
		}
	}
	
	public int retrieveLocationID() throws ClassNotFoundException, SQLException {
		int id = -1;
		LocationDAO lDao = new LocationDAO();
		Location loc = new Location();
		return lDao.retrieveLocationID();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		LocationBO lBo = new LocationBO();
		String locId = Integer.toString(lBo.retrieveLocationID());
		System.out.println("locId as String: " + locId);
		int locID = Integer.parseInt(locId);
		System.out.println("\nlocID as Int: " + locID);
		int test = 5 + locID;
		System.out.println("\nTesting locID: " + test);
		
	}

}
