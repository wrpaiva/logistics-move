package br.com.logistics.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value = "ocean")
public class OceanShipment extends Shipment {

	public static final long serialVersionUID = -69161074567412L;

	// Routing
	@Column(updatable = true, name = "POINT_OF_ORIGIN_OR_FTZ_NUMBER", nullable = true, length = 10)
	private String pointOfOriginOrFTZNumber;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "PORT_OF_LOADING_ID")	
	private Port portOfLoading;
	
	@Column(updatable = true, name = "LOADING_PIER_OR_TERMINAL", nullable = true, length = 10)
	private String loadingPierOrTerminal;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "PRE_CARRIAGE_BY_ID")
	private Carrier preCarriageBy;
	
	@Column(updatable = true, name = "PLACE_OF_RECEIPT_BY_PRE_CARRIER", nullable = true, length = 10)
	private String placeOfReceiptByPreCarrier;
	
	@Column(updatable = true, name = "VESSEL_NAME", nullable = true, length = 50)
	private String vesselName;
	
	@Column(updatable = true, name = "VESSEL_FLAG", nullable = true, length = 80)
	private String vesselFlag;
	
	@Column(updatable = true, name = "VOYAGE_IDENTIFICATION", nullable = true, length = 10)
	private String voyageIdentification;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "PORT_OF_UNLOADING_ID")
	private Port portOfUnloading;
	
	@Column(updatable = true, name = "PLACE_OF_DELIVERY_BY_ON_CARRIER", nullable = true, length = 10)
	private String placeOfDeliveryByOnCarrier;

	public OceanShipment() {
	}

	public String getLoadingPierOrTerminal() {
		return loadingPierOrTerminal;
	}

	public void setLoadingPierOrTerminal(String aLoadingPierOrTerminal) {
		this.loadingPierOrTerminal = aLoadingPierOrTerminal;
	}

	public String getPlaceOfDeliveryByOnCarrier() {
		return placeOfDeliveryByOnCarrier;
	}

	public void setPlaceOfDeliveryByOnCarrier(String aPlaceOfDeliveryByOnCarrier) {
		this.placeOfDeliveryByOnCarrier = aPlaceOfDeliveryByOnCarrier;
	}

	public String getPlaceOfReceiptByPreCarrier() {
		return placeOfReceiptByPreCarrier;
	}

	public void setPlaceOfReceiptByPreCarrier(String aPlaceOfReceiptByPreCarrier) {
		this.placeOfReceiptByPreCarrier = aPlaceOfReceiptByPreCarrier;
	}

	public String getPointOfOriginOrFTZNumber() {
		return pointOfOriginOrFTZNumber;
	}

	public void setPointOfOriginOrFTZNumber(String aPointOfOriginOrFTZNumber) {
		this.pointOfOriginOrFTZNumber = aPointOfOriginOrFTZNumber;
	}

	public Port getPortOfLoading() {
		return portOfLoading;
	}

	public void setPortOfLoading(Port aPortOfLoading) {
		this.portOfLoading = aPortOfLoading;
	}

	public Port getPortOfUnloading() {
		return portOfUnloading;
	}

	public void setPortOfUnloading(Port aPortOfUnloading) {
		this.portOfUnloading = aPortOfUnloading;
	}

	public Carrier getPreCarriageBy() {
		return preCarriageBy;
	}

	public void setPreCarriageBy(Carrier aPreCarriageBy) {
		this.preCarriageBy = aPreCarriageBy;
	}

	public String getVesselFlag() {
		return vesselFlag;
	}

	public void setVesselFlag(String aVesselFlag) {
		this.vesselFlag = aVesselFlag;
	}

	public String getVesselName() {
		return vesselName;
	}

	public void setVesselName(String aVesselName) {
		this.vesselName = aVesselName;
	}

	public String getVoyageIdentification() {
		return voyageIdentification;
	}

	public void setVoyageIdentification(String aVoyageIdentification) {
		this.voyageIdentification = aVoyageIdentification;
	}
}
