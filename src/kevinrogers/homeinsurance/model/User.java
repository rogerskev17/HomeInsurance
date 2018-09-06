package kevinrogers.homeinsurance.model;

public class User {
	private int userId;
	private String userName;
	private String password;
	private String admin;
	
	public User() {
		
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		this.admin = "user";
	}
	
	public User(User user)
	{
		this.userId = user.userId;
		this.userName = user.password;
		this.password = user.password;
		this.admin = user.admin;
	}
	
	public User(int userId, String userName, String password, String admin) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.admin = admin;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}	
}
