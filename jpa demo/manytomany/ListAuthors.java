package manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListAuthors {

	public static void main(String[] args) throws Exception {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		List<Author> authors = em.createQuery("from manytomany.Author", Author.class).getResultList();

		for (Author author : authors) {
			System.out.println(em.contains(author));
			System.out.println(author.getName());
			for (Title title : author.getTitles()) {
				System.out.println(title.getTitle().indent(5));
			}
		}

		em.close();
		emf.close();
	}
}
