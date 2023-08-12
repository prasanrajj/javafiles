package compositePk;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListTitleAuthors {
	
	public static void main(String[] args) throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();

		List<TitleAuthor> titleAuthors = em.createQuery("from compositePk.TitleAuthor", TitleAuthor.class).getResultList();

		for (TitleAuthor ta : titleAuthors) {
			System.out.printf("%s  %s  %d\n", 
					  ta.getKey().getAuthorId(), 
					  ta.getKey().getTitleId(),
					  ta.getOrder());
		}
		
	    em.close();
	    emf.close();
	}
}
