package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "privilege")
public class Privilege implements Serializable {

	public static final long serialVersionUID = -60712279876234222L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "NAME", nullable = false, length = 30)
	private String name;
	
	@Column(updatable = true, name = "VALUE", nullable = false, length = 30)
	private String value;

	public Privilege() {
		this.setId(null);
		this.setName("");
		this.setValue("");
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

	public String getValue() {
		return this.value;
	}

	public void setValue(String aValue) {
		this.value = aValue;
	}
}