package kevinrogers.homeinsurance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PropertyDAO {
	public boolean submitPropertyDetails(int locationID, double marketValue, int yearHomeBuilt, int squareFeet, String dwellingStyle, String roofMaterial, String garageType, int numFullBaths, int numHalfBaths, byte pool) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/casestudyhomeinsurance?autoreconnect=true&useSSl=false";
		String dbUser = "root";
		String dbPassword = "root";
		
		String sql = "INSERT INTO property (location_location_id, property_value, year_built, square_feet, dwelling_style, roof_material, garage_type, num_full_baths, num_half_baths, swimming_pool) VALUES(?,?,?,?,?,?,?,?,?,?)";
		String col[] = {"property_id"};
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, dbUser, dbPassword);
			ps = conn.prepareStatement(sql, col);
			
			ps.setInt(1, locationID);
			ps.setDouble(2, marketValue);
			ps.setInt(3, yearHomeBuilt);
			ps.setInt(4, squareFeet);
			ps.setString(5, dwellingStyle);
			ps.setString(6, roofMaterial);
			ps.setString(7, garageType);
			ps.setInt(8, numFullBaths);
			ps.setInt(9, numHalfBaths);
			ps.setByte(10, pool);
			
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			
			if (rs.next()) {
				return true;
			}
			
			else {
				return false;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			if (rs!= null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return false;
	}
}
