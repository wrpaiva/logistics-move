package br.com.logistics.bean;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shipment")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
public class Shipment implements Serializable {

	public static final long serialVersionUID = -5666712000765621L;
	
	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "NUMBER", nullable = true, length = 10)
	private String name;
	
	@Column(updatable = true, name = "STATUS", nullable = true, length = 25)
	private String status;
	
	@Column(updatable = true, name = "INCOMMING", nullable = false, length = 1)
	private Boolean incomming;
	
	@Column(updatable = true, name = "BOOKING_NUMBER", nullable = true, length = 10)
	private String bookingNumber;
	
	@Column(updatable = true, name = "EXECUTED_PLACE", nullable = true, length = 10)
	private String executedPlace;
	
	@Column(updatable = true, name = "NUMBER", nullable = true, length = 10)
	private String number;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "EXECUTED_BY_ID")
	private User executedBy;
	
	@Column(updatable = true, name = "EXECUTED_DATE", nullable = true)
	private Date executedDate;
	
	@Column(updatable = true, name = "DECLARED_VALUE", nullable = true, length = 10)
	private String declaredValue;
	
	@Column(updatable = true, name = "DESCRIPTION_OF_GOODS", nullable = true, length = 10)
	private String descriptionOfGoods;

	// Entities
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "SHIPPER_ID")
	private ShipmentEntity shipper;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "ULTIMATE_CONSIGNEE_ID")
	private ShipmentEntity ultimateConsignee;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "NOTIFY_PARTY_ID")
	private ShipmentEntity notifyParty;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "INTERMEDIATE_CONSIGNEE_ID")
	private ShipmentEntity intermediateConsignee;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "FORWARDING_AGENT_ID")
	private ShipmentEntity forwardingAgent;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "DESTINATION_AGENT_ID")
	private ShipmentEntity destinationAgent;

	// Routing
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "CARRIER_ID")
	private Carrier carrier;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "MODE_OF_TRANSPORTATION_ID")
	private Method modeOfTransportation;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPARTURE_PORT_ID")
	private Port departurePort;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "ARRIVAL_PORT_ID")
	private Port arrivalPort;
	
	@Column(updatable = true, name = "DEPARTURE_DATE", nullable = true)
	private Date departureDate;
	
	@Column(updatable = true, name = "ARRIVAL_DATE", nullable = true)
	private Date arrivalDate;
	
	@Column(updatable = true, name = "DEPARTURE_TIME", nullable = true)
	private Time departureTime;
	
	@Column(updatable = true, name = "ARRIVAL_TIME", nullable = true)
	private Time arrivalTime;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "ORIGIN_CODE_ID")
	private PortCode originCode;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "DESTINATION_CODE_ID")
	private PortCode destinationCode;
	
	@Column(updatable = true, name = "ROUTED_TRANSACTION", nullable = false, length = 1)
	private Boolean routedTransaction;
	
	@Column(updatable = true, name = "RELATED_COMPANIES", nullable = false, length = 1)
	private Boolean relatedCompanies;

	// Proof Of Delivery
	@Column(updatable = true, name = "DELIVERY_DATE", nullable = true)
	private Date deliveryDate;
	
	@Column(updatable = true, name = "DELIVERY_TIME", nullable = true)
	private Time deliveryTime;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "RECEIVED_BY_ID")
	private Carrier receivedBy;
	
	@Column(updatable = true, name = "PROOF_OF_DELIVERY", nullable = true, length = 100)
	private String proofOfDeliveryComments;

	// Charges
	@Column(updatable = true, name = "TOTAL_PIECES", nullable = true)
	private Integer totalPieces;
	
	@Column(updatable = true, name = "TOTAL_WEIGHT", nullable = true)
	private Float totalWeight;
	
	@Column(updatable = true, name = "TOTAL_VOLUME", nullable = true)
	private Float totalVolume;
	
	@Column(updatable = true, name = "GRAND_TOTAL", nullable = true)
	private Float grandTotal;
	
	@Column(updatable = true, name = "TOTAL_EXPENSE", nullable = true)
	private Float totalExpense;
	
	@Column(updatable = true, name = "TOTAL_INCOME", nullable = true)
	private Float totalIncome;
	
	@Column(updatable = true, name = "TOTAL_PROFIT", nullable = true)
	private Float totalProfit;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "SHIPMENT_ID")
	private List<ShipmentCharge> shipmentCharges;
	
	@OneToMany(mappedBy = "shipment", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	private List<Cargo> cargo;

	public static final String WAITING_FOR_INSTRUCTIONS = "WAITING_FOR_INSTRUCTIONS";
	public static final String LOADED = "LOADED";
	public static final String IN_TRANSIT = "IN_TRANSIT";
	public static final String RECEIVED = "RECEIVED";
	public static final String DELIVERED = "DELIVERED";

	public Shipment() {
		this.setCargo(new ArrayList<Cargo>());
		this.setShipmentCharges(new ArrayList<ShipmentCharge>());
		this.setStatus(WAITING_FOR_INSTRUCTIONS);
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String aStatus) {
		this.status = aStatus;
	}
	
	public Boolean isIncomming() {
		return this.incomming;
	}

	public void setIncomming(Boolean anIncomming) {
		this.incomming = anIncomming;
	}

	public Date getArrivalDate() {
		return this.arrivalDate;
	}

	public void setArrivalDate(Date aArrivalDate) {
		this.arrivalDate = aArrivalDate;
	}

	public Port getArrivalPort() {
		return this.arrivalPort;
	}

	public void setArrivalPort(Port aArrivalPort) {
		this.arrivalPort = aArrivalPort;
	}

	public Time getArrivalTime() {
		return this.arrivalTime;
	}

	public void setArrivalTime(Time aArrivalTime) {
		this.arrivalTime = aArrivalTime;
	}
	
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String aNumber) {
		this.number = aNumber;
	}
	
	public String getBookingNumber() {
		return this.bookingNumber;
	}

	public void setBookingNumber(String aBookingNumber) {
		this.bookingNumber = aBookingNumber;
	}

	public Carrier getCarrier() {
		return this.carrier;
	}

	public void setCarrier(Carrier aCarrier) {
		this.carrier = aCarrier;
	}

	public String getDeclaredValue() {
		return this.declaredValue;
	}

	public void setDeclaredValue(String aDeclaredValue) {
		this.declaredValue = aDeclaredValue;
	}
	
	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date aDeliveryDate) {
		this.deliveryDate = aDeliveryDate;
	}
	
	public Time getDeliveryTime() {
		return this.deliveryTime;
	}

	public void setDeliveryTime(Time aDeliveryTime) {
		this.deliveryTime = aDeliveryTime;
	}

	public Date getDepartureDate() {
		return this.departureDate;
	}

	public void setDepartureDate(Date aDepartureDate) {
		this.departureDate = aDepartureDate;
	}

	public Port getDeparturePort() {
		return this.departurePort;
	}

	public void setDeparturePort(Port aDeparturePort) {
		this.departurePort = aDeparturePort;
	}
	
	public Time getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(Time aDepartureTime) {
		this.departureTime = aDepartureTime;
	}
	
	public String getDescriptionOfGoods() {
		return this.descriptionOfGoods;
	}

	public void setDescriptionOfGoods(String aDescriptionOfGoods) {
		this.descriptionOfGoods = aDescriptionOfGoods;
	}

	public ShipmentEntity getDestinationAgent() {
		return this.destinationAgent;
	}

	public void setDestinationAgent(ShipmentEntity aDestinationAgent) {
		this.destinationAgent = aDestinationAgent;
	}

	public PortCode getDestinationCode() {
		return this.destinationCode;
	}

	public void setDestinationCode(PortCode aDestinationCode) {
		this.destinationCode = aDestinationCode;
	}
	
	public User getExecutedBy() {
		return this.executedBy;
	}

	public void setExecutedBy(User aExectuedBy) {
		this.executedBy = aExectuedBy;
	}
	
	public Date getExecutedDate() {
		return this.executedDate;
	}

	public void setExecutedDate(Date aExecutedDate) {
		this.executedDate = aExecutedDate;
	}

	public String getExecutedPlace() {
		return this.executedPlace;
	}

	public void setExecutedPlace(String aExecutedPlace) {
		this.executedPlace = aExecutedPlace;
	}

	public ShipmentEntity getForwardingAgent() {
		return this.forwardingAgent;
	}

	public void setForwardingAgent(ShipmentEntity aForwardingAgent) {
		this.forwardingAgent = aForwardingAgent;
	}
	
	public ShipmentEntity getIntermediateConsignee() {
		return this.intermediateConsignee;
	}

	public void setIntermediateConsignee(ShipmentEntity aIntermediateConsignee) {
		this.intermediateConsignee = aIntermediateConsignee;
	}
	
	public Method getModeOfTransportation() {
		return this.modeOfTransportation;
	}

	public void setModeOfTransportation(Method aModeOfTransportation) {
		this.modeOfTransportation = aModeOfTransportation;
	}

	@Column(updatable = true, name = "NAME", nullable = false, length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String aName) {
		this.name = aName;
	}
	
	public ShipmentEntity getNotifyParty() {
		return this.notifyParty;
	}

	public void setNotifyParty(ShipmentEntity aNotifyParty) {
		this.notifyParty = aNotifyParty;
	}

	public PortCode getOriginCode() {
		return this.originCode;
	}

	public void setOriginCode(PortCode aOriginCode) {
		this.originCode = aOriginCode;
	}

	public String getProofOfDeliveryComments() {
		return this.proofOfDeliveryComments;
	}

	public void setProofOfDeliveryComments(String aProofOfDeliveryComments) {
		this.proofOfDeliveryComments = aProofOfDeliveryComments;
	}

	public Carrier getReceivedBy() {
		return this.receivedBy;
	}

	public void setReceivedBy(Carrier aReceivedBy) {
		this.receivedBy = aReceivedBy;
	}
	
	public Boolean isRelatedCompanies() {
		return this.relatedCompanies;
	}

	public void setRelatedCompanies(Boolean aRelatedCompanies) {
		this.relatedCompanies = aRelatedCompanies;
	}

	public Boolean isRoutedTransaction() {
		return this.routedTransaction;
	}

	public void setRoutedTransaction(Boolean aRoutedTransaction) {
		this.routedTransaction = aRoutedTransaction;
	}

	public Float getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Float grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Float getTotalExpense() {
		return totalExpense;
	}

	public void setTotalExpense(Float aTotalExpense) {
		this.totalExpense = aTotalExpense;
	}

	public Float getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(Float aTotalIncome) {
		this.totalIncome = aTotalIncome;
	}

	public Float getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(Float aTotalProfit) {
		this.totalProfit = aTotalProfit;
	}
	
	public Integer getTotalPieces() {
		return totalPieces;
	}

	public void setTotalPieces(Integer totalPieces) {
		this.totalPieces = totalPieces;
	}
	
	public Float getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(Float totalVolume) {
		this.totalVolume = totalVolume;
	}

	public Float getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(Float totalWeight) {
		this.totalWeight = totalWeight;
	}
	
	public ShipmentEntity getShipper() {
		return this.shipper;
	}

	public void setShipper(ShipmentEntity aShipper) {
		this.shipper = aShipper;
	}
	
	public ShipmentEntity getUltimateConsignee() {
		return this.ultimateConsignee;
	}

	public void setUltimateConsignee(ShipmentEntity aUltimateConsignee) {
		this.ultimateConsignee = aUltimateConsignee;
	}

	public List<ShipmentCharge> getShipmentCharges() {
		return this.shipmentCharges;
	}

	public void setShipmentCharges(List<ShipmentCharge> aShipmentCharges) {
		this.shipmentCharges = aShipmentCharges;
	}
	
	public List<Cargo> getCargo() {
		return this.cargo;
	}

	public void setCargo(List<Cargo> aCargo) {
		this.cargo = aCargo;
	}
}
