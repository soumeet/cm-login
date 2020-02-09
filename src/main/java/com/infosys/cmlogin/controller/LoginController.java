package com.infosys.cmlogin.controller;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping("/")
	public String home() {
		return "Welcome";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Welcome Admin</h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1>Welcome User</h1>";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@GetMapping("/details")
    public Map<String, Object> user(@AuthenticationPrincipal Principal principal) {
        return Collections.singletonMap("name", principal.getName());
    }
}
