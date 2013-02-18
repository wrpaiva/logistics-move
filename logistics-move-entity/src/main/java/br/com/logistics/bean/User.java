package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "xuser")
public class User implements Serializable {

	public static final long serialVersionUID = -66707493290541421L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "FIRST_NAME", nullable = false, length = 30)
	private String firstName;
	
	@Column(updatable = true, name = "MIDDLE_NAME", nullable = true, length = 30)
	private String middleName;
	
	@Column(updatable = true, name = "LAST_NAME", nullable = false, length = 30)
	private String lastName;
	
	@Column(updatable = true, name = "USER_NAME", nullable = false, length = 8)
	private String userName;
	
	@Column(updatable = true, name = "PASSWORD", nullable = false, length = 8)
	private String password;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "ROLE_ID")
	private Role role;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	@Column(updatable = true, name = "CONTACT", nullable = false, length = 1)
	private Boolean contact;

	public User() {
		this.setId(null);
		this.setFirstName("");
		this.setLastName("");
		this.setUserName("");
		this.setPassword("");
		this.setContact(false);
		Address theAddress = new Address();
		this.setAddress(theAddress);
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String aFirstName) {
		this.firstName = aFirstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String aMiddleName) {
		this.middleName = aMiddleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String aLastName) {
		this.lastName = aLastName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String aUserName) {
		this.userName = aUserName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String aPassword) {
		this.password = aPassword;
	}

	public Boolean isContact() {
		return this.contact;
	}

	public void setContact(Boolean aContact) {
		this.contact = aContact;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role aRole) {
		this.role = aRole;
	}
	
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address anAddress) {
		this.address = anAddress;
	}

	public boolean isPasswordCorrect(String aPassword) {
		return this.getPassword().equals(aPassword);
	}

	public String createFullName() {
		return this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
	}
}