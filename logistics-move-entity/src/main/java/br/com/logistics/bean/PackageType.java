package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "package_type")
public class PackageType implements Serializable {

	public static final long serialVersionUID = -71228787878787320L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "DESCRIPTION", nullable = false, length = 100)
	private String description;
	
	@Column(updatable = true, name = "LENGTH", nullable = false)
	private Float length;
	
	@Column(updatable = true, name = "WIDTH", nullable = false)
	private Float width;
	
	@Column(updatable = true, name = "HEIGHT", nullable = false)
	private Float height;
	
	@Column(updatable = true, name = "VOLUME", nullable = false)
	private Float volume;
	
	@Column(updatable = true, name = "WEIGHT", nullable = false)
	private Float weight;

	public PackageType() {
		this.setId(null);
		this.setDescription("");
		this.setLength(new Float("0.0"));
		this.setWidth(new Float("0.0"));
		this.setHeight(new Float("0.0"));
		this.setVolume(new Float("0.0"));
		this.setWeight(new Float("0.0"));
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String aDescription) {
		this.description = aDescription;
	}

	public Float getHeight() {
		return this.height;
	}

	public void setHeight(Float aHeight) {
		this.height = aHeight;
	}

	public Float getLength() {
		return this.length;
	}

	public void setLength(Float aLength) {
		this.length = aLength;
	}

	public Float getVolume() {
		return this.volume;
	}

	public void setVolume(Float aVolume) {
		this.volume = aVolume;
	}

	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float aWeight) {
		this.weight = aWeight;
	}

	public Float getWidth() {
		return this.width;
	}

	public void setWidth(Float aWidth) {
		this.width = aWidth;
	}
}
