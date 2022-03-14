package com.greatlearning.services;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CredentialService {
	
		public String generateEmail(String firstname, String lastName, String department) {
			 return firstname+lastName+department+"company.com";
		}
		
		public String generatePassword() {
	        final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	        SecureRandom random = new SecureRandom();
	        return IntStream.range(0, 10)
	                .map(i -> random.nextInt(chars.length()))
	                .mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex)))
	                .collect(Collectors.joining());
		}
		
}
