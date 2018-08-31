/*package com.niit.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.model.Mychat;

public class MychatTest {

	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
    static MychatDAO mychatDAO;
	
	@Autowired
    static Mychat mychat;
	
	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.collaboration");
		context.refresh();
		
		mychatDAO = (MychatDAO)context.getBean("MychatDAO");
		mychat = (Mychat)context.getBean("mychat");
  }
	@Test
	public void createMychatTestCase(){
	
		mychat.setMessage("message");
		mychat.setSender("sender");
		
		mychat.setCommentdate(null);
		
		
		mychatDAO.saveOrUpdate(mychat);
	}
}
*/