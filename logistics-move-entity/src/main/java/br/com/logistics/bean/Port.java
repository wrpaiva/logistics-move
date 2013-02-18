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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "port")
public class Port implements Serializable {

	public static final long serialVersionUID = -89111111112344441L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "COUNTRY", nullable = false, length = 50)
	private String country;
	
	@Column(updatable = true, name = "PORT_ID", nullable = false, length = 45)
	private String portId;
	
	@Column(updatable = true, name = "NAME", nullable = false, length = 45)
	private String name;
	
	@Column(updatable = true, name = "SUBDIVISION", nullable = false, length = 45)
	private String subdivision;
	
	@Column(updatable = true, name = "REMARKS", nullable = false, length = 45)
	private String remarks;
	
	@Column(updatable = true, name = "MARITIME", nullable = false, length = 1)
	private Boolean maritime;
	
	@Column(updatable = true, name = "RAIL", nullable = false, length = 1)
	private Boolean rail;
	
	@Column(updatable = true, name = "ROAD", nullable = false, length = 1)
	private Boolean road;
	
	@Column(updatable = true, name = "MAIL", nullable = false, length = 1)
	private Boolean mail;
	
	@Column(updatable = true, name = "AIR", nullable = false, length = 1)
	private Boolean air;
	
	@Column(updatable = true, name = "BORDER_CROSSING", nullable = false, length = 1)
	private Boolean borderCrossing;
	
	@ManyToMany(targetEntity = PortCode.class, cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinTable(name = "port_portcode_link", joinColumns = { @JoinColumn(name = "PORT_ID") }, inverseJoinColumns = { @JoinColumn(name = "PORT_CODE_ID") })
	private List<PortCode> portCodes;

	public Port() {
		this.setId(null);
		this.setCountry("");
		this.setPortId("");
		this.setName("");
		this.setSubdivision("");
		this.setRemarks("");
		this.setMaritime(false);
		this.setRail(false);
		this.setRoad(false);
		this.setAir(false);
		this.setMail(false);
		this.setBorderCrossing(false);
		this.portCodes = new ArrayList<PortCode>();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String aCountry) {
		this.country = aCountry;
	}

	public String getPortId() {
		return this.portId;
	}

	public void setPortId(String aPortId) {
		this.portId = aPortId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public String getSubdivision() {
		return this.subdivision;
	}

	public void setSubdivision(String aSubdivision) {
		this.subdivision = aSubdivision;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String aRemarks) {
		this.remarks = aRemarks;
	}

	public Boolean isMaritime() {
		return this.maritime;
	}

	public void setMaritime(Boolean aMaritime) {
		this.maritime = aMaritime;
	}

	public Boolean isRail() {
		return this.rail;
	}

	public void setRail(Boolean aRail) {
		this.rail = aRail;
	}

	public Boolean isRoad() {
		return this.road;
	}

	public void setRoad(Boolean aRoad) {
		this.road = aRoad;
	}

	public Boolean isMail() {
		return this.mail;
	}

	public void setMail(Boolean aMail) {
		this.mail = aMail;
	}

	public Boolean isAir() {
		return this.air;
	}

	public void setAir(Boolean anAir) {
		this.air = anAir;
	}

	public Boolean isBorderCrossing() {
		return this.borderCrossing;
	}

	public void setBorderCrossing(Boolean aBorderCrossing) {
		this.borderCrossing = aBorderCrossing;
	}

	public List<PortCode> getPortCodes() {
		return this.portCodes;
	}

	public void setPortCodes(List<PortCode> aPortCodes) {
		this.portCodes = aPortCodes;
	}
}
