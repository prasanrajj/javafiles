package queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NativeQueryDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_query");
		EntityManager em = emf.createEntityManager();
		
		Query query =   em.createNativeQuery("select * from titles where ytd_sales > 10000", Title.class);
		List<Title> titles = query.getResultList();
		
		for(var t : titles)
			System.out.println(t.getTitle());
		 
		em.close();
		emf.close();

	}

}
