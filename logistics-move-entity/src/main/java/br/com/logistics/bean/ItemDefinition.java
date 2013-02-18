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
@Table(name = "item_definition")
public class ItemDefinition implements Serializable {

	public static final long serialVersionUID = -18228787878787328L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "PART_NUMBER", nullable = true, length = 45)
	private String partNumber;
	
	@Column(updatable = true, name = "DESCRIPTION", nullable = true, length = 45)
	private String description;
	
	@Column(updatable = true, name = "MODEL", nullable = true, length = 45)
	private String model;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "HAZZARDOUS_ID")
	private Hazardous hazardous;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "PACKAGE_TYPE_ID")
	private PackageType packageType;
	
	@OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENT_ID")
	private Customer client;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "MANUFACTURER_ID")
	private Customer manufacturer;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "SHIPMENT_EXPORT_DECLARATION_ID")
	private ShipmentExportDeclaration shipmentExportDeclaration;

	public ItemDefinition() {
		this.setId(null);
		this.setPartNumber("");
		this.setDescription("");
		this.setModel("");
		this.setHazardous(new Hazardous());
		this.setPackageType(null);
		this.setClient(null);
		this.setManufacturer(null);
		this.setShipmentExportDeclaration(new ShipmentExportDeclaration());
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String aPartNumber) {
		this.partNumber = aPartNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String aDescription) {
		this.description = aDescription;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String aModel) {
		this.model = aModel;
	}

	public Hazardous getHazardous() {
		return hazardous;
	}

	public void setHazardous(Hazardous aHazardous) {
		this.hazardous = aHazardous;
	}

	public ShipmentExportDeclaration getShipmentExportDeclaration() {
		return shipmentExportDeclaration;
	}

	public void setShipmentExportDeclaration(ShipmentExportDeclaration aShipmentExportDeclaration) {
		this.shipmentExportDeclaration = aShipmentExportDeclaration;
	}

	public PackageType getPackageType() {
		return packageType;
	}

	public void setPackageType(PackageType aPackageType) {
		this.packageType = aPackageType;
	}

	public Customer getClient() {
		return client;
	}

	public void setClient(Customer aClient) {
		this.client = aClient;
	}

	public Customer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Customer aManufacturer) {
		this.manufacturer = aManufacturer;
	}
}
