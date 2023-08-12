package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddEmployee {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		Employee e = new Employee();
		e.setName("Jason");
		
		Project p = new Project();
		p.setTitle("Todos");
		
		e.setProject(p);

		em.getTransaction().begin(); 
		em.persist(e);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
