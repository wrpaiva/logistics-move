package br.com.logistics.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rate")
public class Rate implements Serializable {

    public static final long serialVersionUID = -36111293290511123L;

    @Id
    @Column(updatable = false, name = "ID", nullable = false)
    private Integer id;

    @Column(updatable = true, name = "DESCRIPTION", nullable = true, length = 50)
    private String description;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "ORIGIN_PORT_ID")
    private Port origin;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "DESTINATION_PORT_ID")
    private Port destination;
    
    @Column(updatable = true, name = "MIN", nullable = true)
    private Float min;
    
    @Column(updatable = true, name = "MAX", nullable = true)
    private Float max;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "METHOD_ID")
    private Method method;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "MEASURE_TYPE_ID")
    private MeasureType measureType;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "MEASURE_UNIT_ID")
    private MeasureUnit measureUnit;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch=FetchType.LAZY)
    @JoinColumn(name = "CHARGE_ID")
    private Charge charge;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "RATE_ID")
    private List<RateRange> rateRanges;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer anId) {
        this.id = anId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public Port getOrigin() {
        return this.origin;
    }

    public void setOrigin(Port anOrigin) {
        this.origin = anOrigin;
    }

    public Port getDestination() {
        return this.destination;
    }

    public void setDestination(Port aDestination) {
        this.destination = aDestination;
    }

    public Float getMin() {
        return this.min;
    }

    public void setMin(Float aMin) {
        this.min = aMin;
    }

    public Float getMax() {
        return this.max;
    }

    public void setMax(Float aMax) {
        this.max = aMax;
    }

    public Method getMethod() {
        return this.method;
    }

    public void setMethod(Method aMethod) {
        this.method = aMethod;
    }

    public MeasureType getMeasureType() {
        return this.measureType;
    }

    public void setMeasureType(MeasureType aMeasureType) {
        this.measureType = aMeasureType;
    }

    public MeasureUnit getMeasureUnit() {
        return this.measureUnit;
    }

    public void setMeasureUnit(MeasureUnit aMeasureUnit) {
        this.measureUnit = aMeasureUnit;
    }
    
    public Charge getCharge() {
        return this.charge;
    }

    public void setCharge(Charge aCharge) {
        this.charge = aCharge;
    }

    public List<RateRange> getRateRanges() {
        return this.rateRanges;
    }

    public void setRateRanges(List<RateRange> aRateRanges) {
        this.rateRanges = aRateRanges;
    }
}