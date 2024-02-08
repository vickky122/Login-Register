package com.company.dao;

import com.company.model.User;

public interface UserDao {

	boolean addUser(User user);
	boolean isValidUser(String username, String password);
	boolean addUser(com.company.dao.User user);
}