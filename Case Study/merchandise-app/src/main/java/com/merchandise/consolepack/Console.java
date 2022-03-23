package com.merchandise.consolepack;

import java.util.Scanner;
import com.merchandise.entities.Customer;
import com.merchandise.entities.Merchandise;
import com.merchandise.entities.Supplier;
import com.merchandise.services.Service;

public class Console {

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
			switch (choice) {
			case 'a':
				System.out.println("\n=== For adding customer ===");
				createEntity("Customer");
				break;
			case 'b':
				System.out.println("\n=== For adding Supplier ===");
				createEntity("Supplier");
				break;
			case 'c':
				System.out.println("\nList of Customers: ");
				System.out.println(Service.getAllCustomers());
				System.out.println("\nList of Suppliers");
				System.out.println(Service.getAllSuppliers());
				break;
			case 'd':
				System.out.print("\nEnter the partner id of customer: ");
				int id = sc.nextInt();
				Customer customerById = Service.getCustomerById(id);
				if (customerById == null) {
					System.out.println("=== Customer not found. ===");
				} else {
					System.out.println("Customer: " + customerById);
				}
				break;
			case 'e':
				System.out.println("\n ==== GoodBye ====");
				break;
			default:
				System.out.println("\n ==== Wrong choice. Try again. ====");
			}
			if (choice == 'e') {
				break;
			}
		}

	}

	private static void createEntity(String entity) {
		if (entity == null) {
			return;
		}
		Scanner sc2 = new Scanner(System.in);

		// get data from user
		System.out.print("Enter partner Id: ");
		int partnerId = sc2.nextInt();
		sc2.nextLine();
		System.out.print("Enter partner Name: ");
		String partnerName = sc2.nextLine();
		System.out.print("Enter city: ");
		String city = sc2.nextLine();
		System.out.print("Enter state: ");
		String state = sc2.nextLine();

		if (entity.equalsIgnoreCase("Customer")) {
			System.out.print("Enter credit limit: ");
			double creditLimit = sc2.nextDouble();
			System.out.print("Enter phone number: ");
			String phoneNo = sc2.next();
			System.out.print("Enter email:");
			String email = sc2.next();

			// create customer object
			Merchandise customer = new Customer(partnerId, partnerName, city, state, creditLimit, phoneNo, email);
			storeEntity(customer);
		} 
		else if (entity.equalsIgnoreCase("Supplier")) {
			System.out.print("Enter credit balance: ");
			double creditBalance = sc2.nextDouble();
			System.out.print("Enter driving License Number:");
			String drivingLicenseNumber = sc2.next();

			// create supplier object
			Merchandise supplier = new Supplier(partnerId, partnerName, city, state, creditBalance,drivingLicenseNumber);
			storeEntity(supplier);
		}
		else {
			System.out.println("Wrong entity.");
		}
	}

	private static void storeEntity(Merchandise entity) {

		if (entity == null) {
			return;
		}
		// validate the object created
		String[] validationErrors = entity.validate();
		int errCount = 0;

		// Display errors if any
		for (String error : validationErrors) {
			if (error != null) {
				errCount++;
				System.out.println("Error: " + error);
			}
		}
		
		if (entity instanceof Customer) {
			// if no errors found, then store the customer object else don't
			if (errCount == 0) {
				Service.saveCustomerDetails((Customer) entity);
				System.out.println("=== Customer added successfully ===");
			} else {
				System.out.println("=== Customer cannot be added ===");
			}
		}
		
		if (entity instanceof Supplier) {
			// if no errors found, then store the customer object else don't
			if (errCount == 0) {
				Service.saveSupplierDetails((Supplier) entity);
				System.out.println("=== Supplier added successfully ===");
			} else {
				System.out.println("=== Supplier cannot be added. ===");
			}
		}
	}

}
