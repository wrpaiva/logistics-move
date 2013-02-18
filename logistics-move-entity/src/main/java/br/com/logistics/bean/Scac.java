package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scac")
public class Scac implements Serializable {

    public static final long serialVersionUID = -12345678901234565L;

    @Id
    @Column(updatable = false, name = "ID", nullable = false, length = 10)
    private String id;

    @Column(updatable = true, name = "DESCRIPTION", nullable = false, length = 45)
    private String description;

    public Scac() {
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
