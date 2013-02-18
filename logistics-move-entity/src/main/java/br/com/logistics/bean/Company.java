package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "company")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
public class Company extends ShipmentEntity implements Serializable {

    public static final long serialVersionUID = -59212198743431122L;

    @Column(updatable = true, name = "IDENTIFIER", nullable = false, length = 30)
    private String identifier;
   
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "IATA_ID")
    private Iata iata;
  
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "FMC_ID")
    private Fmc fmc;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "SCAC_ID")
    private Scac scac;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "PORT_CODE_ID")
    private PortCode portCode;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Company() {
        this.setIdentifier("");
    }

    public Iata getIata() {
        return this.iata;
    }

    public void setIata(Iata aIata) {
        this.iata = aIata;
    }

    public Fmc getFmc() {
        return this.fmc;
    }

    public void setFmc(Fmc aFmc) {
        this.fmc = aFmc;
    }

    public Scac getScac() {
        return this.scac;
    }

    public void setScac(Scac aScac) {
        this.scac = aScac;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String anIdentifier) {
        this.identifier = anIdentifier;
    }
    public PortCode getPortCode() {
        return this.portCode;
    }

    public void setPortCode(PortCode aPortCode) {
        this.portCode = aPortCode;
    }

}