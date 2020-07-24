package com.ebotola.auth;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
	
	public LoginController() {}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public void login(String p_username, String p_password) {
		return p_username != null && p_password != null &&
				p_username.equals("a") && p_password.equals("p");
	}

}
