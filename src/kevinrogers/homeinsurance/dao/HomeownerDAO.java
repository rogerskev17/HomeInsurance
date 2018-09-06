package kevinrogers.homeinsurance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HomeownerDAO {

public boolean submitHomeowner(int userId, String firstName, String lastName, java.sql.Date birthDate, byte retired, int ssn, String emailAddress) throws SQLException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/casestudyhomeinsurance?autoreconnect=true&useSSl=false";
		String dbUser = "root";
		String dbPassword = "root";
		
		String sql = "INSERT INTO HOMEOWNERS (users_user_id, first_name, last_name, birth_date, retired, ssn, email_address) VALUES(?,?,?,?,?,?,?)";		
		String col[] = {"homeowner_id"};
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, dbUser, dbPassword);
			ps = conn.prepareStatement(sql, col);
			
			ps.setInt(1, userId);
			ps.setString(2, firstName);
			ps.setString(3, lastName);
			ps.setDate(4, birthDate);
			ps.setByte(5, retired);
			ps.setInt(6, ssn);
			ps.setString(7, emailAddress);
			
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
