package br.com.logistics.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shipment_entity")
public class ShipmentEntity implements Serializable {

	public static final long serialVersionUID = -121876543903428743L;

	@Id
	@GeneratedValue
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "TRANSACTION_DUE_DAYS", nullable = true)
	private Integer transactionDueDays;
	
	@Column(updatable = true, name = "ENTITY_ID", nullable = true, length = 50)
	private String entityId;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "CONTACT_ID")
	private Contact contact;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "IDENTIFICATION_ID")
	private Identification identification;
	
	@Column(updatable = true, name = "SHIPPER", nullable = false, length = 1)	
	private Boolean shipper;
	
	@Column(updatable = true, name = "ULTIMATE_CONSIGNEE", nullable = false, length = 1)	
	private Boolean ultimateConsignee;
	
	@Column(updatable = true, name = "PARTY", nullable = false, length = 1)
	private Boolean party;
	
	@Column(updatable = true, name = "INTERMEDIATE_CONSIGNEE", nullable = false, length = 1)
	private Boolean intermediateConsignee;
	
	@Column(updatable = true, name = "SHIPMENT_AGENT", nullable = false, length = 1)
	private Boolean shipmentAgent;
	
	@Column(updatable = true, name = "INACTIVE", nullable = false, length = 1)
	private Boolean inactive;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "BILLING_ADDRESS_ID")
	private Address billingAddress;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CARRIER_ID")
	private List<Rate> rates;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CARRIER_ID")
	private List<CustomCharge> customCharges;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public Integer getTransactionDueDays() {
		return this.transactionDueDays;
	}

	public void setTransactionDueDays(Integer aTransactionDueDays) {
		this.transactionDueDays = aTransactionDueDays;
	}

	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(String anEntityId) {
		this.entityId = anEntityId;
	}
	
	public Boolean isInactive() {
		return this.inactive;
	}

	public void setInactive(Boolean anInactive) {
		this.inactive = anInactive;
	}
	
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address anAddress) {
		this.address = anAddress;
	}

	public Address getBillingAddress() {
		return this.billingAddress;
	}

	public void setBillingAddress(Address aBillingAddress) {
		this.billingAddress = aBillingAddress;
	}
	
	public List<Rate> getRates() {
		return this.rates;
	}

	public void setRates(List<Rate> aRates) {
		this.rates = aRates;
	}
	
	public List<CustomCharge> getCustomCharges() {
		return this.customCharges;
	}

	public void setCustomCharges(List<CustomCharge> aCustomCharges) {
		this.customCharges = aCustomCharges;
	}
	
	public Boolean isIntermediateConsignee() {
		return this.intermediateConsignee;
	}

	public void setIntermediateConsignee(Boolean anIntermediateConsignee) {
		this.intermediateConsignee = anIntermediateConsignee;
	}
	
	public Boolean isShipmentAgent() {
		return this.shipmentAgent;
	}

	public void setShipmentAgent(Boolean aShipmentAgent) {
		this.shipmentAgent = aShipmentAgent;
	}
	
	public Boolean isParty() {
		return this.party;
	}

	public void setParty(Boolean aParty) {
		this.party = aParty;
	}

	public Boolean isShipper() {
		return this.shipper;
	}

	public void setShipper(Boolean aShipper) {
		this.shipper = aShipper;
	}

	public Boolean isUltimateConsignee() {
		return this.ultimateConsignee;
	}

	public void setUltimateConsignee(Boolean anUltimateConsignee) {
		this.ultimateConsignee = anUltimateConsignee;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Identification getIdentification() {
		return identification;
	}

	public void setIdentification(Identification identification) {
		this.identification = identification;
	}
}
