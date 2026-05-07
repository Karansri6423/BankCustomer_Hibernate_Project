package bank_hibernate;

import java.util.Scanner;

public class controller {

	Scanner sc=new Scanner(System.in);
	service s;
	public controller() {
		s=new service();
	}
	public void insertCustomer() {
		
		System.out.println("Enter customer name: ");
		String name=sc.nextLine();
		System.out.println("Enter the customer address: ");
		String address=sc.nextLine();
		System.out.println("Enter Customer balance: ");
		double balance=sc.nextDouble();
		sc.nextLine();
		customer c=new customer(name,address,balance);
		s.insertCustomer(c);
		
		
	}
	public void getAllCustomer() {
		
		s.getAllCustomer();
		
	}
	public void getcustomerById() {
		System.out.println("Enter the customer Id: ");
		int id=sc.nextInt();
		customer c=s.getcustomerByID(id);
		if(c!=null)
		{
			System.out.println(c);
			System.out.println();
		}
		else
		{
			System.out.println("Customer not present with Id: "+id);
			System.out.println();
		}
		
	}
	public void updateBalanceByID() {
		
		System.out.println("Enter the customer Id to update: ");
		int id=sc.nextInt();
		System.out.println("Enter the new balance: ");
		double newBalance=sc.nextDouble();
		s.updateBalanceById(id,newBalance);
		
	}
	public void deleteCustomerById() {
		
		System.out.println("Enter the customer Id to be deleted: ");
		int id=sc.nextInt();
		s.deletCustomerById(id);
		
		
	}

}
