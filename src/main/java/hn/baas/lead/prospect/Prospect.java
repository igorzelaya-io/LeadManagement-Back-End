package hn.baas.lead.prospect;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@JsonSerialize
@Table(name = Prospect.TABLE_NAME,schema = "LeadManagmentDB")
public class Prospect {
	public static final String TABLE_NAME = "management";
	public Prospect(){
		prospectId = UUID.randomUUID().toString();
	}
	@JsonProperty
	@Id
	@Column(name = "prospectId")
	private String prospectId;
	
	
	@JsonProperty
	@Column(name = "prospectName")
	private String prospectName;
	
	
	@JsonProperty
	@Column(name = "prospectOrgName")
	private String prospectOrgName;

	
	@JsonProperty
	@Column(name = "prospectPhone")
	private String prospectPhone;
	
	
	@JsonProperty
	@Column(name = "prospectCountry")
	private String prospectCountry;
	
	
	@JsonProperty
	@Column(name = "prospectMail")
	private String prospectEmail;
	
	
	@JsonProperty
	@Column(name = "prospectStatusCode")
	private ProspectStatus prospectStatusCode;
	
	
	@JsonProperty
	@Column(name = "prospectComment")
	private String prospectComments;
	
	public Prospect(String prospectId, String prospectName , String prospectOrgName, String prospectPhone, String prospectCountry, String prospectEmail, ProspectStatus prospectStatusCode, String prospectComments) {
		this.prospectId = prospectId;
		this.prospectName = prospectName;
		this.prospectOrgName = prospectOrgName;
		this.prospectPhone = prospectPhone;
		this.prospectCountry = prospectCountry;
		this.prospectEmail = prospectEmail;
		this.prospectStatusCode = prospectStatusCode;
		this.prospectComments = prospectComments;
	}
	public void setProspectId(String prospectId) {
		this.prospectId = prospectId;
	}
	
	
	public String getProspectId() {
		return this.prospectId;
	}
	
	
	public void setProspectName(String prospectName) {
		this.prospectName = prospectName;
	}
	
	
	public String getProspectName() {
		return this.prospectName;
	}
	
	
	public void setProspectOrgName(String prospectOrgName) {
		this.prospectOrgName = prospectOrgName;
	}
	
	
	public String getProspectOrgName() {
		return this.prospectOrgName;
	}
	
	
	public void setProspectPhone(String prospectPhone) {
		this.prospectPhone = prospectPhone;
	}
	
	
	public String getProspectPhone() {
		return this.prospectPhone;
	}
	
	
	public void setProspectCountry(String prospectCountry) {
		this.prospectCountry = prospectCountry;
	}
	
	
	public String getProspectCountry() {
		return this.prospectCountry;
	}
	
	
	public void setProspectEmail(String prospectEmail) {
		this.prospectEmail = prospectEmail;
	}
	
	
	public String getProspectEmail() {
		return this.prospectEmail;
	}
	
	
	public void setProspectStatusCode(ProspectStatus prospectStatusCode) {
		this.prospectStatusCode = prospectStatusCode;
	}
	
	
	public ProspectStatus getProspectStatusCode() {
		return this.prospectStatusCode;
	}
	
	
	public void setProspectComments(String prospectComments) {
		this.prospectComments = prospectComments;
	}
	
	
	public String getProspectComments() {
		return this.prospectComments;
	}
}