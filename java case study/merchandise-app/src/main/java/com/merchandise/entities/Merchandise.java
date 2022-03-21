package com.merchandise.entities;

public class Merchandise {
	
	private int partnerId;
	private String partnerName;
	private String city;
	private String state;
	public Merchandise(int partnerId, String partnerName, String city, String state) {
		this.partnerId = partnerId;
		this.partnerName = partnerName;
		this.city = city;
		this.state = state;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPartnerId() {
		return partnerId;
	}
	
	public String toString() {
		return this.partnerId + " : "+this.partnerName+" : "+this.city+" : "+this.state;
	}
	
	//validate
	
	//equals
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null) 
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		Merchandise that = (Merchandise) obj;
		if(that.partnerName != null && that.city != null && that.state != null &&
			this.partnerName != null && this.city != null && this.state != null) {
			return this.partnerId == that.partnerId && this.partnerName.equalsIgnoreCase(that.partnerName)
					&& this.city.equalsIgnoreCase(that.city) && this.state.equalsIgnoreCase(that.state);
		}
		else {
			return false;
		}
	}
	
	//hashcode
	@Override
	public int hashCode() {
		int partnerNameHashCode = partnerName== null ? 0 : partnerName.hashCode();
		int cityHashCode = city == null ? 0: city.hashCode();
		int stateHashCode = state == null ? 0: state.hashCode();
		return partnerId+ partnerNameHashCode+ cityHashCode+ stateHashCode;
	}
	

}
