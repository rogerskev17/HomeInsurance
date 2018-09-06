package kevinrogers.homeinsurance.bo;

import java.sql.SQLException;

import kevinrogers.homeinsurance.dao.UserDAO;
import kevinrogers.homeinsurance.model.User;

public class UserBO {
	
	//Use the BOs to store the data to send to the DAO.
	//That way, you can access the data without
	//having to make on-the-fly calcuations
	
	public boolean registerUser(String name, String pw ) throws ClassNotFoundException, SQLException {		
		User u = new User(name, pw);
		UserDAO user = new UserDAO();
		return user.registerUser(name, pw);
	}
	
	public boolean validateUser(String name, String pw) throws ClassNotFoundException, SQLException {	
		UserDAO user = new UserDAO();		
		return user.validateUser(name, pw);
	}
	
	public int getIdByUser(String currentUser) throws ClassNotFoundException, SQLException {
		int id = 0;
		UserDAO user = new UserDAO();
		id = user.getIdByUser(currentUser);
		return id;
	}
	
//	public List<User> getAllUsers()
//	{
//		List<User> users = null;
//	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		UserBO uBo = new UserBO();
		UserDAO uDao = new UserDAO();
		
		String currentUser = "Kevin";
		System.out.println(uDao.getIdByUser(currentUser));
		
	}
	
}
