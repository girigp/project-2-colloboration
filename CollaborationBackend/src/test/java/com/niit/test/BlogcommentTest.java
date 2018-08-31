package com.niit.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.BlogcommentDAO;
import com.niit.model.Blogcomment;

public class BlogcommentTest {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static BlogcommentDAO blogcommentDAO;

	@Autowired
	static Blogcomment blogcomment;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();

		blogcommentDAO = (BlogcommentDAO) context.getBean("BlogcommentDAO");

		blogcomment = (Blogcomment) context.getBean("blogcomment");
	}

	@Test
	public void createBlogcommentTestCase() {

		blogcomment.setBcomment("bcomment");
		blogcomment.setEmail("mm@gmail.com");

		blogcommentDAO.saveOrUpdate(blogcomment);
	}

}
