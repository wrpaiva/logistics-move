package br.com.logistics.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role implements Serializable {

	public static final long serialVersionUID = -10932672311112974L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;

	@Column(updatable = true, name = "NAME", nullable = false, length = 30)
	private String name;
	
	@Column(updatable = true, name = "DESCRIPTION", nullable = true, length = 100)
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ROLE_ID")
	private List<Privilege> privileges;
	
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<User> users;
	
	@Column(updatable = true, name = "CARGO_SYSTEM_ACCESS", nullable = false, length = 1)
	private Boolean cargoSystemAccess;
	
	@Column(updatable = true, name = "TRACKING_SYSTEM_ACCESS", nullable = false, length = 1)
	private Boolean trackingSystemAccess;

	public Role() {
		this.setId(null);
		this.setDescription("");
		this.setName("");
		this.setCargoSystemAccess(false);
		this.setTrackingSystemAccess(false);
		this.setPrivileges(new ArrayList<Privilege>());
		this.setUsers(new ArrayList<User>());
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String aDescription) {
		this.description = aDescription;
	}
	
	public Boolean isCargoSystemAccess() {
		return cargoSystemAccess;
	}

	public void setCargoSystemAccess(Boolean cargoSystemAccess) {
		this.cargoSystemAccess = cargoSystemAccess;
	}

	public Boolean isTrackingSystemAccess() {
		return trackingSystemAccess;
	}

	public void setTrackingSystemAccess(Boolean trackingSystemAccess) {
		this.trackingSystemAccess = trackingSystemAccess;
	}	

	public List<Privilege> getPrivileges() {
		return this.privileges;
	}

	public void setPrivileges(List<Privilege> aPrivileges) {
		this.privileges = aPrivileges;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> aUsers) {
		this.users = aUsers;
	}
}