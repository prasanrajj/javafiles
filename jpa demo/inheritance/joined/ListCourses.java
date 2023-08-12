package inheritance.joined;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListCourses {
	
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		var courses = em.createQuery("from OnlineCourse", Course.class).getResultList();

		for (var course : courses) {
			System.out.printf("%s\n", course.getName());
		}
		
	    em.close();
	    emf.close();
	}
}
