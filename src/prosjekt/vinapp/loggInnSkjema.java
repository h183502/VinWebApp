package prosjekt.vinapp;

import javax.servlet.http.HttpServletRequest;

public class loggInnSkjema {
	
	private String brukernavn;
	private String passord;
	private String feilInnlogging;
	
	public loggInnSkjema(HttpServletRequest request) {
		this.brukernavn = request.getParameter("brukernavn");
		this.passord = request.getParameter("passord");
	}

	public void feilMelding() {
		brukernavn = "";
		passord = "";
		feilInnlogging = "Feil brukernavn eller passord!";
		
	}
	public boolean sjekkInnlogging(brukerEAO bEAO) {
		if(!brukernavn.isEmpty() && bEAO.finnesBrukernavn(brukernavn)) {
			PassordUtil hash = new PassordUtil();
			return hash.sjekkPassord(passord, bEAO.hentPassord(brukernavn));
		}else {
			return false;
		}
	}

	public String getBrukernavn() {
		return brukernavn;
	}

	public void setBrukernavn(String brukernavn) {
		this.brukernavn = brukernavn;
	}

	public String getPassord() {
		return passord;
	}

	public void setPassord(String passord) {
		this.passord = passord;
	}

	public String getFeilInnlogging() {
		return feilInnlogging;
	}

	public void setFeilInnlogging(String feilInnlogging) {
		this.feilInnlogging = feilInnlogging;
	}
	
}
