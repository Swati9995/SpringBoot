package com.core.java.customException;

public class GlobalException1 {
	
	
	public static void validateAge(int age) throws InvalidAgeException1 {
		
		if(age < 18) {
			
			
			throw new InvalidAgeException1("age is not valid to vote");
		}else {
			
			System.out.println("Welcome to vote");
		}
		
		
	}
	
	public static void main(String args[]) {
		
		try {
			
			validateAge(16);
			
		}catch(InvalidAgeException1 ex) {
			
			  System.out.println("Exception occured: " + ex);  
		}
	}

}
