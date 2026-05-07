package bank_hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int c_id;
	private String c_name;
	private String c_address;
	private double c_balance;
	
	public customer() {
		// TODO Auto-generated constructor stub
	}

	public customer( String c_name, String c_address, double c_balance) {
		super();
		
		this.c_name = c_name;
		this.c_address = c_address;
		this.c_balance = c_balance;
	}

	

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getAddress() {
		return c_address;
	}

	public void setc_Address(String address) {
		this.c_address = address;
	}

	public double getc_Balance() {
		return c_balance;
	}

	public void setc_Balance(double balance) {
		this.c_balance = balance;
	}

	@Override
	public String toString() {
		return "customer [c_id=" + c_id + ", c_name=" + c_name + ", c_address=" + c_address + ", c_balance=" + c_balance + "]";
	}
	
	
	
	
	

}
