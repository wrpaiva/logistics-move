package br.com.logistics.bean;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "land")
public class GroundShipment extends Shipment {

	public static final long serialVersionUID = -114561078193412L;
	
	@Column(updatable = true, name = "VEHICLE_NUMBER", nullable = true, length = 10)
	private String vehicleNumber;
	
	@Column(updatable = true, name = "PRO_NUMBER", nullable = true, length = 10)
	private String proNumber;
	
	@Column(updatable = true, name = "TRACKING_NUMBER", nullable = true, length = 10)
	private String trackingNumber;
	
	@Column(updatable = true, name = "DRIVER_NAME", nullable = true, length = 10)
	private String driverName;
	
	@Column(updatable = true, name = "DRIVER_LICENSE_NUMBER", nullable = true, length = 10)
	private String driverLicenseNumber;

	public GroundShipment() {
	}

	public String getDriverLicenseNumber() {
		return driverLicenseNumber;
	}

	public void setDriverLicenseNumber(String aDriverLicenseNumber) {
		this.driverLicenseNumber = aDriverLicenseNumber;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String aDriverName) {
		this.driverName = aDriverName;
	}

	public String getProNumber() {
		return proNumber;
	}

	public void setProNumber(String aProNumber) {
		this.proNumber = aProNumber;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String aTrackingNumber) {
		this.trackingNumber = aTrackingNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String aVehicleNumber) {
		this.vehicleNumber = aVehicleNumber;
	}
}
