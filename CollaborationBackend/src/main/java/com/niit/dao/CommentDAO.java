package com.niit.dao;

import java.util.List;

import com.niit.model.Comment;

public interface CommentDAO {
	

	public List<Comment> list();
	
	public List<Comment> getForumComments(int forumId);
	
	public Comment getComment(int CommentId);
	
	public Comment saveOrUpdate(Comment comment);
		
	public void delete(int id);


}
