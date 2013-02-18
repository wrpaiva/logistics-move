package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "port_code")
public class PortCode implements Serializable {

	public static final long serialVersionUID = -11228787878787321L;

	public static final String US = "us";
	public static final String COUNTRY = "country";
	public static final String ALL = "all";

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "CODE", nullable = false)
	private Integer code;
	
	@Column(updatable = true, name = "DESCRIPTION", nullable = false, length = 210)
	private String description;
	
	@Column(updatable = true, name = "TYPE", nullable = false, length = 10)
	private String type;
	
	@Column(updatable = true, name = "COMMONLY_USED", nullable = false, length = 1)
	private Boolean commonlyUsed;

	public PortCode() {
		this.setId(null);
		this.setCode(new Integer(0));
		this.setDescription("");
		this.setType("");
		this.setCommonlyUsed(false);
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer aCode) {
		this.code = aCode;
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

	public Boolean isCommonlyUsed() {
		return this.commonlyUsed;
	}

	public void setCommonlyUsed(Boolean aCommonlyUsed) {
		this.commonlyUsed = aCommonlyUsed;
	}
}
