package prosjekt.vinapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="vinapp", name="brukerliste")
public class bruker {
	
		@Id
	    private String brukernavn;
	    private String fornavn;
	    private String etternavn;
	    private String passord;

	    public bruker(String brukernavn, String fornavn, String etternavn, String passord){

	        this.brukernavn = brukernavn;
	        this.fornavn = fornavn;
	        this.etternavn = etternavn;
	        this.passord = passord;
	    }
	    public bruker(){

	    }

	    public String getBrukernavn() {
	        return brukernavn;
	    }

	    public void setBrukernavn(String brukernavn) {
	        this.brukernavn = brukernavn;
	    }

	    public String getFornavn() {
	        return fornavn;
	    }

	    public void setFornavn(String fornavn) {
	        this.fornavn = fornavn;
	    }

	    public String getEtternavn() {
	        return etternavn;
	    }

	    public void setEtternavn(String etternavn) {
	        this.etternavn = etternavn;
	    }

	    public String getPassord() {
	        return passord;
	    }

	    public void setPassord(String passord) {
	        this.passord = passord;
	    }

}
