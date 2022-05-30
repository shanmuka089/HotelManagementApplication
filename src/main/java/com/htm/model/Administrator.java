package com.htm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.htm.annotations.CheckId;
import com.htm.annotations.CheckPhone;

@Entity
@Table(name = "administrator")
public class Administrator {
	
	@Id
	@Column
	@CheckId
	private int admin_id;
	
	@NotBlank
	@Column
	private String admin_name;
	
	@NotBlank
	@Column
	private String admin_code;

	@Column
	@CheckPhone
	private String admin_mobile;
	
	@NotBlank
	@Column
	private String admin_password;
	public Administrator() {
		super();
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_code() {
		return admin_code;
	}
	public void setAdmin_code(String admin_code) {
		this.admin_code = admin_code;
	}
	public String getAdmin_mobile() {
		return admin_mobile;
	}
	public void setAdmin_mobile(String admin_mobile) {
		this.admin_mobile = admin_mobile;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public Administrator(int admin_id, @NotBlank String admin_name, @NotBlank String admin_code, String admin_mobile,
			@NotBlank String admin_password) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_code = admin_code;
		this.admin_mobile = admin_mobile;
		this.admin_password = admin_password;
	}
	

}
