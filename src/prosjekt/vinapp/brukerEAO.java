package prosjekt.vinapp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class brukerEAO {
	
	@PersistenceContext(name="brukerPU")
	private EntityManager em;
	
	public void leggTilBruker(bruker b) {
		em.persist(b);
	}
	
	public List<bruker>hentbruker(){
		List<bruker>liste = em.createQuery("Select b FROM bruker b").getResultList();
		return liste;
	}
	
	public boolean finnesBrukernavn(String brukernavn) {
		return (em.find(bruker.class, brukernavn) != null);
	}

	public String hentPassord(String brukernavn) {
		return em.find(bruker.class, brukernavn).getPassord();
	}
}
