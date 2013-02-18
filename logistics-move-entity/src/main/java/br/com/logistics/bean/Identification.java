package br.com.logistics.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "identification")
public class Identification {
	
	@Id
	@GeneratedValue
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "NUMBER", nullable = true, length = 50)
	private String number;
	
	@Column(updatable = true, name = "NUMBER_TYPE", nullable = true, length = 10)
	private String type;
	
	@Column(updatable = true, name = "PAYMENT_TYPE", nullable = true, length = 10)
	private String paymentType;
	
	@Column(updatable = true, name = "CREDIT_LIMIT", nullable = true)
	private Float creditLimit;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Float getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Float creditLimit) {
		this.creditLimit = creditLimit;
	}
}
