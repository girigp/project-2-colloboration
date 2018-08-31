package com.niit.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ForumDAO;
import com.niit.model.Forum;

public class ForumTest {

	
	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static ForumDAO forumDAO;

	@Autowired
	static Forum forum;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();

		// get the userDAO from context
		forumDAO = (ForumDAO) context.getBean("ForumDAO");

		forum = (Forum) context.getBean("forum");
	}

	@Test
	public void createForumTestCase() {

		forum.setForumcontent("Discussion board");
	  	forum.setStatus("college system will change");
	  	forum.setForumname("forumname");
	  	forumDAO.saveOrUpdate(forum);

	}
}
