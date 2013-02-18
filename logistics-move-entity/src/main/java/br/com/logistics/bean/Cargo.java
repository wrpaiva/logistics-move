package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cargo")
@Inheritance(strategy = InheritanceType.JOINED)
public class Cargo implements Serializable {

	public static final long serialVersionUID = -777712321237865563L;
	
	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "DESCRIPTION", nullable = false, length = 100)
	private String description;
	
	@Column(updatable = true, name = "LENGTH", nullable = true)
	private Float length;
	
	@Column(updatable = true, name = "WIDTH", nullable = true)
	private Float width;
	
	@Column(updatable = true, name = "HEIGHT", nullable = true)
	private Float height;
	
	@Column(updatable = true, name = "WEIGHT", nullable = true)
	private Float weight;
	
	@Column(updatable = true, name = "VOLUME", nullable = true)
	private Float volume;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "SHIPMENT_ID")
	private Shipment shipment;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "PACKAGE_TYPE_ID")
	private PackageType packageType;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "SHIPMENT_EXPORT_DECLARATION_ID")
	private ShipmentExportDeclaration shipmentExportDeclaration;

	public Cargo() {
		this.setId(null);
		this.setDescription("");
		this.setLength(new Float("0.0"));
		this.setWidth(new Float("0.0"));
		this.setHeight(new Float("0.0"));
		this.setWeight(new Float("0.0"));
		this.setVolume(new Float("0.0"));
		this.setPackageType(null);
		this.setShipment(null);
		this.setShipmentExportDeclaration(new ShipmentExportDeclaration());
	}
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String aDescription) {
		this.description = aDescription;
	}

	public Float getHeight() {
		return this.height;
	}

	public void setHeight(Float aHeight) {
		this.height = aHeight;
	}

	public Float getLength() {
		return this.length;
	}

	public void setLength(Float aLength) {
		this.length = aLength;
	}

	public Float getWidth() {
		return this.width;
	}

	public void setWidth(Float aWidth) {
		this.width = aWidth;
	}

	public Float getVolume() {
		return this.volume;
	}

	public void setVolume(Float aVolume) {
		this.volume = aVolume;
	}

	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float aWeight) {
		this.weight = aWeight;
	}

	public PackageType getPackageType() {
		return packageType;
	}

	public void setPackageType(PackageType aPackageType) {
		this.packageType = aPackageType;
	}

	public ShipmentExportDeclaration getShipmentExportDeclaration() {
		return shipmentExportDeclaration;
	}

	public void setShipmentExportDeclaration(ShipmentExportDeclaration aShipmentExportDeclaration) {
		this.shipmentExportDeclaration = aShipmentExportDeclaration;
	}
	
	public Shipment getShipment() {
		return shipment;
	}
	
	public void setShipment(Shipment aShipment) {
		this.shipment = aShipment;
	}
}
