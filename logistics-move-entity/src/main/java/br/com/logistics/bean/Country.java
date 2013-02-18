package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country implements Serializable {
	
	private static final long serialVersionUID = 7179740666529248561L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;
	
	@Column(updatable = true, name = "CODE", nullable = false, length = 100)
	private String code;
	
	@Column(updatable = true, name = "NAME", nullable = false, length = 100)
	private String name;
	
	@ManyToOne
	private State state;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
