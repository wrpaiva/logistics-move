package br.com.logistics.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "NAME", nullable = false, length = 50)
	private String name;
	
	@Column(updatable = true, name = "ACCOUNT_NUMBER", nullable = false, length = 50)
	private String accountNumber;
	
	@Column(updatable = true, name = "FIRST_NAME", nullable = true, length = 30)
	private String firstName;
	
	@Column(updatable = true, name = "LAST_NAME", nullable = true, length = 30)
	private String lastName;


	public String getName() {
		return this.name;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String anAccountNumber) {
		this.accountNumber = anAccountNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
