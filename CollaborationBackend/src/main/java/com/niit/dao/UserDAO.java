package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface UserDAO {

	public List<User> list();

	public User saveOrUpdate(User user);

	public User create(User user);

	public void delete(int userId);

	public User getByUserId(int userid);

	public User getByMail(String email);

	public User get(String empID);

	public User login(User user);
}
