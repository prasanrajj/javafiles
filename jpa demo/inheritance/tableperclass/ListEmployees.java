package inheritance.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListEmployees {
	
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		var emps = em.createQuery("from inheritance.Employee", Employee.class).getResultList();

		for (var e : emps) {
			System.out.printf("%s\n", e.getName());
		}
		
	    em.close();
	    emf.close();
	}
}
