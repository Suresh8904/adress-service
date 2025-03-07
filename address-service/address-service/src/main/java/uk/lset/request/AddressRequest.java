package uk.lset.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AddressRequest {
	private String id;
	private String city;
	 private String address;
	 private String country;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	 
}
