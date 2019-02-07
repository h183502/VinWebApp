package prosjekt.vinapp;

public class Validator {
	
	public static boolean erFornavnGyldig(String fornavn) {
		if(fornavn.matches("[A-ZÆØÅ][a-zæøå]{2,20}")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean erEtternavnGyldig(String etternavn) {
		if(etternavn.matches("[A-ZÆØÅ][a-zæøå]{2,30}")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean erPassordGyldig(String passord1, String passord2) {
		if(passord1.matches("[A-ZÆØÅa-zæøå]{6,20}") && passord1.equals(passord2)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean erPassordUlik(String passord1, String passord2) {
		if(!passord1.equals(passord2)) {
			return true;
		}else {
			return false;
		}
	}

}
