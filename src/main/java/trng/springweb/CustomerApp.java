package trng.springweb;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;
import trng.springweb.model.Address;
import trng.springweb.model.Customer;
import trng.springweb.service.CustomerService;
import trng.springweb.utils.HibernateUtils;

public class CustomerApp {
	
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(trng.springweb.config.AppConfig.class);
	CustomerService cserv = applicationContext.getBean(CustomerService.class);
	static Scanner scanner;

	public CustomerApp() {
		scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {
		CustomerApp capp = new CustomerApp();
		while (true) {
			HibernateUtils.displayCustomerMenu();
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				capp.insertCustomer();
				break;

			case 2:
				capp.removeCustomer();
				break;
			case 3:
				capp.changeCustomer();
				break;
			case 4:
				capp.loadCustomer();
				break;
			case 5:
				capp.getCustomersList();
				break;
			case 6:
				capp.returnMonthlySales();
				break;
			case 7:
				capp.getSummaryReport();
				break;
			default:
				scanner.close();
				System.exit(0);
				break;

			}
		}
	}

	public void insertCustomer() {
		System.out.println("\nEnter Customer details:\n");
		System.out.println("\nEnter Customer first name:\n");
		String cfname = scanner.next();
		System.out.println("\nEnter Customer middle name:\n");
		String cmname = scanner.next();
		System.out.println("\nEnter Customer last name:\n");
		String clname = scanner.next();
		System.out.println("\nEnter Customer address:\n");
		System.out.println("\nEnter street address:\n");
		String street = scanner.next();
		System.out.println("\nEnter city:\n");
		String city = scanner.next();
		System.out.println("\nEnter state:\n");
		String state = scanner.next();
		System.out.println("\nEnter Zip:\n");
		String zip = scanner.next();
		System.out.println("\nEnter Country:\n");
		String country = scanner.next();
		Address address = new Address(street, city, state, zip, country,street, city, state, zip, country);
		Customer customer = new Customer(cfname, cmname, clname, address);
		boolean result=cserv.addCustomer(customer);
		if(result)
			   System.out.println("Success");
		   else
			   System.out.println("Failure");
	}

	public void removeCustomer() {
		System.out.println("\nEnter customer Id of the customer to be deleted:\n");
		int cid = scanner.nextInt();
		boolean result=cserv.deleteCustomer(cid);
		if(result)
			   System.out.println("Success");
		   else
			   System.out.println("Failure");
	}

	public void changeCustomer() {
		System.out.println("\nEnter Customer details:\n");
		System.out.println("\nEnter Customer ID:\n");
		int cid = scanner.nextInt();
		System.out.println("\nEnter Customer first name:\n");
		String cfname = scanner.next();
		System.out.println("\nEnter Customer middle name:\n");
		String cmname = scanner.next();
		System.out.println("\nEnter Customer last name:\n");
		String clname = scanner.next();
		System.out.println("\nEnter Customer address:\n");
		System.out.println("\nEnter street address:\n");
		String street = scanner.next();
		System.out.println("\nEnter city:\n");
		String city = scanner.next();
		System.out.println("\nEnter state:\n");
		String state = scanner.next();
		System.out.println("\nEnter Zip:\n");
		String zip = scanner.next();
		System.out.println("\nEnter Country:\n");
		String country = scanner.next();
		Address address = new Address(street, city, state, zip, country, street, city, state, zip, country);
		Customer customer = new Customer(cfname, cmname, clname, address);
		customer.setCustomerID(cid);
		boolean result=cserv.updateCustomer(customer);
		if(result)
			   System.out.println("Success");
		   else
			   System.out.println("Failure");
	}

	public void loadCustomer() {
		System.out.println("\nEnter customer Id of the customer to be loaded:\n");
		int cid = scanner.nextInt();
		Customer c=cserv.loadCustomer(cid);
		System.out.println("Customer ID: "+c.getCustomerID());
		System.out.println("First Name: "+c.getFirstName());
		System.out.println("Middle Name: "+c.getMiddleName());
		System.out.println("Last Name: "+c.getLastName());
	}

	public void getCustomersList() {
		System.out.println("\nEnter zipCode of the customers to be listed:\n");
		String zip = scanner.next();
		cserv.getCustomers(zip).stream().forEach(System.out::println);
	}

	public void returnMonthlySales() {
		System.out.println("\nEnter year to get monthly sales summary for all 12 months of the year:\n");
		int year = scanner.nextInt();
		Map<String, Double> salesMap = cserv.getMonthlySales(year);
		
		for(Entry<String, Double> entry: salesMap.entrySet()) {
			System.out.println("Month: "+entry.getKey());
			System.out.println("Sales: "+entry.getValue());
		}
	}

	public void getSummaryReport() {
		System.out.println("\nEnter the month to get customer summary for the month:\n");
		int month = scanner.nextInt();
		if(cserv.getReport(month)==null || cserv.getReport(month).size()==0)
			System.out.println("No such customer exists in the datastore");
		cserv.getReport(month).stream().forEach(System.out::println);
	}
}