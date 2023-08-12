package queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NativeQueryCustomClass {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_query");
		EntityManager em = emf.createEntityManager();
		
		Query query =   em.createNativeQuery("select pub_id as publisher, count(*) titleCount from titles group by pub_id",
				                             "pubTitleCount");
		List<PubTitleCount> pubTitlesCount = query.getResultList();
		
		for(var v : pubTitlesCount) {
			
			System.out.printf("%s %d\n", v.getPublisher(), v.getTitleCount());
		}
		 
		em.close();
		emf.close();
	}

}
