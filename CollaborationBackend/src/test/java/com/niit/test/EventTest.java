package com.niit.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.EventDAO;
import com.niit.model.Event;

public class EventTest {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static EventDAO eventDAO;
	@Autowired
	static Event event;
	
	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		eventDAO = (EventDAO) context.getBean("EventDAO");
		event = (Event) context.getBean("event");
   }
	@Test
	public void createEventTestCase() {
       event.setEventcategory("inagration");
       eventDAO.saveOrUpdate(event);
	}

}
