package jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

// @Component
public class CategoryCRUDWithNP implements CommandLineRunner {
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	public void addCategory(String code, String description) {
		var params = new MapSqlParameterSource()
				.addValue("code", code)
				.addValue("desc", description);

		jdbcTemplate.update("insert into categories values(:code,:desc)", params);
		System.out.println("Added Successfully!");
	}

	@Override
	public void run(String... args) throws Exception {

		addCategory("cat222", "Category 222");

	}

}
