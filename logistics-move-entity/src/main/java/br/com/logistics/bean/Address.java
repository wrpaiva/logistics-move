package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {

	public static final long serialVersionUID = -11112229087666666L;
	
	@Id
	@GeneratedValue
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "WORK_PHONE", nullable = true, length = 30)
	private String workPhone;
	
	@Column(updatable = true, name = "HOME_PHONE", nullable = true, length = 30)
	private String homePhone;
	
	@Column(updatable = true, name = "FAX_PHONE", nullable = true, length = 30)
	private String faxPhone;
	
	@Column(updatable = true, name = "EMAIL", nullable = true, length = 30)
	private String email;
	
	@Column(updatable = true, name = "STREET", nullable = true, length = 30)
	private String street;
	
	@Column(updatable = true, name = "ZIP_CODE", nullable = true)
	private Integer zipCode;
	
	public Address() {
		this.setEmail("");
		this.setStreet("");
		this.setHomePhone("");
		this.setWorkPhone("");
		this.setFaxPhone("");
		this.setZipCode(0);
	}
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public String getWorkPhone() {
		return this.workPhone;
	}

	public void setWorkPhone(String aWorkPhone) {
		this.workPhone = aWorkPhone;
	}

	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String aHomePhone) {
		this.homePhone = aHomePhone;
	}

	public String getFaxPhone() {
		return this.faxPhone;
	}

	public void setFaxPhone(String aFaxPhone) {
		this.faxPhone = aFaxPhone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String anEmail) {
		this.email = anEmail;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String anStreet) {
		this.street = anStreet;
	}

	public Integer getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(Integer aZipCode) {
		this.zipCode = aZipCode;
	}
}