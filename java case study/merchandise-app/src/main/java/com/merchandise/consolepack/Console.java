package com.merchandise.consolepack;

import java.util.Scanner;

import com.merchandise.entities.Customer;
import com.merchandise.entities.Supplier;
import com.merchandise.services.Service;

public class Console {
	
	static Service service = new Service();
	
	public static void main(String[] args) {

		char choice;
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.println("\n========== Choose one of the following options ================");
			System.out.println("a. Add Customer");
			System.out.println("b. Add Supplier");
			System.out.println("c. Display Report");
			System.out.println("d. Search");
			System.out.println("e. Exit");
			System.out.println("================================================================");
			System.out.print("Enter your choice: ");
			choice = sc.next().charAt(0);
			switch(choice) {
			case 'a': System.out.println("\n=== For adding customer ===");
						createCustomer();
						break;
			case 'b': System.out.println("\n=== For adding Supplier ===");
						createSupplier();
			  			break;
			case 'c': System.out.println("\nList of Customers: ");
						System.out.println(service.getAllCustomers());
						System.out.println("\nList of Suppliers");
						System.out.println(service.getAllSuppliers());
  						break;
			case 'd': System.out.print("\nEnter the partner id of customer: ");
						int id = sc.nextInt();
						Customer customerById = service.getCustomerById(id);
						if(customerById == null) {
							System.out.println("=== Customer not found. ===");
						}
						else {
							System.out.println("Customer: "+customerById);
						}
						break;
			case 'e': System.out.println("\n ==== GoodBye ====");
						break;
			default: System.out.println("\n ==== Wrong choice. Try again. ====");
			}
			if(choice == 'e') {
				break;
			}
		}

	}
	
	public static void createCustomer() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter partner Id: ");
		int partnerId = sc1.nextInt();
		sc1.nextLine();
		System.out.print("Enter partner Name: ");
		String partnerName = sc1.nextLine();
		System.out.print("Enter city: ");
		String city = sc1.nextLine();
		System.out.print("Enter state: ");
		String state = sc1.nextLine();
		System.out.print("Enter credit limit: ");
		double creditLimit = sc1.nextDouble();
		System.out.print("Enter phone number: ");
		String phoneNo = sc1.next();
		System.out.print("Enter email:");
		String email = sc1.next();
		Customer customer = new Customer(partnerId, partnerName, city, state, creditLimit, phoneNo, email);
		String[] validationErrors = customer.validate();
		int errCount = 0;
		for(String error:validationErrors) {
			if(error != null) {
				errCount++;
				System.out.println("Error: "+error);
			}
		}
		if(errCount == 0) {
			service.saveCustomerDetails(customer);
			System.out.println("=== Customer added successfully ===");
		}
		else {
			System.out.println("=== Customer cannot be added ===");
		}
	}
	
	public static void createSupplier() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter partner Id: ");
		int partnerId = sc2.nextInt();
		sc2.nextLine();
		System.out.print("Enter partner Name: ");
		String partnerName = sc2.nextLine();
		System.out.print("Enter city: ");
		String city = sc2.nextLine();
		System.out.print("Enter state: ");
		String state = sc2.nextLine();
		System.out.print("Enter credit balance: ");
		double creditBalance = sc2.nextDouble();
		System.out.print("Enter driving License Number:");
		String drivingLicenseNumber = sc2.next();
		Supplier supplier = new Supplier(partnerId, partnerName, city, state, creditBalance, drivingLicenseNumber);
		String[] validationErrors = supplier.validate();
		int errCount = 0;
		for(String error:validationErrors) {
			if(error != null) {
				errCount++;
				System.out.println("Error: "+error);
			}
		}
		if(errCount == 0) {
			service.saveSupplierDetails(supplier);
			System.out.println("=== Supplier added successfully ===");
		}
		else {
			System.out.println("=== Supplier cannot be added. ===");
		}
	}

}
