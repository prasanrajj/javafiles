package inheritance.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddEmployees {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();
		 
		Consultant c = new Consultant();
		c.setName("Jackson");
		c.setRate(100);
			
		SalariedEmployee  s = new SalariedEmployee();
		s.setName("David");
		s.setSalary(10000);

		em.getTransaction().begin(); 
		em.persist(c);
		em.persist(s);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
