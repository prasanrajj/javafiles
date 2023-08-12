package onetoone.sharedpk;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListProjects {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_msdb_ddl");
		EntityManager em = emf.createEntityManager();

		List<Project> projects = em.createQuery("from Project", Project.class).getResultList();

		for (var project : projects) {
			System.out.printf("%s  %s\n", project.getTitle(), project.getEmployee().getName());
		}

		em.close();
		emf.close();
	}
}
