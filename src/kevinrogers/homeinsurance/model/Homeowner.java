package kevinrogers.homeinsurance.model;

import java.sql.Timestamp;

public class Homeowner {
	
	private int homeowner_id;
	private String first_name;
	private String last_name;
	private Timestamp birth_date;
	private int retired;
	private int ssn;
	private int user_id;
	
	public Homeowner() {
		
	}

	public int getHomeowner_id() {
		return homeowner_id;
	}

	public void setHomeowner_id(int homeowner_id) {
		this.homeowner_id = homeowner_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getRetired() {
		return retired;
	}

	public void setRetired(int retired) {
		this.retired = retired;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}	
	
}
