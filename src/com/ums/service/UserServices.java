package com.ums.service;

import com.ums.beans.User;

public interface UserServices {
	public Boolean createProfile(User user);
	public User searchUser(Integer userId);
	public Boolean updatePassword(Integer userId, String oldPassword, String newPassword);
	public Boolean deleteUser(Integer userId, String password);

}
