package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "measure_unit")
public class MeasureUnit implements Serializable {

    public static final long serialVersionUID = -2787823232107122L;
    
    @Id
    @Column(updatable = false, name = "ID", nullable = false, length = 50)
    private String id;

    @Column(updatable = false, name = "DESCRIPTION", nullable = false, length = 100)
    private String description;
    
    @Column(updatable = false, name = "TYPE", nullable = false, length = 20)
    private String type;

    public MeasureUnit() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String anId) {
        this.id = anId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String aType) {
        this.type = aType;
    }
}
