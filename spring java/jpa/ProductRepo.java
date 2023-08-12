package jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepo extends JpaRepository <Product,Integer>{
    
	  @Query("from Product p join fetch p.category")
	  List<Product> getAllProducts();
	 
}
