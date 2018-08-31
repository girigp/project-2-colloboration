package com.niit.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDAO;
import com.niit.model.User;

public class UserTest {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static UserDAO userDAO;

	@Autowired
	static User user;

	@BeforeClass
	public static void initialize() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();

		// get the userDAO from context
		userDAO = (UserDAO) context.getBean("UserDAO");

		user = (User) context.getBean("user");
	}

	@Test
	public void createUserTestCase() {

		user.setUsername("Jenu");
		user.setPassword("jenu");
		user.setContact("8807761502");
		user.setEmail("jenu@gmail.com");
		user.setAddress("Kerala");
		user.setRole("Student");
		userDAO.saveOrUpdate(user);

	}

}
