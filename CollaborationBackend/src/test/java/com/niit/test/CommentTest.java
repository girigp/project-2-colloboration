package com.niit.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CommentDAO;
import com.niit.model.Comment;

public class CommentTest {
	
	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static CommentDAO commentDAO;

	@Autowired
	static Comment comment;
	
	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		commentDAO = (CommentDAO) context.getBean("CommentDAO");

		comment = (Comment) context.getBean("comment");
	}
	@Test
	public void createCommentTestCase() {

		comment.setUserName("mnhjknh");
		comment.setComments("ghvgg");
		comment.setForumId(986);
		comment.setUserId(74);
		comment.setUserMail("cgbhj@gmail.com");

		commentDAO.saveOrUpdate(comment);
		

	}

}
