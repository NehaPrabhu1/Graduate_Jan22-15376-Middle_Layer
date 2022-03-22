package com.merchandise.entities;

import java.util.*;

public class Merchandise {
	//private static int generateId = 0;
	
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
	public String[] validate() {
		HashSet<String> h = new HashSet<String>();
		if(partnerId <=0) {
			h.add("Partner Id cannot be negative");
		}
		if(partnerName == null) {
			h.add("Partner Name cannot be null");
		}
		else if(partnerName.length() < 5) {
			h.add("Partner Name should have atleast 5 characters");
		}
		if(city == null) {
			h.add("City cannot be null");
		}
		else if(city.length() < 3) {
			h.add("City should have atleast 3 characters");
		}
		if(state == null) {
			h.add("State cannot be null");
		}
		else if(state.length() < 3) {
			h.add("State should have atleast 3 characters");
		}
		String[] errors = new String[10];
		h.toArray(errors);
		return errors;
	}
	
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
