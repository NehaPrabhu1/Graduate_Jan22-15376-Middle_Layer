package com.merchandise.entities;

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
