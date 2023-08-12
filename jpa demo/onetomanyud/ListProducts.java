package onetomanyud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListProducts {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb");
		EntityManager em = emf.createEntityManager();

		List<Product> prods = em.createQuery("from onetomanyud.Product", Product.class).getResultList();

		for (Product p : prods) {
			// System.out.printf("%s - %s\n", p.getName(),
			// p.getCategory().getDescription());
			System.out.println(p.getName());
		}

		em.close();
		emf.close();
	}
}
