package com.merchandise.entities;

import java.util.*;

public class Customer extends Merchandise {
	
	private double creditLimit;
	private String phoneNo;
	private String email;
	public Customer(int partnerId, String partnerName, String city, String state, double creditLimit, String phoneNo,
			String email) {
		super(partnerId, partnerName, city, state);
		this.creditLimit = creditLimit;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public String[] validate() {
		String[] errors = super.validate();
		Set<String> errorSet = new HashSet<>();
		for(String error: errors) {
			errorSet.add(error);
		}
		if(creditLimit > 50000) {
			errorSet.add("Credit Limit should not be more than 50000");
		}
		String phoneNoPatter = "^[1-9]{1}[0-9]{9}";
		if(phoneNo == null) {
			errorSet.add("Phone No. should not be null");
		}
		else if(!phoneNo.matches(phoneNoPatter)) {
			errorSet.add("Phone number should be in proper format.");
		}
		String emailPattern = "^[a-zA-Z0-9._%+-]+@[A-Za-z0-9.-]+.[a-z]{2,6}";
		if(email == null) {
			errorSet.add("Email cannot be null.");
		}
		else if(!email.matches(emailPattern)) {
			errorSet.add("Provide proper email format.");
		}
		errorSet.toArray(errors);
		return errors;
	}
	
	@Override
	public String toString() {
		return "[" + super.toString() + " : "+ this.creditLimit + " : "+this.email+" : "+this.phoneNo + "]";
	}
	@Override
	public int hashCode() {
		int result = super.hashCode();
		int creditLimitHash =(int) Double.doubleToLongBits(creditLimit);
		int phoneNoHash = phoneNo == null ? 0: phoneNo.hashCode();
		int emailHashCode = email == null ? 0: email.hashCode();
		return result + creditLimitHash + phoneNoHash + emailHashCode;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj == null) 
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer that = (Customer) obj;
		if(that.email != null && this.email != null) {
			return this.creditLimit == that.creditLimit && this.email.equalsIgnoreCase(that.email) && this.phoneNo == that.phoneNo;
		}
		else {
			return false;
		}
	}
	
	
	
	

}
