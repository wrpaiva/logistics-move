package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
public class Customer extends ShipmentEntity implements Serializable {

    public static final long serialVersionUID = -121987563245298120L;

    public Customer() {
    }

}
