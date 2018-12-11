package com.bubuplayground.bubuplaygroundfirstwebapp.Service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String userId, String password) {
		return userId.equalsIgnoreCase("gigi") 
				&& password.equalsIgnoreCase("dummy");
	}
}
