package prosjekt.vinapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="vinapp", name="vinliste")
public class nyVin {
	
	@Id
	private String navn;
	private String land;
	private String region;
	private String årgang;
	private String beskrivelse;
	
	public nyVin(String navn, String land, String region, String årgang, String beskrivelse) {
		this.navn = navn;
		this.land = land;
		this.region = region;
		this.årgang = årgang;
		this.beskrivelse = beskrivelse;
	}
	public nyVin() {
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getÅrgang() {
		return årgang;
	}
	public void setÅrgang(String årgang) {
		this.årgang = årgang;
	}
	public String getBeskrivelse() {
		return beskrivelse;
	}
	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}
	
	

}
