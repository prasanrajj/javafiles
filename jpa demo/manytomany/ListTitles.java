package manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTitles {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		List<Title> titles = em.createQuery("from manytomany.Title", Title.class).getResultList();
 
		for (Title title : titles) {
			System.out.println(title.getTitle());
			for (Author author : title.getAuthors()) {
				System.out.println(author.getName().indent(5));
			}
		}

		em.close();
		emf.close();
	}
}
