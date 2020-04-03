package com.bookSystem.bookSystem;

import com.bookSystem.bookSystem.dao.AuthorDAO;
import com.bookSystem.bookSystem.entities.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthorTests {

	@Autowired
	private AuthorDAO authorDAO;

	@Test
	void contextLoads() {
	}

	@Test
	void save() throws Exception {
		authorDAO.save(new Author(1L,"Jeff", "Poop"));
	}

}
