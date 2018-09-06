package kevinrogers.homeinsurance.bo;

import java.sql.SQLException;

import kevinrogers.homeinsurance.dao.PropertyDAO;

public class PropertyBO {
	public boolean submitPropertyDetails(int locationID, double marketValue, int yearHomeBuilt, int squareFeet, String dwellingStyle, String roofMaterial, String garageType, int numFullBaths, int numHalfBaths, byte pool) throws ClassNotFoundException, SQLException {
		PropertyDAO pDao = new PropertyDAO();
		if (pDao.submitPropertyDetails(locationID, marketValue, yearHomeBuilt, squareFeet, dwellingStyle, roofMaterial, garageType, numFullBaths, numHalfBaths, pool)) {
			return true;
		}
		else {
			return false;
		}
	}
}
