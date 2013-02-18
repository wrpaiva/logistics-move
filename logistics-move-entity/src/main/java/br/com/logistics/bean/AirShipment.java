package br.com.logistics.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value = "air")
public class AirShipment extends Shipment {

	public static final long serialVersionUID = -11232390009993412L;

	@Column(updatable = true, name = "DECLARED_VALUE_FOR_CARRIAGE", nullable = true, length = 10)
	private String declaredValueForCarriage = null;
	
	@Column(updatable = true, name = "DECLARED_VALUE_FOR_CUSTOMS", nullable = true, length = 10)
	private String declaredValueForCustoms = null;

	// Routing
	@Column(updatable = true, name = "FLIGHT_NUMBER", nullable = true, length = 10)
	private String flightNumber = null;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "FIRST_TRANSFER_DEPARTURE_AIRPORT_ID")
	private Port firstTransferDepartureAirport = null;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "FIRST_TRANSFER_CARRIER_ID")
	private Carrier firstTransferCarrier = null;
	
	@Column(updatable = true, name = "FIRST_TRANSFER_FLIGHT_NUMBER", nullable = true, length = 10)
	private String firstTransferFlight = null;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "SECOND_TRANSFER_DEPARTURE_AIRPORT_ID")
	private Port secondTransferDepartureAirport = null;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "SECOND_TRANSFER_CARRIER_ID")
	private Carrier secondTransferCarrier = null;

	@Column(updatable = true, name = "SECOND_TRANSFER_FLIGHT_NUMBER", nullable = true, length = 10)
	private String secondTransferFlight = null;

	public AirShipment() {
	}

	public String getDeclaredValueForCarriage() {
		return declaredValueForCarriage;
	}

	public void setDeclaredValueForCarriage(String aDeclaredValueForCarriage) {
		this.declaredValueForCarriage = aDeclaredValueForCarriage;
	}

	public String getDeclaredValueForCustoms() {
		return declaredValueForCustoms;
	}

	public void setDeclaredValueForCustoms(String aDeclaredValueForCustoms) {
		this.declaredValueForCustoms = aDeclaredValueForCustoms;
	}
	
	public Carrier getFirstTransferCarrier() {
		return firstTransferCarrier;
	}

	public void setFirstTransferCarrier(Carrier aFirstTransferCarrier) {
		this.firstTransferCarrier = aFirstTransferCarrier;
	}

	public Port getFirstTransferDepartureAirport() {
		return firstTransferDepartureAirport;
	}

	public void setFirstTransferDepartureAirport(Port aFirstTransferDepartureAirport) {
		this.firstTransferDepartureAirport = aFirstTransferDepartureAirport;
	}
	
	public String getFirstTransferFlight() {
		return firstTransferFlight;
	}

	public void setFirstTransferFlight(String aFirstTransferFlight) {
		this.firstTransferFlight = aFirstTransferFlight;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String aFlightNumber) {
		this.flightNumber = aFlightNumber;
	}
	
	public Carrier getSecondTransferCarrier() {
		return secondTransferCarrier;
	}

	public void setSecondTransferCarrier(Carrier aSecondTransferCarrier) {
		this.secondTransferCarrier = aSecondTransferCarrier;
	}
	
	public Port getSecondTransferDepartureAirport() {
		return secondTransferDepartureAirport;
	}

	public void setSecondTransferDepartureAirport(Port aSecondTransferDepartureAirport) {
		this.secondTransferDepartureAirport = aSecondTransferDepartureAirport;
	}

	public String getSecondTransferFlight() {
		return secondTransferFlight;
	}

	public void setSecondTransferFlight(String aSecondTransferFlight) {
		this.secondTransferFlight = aSecondTransferFlight;
	}
}
