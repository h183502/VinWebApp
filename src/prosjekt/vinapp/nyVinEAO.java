package prosjekt.vinapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

public class nyVinEAO {
	
	@PersistenceUnit(unitName="vinPU")
	private EntityManagerFactory emf;
	
	EntityManager em = emf.createEntityManager();

	public void leggTilNyVin(nyVin v) {
		em.persist(v);
	}
	
	public List<nyVin>hentVinListe(){
		List<nyVin>liste = em.createQuery("Select v From nyVin v").getResultList();
		return liste;
	}
}
