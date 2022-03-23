package com.merchandise.entities;

import java.util.*;

/**
 * This is Merchandise class which is a base class.
 * @author neha15376
 *
 */

public abstract class Merchandise {
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
	
	//validate
	public String[] validate() {
		HashSet<String> errorSet = new HashSet<String>();
		if(partnerId <=0) {
			errorSet.add("Partner Id cannot be negative");
		}
		if(partnerName == null) {
			errorSet.add("Partner Name cannot be null");
		}
		else if(partnerName.length() < 5) {
			errorSet.add("Partner Name should have atleast 5 characters");
		}
		if(city == null) {
			errorSet.add("City cannot be null");
		}
		else if(city.length() < 3) {
			errorSet.add("City should have atleast 3 characters");
		}
		if(state == null) {
			errorSet.add("State cannot be null");
		}
		else if(state.length() < 3) {
			errorSet.add("State should have atleast 3 characters");
		}
		String[] errors = new String[10];
		errorSet.toArray(errors);
		return errors;
	}
	
	@Override
	public String toString() {
		return this.partnerId + " : "+this.partnerName+" : "+this.city+" : "+this.state;
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
	
	//hashCode
	@Override
	public int hashCode() {
		int partnerNameHashCode = partnerName== null ? 0 : partnerName.hashCode();
		int cityHashCode = city == null ? 0: city.hashCode();
		int stateHashCode = state == null ? 0: state.hashCode();
		return partnerId+ partnerNameHashCode+ cityHashCode+ stateHashCode;
	}
	

}