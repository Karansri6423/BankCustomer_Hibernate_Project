package bank_hibernate;

import java.util.List;

public class service {
	
	Dao d;
	public service() {
		d=new Dao();
	}
	public  void insertCustomer(customer c) {
		
		if(c.getc_Balance()>0)
		{
			d.insertCustomer(c);
			System.out.println("INSERTED SUCCESSFULLY!!!!");
			System.out.println();
		}
		else
		{
			System.out.println("Something went wrong");
			System.out.println();
		}
		
	}
	public void getAllCustomer() {
		
		d.getAllCustomer();
		
	}
	public customer getcustomerByID(int id) {
		
		customer c=d.getCustomerById(id);
		return c;
		
	}
	public void updateBalanceById(int id, double newBalance) {
		
		d.updateBalanceBYId(id,newBalance);
	}
	public void deletCustomerById(int id) {
		customer c=d.deleteCustomerById(id);
	}
	

}
