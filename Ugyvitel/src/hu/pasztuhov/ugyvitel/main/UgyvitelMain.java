package hu.pasztuhov.ugyvitel.main;

import javax.persistence.*;

import hu.pasztuhov.ugyvitel.control.*;
import hu.pasztuhov.ugyvitel.view.*;

public class UgyvitelMain {
	protected View view;
	protected Control control;
	protected Rights rights;
	private final static String PERSISTENCE_UNIT_NAME = "ugyvitel";
	private static EntityManagerFactory factory;
	private EntityManager em;
	
	public UgyvitelMain() {
		rights = new Rights();
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = factory.createEntityManager();
		this.control = new MainControl(this);
		
		em.close();
	}
	public Rights getRights() {
		return rights;
	}
	
	public EntityManager getEntityManager() {
		return this.em;
	}
	

	public static void main(String[] args) {
		UgyvitelMain ugyvitelMain = new UgyvitelMain();
	}

}
