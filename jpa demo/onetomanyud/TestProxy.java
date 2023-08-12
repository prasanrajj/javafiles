package onetomanyud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestProxy {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		var prod = em.getReference(Product.class, 101);
		System.out.println(prod.getClass());
		System.out.println(prod.getName());
	    em.close();
	    emf.close();
	}
}
