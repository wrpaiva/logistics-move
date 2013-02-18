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
@Table(name = "shipment_export_declaration")
public class ShipmentExportDeclaration implements Serializable {

	public static final long serialVersionUID = -91228787878787320L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "QUANTITY1", nullable = true)
	private Float quantity1;
	
	@Column(updatable = true, name = "QUANTITY2", nullable = true)
	private Float quantity2;
	
	@Column(updatable = true, name = "VALUE", nullable = true)
	private Float value;
	
	@Column(updatable = true, name = "ECCN", nullable = true, length = 45)
	private String eccn;
	
	@Column(updatable = true, name = "ORIGIN", nullable = true, length = 45)
	private String origin;
	
	@Column(updatable = true, name = "USED_VEHICLE", nullable = false, length = 1)
	private Boolean usedVehicle;
	
	@Column(updatable = true, name = "INCLUDE_IN_SED", nullable = false, length = 1)
	private Boolean includeInSED;
	
	@Column(updatable = true, name = "LICENSE_NUMBER", nullable = true, length = 45)
	private String licenseNumber;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "COMMODITY_CLASSIFICATION_ID")
	private CommodityClassification scheduleB;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "LICENSE_TYPE_ID")
	private LicenseType licenseType;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "EXPORT_CODE_ID")
	private ExportCode exportCode;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "VEHICLE_ID")
	private Vehicle vehicle;

	public ShipmentExportDeclaration() {
		this.setId(null);
		this.setVehicle(new Vehicle());
		this.setQuantity1(new Float("0.0"));
		this.setQuantity2(new Float("0.0"));
		this.setValue(new Float("0.0"));
		this.setLicenseNumber("");
		this.setEccn("");
		this.setOrigin("");
		this.setUsedVehicle(false);
		this.setScheduleB(null);
		this.setLicenseType(null);
		this.setExportCode(null);
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public CommodityClassification getScheduleB() {
		return scheduleB;
	}

	public void setScheduleB(CommodityClassification aScheduleB) {
		this.scheduleB = aScheduleB;
	}

	public String getEccn() {
		return eccn;
	}

	public void setEccn(String anEccn) {
		this.eccn = anEccn;
	}

	public ExportCode getExportCode() {
		return exportCode;
	}

	public void setExportCode(ExportCode anExportCode) {
		this.exportCode = anExportCode;
	}

	public Boolean isIncludeInSED() {
		return includeInSED;
	}

	public void setIncludeInSED(Boolean anIncludeInSED) {
		this.includeInSED = anIncludeInSED;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String aLicenseNumber) {
		this.licenseNumber = aLicenseNumber;
	}

	public LicenseType getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(LicenseType aLicenseType) {
		this.licenseType = aLicenseType;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String anOrigin) {
		this.origin = anOrigin;
	}

	public Float getQuantity1() {
		return quantity1;
	}

	public void setQuantity1(Float aQuantity1) {
		this.quantity1 = aQuantity1;
	}

	public Float getQuantity2() {
		return quantity2;
	}

	public void setQuantity2(Float aQuantity2) {
		this.quantity2 = aQuantity2;
	}

	public Boolean isUsedVehicle() {
		return usedVehicle;
	}

	public void setUsedVehicle(Boolean aUsedVehicle) {
		this.usedVehicle = aUsedVehicle;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float aValue) {
		this.value = aValue;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle aVehicle) {
		this.vehicle = aVehicle;
	}
}