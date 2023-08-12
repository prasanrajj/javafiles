package inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddPersons {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		 
		Player p = new Player();
		p.setName("Dhoni");
		p.setGame("Cricket");
		
		Student s = new Student();
		s.setName("Jason");
		s.setCollege("Stanford");

		em.getTransaction().begin(); 
		em.persist(p);
		em.persist(s);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
