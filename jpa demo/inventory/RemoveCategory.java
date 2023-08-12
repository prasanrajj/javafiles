package inventory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Category;

public class RemoveCategory {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		var category = em.find(Category.class, "cat1");  
		// Managed 
		if (category != null) {
			em.getTransaction().begin(); 
			em.remove(category);
			// Removed 
			em.getTransaction().commit(); 
		}
		else
			System.out.println("Sorry! Category code not found!");
		em.close();
		emf.close();

	}

}
