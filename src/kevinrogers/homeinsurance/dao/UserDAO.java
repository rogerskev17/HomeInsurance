package kevinrogers.homeinsurance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kevinrogers.homeinsurance.model.User;

public class UserDAO {
	
	public boolean validateUser(String username, String credentials) throws ClassNotFoundException, SQLException
	{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;		
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/casestudyhomeinsurance?autoReconnect=true&useSSL=false";
		String dbUser = "root";
		String dbPassword = "root";
		
		String sql = "select * from users where user_name=? and password=?";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, dbUser, dbPassword);
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2,  credentials);
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				if (rs != null) {
					rs.close();
				}
				
				if(ps != null) {
					ps.close();
				}
				
				if (conn != null) {
					conn.close();
				}
				
				return true;
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
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
		
		return false;
	}
	
	public boolean registerUser(String username, String password) throws ClassNotFoundException, SQLException
	{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/casestudyhomeinsurance?autoReconnect=true&useSSL=false";
		String dbUser = "root";
		String dbPassword = "root";
		
		String sql = "INSERT INTO USERS (user_name, password, admin_role) VALUES(?,?,?)";
		String col[] = {"user_id"};
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, dbUser, dbPassword);
			ps = conn.prepareStatement(sql, col);
			ps.setString(1, username);
			ps.setString(2,  password);
//			if (admin) {
//				ps.setInt(3, 1);
//			}
//			else {
				ps.setInt(3, 0);
//			}
			
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			
			if (rs.next()) {
				return true;
			}
			
			else {
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if (rs != null) {
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
	
	public List<User> getAllUsers() throws ClassNotFoundException, SQLException {
		List<User> users = null;
		User user = new User();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/casestudyhomeinsurance?autoReconnect=true&useSSL=false";
		String dbUser = "root";
		String dbPassword = "root";
		
		String sql = "Select * from Users";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, dbUser, dbPassword);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery(sql);
			
			users = new ArrayList<User>();
			while(rs.next())
			{
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setAdmin(rs.getString(4));
				users.add(user);
			}
			
			conn.close();
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
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
		
		return users;
	}
	
	public int getIdByUser(String currentUser) throws ClassNotFoundException, SQLException
	{
		int id = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/casestudyhomeinsurance?autoReconnect=true&useSSL=false";
		String dbUser = "root";
		String dbPassword = "root";
		
		String sql = "select user_id from users where user_name = ?";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, dbUser, dbPassword);
			ps = conn.prepareStatement(sql);
			ps.setString(1, currentUser);
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
		catch(SQLException e)
		{
			e.printStackTrace();
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