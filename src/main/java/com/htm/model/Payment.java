package com.htm.model;



import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "payment")
public class Payment {
	
	@Id
	private String payment_id;
	
	private String user_name;
	
	private double amount;
	
	private double tax;
	
	private double total_amount;
	
	@NotBlank(message = "* credit card number cannot be blank")
	private String credit_num;
	
	@NotBlank(message = "* Ifsc code cannot be balnk")
	private String ifsc_code;
	
	private Timestamp timeStamp;
	
	
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public String getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(String string) {
		this.payment_id = string;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCredit_num() {
		return credit_num;
	}

	public void setCredit_num(String credit_num) {
		this.credit_num = credit_num;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timestamp2) {
		this.timeStamp = timestamp2;
	}
	
	public Payment(String payment_id, String user_name, double amount, double tax, double total_amount, String credit_num,
			String ifsc_code, Timestamp timeStamp) {
		super();
		this.payment_id = payment_id;
		this.user_name = user_name;
		this.amount = amount;
		this.tax = tax;
		this.total_amount = total_amount;
		this.credit_num = credit_num;
		this.ifsc_code = ifsc_code;
		this.timeStamp = timeStamp;
	}

	public Payment() {
		super();
	}

	
	
}
