package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commodity_classification")
public class CommodityClassification implements Serializable {

	public static final long serialVersionUID = -11228787878787320L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "CODE", nullable = false, length = 10)
	private String code;
	
	@Column(updatable = true, name = "DESCRIPTION", nullable = false, length = 160)
	private String description;

	public CommodityClassification() {
		this.setId(null);
		this.setCode(null);
		this.setDescription("");
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String aCode) {
		this.code = aCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String aDescription) {
		this.description = aDescription;
	}
}