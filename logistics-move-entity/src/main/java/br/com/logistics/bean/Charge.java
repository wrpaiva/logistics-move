package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "charge")
public class Charge implements Serializable {

	public static final long serialVersionUID = -51250926452891298L;

	public static final String INCOME = "INC";
	public static final String INCOME_FREIGHT = "INC_FR";
	public static final String EXPENSE = "EXP";
	public static final String EXPENSE_FREIGHT = "EXP_FR";

	@Id
	@Column(updatable = false, name = "ID", nullable = false, length = 50)
	private String id;
	
	@Column(updatable = false, name = "DESCRIPTION", nullable = false, length = 100)
	private String description;
	
	@Column(updatable = false, name = "TYPE", nullable = false, length = 20)
	private String type;

	
	public String getId() {
		return this.id;
	}

	public void setId(String anId) {
		this.id = anId;
	}

	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String aDescription) {
		this.description = aDescription;
	}

	
	public String getType() {
		return this.type;
	}

	public void setType(String aType) {
		this.type = aType;
	}
}
