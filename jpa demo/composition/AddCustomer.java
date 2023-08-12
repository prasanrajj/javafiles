package composition;
 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddCustomer {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		 
		Customer c = new Customer();
		c.setName("Larry Page");
		Address a = new Address();
		a.setAddress("33-303-33");
		a.setCity("California");
		
		c.setHome(a);
		

		em.getTransaction().begin(); 
		em.persist(c);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
