package org.sample;

public class Sample {
	public static void main(String[] args) {
		int num = 121;
		int n = num;

		int rem = 0;
		int res = 0;
		while (num > 0) {
			rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;

		}
		System.out.println(res);
		if (n == res) {
			System.out.println("polindrome");
		} else {
			System.out.println("non polindrome");
		}
		// find the given no is polindrome or not
		int a = 12033;
		int n1 = a;

		int remaintor = 0;
		int c = 0;
		while (a > 0) {
			remaintor = a % 10;

			c = (c * 10) + remaintor;

			a = a / 10;
		}
		System.out.println(c);
		if (n1 == c) {
			System.out.println("polindrome");
		} else {
			System.out.println("non polindrome");
		}

		// find the given no is armstrong or not

		int num1 = 153;
		int n2 = num1;

		int rem1 = 0;

		int res1 = 0;

		while (num1 > 0) {
			rem1 = num1 % 10;
			res1 = res1 + (rem1 * rem1 * rem1);
			num1 = num1 / 10;

		}
		System.out.println(res1);
		if (n2 == res1) {
			System.out.println("Given num is an armstrong");
		} else {
			System.out.println("Given num is not armstrong");
		}

		// add given num\

		int num3 = 12345;
		int rem3 = 0;
		int res3 = 0;
		while (num3 > 0) {
			rem3 = num3 % 10;
			res3 = res3 + rem3;
			num3 = num3 / 10;

		}
		System.out.println(res3);

		// miltiple given numbers
		int num4 = 12345;
		int rem4 = 0;
		int res4 = 1;
		while (num4 > 0) {
			rem4 = num4 % 10;
			res4 = res4 * rem4;
			num4 = num4 / 10;

		}
		System.out.println(res4);

	}

}
