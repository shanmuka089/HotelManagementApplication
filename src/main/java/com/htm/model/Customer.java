package com.htm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.htm.annotations.CheckId;
import com.htm.annotations.CheckPhone;


@Entity
@Table(name="customer")
public class Customer implements Serializable {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	
	@Column
	@NotBlank(message = "* name cannot be blank")
	private String customer_name;
	
	@Column
	@NotBlank(message = "* state cannot be blank")
	private String customer_state;
	
	@Column
	@NotBlank(message = "* city cannot be blank")
	private String customer_city;
	
	@Column
	@NotBlank(message = "* mail cannot be blank")
	private String customer_mail;
	
	@Column
	@CheckPhone
	private String customer_mobile="91";
	
	@Column
	@NotBlank(message = "* please enter the registration date")
	private String customer_date;
	
	@Column
	@NotBlank(message = "* please select your gender")
	private String customer_gender;
	
	@Column
	@NotBlank(message = "* please select your country")
	private String customer_country;
	
	@Column
	@NotBlank(message = "*password cannot be blank")
	private String customer_password;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_state() {
		return customer_state;
	}

	public void setCustomer_state(String customer_state) {
		this.customer_state = customer_state;
	}

	public String getCustomer_city() {
		return customer_city;
	}

	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}

	public String getCustomer_mail() {
		return customer_mail;
	}

	public void setCustomer_mail(String customer_mail) {
		this.customer_mail = customer_mail;
	}

	public String getCustomer_mobile() {
		return customer_mobile;
	}

	public void setCustomer_mobile(String customer_mobile) {
		this.customer_mobile = customer_mobile;
	}

	public String getCustomer_date() {
		return customer_date;
	}

	public void setCustomer_date(String customer_date) {
		this.customer_date = customer_date;
	}

	public String getCustomer_gender() {
		return customer_gender;
	}

	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}

	public String getCustomer_country() {
		return customer_country;
	}

	public void setCustomer_country(String customer_country) {
		this.customer_country = customer_country;
	}

	public String getCustomer_password() {
		return customer_password;
	}

	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}

	public Customer(@NotBlank(message = "* name cannot be blank") String customer_name,
			@NotBlank(message = "* state cannot be blank") String customer_state,
			@NotBlank(message = "* city cannot be blank") String customer_city,
			@NotBlank(message = "* mail cannot be blank") String customer_mail, String customer_mobile,
			@NotBlank(message = "* please enter the registration date") String customer_date,
			@NotBlank(message = "* please select your gender") String customer_gender,
			@NotBlank(message = "* please select your country") String customer_country,
			@NotBlank(message = "*password cannot be blank") String customer_password) {
		super();
		this.customer_name = customer_name;
		this.customer_state = customer_state;
		this.customer_city = customer_city;
		this.customer_mail = customer_mail;
		this.customer_mobile = customer_mobile;
		this.customer_date = customer_date;
		this.customer_gender = customer_gender;
		this.customer_country = customer_country;
		this.customer_password = customer_password;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_state="
				+ customer_state + ", customer_city=" + customer_city + ", customer_mail=" + customer_mail
				+ ", customer_mobile=" + customer_mobile + ", customer_date=" + customer_date + ", customer_gender="
				+ customer_gender + ", customer_country=" + customer_country + ", customer_password="
				+ customer_password + "]";
	}
	
	
	
}
