package com.myspring.RedditCLone.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspring.RedditCLone.dto.AuthenticationResponse;
import com.myspring.RedditCLone.dto.LoginRequest;
import com.myspring.RedditCLone.dto.RegisterRequest;
import com.myspring.RedditCLone.service.AuthService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
	
	private final AuthService authService;
	
	@PostMapping("/signup")
	public ResponseEntity<String> singup(@RequestBody RegisterRequest registerRequest) {
		
		authService.signup(registerRequest);
		
		return new ResponseEntity<>("User Registration Successful", HttpStatus.OK);
		
		
	}
	
	@GetMapping("accountVerification/{token}")
	public ResponseEntity<String> verifyAccount(@PathVariable String token)
	{
		authService.verifyAccount(token);
		return new ResponseEntity<>("Account verified successfully",HttpStatus.OK);
		
	}
	
	@PostMapping("/login")
	public AuthenticationResponse login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }

}
