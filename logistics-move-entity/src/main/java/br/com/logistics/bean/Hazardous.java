/****************************************************************************************
 * The contents of this file are subject to the Overactive Source Public License Version
 * 1.1.3 ("License"); You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at http://overactive.sourceforge.net
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied.  See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * All copies of the Covered Code must include on each user interface screen:
 *    (i) the "Overactive Source" logo and
 *    (ii) the Overactive Source copyright notice
 * in the same form as they appear in the distribution.  See full license for
 * requirements.
 *
 * The Original Code is: Overactive Source
 * The Initial Developer of the Original Code is Ezequiel Cuellar.
 * Portions created by Ezequiel Cuellar are Copyright (C) 2005-2006 Ezequiel Cuellar;
 * All Rights Reserved.
 * Authors: Ezequiel Cuellar <overactive.source@gmail.com>
 ***************************************************************************************/

package br.com.logistics.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hazardous")
public class Hazardous implements Serializable {

	public static final long serialVersionUID = -21228787878787391L;

	@Id
	@Column(updatable = false, name = "ID", nullable = false)
	private Integer id;
	
	@Column(updatable = true, name = "HAZARDOUS", nullable = false, length = 1)
	private Boolean hazardous;
	
	@Column(updatable = true, name = "IDENTIFICATION_NUMBER", nullable = true, length = 45)
	private String identificationNumber;
	
	@Column(updatable = true, name = "MATERIAL_CLASS", nullable = true, length = 45)
	private String materialClass;
	
	@Column(updatable = true, name = "CLASS_QUALIFIER", nullable = true, length = 45)
	private String classQualifier;
	
	@Column(updatable = true, name = "MATERIAL_DESCRIPTION", nullable = true, length = 45)
	private String materialDescription;
	
	@Column(updatable = true, name = "EMERGENCY_CONTACT", nullable = true, length = 45)
	private String emergencyContact;
	
	@Column(updatable = true, name = "MATERIAL_PAGE", nullable = true, length = 45)
	private String materialPage;
	
	@Column(updatable = true, name = "FLASH_POINT_TEMP", nullable = true, length = 45)
	private String flashPointTemp;
	
	@Column(updatable = true, name = "SPECIAL_INSTRUCTIONS", nullable = true, length = 45)
	private String specialInstructions;
	
	@Column(updatable = true, name = "DESCRIPTION_OF_CLASS", nullable = true, length = 45)
	private String descriptionOfClass;

	public Hazardous() {
		this.setId(null);
		this.setHazardous(false);
		this.setIdentificationNumber("");
		this.setMaterialClass("");
		this.setClassQualifier("");
		this.setMaterialDescription("");
		this.setEmergencyContact("");
		this.setMaterialPage("");
		this.setFlashPointTemp("");
		this.setSpecialInstructions("");
		this.setDescriptionOfClass("");
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer anId) {
		this.id = anId;
	}

	public Boolean isHazardous() {
		return hazardous;
	}

	public void setHazardous(Boolean aHazardous) {
		this.hazardous = aHazardous;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String anIdentificationNumber) {
		this.identificationNumber = anIdentificationNumber;
	}

	public String getMaterialClass() {
		return materialClass;
	}

	public void setMaterialClass(String aMaterialClass) {
		this.materialClass = aMaterialClass;
	}

	public String getClassQualifier() {
		return classQualifier;
	}

	public void setClassQualifier(String aClassQualifier) {
		this.classQualifier = aClassQualifier;
	}
	
	public String getMaterialDescription() {
		return materialDescription;
	}

	public void setMaterialDescription(String aMaterialDescription) {
		this.materialDescription = aMaterialDescription;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String anEmergencyContact) {
		this.emergencyContact = anEmergencyContact;
	}

	public String getMaterialPage() {
		return materialPage;
	}

	public void setMaterialPage(String aMaterialPage) {
		this.materialPage = aMaterialPage;
	}

	public String getFlashPointTemp() {
		return flashPointTemp;
	}

	public void setFlashPointTemp(String aFlashPointTemp) {
		this.flashPointTemp = aFlashPointTemp;
	}

	public String getSpecialInstructions() {
		return specialInstructions;
	}

	public void setSpecialInstructions(String aSpecialInstructions) {
		this.specialInstructions = aSpecialInstructions;
	}

	public String getDescriptionOfClass() {
		return descriptionOfClass;
	}

	public void setDescriptionOfClass(String aDescriptionOfClass) {
		this.descriptionOfClass = aDescriptionOfClass;
	}
}
