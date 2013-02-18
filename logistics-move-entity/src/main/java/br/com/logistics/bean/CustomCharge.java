package br.com.logistics.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
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
@Table(name = "custom_charge")
public class CustomCharge implements Serializable {

    public static final long serialVersionUID = -6121232309095651L;

    @Id
    @Column(updatable = false, name = "ID", nullable = false)
    private Integer id;

    @Column(updatable = true, name = "DESCRIPTION", nullable = true, length = 50)
    private String description;
    
    @Column(updatable = true, name = "MIN", nullable = true)
    private Float min;
    
    @Column(updatable = true, name = "MAX", nullable = true)
    private Float max;
    
    @Column(updatable = true, name = "PRICE", nullable = true)
    private Float price;
    
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
    @JoinColumn(name = "CUSTOM_CHARGE_ID")
    private List<CustomChargeRange> customChargeRanges;

    public CustomCharge() {
        Calendar theCalendar = Calendar.getInstance();
        Long theTimeInMillis = new Long(theCalendar.getTimeInMillis());
        int theId = theTimeInMillis.intValue();

        this.setId(theId);
        this.setDescription("");
        this.setMax(new Float(0));
        this.setMin(new Float(0));
        this.setPrice(new Float(0));
        this.setCustomChargeRanges(new ArrayList<CustomChargeRange>());
    }

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

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float aPrice) {
        this.price = aPrice;
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

    public List<CustomChargeRange> getCustomChargeRanges() {
        return this.customChargeRanges;
    }

    public void setCustomChargeRanges(List<CustomChargeRange> aCustomChargeRanges) {
        this.customChargeRanges = aCustomChargeRanges;
    }
}