package com.merchandise.entities;

import java.util.HashSet;
import java.util.Set;

/**
 * This is Supplier class used to create Supplier objects.
 * @author neha15376
 *
 */

public class Supplier extends Merchandise {
	
	private double creditBalance;
	private String drivingLicenseNumber;
	
	public Supplier(int partnerId, String partnerName, String city, String state, double creditBalance, String drivingLicenseNumber) {
		super(partnerId, partnerName, city, state);
		this.creditBalance = creditBalance;
		this.drivingLicenseNumber = drivingLicenseNumber;
	}

	public double getCreditBalance() {
		return creditBalance;
	}

	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}
	
	
	@Override
	public String[] validate() {
		String[] errors = super.validate();
		Set<String> errorSet = new HashSet<>();
		for(String error: errors) {
			errorSet.add(error);
		}
		String drivingLicenseNumberPattern = "^[A-Z]{2}[0-9]{2}[0-9]{4}[0-9]{7}";
		
		if(creditBalance > 175000) {
			errorSet.add("Credit Balance should not be more than 175000");
		}
		if(drivingLicenseNumber == null) {
			errorSet.add("Driving license number should not be null.");
		}
		else if(!drivingLicenseNumber.matches(drivingLicenseNumberPattern)) {
			errorSet.add("Provide proper driving license number.");
		}
		errorSet.toArray(errors);
		return errors;
	}
	
	@Override
	public String toString() {
		return "["+ super.toString()+" : "+this.creditBalance+" : "+this.drivingLicenseNumber+"]";
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		int creditBalanceHashCode = (int)Double.doubleToLongBits(creditBalance);
		int drivingLicenseNumberHashCode = drivingLicenseNumber == null ? 0 : drivingLicenseNumber.hashCode();
		return result + creditBalanceHashCode + drivingLicenseNumberHashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if(obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Supplier that = (Supplier) obj;
		if(that.drivingLicenseNumber != null) {
			return this.creditBalance == that.creditBalance && this.drivingLicenseNumber.equalsIgnoreCase(that.drivingLicenseNumber);
		}
		else {
			return false;
		}
	}
	
	

}
