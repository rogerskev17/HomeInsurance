package kevinrogers.homeinsurance.model;

public class Quote {

	private double monthly_premium;
	private double dwelling_coverage;
	private double detached_structures;
	private double personal_property;
	private double living_expenses;
	private double medical_expenses;
	private double deductible;
	private int quote_id;
	private int location_id;
	
	public Quote() {
		
	}
	
	public double getMonthly_premium() {
		return monthly_premium;
	}
	public void setMonthly_premium(double monthly_premium) {
		this.monthly_premium = monthly_premium;
	}
	public double getDwelling_coverage() {
		return dwelling_coverage;
	}
	public void setDwelling_coverage(double dwelling_coverage) {
		this.dwelling_coverage = dwelling_coverage;
	}
	public double getDetached_structures() {
		return detached_structures;
	}
	public void setDetached_structures(double detached_structures) {
		this.detached_structures = detached_structures;
	}
	public double getPersonal_property() {
		return personal_property;
	}
	public void setPersonal_property(double personal_property) {
		this.personal_property = personal_property;
	}
	public double getLiving_expenses() {
		return living_expenses;
	}
	public void setLiving_expenses(double living_expenses) {
		this.living_expenses = living_expenses;
	}
	public double getMedical_expenses() {
		return medical_expenses;
	}
	public void setMedical_expenses(double medical_expenses) {
		this.medical_expenses = medical_expenses;
	}
	public double getDeductible() {
		return deductible;
	}
	public void setDeductible(double deductible) {
		this.deductible = deductible;
	}
	public int getQuote_id() {
		return quote_id;
	}
	public void setQuote_id(int quote_id) {
		this.quote_id = quote_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	
}
