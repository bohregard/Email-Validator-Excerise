package com.intrepidnetworks.emailvalidator;

import com.intrepidnetworks.emailvalidator.validator.EmailValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EmailValidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailValidatorApplication.class, args);
	}

	@GetMapping("/validate")
	public String hello(@RequestParam(value = "email") String name) {
		return String.format("Email address valid: %s!", EmailValidator.isEmailValid(name));
	}
}
