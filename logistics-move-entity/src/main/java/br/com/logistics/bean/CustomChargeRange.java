package br.com.logistics.bean;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "custom_charge_range")
public class CustomChargeRange implements Serializable {

    public static final long serialVersionUID = -55511476540214425L;

    @Id
    @Column(updatable = false, name = "ID", nullable = false)
    private Integer id;
    
    @Column(updatable = true, name = "CHARGE", nullable = true)
    private Float charge;
    
    @Column(updatable = true, name = "RANGE", nullable = true)
    private Float range;

    public CustomChargeRange() {
        Calendar theCalendar = Calendar.getInstance();
        Long theTimeInMillis = new Long(theCalendar.getTimeInMillis());
        int theId = theTimeInMillis.intValue();
        this.setId(theId);
        this.setCharge(new Float(0));
        this.setRange(new Float(0));
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer anId) {
        this.id = anId;
    }

    public Float getRange() {
        return this.range;
    }

    public void setRange(Float aRange) {
        this.range = aRange;
    }

    public Float getCharge() {
        return this.charge;
    }

    public void setCharge(Float aCharge) {
        this.charge = aCharge;
    }
}
