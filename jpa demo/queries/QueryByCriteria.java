package queries;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class QueryByCriteria {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs_query");
		EntityManager em = emf.createEntityManager();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Title> cr = cb.createQuery(Title.class);
		Root<Title> root = cr.from(Title.class);
		cr.select(root).where(cb.between(root.get("price"), 10, 20));

		var query = em.createQuery(cr);
		List<Title> titles = query.getResultList();

		for (var t : titles)
			System.out.printf("%s %f\n", t.getTitle(), t.getPrice());
		em.close();
		emf.close();

	}

}
