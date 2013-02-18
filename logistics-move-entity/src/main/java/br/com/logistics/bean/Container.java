package br.com.logistics.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "container")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
public class Container extends Cargo {

	public static final long serialVersionUID = -61228787878787320L;

	@Column(updatable = true, name = "NUMBER", nullable = true, length = 45)
	private String number;
	
	@Column(updatable = true, name = "SEAL_NUMBER_1", nullable = true, length = 45)
	private String sealNumber1;
	
	@Column(updatable = true, name = "SEAL_NUMBER_2", nullable = true, length = 45)
	private String sealNumber2;
	
	@Column(updatable = true, name = "ADD_WEIGHT", nullable = false, length = 1)
	private Boolean addWeight;

	@OneToMany(mappedBy = "container", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	private List<Commodity> commodities;

	public Container() {
		this.setNumber("");
		this.setSealNumber1("");
		this.setSealNumber2("");
		this.setAddWeight(false);
		this.setCommodities(new ArrayList<Commodity>());
	}

	public void addCommodity(Commodity aCommodity) {
		List<Commodity> theCommodities = this.getCommodities();
		theCommodities.add(aCommodity);
	}
	
	public Boolean isAddWeight() {
		return addWeight;
	}

	public void setAddWeight(Boolean anAddWeight) {
		this.addWeight = anAddWeight;
	}

	public List<Commodity> getCommodities() {
		return commodities;
	}

	public void setCommodities(List<Commodity> aCommodities) {
		this.commodities = aCommodities;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String aNumber) {
		this.number = aNumber;
	}

	public String getSealNumber1() {
		return sealNumber1;
	}

	public void setSealNumber1(String aSealNumber1) {
		this.sealNumber1 = aSealNumber1;
	}

	public String getSealNumber2() {
		return sealNumber2;
	}

	public void setSealNumber2(String aSealNumber2) {
		this.sealNumber2 = aSealNumber2;
	}
}