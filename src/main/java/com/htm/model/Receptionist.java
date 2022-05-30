package com.htm.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.htm.annotations.CheckId;
import com.htm.annotations.CheckPhone;

@Entity
@Table(name = "receptionist")
public class Receptionist {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recep_id;
	@Column
	@NotBlank(message = "* name cannot be blank")
	private String recep_name;
	@Column
	@NotBlank(message = "* state cannot be blank")
	private String recep_state;
	@Column
	@NotBlank(message = "* city cannot be blank")
	private String recep_city;
	@Column
	@Email
	@NotBlank(message = "* mail cannot be blank")
	private String recep_mail;
	@Column
	@CheckPhone
	private String recep_mobile="91";
	
	@Column
	@NotBlank(message = "* please enter the registration date")
	private String recep_date;
	
	@Column
	@NotBlank(message = "* please select your gender")
	private String recep_gender;
	
	@Column
	@NotBlank(message = "* please select your country")
	private String recep_country;
	
	@Column
	@NotBlank(message = "*you must create the password")
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRecep_id() {
		return recep_id;
	}
	public void setRecep_id(int recep_id) {
		this.recep_id = recep_id;
	}
	public String getRecep_name() {
		return recep_name;
	}
	public void setRecep_name(String recep_name) {
		this.recep_name = recep_name;
	}
	public String getRecep_state() {
		return recep_state;
	}
	public void setRecep_state(String recep_state) {
		this.recep_state = recep_state;
	}
	public String getRecep_city() {
		return recep_city;
	}
	public void setRecep_city(String recep_city) {
		this.recep_city = recep_city;
	}
	public String getRecep_mail() {
		return recep_mail;
	}
	public void setRecep_mail(String recep_mail) {
		this.recep_mail = recep_mail;
	}
	public String getRecep_mobile() {
		return recep_mobile;
	}
	public void setRecep_mobile(String recep_mobile) {
		this.recep_mobile = recep_mobile;
	}
	public String getRecep_date() {
		return recep_date;
	}
	public void setRecep_date(String recep_date) {
		this.recep_date = recep_date;
	}
	public Receptionist() {
		super();
	}
	public String getRecep_gender() {
		return recep_gender;
	}
	public void setRecep_gender(String recep_gender) {
		this.recep_gender = recep_gender;
	}
	public String getRecep_country() {
		return recep_country;
	}
	public void setRecep_country(String recep_country) {
		this.recep_country = recep_country;
	}
	public Receptionist(int recep_id, @NotBlank(message = "* name cannot be blank") String recep_name,
			@NotBlank(message = "* state cannot be blank") String recep_state,
			@NotBlank(message = "* city cannot be blank") String recep_city,
			@Email @NotBlank(message = "* mail cannot be blank") String recep_mail, String recep_mobile,
			@NotBlank(message = "* please enter the registration date") String recep_date,
			@NotBlank(message = "* please select your gender") String recep_gender,
			@NotBlank(message = "* please select your country") String recep_country,
			@NotBlank(message = "*you must create the password") String password) {
		super();
		this.recep_id = recep_id;
		this.recep_name = recep_name;
		this.recep_state = recep_state;
		this.recep_city = recep_city;
		this.recep_mail = recep_mail;
		this.recep_mobile = recep_mobile;
		this.recep_date = recep_date;
		this.recep_gender = recep_gender;
		this.recep_country = recep_country;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Receptionist [recep_id=" + recep_id + ", recep_name=" + recep_name + ", recep_state=" + recep_state
				+ ", recep_city=" + recep_city + ", recep_mail=" + recep_mail + ", recep_mobile=" + recep_mobile
				+ ", recep_date=" + recep_date + ", recep_gender=" + recep_gender + ", recep_country=" + recep_country
				+ ", password=" + password + "]";
	}
	
}
