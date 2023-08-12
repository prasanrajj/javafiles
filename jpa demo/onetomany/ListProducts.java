package onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListProducts {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		List<Product> prods = em.createQuery("from onetomany.Product p join fetch p.category", Product.class).getResultList();

		for (Product p : prods) {
			System.out.printf("%s - %s\n",  p.getName(), p.getCategory().getDescription());
		}

		em.close();
		emf.close();
	}
}
