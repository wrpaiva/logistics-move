package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("freight_charge")
public class ShipmentFreightCharge extends ShipmentCharge implements Serializable {

	public static final long serialVersionUID = -10292323893567231L;

	@Column(updatable = true, name = "APPLY_BY", nullable = true, length = 10)
	private String applyBy;
	
	@Column(updatable = true, name = "NUMBER_OF_PIECES", nullable = true)
	private Integer numberOfPieces;
	
	@Column(updatable = true, name = "GROSS_WEIGHT", nullable = true)
	private Float grossWeight;
	
	@Column(updatable = true, name = "GROSS_VOLUME", nullable = true)
	private Float grossVolume;
	
	@Column(updatable = true, name = "CHARGEABLE_WEIGHT", nullable = true)
	private Float chargeableWeight;
	
	@Column(updatable = true, name = "CHARGE_TYPE", nullable = true, length = 15)
	private String chargeType;
	
	@Column(updatable = true, name = "RATE_CHARGE", nullable = true)
	private Float rateCharge;

	public ShipmentFreightCharge() {
		super();
		this.setApplyBy("");
		this.setChargeType("");
		this.setNumberOfPieces(0);
		this.setGrossWeight(new Float("0.0"));
		this.setGrossVolume(new Float("0.0"));
		this.setChargeableWeight(new Float("0.0"));
		this.setRateCharge(new Float("0.0"));
	}

	public String getApplyBy() {
		return this.applyBy;
	}

	public void setApplyBy(String anApplyBy) {
		this.applyBy = anApplyBy;
	}

	public Float getChargeableWeight() {
		return chargeableWeight;
	}

	public void setChargeableWeight(Float chargeableWeight) {
		this.chargeableWeight = chargeableWeight;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public Float getGrossVolume() {
		return grossVolume;
	}

	public void setGrossVolume(Float grossVolume) {
		this.grossVolume = grossVolume;
	}

	public Float getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(Float grossWeight) {
		this.grossWeight = grossWeight;
	}

	public Integer getNumberOfPieces() {
		return numberOfPieces;
	}

	public void setNumberOfPieces(Integer numberOfPieces) {
		this.numberOfPieces = numberOfPieces;
	}

	public Float getRateCharge() {
		return rateCharge;
	}

	public void setRateCharge(Float rateCharge) {
		this.rateCharge = rateCharge;
	}

}
