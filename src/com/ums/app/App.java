package com.ums.app;

import com.ums.beans.User;
import com.ums.service.UserServices;
import com.ums.service.UserServicesImpl;

public class App {
	public static void main(String[] args) {
		UserServices services = new UserServicesImpl();
		User user = services.searchUser(1);
		System.out.println(user);
//		System.out.println("Deleted: " + services.deleteUser(1, "root"));
//		services.createProfile(user);
		System.out.println("Password Updated: " + services.updatePassword(1, "root", "1234"));
		System.out.println(services.searchUser(1));
	}
}
