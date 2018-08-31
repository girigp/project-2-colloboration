package com.niit.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.BlogDAO;
import com.niit.model.Blog;

public class BlogTest {
	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static BlogDAO blogDAO;

	@Autowired
	static Blog blog;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();

		blogDAO = (BlogDAO) context.getBean("BlogDAO");

		blog = (Blog) context.getBean("blog");
	}

	@Test
	public void createBlogTestCase() {

		blog.setTitle("placement session");
		blog.setDescription("www.indiabixapp.com");
		blog.setStatus("active");
		blog.setLikes(9);
		blog.setUsername("mano");
		blog.setUserid(2);

		blogDAO.saveOrUpdate(blog);

	}
}