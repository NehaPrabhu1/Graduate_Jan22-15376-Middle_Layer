package com.merchandise.services;

import com.merchandise.entities.Customer;
import com.merchandise.entities.Supplier;

import java.util.*;

public class Service {
	Customer[] customerArray = new Customer[5];
	Supplier[] supplierArray = new Supplier[5];

	public void saveCustomerDetails(Customer cust) {
		Set<Customer> customers = new HashSet<>();
		for (Customer customer : customerArray) {
			if (customer != null) {
				customers.add(customer);
			}
		}
		if (cust != null) {
			customers.add(cust);
			customers.toArray(customerArray);
		}
	}

	public List<Customer> getAllCustomers() {
		List<Customer> allCustomer = new ArrayList<>();
		for (Customer customer : customerArray) {
			if (customer != null) {
				allCustomer.add(customer);
			}
		}
		return allCustomer;
	}

	public Customer getCustomerById(int customerid) {
		Set<Customer> customers = new HashSet<>();
		for (Customer customer : customerArray) {
			if (customer != null) {
				customers.add(customer);
			}
		}
		Iterator<Customer> customerIterator = customers.iterator();
		while (customerIterator.hasNext()) {
			Customer customer = customerIterator.next();
			if (customer.getPartnerId() == customerid) {
				return customer;
			}
		}
		return null;
	}

	public void saveSupplierDetails(Supplier sup) {
		Set<Supplier> suppliers = new HashSet<>();
		for (Supplier supplier : supplierArray) {
			if (supplier != null) {
				suppliers.add(supplier);
			}
		}
		if (sup != null) {
			suppliers.add(sup);
			suppliers.toArray(supplierArray);
		}
	}

	public List<Supplier> getAllSuppliers() {
		List<Supplier> allSupplier = new ArrayList<>();
		for (Supplier supplier : supplierArray) {
			if (supplier != null) {
				allSupplier.add(supplier);
			}
		}
		return allSupplier;
	}

}
