package prosjekt.vinapp;

import javax.servlet.http.HttpServletRequest;

public class vinSkjema {
	
	private String navn;
	private String feilNavn;
	private String land;
	private String feilLand;
	private String region;
	private String feilRegion;
	private String årgang;
	private String feilÅrgang;
	private String beskrivelse;
	
	public vinSkjema(HttpServletRequest request) {
		
		this.navn = request.getParameter("navn");
		this.land = request.getParameter("land");
		this.region = request.getParameter("region");
		this.årgang = request.getParameter("årgang");
		this.beskrivelse = request.getParameter("beskrivelse");
	}
	
	public nyVin nyAnmeldelse() {
		return new nyVin(navn, land, region, årgang, beskrivelse);
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getFeilNavn() {
		return feilNavn;
	}

	public void setFeilNavn(String feilNavn) {
		this.feilNavn = feilNavn;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getFeilLand() {
		return feilLand;
	}

	public void setFeilLand(String feilLand) {
		this.feilLand = feilLand;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getFeilRegion() {
		return feilRegion;
	}

	public void setFeilRegion(String feilRegion) {
		this.feilRegion = feilRegion;
	}

	public String getÅrgang() {
		return årgang;
	}

	public void setÅrgang(String årgang) {
		this.årgang = årgang;
	}

	public String getFeilÅrgang() {
		return feilÅrgang;
	}

	public void setFeilÅrgang(String feilÅrgang) {
		this.feilÅrgang = feilÅrgang;
	}

	public String getBeskrivelse() {
		return beskrivelse;
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}

}
