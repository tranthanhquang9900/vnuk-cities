package vn.edu.vnuk.cities.model;


public class City {
	private long id;
	private String city;
	private String province;
	private long zip_code;
	
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getProvince() {
		return province;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
	public long getZip_code() {
		return zip_code;
	}
	
	public void setZip_code(long zip_code) {
		this.zip_code = zip_code;
	}
	
}
