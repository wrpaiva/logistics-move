package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "method")
public class Method implements Serializable {
    
    public static final long serialVersionUID = -91212126762100122L;
    
    public static final String all = "all";
    
    public static final String land = "land";
    
    public static final String ocean = "ocean";
    
    public static final String air = "air";     

    @Id
    @Column(updatable = false, name = "ID", nullable = false, length = 50)
    private String id;
    
    @Column(updatable = false, name = "DESCRIPTION", nullable = false, length = 100)
    private String description;
    
    @Column(updatable = false, name = "TYPE", nullable = false, length = 20)
    private String type;

    public Method() {
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
