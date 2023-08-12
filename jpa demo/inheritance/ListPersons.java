package inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListPersons {
	
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		var persons = em.createQuery("from Player", Person.class).getResultList();

		for (var p : persons) {
			System.out.println(p.getClass());
			System.out.printf("%s\n", p.toString());
		}
		
	    em.close();
	    emf.close();
	}
}
