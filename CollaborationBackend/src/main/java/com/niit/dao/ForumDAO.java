package com.niit.dao;

import java.util.List;

import com.niit.model.Forum;

public interface ForumDAO {
	
	public List<Forum>list();

	public Forum saveOrUpdate(Forum forum);
	
	public void delete (int forumid);
	
	public Forum getByForumid(int forumid);
	
	public Forum getByUsername(String username);
	
	public List<Forum> getAcceptedList();
	
	public List<Forum> getNotAcceptedList();


}
