package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City implements Serializable {
	
	private static final long serialVersionUID = 4358587422309264699L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;
	
	@Column(updatable = true, name = "DESCRIPTION", nullable = false, length = 100)
	private String descrition;
	
	@Column(updatable = true, name = "NAME", nullable = false, length = 50)
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescrition() {
		return descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
