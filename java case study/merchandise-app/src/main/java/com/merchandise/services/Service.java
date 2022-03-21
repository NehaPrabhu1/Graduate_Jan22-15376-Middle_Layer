package com.merchandise.services;

import com.merchandise.entities.Customer;
import com.merchandise.entities.Supplier;

import java.util.*;

public class Service {
	Customer[] customerArray = new Customer[5];
	Supplier[] supplierArray = new Supplier[5];
	Set<Customer> customers = new HashSet<>();
	Set<Supplier> suppliers = new HashSet<>();
	public void saveCustomerDetails(Customer cust) {
		if(cust != null) {
			customers.add(cust);
			customers.toArray(customerArray);
		}
	}
	public List<Customer> getAllCustomers(){
		List<Customer> allCustomer = new ArrayList<>(customers);
		return allCustomer;
	}
	
	public Customer getCustomerById(int customerid) {
		Iterator<Customer> c = customers.iterator();
		while(c.hasNext()) {
			Customer cust = c.next();
			if(cust.getPartnerId() == customerid) {
				return cust;
			}
		}
		return null;
	}
	
	public void saveSupplierDetails(Supplier sup) {
		if(sup != null) {
			suppliers.add(sup);
			suppliers.toArray(supplierArray);
		}
	}
	public List<Supplier> getAllSuppliers(){
		List<Supplier> allSupplier = new ArrayList<>(suppliers);
		return allSupplier;
	}

}
