package br.com.logistics.bean;

public class PaymentType {

    private String id;
    private String description;

    public PaymentType() {
    }
    
    public PaymentType(String anId, String aDescription) {
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
