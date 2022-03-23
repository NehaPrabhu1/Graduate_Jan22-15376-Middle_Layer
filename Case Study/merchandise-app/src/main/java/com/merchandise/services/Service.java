package com.merchandise.services;

import com.merchandise.entities.Customer;
import com.merchandise.entities.Merchandise;
import com.merchandise.entities.Supplier;
import java.util.*;

/**
 * This is a Service class used to store objects 
 * of class Customer and Supplier created by user in arrays.
 * Also used for providing list of Customers and Suppliers stored 
 * and used for searching Customer by Id.
 * @author neha15376
 *
 */

public class Service {
	
	 /*---Arrays to store customer and suppliers---*/
	static Customer[] customerArray = new Customer[5];
	static Supplier[] supplierArray = new Supplier[5];

	public static void saveCustomerDetails(Customer cust) {
		//HashSet to avoid repetitive objects
		Set<Customer> customers = new HashSet<>(); 
		
		//add existing customers in array to hashSet
		for (Customer customer : customerArray) {
			if (customer != null) {
				customers.add(customer);
			}
		}
		
		//add new customer object to hashset and convert hashset to array
		if (isValid(cust)) {
			customers.add(cust);
			customers.toArray(customerArray);
		}
		else {
			return;
		}
	}

	public static List<Customer> getAllCustomers() {
		List<Customer> allCustomer = new ArrayList<>();
		
		//add all the existing customer objects from array to the list
		for (Customer customer : customerArray) {
			if (customer != null) {
				allCustomer.add(customer);
			}
		}
		return allCustomer;
	}

	public static Customer getCustomerById(int customerid) {
		Set<Customer> customers = new HashSet<>();
		
		//add existing customers in array to hashSet
		for (Customer customer : customerArray) {
			if (customer != null) {
				customers.add(customer);
			}
		}
		Iterator<Customer> customerIterator = customers.iterator();
		
		//check for the customer of id, if found, then return
		while (customerIterator.hasNext()) {
			Customer customer = customerIterator.next();
			if (customer.getPartnerId() == customerid) {
				return customer;
			}
		}
		return null;
	}

	public static void saveSupplierDetails(Supplier sup) {
		//HashSet to avoid repetitive objects
		Set<Supplier> suppliers = new HashSet<>();
		
		//add existing suppliers in array to hashSet
		for (Supplier supplier : supplierArray) {
			if (supplier != null) {
				suppliers.add(supplier);
			}
		}
		
		//add new supplier object to hashSet and convert hashSet to array
		if (isValid(sup)) {
			suppliers.add(sup);
			suppliers.toArray(supplierArray);
		}
		else {
			return;
		}
	}

	public static List<Supplier> getAllSuppliers() {
		List<Supplier> allSupplier = new ArrayList<>();
		//add all the existing supplier objects from array to the list
		for (Supplier supplier : supplierArray) {
			if (supplier != null) {
				allSupplier.add(supplier);
			}
		}
		return allSupplier;
	}
	
	private static boolean isValid(Merchandise entity) {
		if (entity == null) {
			return false;
		}
		String[] validationErrors = entity.validate();
		int errCount = 0;

		// Display errors if any
		for (String error : validationErrors) {
			if (error != null) {
				errCount++;
			}
		}
		if(errCount == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
