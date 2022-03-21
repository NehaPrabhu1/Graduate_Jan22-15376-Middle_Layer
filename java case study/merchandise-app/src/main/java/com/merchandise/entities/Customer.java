package com.merchandise.entities;

public class Customer extends Merchandise {
	
	private double creditLimit;
	private long phoneNo;
	private String email;
	public Customer(int partnerId, String partnerName, String city, String state, double creditLimit, long phoneNo,
			String email) {
		super(partnerId, partnerName, city, state);
		this.creditLimit = creditLimit;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return "[" + super.toString() + " : "+ this.creditLimit + " : "+this.email+" : "+this.phoneNo + "]";
	}
	@Override
	public int hashCode() {
		int result = super.hashCode();
		int creditLimitHash =(int) Double.doubleToLongBits(creditLimit);
		int phoneNoHash = (int) phoneNo;
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
