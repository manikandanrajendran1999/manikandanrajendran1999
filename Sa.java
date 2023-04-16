package org.sample;

public class Sa {
	public static void main(String[] args) {
		int num= 111;
		int rem = 0;
		int res = 0;
		int a = num;
		while (num >0) {
			rem = num%10;
			res= (res*10) + rem;
			num = num/10;
		}
		
		if (a==res) {
			System.out.println("yes its a palindrome");
		}else {
			System.out.println("no, its not a polindrome");
		}
	}
	
	
}
