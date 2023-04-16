package org.sample;

public class AgeInvalidException extends Throwable {

	public AgeInvalidException(int age) {
		System.out.println("Age is :" + age);
	}
	
	public void verifyage(int age) throws AgeInvalidException {
		if (age<18) {
			try {
				throw new AgeInvalidException(age);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
