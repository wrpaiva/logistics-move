package br.com.logistics.bean;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shipment_charge")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
@DiscriminatorValue("charge")
public class ShipmentCharge implements Serializable {

	public static final long serialVersionUID = -23781034256671298L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "INCOME", nullable = false, length = 1)
	private Boolean income;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "CHARGE_ID")
	private Charge charge;
	
	@Column(updatable = true, name = "DESCRIPTION", nullable = true, length = 50)
	private String description;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "APPLY_TO")
	private ShipmentEntity applyTo;
	
	@Column(updatable = true, name = "PAID_AS", nullable = true, length = 10)
	private String paidAs;
	
	@Column(updatable = true, name = "QUANTITY", nullable = true)
	private Float quantity;
	
	@Column(updatable = true, name = "UNIT", nullable = true, length = 45)
	private String unit;
	
	@Column(updatable = true, name = "PRICE", nullable = true)
	private Float price;
	
	@Column(updatable = true, name = "AMOUNT", nullable = true)
	private Float amount;

	public ShipmentCharge() {
		Calendar theCalendar = Calendar.getInstance();
		Long theTimeInMillis = new Long(theCalendar.getTimeInMillis());
		int theId = theTimeInMillis.intValue();

		this.setId(theId);
		this.setDescription("");
		this.setPaidAs("");
		this.setIncome(true);
		this.setQuantity(new Float("0.0"));
		this.setUnit("");
		this.setPrice(new Float("0.0"));
		this.setAmount(new Float("0.0"));
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public Boolean isIncome() {
		return this.income;
	}

	public void setIncome(Boolean anIncome) {
		this.income = anIncome;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String aDescription) {
		this.description = aDescription;
	}

	public ShipmentEntity getApplyTo() {
		return applyTo;
	}

	public void setApplyTo(ShipmentEntity anApplyTo) {
		this.applyTo = anApplyTo;
	}

	public String getPaidAs() {
		return this.paidAs;
	}

	public void setPaidAs(String aPaidAs) {
		this.paidAs = aPaidAs;
	}

	public Charge getCharge() {
		return this.charge;
	}

	public void setCharge(Charge aCharge) {
		this.charge = aCharge;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
