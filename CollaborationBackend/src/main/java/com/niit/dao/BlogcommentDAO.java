package com.niit.dao;

import java.util.List;

import com.niit.model.Blogcomment;

public interface BlogcommentDAO {

	public List<Blogcomment> list();

	public List<Blogcomment> getBlogComments(int blogId);

	public Blogcomment getBlogComment(int blogCommentId);

	public Blogcomment save(Blogcomment bcomment);

	public Blogcomment saveOrUpdate(Blogcomment bcomment);

	public void delete(int id);

}