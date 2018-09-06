package kevinrogers.homeinsurance.model;

public class Property {

	private int property_value;
	private String year_built;
	private String square_feet;
	private String dwelling_style;
	private String root_material;
	private String garage_type;
	private int num_full_baths;
	private int num_half_baths;
	private byte swimming_pool;
	private String property_id;
	private int location_id;
	
	public Property() {
		
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public int getProperty_value() {
		return property_value;
	}
	public void setProperty_value(int property_value) {
		this.property_value = property_value;
	}
	public String getYear_built() {
		return year_built;
	}
	public void setYear_built(String year_built) {
		this.year_built = year_built;
	}
	public String getSquare_feet() {
		return square_feet;
	}
	public void setSquare_feet(String square_feet) {
		this.square_feet = square_feet;
	}
	public String getDwelling_style() {
		return dwelling_style;
	}
	public void setDwelling_style(String dwelling_style) {
		this.dwelling_style = dwelling_style;
	}
	public String getRoot_material() {
		return root_material;
	}
	public void setRoot_material(String root_material) {
		this.root_material = root_material;
	}
	public String getGarage_type() {
		return garage_type;
	}
	public void setGarage_type(String garage_type) {
		this.garage_type = garage_type;
	}
	public int getNum_full_baths() {
		return num_full_baths;
	}
	public void setNum_full_baths(int num_full_baths) {
		this.num_full_baths = num_full_baths;
	}
	public int getNum_half_baths() {
		return num_half_baths;
	}
	public void setNum_half_baths(int num_half_baths) {
		this.num_half_baths = num_half_baths;
	}
	public byte getSwimming_pool() {
		return swimming_pool;
	}
	public void setSwimming_pool(byte swimming_pool) {
		this.swimming_pool = swimming_pool;
	}
	public String getProperty_id() {
		return property_id;
	}
	public void setProperty_id(String property_id) {
		this.property_id = property_id;
	}
}
