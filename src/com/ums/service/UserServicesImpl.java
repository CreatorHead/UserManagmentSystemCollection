package com.ums.service;

import com.ums.beans.User;
import com.ums.dao.RepoImpl;
import com.ums.dao.UserDAO;

public class UserServicesImpl implements UserServices {

	private UserDAO db = new RepoImpl();
	
	@Override
	public Boolean createProfile(User user) {
		return db.createProfile(user);
	}

	@Override
	public User searchUser(Integer userId) {
		return db.searchUser(userId);
	}

	@Override
	public Boolean updatePassword(Integer userId, String oldPassword, String newPassword) {
		return db.updatePassword(userId, oldPassword, newPassword);
	}

	@Override
	public Boolean deleteUser(Integer userId, String password) {
		return db.deleteUser(userId, password);
	}

}
