package kevinrogers.homeinsurance.model;

//premium = rate X exposure units
//rate= (5*(dwelling/1000))/yr

//store sessions with attributes and not requests
// that way, things carry over.
//Put things in BO and DAO so that you can use them
//elsewhere

import java.sql.Date;

public class Policy {

	private int policy_id;
	private Date start_date;
	private Date end_date;
	private int term;
	private String status;
	private int quote_id;
	
	public Policy() {
		
	}
	
	public int getPolicy_id() {
		return policy_id;
	}	
	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getQuote_id() {
		return quote_id;
	}
	public void setQuote_id(int quote_id) {
		this.quote_id = quote_id;
	}
	
}
