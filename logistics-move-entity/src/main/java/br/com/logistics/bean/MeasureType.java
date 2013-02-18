package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "measure_type")
public class MeasureType implements Serializable {

	public static final long serialVersionUID = -44112449944664464L;

	public static final String WEIGHT = "weight";

	public static final String VALUE = "value";

	public static final String TIME = "time";

	public static final String CONTAINER = "container";

	public static final String VOLUME = "volume";

	public static final String PIECES = "pieces";

	@Id
	@Column(updatable = false, name = "ID", nullable = false, length = 50)
	private String id;

	@Column(updatable = false, name = "DESCRIPTION", nullable = false, length = 100)
	private String description;

	public MeasureType() {
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

	public boolean typeOf(String aType) {
		return this.getId().equals(aType);
	}
}
