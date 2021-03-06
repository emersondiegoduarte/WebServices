package br.com.services.util;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory = Persistence
			.createEntityManagerFactory("WebServices");

	@javax.enterprise.inject.Produces
	@RequestScoped
	public static EntityManager criaEntityManager() {
		return factory.createEntityManager();
	}

//	public void finaliza(@Disposes EntityManager manager) {
//		manager.close();
//	}

}
