package com.merchandise.entities;

import com.merchandise.services.Service;

public class TestMerchandise {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(1,"John","New York City","New York", 10000, 1234567890L,"john@gmail.com");
		Supplier s1 = new Supplier(2,"Peter","Chicago","Illionis",120000,"C-1234");
		
		Customer c2 = new Customer(3,"Jack","New York City","New York", 12000, 1234567890L,"jack@gmail.com");
		Supplier s2 = new Supplier(4,"Jill","Chicago","Illionis",125000,"C-1244");
		
		//Repetitive
		Customer c3 = new Customer(5,"John","New York City","New York", 10000, 1234567890L,"john@gmail.com");
		Supplier s3 = new Supplier(6,"Peter","Chicago","Illionis",120000,"C-1234");
		
		
		Service service = new Service();
		service.saveCustomerDetails(c1);
		service.saveCustomerDetails(c2);
		service.saveSupplierDetails(s1);
		service.saveSupplierDetails(s2);
		service.saveCustomerDetails(c3);
		service.saveSupplierDetails(s3);
		System.out.println(service.getAllCustomers());
		System.out.println(service.getAllSuppliers());
		
		System.out.println(service.getCustomerById(5));
		
		
	}

}
