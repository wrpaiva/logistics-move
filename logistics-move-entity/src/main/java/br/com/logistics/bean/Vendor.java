package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
public class Vendor extends ShipmentEntity implements Serializable {

    public static final long serialVersionUID = -66677232390909454L;

    public Vendor() {
    }
}
