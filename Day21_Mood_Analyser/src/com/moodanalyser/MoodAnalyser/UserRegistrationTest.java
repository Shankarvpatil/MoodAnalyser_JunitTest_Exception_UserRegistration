package com.moodanalyser.MoodAnalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import com.moodanalyser.MoodAnalyser.CustomException;
import com.moodanalyser.MoodAnalyser.UserRegistration;

class UserRegistrationTest {

	@Test
	void firstNameValidator() throws CustomException {
		try {
			String firstName = "Shankar";
			assertEquals(true,  UserRegistration.firstNameValidator(firstName));
		}catch(CustomException e) {System.out.println(e.getMessage());}
	}
	
	@Test
	void lastNameValidator() throws CustomException {
		try {
			String lastName = "Patil";
			assertEquals(true,  UserRegistration.lastNameValidator(lastName));
		}catch(CustomException e) {System.out.println(e.getMessage());}
	}
	
	@Test
	void passwordValidator() throws CustomException {
		try {
			String password = "Shankar@12313";
			assertEquals(true,  UserRegistration.paswwordValidator(password));
		}catch(CustomException e) {System.out.println(e.getMessage());}
	}
	
	@Test
	void contactNumberValidator() throws CustomException {
		try {
			String contactNumber = "91 9518760487";
			assertEquals(true,  UserRegistration.lastNameValidator(contactNumber));
		}catch(CustomException e) {System.out.println(e.getMessage());}
	}
	
	@Test
	void EmailValidator() throws CustomException {
		try {
			String email = "abc-100@yahoo.com";
			assertEquals(true,  UserRegistration.emailValidator(email));
		}catch(CustomException e) {System.out.println(e.getMessage());}
	}

	@ParameterizedTest
	void emailValidation() throws CustomException {
		try {
			String [] email = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
	        		"abc-100@abc.net", null, "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com.com"};
			for(String i: email)
				assertTrue(UserRegistration.emailValidator(i));
		}catch(CustomException e) {System.out.println(e.getMessage());}
	}

}