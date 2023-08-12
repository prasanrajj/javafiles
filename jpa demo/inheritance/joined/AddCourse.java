package inheritance.joined;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddCourse {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		 
		OnlineCourse c1 = new OnlineCourse();
		c1.setName("AWS");
		c1.setUrl("https://meet.goto.com/81883833");
		
		OfflineCourse c2 = new OfflineCourse();
		c2.setName("Java Langauge");
		c2.setLocation("Srikanth Technologies, Dwarkanagar");

		em.getTransaction().begin(); 
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
