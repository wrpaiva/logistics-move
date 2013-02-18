package br.com.logistics.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "commodity")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
public class Commodity extends Cargo {

	public static final long serialVersionUID = -81228787878787320L;

	@Column(updatable = true, name = "PIECES", nullable = true)
	private Integer pieces;
	
	@Column(updatable = true, name = "TOTAL_WEIGHT", nullable = false)
	private Float totalWeight;
	
	@Column(updatable = true, name = "TOTAL_VOLUME", nullable = true)
	private Float totalVolume;
	
	@Column(updatable = true, name = "MEASURE", nullable = true, length = 45)
	private String measure;
	
	@Column(updatable = true, name = "QUANTITY", nullable = true)
	private Float quantity;
	
	@Column(updatable = true, name = "UNIT", nullable = false, length = 45)
	private String unit;
	
	@Column(updatable = true, name = "UNITARY_VALUE", nullable = true)
	private Float unitaryValue;
	
	@Column(updatable = true, name = "TOTAL_VALUE", nullable = true)
	private Float totalValue;
	
	@Column(updatable = true, name = "NOTES", nullable = true, length = 200)
	private String notes;
	
	@Column(updatable = true, name = "BY_TOTALS", nullable = false, length = 1)
	private Boolean byTotals;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "LOCATION_ID")
	private Location location;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "HAZZARDOUS_ID")
	private Hazardous hazardous;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "CONTAINER_ID")
	private Container container;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "COMMODITY_IDENTIFICATION_ID")
	private CommodityIdentification commodityIdentification;

	public Commodity() {
		this.setPieces(1);
		this.setTotalWeight(new Float("0.0"));
		this.setTotalVolume(new Float("0.0"));
		this.setTotalValue(new Float("0.0"));
		this.setQuantity(new Float("0.0"));
		this.setUnitaryValue(new Float("0.0"));
		this.setMeasure("");
		this.setUnit("");
		this.setNotes("");
		this.setHazardous(new Hazardous());
		this.setCommodityIdentification(new CommodityIdentification());
		this.setLocation(null);
		this.setByTotals(false);
	}

	public CommodityIdentification getCommodityIdentification() {
		return commodityIdentification;
	}

	public void setCommodityIdentification(CommodityIdentification aCommodityIdentification) {
		this.commodityIdentification = aCommodityIdentification;
	}

	public Hazardous getHazardous() {
		return hazardous;
	}

	public void setHazardous(Hazardous aHazardous) {
		this.hazardous = aHazardous;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location aLocation) {
		this.location = aLocation;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String aMeasure) {
		this.measure = aMeasure;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String aNotes) {
		this.notes = aNotes;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float aQuantity) {
		this.quantity = aQuantity;
	}

	public Float getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Float aTotalValue) {
		this.totalValue = aTotalValue;
	}

	public Float getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(Float aTotalVolume) {
		this.totalVolume = aTotalVolume;
	}

	public Float getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(Float aTotalWeight) {
		this.totalWeight = aTotalWeight;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String aUnit) {
		this.unit = aUnit;
	}

	public Float getUnitaryValue() {
		return unitaryValue;
	}

	public void setUnitaryValue(Float aUnitaryValue) {
		this.unitaryValue = aUnitaryValue;
	}

	public Boolean isByTotals() {
		return byTotals;
	}

	public void setByTotals(Boolean aByTotals) {
		this.byTotals = aByTotals;
	}

	public Integer getPieces() {
		return pieces;
	}

	public void setPieces(Integer aPieces) {
		this.pieces = aPieces;
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container aContainer) {
		this.container = aContainer;
	}
}
