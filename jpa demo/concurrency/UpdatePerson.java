package concurrency;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;

public class UpdatePerson {
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin(); 
		
	    Person p = em.find(Person.class, LockModeType.PESSIMISTIC_WRITE);
	    p.setName("Srikanth");
        Scanner s = new Scanner(System.in);
        System.out.println("Press ENTER to continue ...");
        var input = s.nextLine();
        
		
		em.persist(p);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
