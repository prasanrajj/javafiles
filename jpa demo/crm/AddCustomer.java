package crm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
import entities.Customer;
 
public class AddCustomer {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		Customer c = new Customer("Larry","elon@twitter.com");

		em.getTransaction().begin(); 
		em.persist(c);
		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
