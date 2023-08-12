package inventory;
 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Product;

public class UpdateTwoProducts {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();
		try {
			Product prod1 = em.find(Product.class, 101);
			if (prod1 == null)
				return;

			prod1.setPrice(500);
			System.out.println("Updated first product!");
			Product prod2 = em.find(Product.class, 1022);
			if (prod2 == null)
				return;

			prod2.setPrice(8000);
			
			em.getTransaction().begin();

			em.getTransaction().commit();

		} // end of try
		finally {
			em.close();
			emf.close();
		}
	}
}
