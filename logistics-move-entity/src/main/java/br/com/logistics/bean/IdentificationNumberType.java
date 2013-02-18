package br.com.logistics.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class IdentificationNumberType {

	@Id
	@GeneratedValue
	@Column(updatable = false, name = "ID", nullable = false)
    private String id;
	
	@Column(updatable = true, name = "DESCRIPTION", nullable = true, length = 10)
    private String description;

    public IdentificationNumberType() {
    }
    
    public IdentificationNumberType(String anId, String aDescription) {
        super();
        this.setId(anId);
        this.setDescription(aDescription);
    }
    
    public void setId(String anId) {
        this.id = anId;
    }

    public String getId() {
        return this.id;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getDescription() {
        return this.description;
    }
}
