package br.com.logistics.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "carrier")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
public class Carrier extends ShipmentEntity {

	public static final long serialVersionUID = -56781234509877123L;

	@Column(updatable = true, name = "TYPE", nullable = false, length = 10)
	private String type;

	@Column(updatable = true, name = "IATA_ACCOUNT_NUMBER", nullable = true, length = 10)
	private String iataAccountNumber;

	@Column(updatable = true, name = "AIRLINE_CODE_NUMBER", nullable = true, length = 10)
	private String airlineCodeNumber;

	@Column(updatable = true, name = "AIRWAY_BILL_NUMBERS", nullable = true, length = 200)
	private String airwayBillNumbers;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "FMC_ID")
	private Fmc fmc;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "IATA_ID")
	private Iata iata;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "SCAC_ID")
	private Scac scac;

	public Carrier() {
	}

	public String getType() {
		return this.type;
	}

	public void setType(String aType) {
		this.type = aType;
	}

	public String getIataAccountNumber() {
		return this.iataAccountNumber;
	}

	public void setIataAccountNumber(String aIataAccountNumber) {
		this.iataAccountNumber = aIataAccountNumber;
	}

	public String getAirlineCodeNumber() {
		return this.airlineCodeNumber;
	}

	public void setAirlineCodeNumber(String anAirlineCodeNumber) {
		this.airlineCodeNumber = anAirlineCodeNumber;
	}

	public Fmc getFmc() {
		return this.fmc;
	}

	public void setFmc(Fmc aFmc) {
		this.fmc = aFmc;
	}

	public Iata getIata() {
		return this.iata;
	}

	public void setIata(Iata aIata) {
		this.iata = aIata;
	}

	public String getAirwayBillNumbers() {
		return this.airwayBillNumbers;
	}

	public void setAirwayBillNumbers(String aAirwayBillNumbers) {
		this.airwayBillNumbers = aAirwayBillNumbers;
	}

	public Scac getScac() {
		return this.scac;
	}

	public void setScac(Scac anScac) {
		this.scac = anScac;
	}
}
