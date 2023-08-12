package inventory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Category;

public class UpdateCategory {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		var category = em.find(Category.class, "c11"); // 1
		// Managed 
		if (category != null) {
			category.setDescription("Category 111"); // 2
			em.getTransaction().begin(); // 3
			em.getTransaction().commit(); // 5
		}
		else
			System.out.println("Sorry! Category code not found!");
		em.close();
		emf.close();

	}

}
