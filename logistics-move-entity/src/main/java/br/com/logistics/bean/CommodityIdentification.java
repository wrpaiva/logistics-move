package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "commodity_identification")
public class CommodityIdentification implements Serializable {

	public static final long serialVersionUID = -22228787878787322L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;

	@Column(updatable = true, name = "DESCRIPTION", nullable = true, length = 100)
	private String description;
	
	@Column(updatable = true, name = "MODEL", nullable = true, length = 45)
	private String model;
	
	@Column(updatable = true, name = "SERIAL", nullable = true, length = 45)
	private String serial;

	@Column(updatable = true, name = "INVOICE_NUMBER", nullable = true, length = 45)
	private String invoiceNumber;
	
	@Column(updatable = true, name = "PO_NUMBER", nullable = true, length = 45)
	private String poNumber;
	
	@Column(updatable = true, name = "LOT_NUMBER", nullable = true, length = 45)
	private String lotNumber;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_DEFINITION_ID")
	private ItemDefinition partNumber;

	public CommodityIdentification() {
		this.setId(null);
		this.setDescription("");
		this.setModel("");
		this.setSerial("");
		this.setInvoiceNumber("");
		this.setPoNumber("");
		this.setLotNumber("");
		this.setPartNumber(null);
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

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String anInvoiceNumber) {
		this.invoiceNumber = anInvoiceNumber;
	}

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String aLotNumber) {
		this.lotNumber = aLotNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String aModel) {
		this.model = aModel;
	}

	public ItemDefinition getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(ItemDefinition aPartNumber) {
		this.partNumber = aPartNumber;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String aPoNumber) {
		this.poNumber = aPoNumber;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String aSerial) {
		this.serial = aSerial;
	}
}