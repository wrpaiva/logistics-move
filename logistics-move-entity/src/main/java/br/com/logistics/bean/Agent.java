package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "agent")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
public class Agent extends ShipmentEntity implements Serializable {

    public static final long serialVersionUID = -342112344051256740L;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "FMC_ID")
    private Fmc fmc;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "IATA_ID")
    private Iata iata;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "SCAC_ID")
    private Scac scac;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "PORT_CODE_ID")
    private PortCode portCode;

    public Agent() {
    }

    public Fmc getFmc() {
        return this.fmc;
    }

    public void setFmc(Fmc aFmc) {
        this.fmc = aFmc;
    }

    public PortCode getPortCode() {
        return this.portCode;
    }

    public void setPortCode(PortCode aPortCode) {
        this.portCode = aPortCode;
    }

    public Scac getScac() {
        return this.scac;
    }

    public void setScac(Scac anScac) {
        this.scac = anScac;
    }

    public Iata getIata() {
        return this.iata;
    }

    public void setIata(Iata aIata) {
        this.iata = aIata;
    }
}
