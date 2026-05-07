package bank_hibernate;

import java.util.Scanner;

public class userApplication {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		controller c=new controller();
		
		while(true)
		{
			System.out.println("-----Bank Menu-----");
			System.out.println("1. Insert Customer");
			System.out.println("2.Get all customer");
			System.out.println("3.Get Customer By Id");
			System.out.println("4.Update Balance");
			System.out.println("5.Delete Customer by Id");
			System.out.println("Enter your choice: ");
			
			int choice =sc.nextInt();
			switch(choice)
			{
			 case 1:  c.insertCustomer();
			 			break;
			 case 2: c.getAllCustomer();
			 		break;
			 case 3: c.getcustomerById();
			 		break;
			 case 4: c.updateBalanceByID();
			 		break;
			 case 5:c.deleteCustomerById();
			 		break;
			}
		}

	}

}
