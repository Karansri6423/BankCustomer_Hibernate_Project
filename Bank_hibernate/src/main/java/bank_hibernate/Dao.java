package bank_hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {
	
	Configuration cgf=new Configuration().configure();
	SessionFactory sfg=cgf.buildSessionFactory();
	public void insertCustomer(customer c) {
		
		Session s=sfg.openSession();
		Transaction tfx=s.beginTransaction();
		s.save(c);
		tfx.commit();
		s.close();
		
	}
	public void getAllCustomer() {
		
		Session s=sfg.openSession();
		List<customer>list=s.createQuery("from customer",customer.class).list();
		
		for(customer c:list)
		{
			System.out.println(c);
			System.out.println();
		}
		s.close();
		
		
	}
	public customer getCustomerById(int id) {
		Session s=sfg.openSession();
		customer c=s.get(customer.class, id);
		return c;
	}
	public void updateBalanceBYId(int id, double newBalance) {
		
		Session s=sfg.openSession();
		Transaction tsx=s.beginTransaction();
		customer c=s.get(customer.class, id);
		if(c!=null)
		{
			c.setc_Balance(newBalance);
			s.update(c);
			
			System.out.println("Updated Successfully!!");
			System.out.println();
		}
		tsx.commit();
		s.close();
		
	}
	public customer deleteCustomerById(int id) {
		Session s=sfg.openSession();
		Transaction tfx=s.beginTransaction();
		customer c=s.get(customer.class, id);
		if(c!=null)
		{
			s.remove(c);
			System.out.println("Deleted succesfully");
			System.out.println();
		}
		tfx.commit();
		s.close();
		return c;
	}
	

}
