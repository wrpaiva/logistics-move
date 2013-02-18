package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle implements Serializable {

	public static final long serialVersionUID = -10228787878787320L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;

	@Column(updatable = true, name = "VEHICLE_TYPE_ID", nullable = true, length = 45)
	private String vehicleTypeId;
	
	@Column(updatable = true, name = "VEHICLE_ID", nullable = true, length = 45)
	private String vehicleId;
	
	@Column(updatable = true, name = "TITLE", nullable = true, length = 45)
	private String title;
	
	@Column(updatable = true, name = "TITLE_STATE", nullable = true, length = 45)
	private String titleState;

	public Vehicle() {
		this.setId(null);
		this.setVehicleTypeId("");
		this.setVehicleId("");
		this.setTitle("");
		this.setTitleState("");
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String aTitle) {
		this.title = aTitle;
	}

	public String getTitleState() {
		return titleState;
	}

	public void setTitleState(String aTitleState) {
		this.titleState = aTitleState;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String aVehicleId) {
		this.vehicleId = aVehicleId;
	}

	public String getVehicleTypeId() {
		return vehicleTypeId;
	}

	public void setVehicleTypeId(String aVehicleTypeId) {
		this.vehicleTypeId = aVehicleTypeId;
	}
}
