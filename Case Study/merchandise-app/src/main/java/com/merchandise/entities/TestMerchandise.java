package com.merchandise.entities;

import com.merchandise.services.Service;

public class TestMerchandise {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(1,"John","New York City","New York", 10000, "1234567890","john@gmail.com");
		Supplier s1 = new Supplier(2,"Peter","Chicago","Illionis",120000,"C-1234");
		
		Customer c2 = new Customer(3,"Jack","New York City","New York", 12000, "1234567890","jack@gmail.com");
		Supplier s2 = new Supplier(4,"Jill","Chicago","Illionis",125000,"C-1244");
		
		//Repetitive
		Customer c3 = new Customer(5,"John","New York City","New York", 10000, "1234567890","john@gmail.com");
		Supplier s3 = new Supplier(6,"Peter","Chicago","Illionis",120000,"C-1234");
		
		Customer c4 = new Customer(7,"John","New York City","New York", 10000,"1234567890","john@gmail.com");
		Supplier s4 = new Supplier(8,"Peter","Chicago","Illionis",120000,"C-1234");
		
		Customer c5 = new Customer(9,"John","New York City","New York", 10000, "1234567890","john@gmail.com");
		Supplier s5 = new Supplier(10,"Peter","Chicago","Illionis",120000,"C-1234");


		Service.saveCustomerDetails(c1);
		Service.saveCustomerDetails(c2);
		Service.saveSupplierDetails(s1);
		Service.saveSupplierDetails(s2);
		Service.saveCustomerDetails(c3);
		Service.saveSupplierDetails(s3);
		Service.saveCustomerDetails(c4);
		Service.saveSupplierDetails(s4);
		Service.saveCustomerDetails(c5);
		Service.saveSupplierDetails(s5);

		System.out.println(Service.getAllCustomers());
		System.out.println(Service.getAllSuppliers());
		
		System.out.println(Service.getCustomerById(3));
		
		
	}

}
