package inventory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Category;

public class AddCategory {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		Category c = new Category();
		c.setCode("cat1");
		c.setDescription("Category one");
		// Transient 

		em.getTransaction().begin(); 
		em.persist(c);
		// Managed 
		em.getTransaction().commit();

		em.close();
		// Detached 
		emf.close();

	}

}
