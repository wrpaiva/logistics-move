package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fmc")
public class Fmc implements Serializable {

    public static final long serialVersionUID = -01111143212123456L;

    @Id
    @Column(updatable = false, name = "ID", nullable = false, length = 10)
    private String id;
  
    @Column(updatable = true, name = "DESCRIPTION", nullable = false, length = 80)
    private String description;

    public Fmc() {
        this.setId("");
        this.setDescription("");
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
}
