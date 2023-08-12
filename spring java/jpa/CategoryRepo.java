package jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepo extends  JpaRepository<Category, String> {

	// Query Derivation
	Category findByDescription(String description);

	List<Category> findByDescriptionContaining(String description);

	int countByDescriptionContaining(String description);

	@Query("FROM Category WHERE length(description) > 5")
	List<Category> getLongCategories();

	@Query("FROM Category WHERE length(description) between :minLen and :maxLen")
	List<Category> getLongCategories(@Param("minLen") int minLen, @Param("maxLen") int maxLen);

	@Query(value = "select * from categories where len(catdesc) between :min and :max", nativeQuery = true)
	List<Category> getCategoriesByLength(@Param("min") Integer min, @Param("max") Integer max);
}
