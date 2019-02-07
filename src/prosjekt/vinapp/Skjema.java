package prosjekt.vinapp;

import javax.servlet.http.HttpServletRequest;

public class Skjema {
	
	private String brukernavn;
	private String feilBrukernavn;
	private String fornavn;
	private String feilFornavn;
	private String etternavn;
	private String feilEtternavn;
	private String passord1;
	private String feilPassord1;
	private String passord2;
	private String feilPassord2;
	
	public Skjema(HttpServletRequest request) {
		
		this.brukernavn = request.getParameter("brukernavn");
		this.fornavn = request.getParameter("fornavn");
		this.etternavn = request.getParameter("etternavn");
		this.passord1 = request.getParameter("passord1");
		this.passord2 = request.getParameter("passord2");
		
	}
	
	public bruker opprettBruker() {
		passord1 = PassordUtil.krypterPassord(passord1);
		
		return new bruker(brukernavn, fornavn, etternavn, passord1);
	}
	public void gjemPassord() {
		passord1 = "";
		passord2 = "";
	}

	public String getBrukernavn() {
		return brukernavn;
	}

	public void setBrukernavn(String brukernavn) {
		this.brukernavn = brukernavn;
	}

	public String getFeilBrukernavn() {
		return feilBrukernavn;
	}

	public void setFeilBrukernavn(String feilBrukernavn) {
		this.feilBrukernavn = feilBrukernavn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getFeilFornavn() {
		return feilFornavn;
	}

	public void setFeilFornavn(String feilFornavn) {
		this.feilFornavn = feilFornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getFeilEtternavn() {
		return feilEtternavn;
	}

	public void setFeilEtternavn(String feilEtternavn) {
		this.feilEtternavn = feilEtternavn;
	}

	public String getPassord1() {
		return passord1;
	}

	public void setPassord1(String passord1) {
		this.passord1 = passord1;
	}

	public String getFeilPassord1() {
		return feilPassord1;
	}

	public void setFeilPassord1(String feilPassord1) {
		this.feilPassord1 = feilPassord1;
	}

	public String getPassord2() {
		return passord2;
	}

	public void setPassord2(String passord2) {
		this.passord2 = passord2;
	}

	public String getFeilPassord2() {
		return feilPassord2;
	}

	public void setFeilPassord2(String feilPassord2) {
		this.feilPassord2 = feilPassord2;
	}

}
