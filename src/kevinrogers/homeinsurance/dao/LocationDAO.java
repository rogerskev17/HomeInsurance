package kevinrogers.homeinsurance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationDAO {
	
	public boolean submitLocation(int userId, String residenceType, String addressLine1, String addressLine2, String city, String state, int zip, String residenceUse) throws SQLException{
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/casestudyhomeinsurance?autoreconnect=true&useSSl=false";
		String dbUser = "root";
		String dbPassword = "root";
		
		String sql = "INSERT INTO LOCATION (users_user_id, residence_type, address_line_1, address_line_2, city, state, zip, residence_use) VALUES(?,?,?,?,?,?,?,?)";
		String col[] = {"location_id"};
		
		try {
			Class.forName(driver);			
			conn = DriverManager.getConnection(url, dbUser, dbPassword);
			ps = conn.prepareStatement(sql, col);
			
			ps.setInt(1, userId);
			ps.setString(2, residenceType);
			ps.setString(3, addressLine1);
			ps.setString(4, addressLine2);
			ps.setString(5, city);
			ps.setString(6, state);
			ps.setInt(7, zip);
			ps.setString(8, residenceUse);
			
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			
			if (rs.next()) {
				return true;
			}
			
			else {
				return false;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
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
	
	public boolean getPreviousLocationID() {
		return false;
	}
	
	public int retrieveLocationID() throws SQLException, ClassNotFoundException {
		int id = -1;
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/casestudyhomeinsurance?autoreconnect=true&useSSl=false";
		String dbUser = "root";
		String dbPassword = "root";
		
		String sql = "SELECT location_id FROM location ORDER BY location_id DESC limit 1";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, dbUser, dbPassword);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				id = rs.getInt(1);
				
				if (rs != null) {
					rs.close();
				}
				
				if(ps != null) {
					ps.close();
				}
				
				if (conn != null) {
					conn.close();
				}
				
				return id;
			}
		}
		
		finally {
			
			if (rs != null) {
				rs.close();
			}
			
			if(ps != null) {
				ps.close();
			}
			
			if (conn != null) {
				conn.close();
			}
			
		}		
		
		return id;
	}

}
