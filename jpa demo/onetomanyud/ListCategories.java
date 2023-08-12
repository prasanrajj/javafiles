package onetomanyud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListCategories {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		List<Category> cats = em.createQuery("from onetomanyud.Category", Category.class).getResultList();

		for (Category cat : cats) {
			System.out.printf("%s  %s\n", cat.getCode(), cat.getDescription());
 		}
		
	    em.close();
	    emf.close();
	}
}
