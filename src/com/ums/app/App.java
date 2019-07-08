package com.ums.app;

import com.ums.service.UserServices;
import com.ums.service.UserServicesImpl;

public class App {
	public static void main(String[] args) {
		UserServices services = new UserServicesImpl();
		
		System.out.println(services.searchUser(1));
	}
}
