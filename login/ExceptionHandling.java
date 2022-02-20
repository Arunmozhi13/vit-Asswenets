package org.login;

public class ExceptionHandling {

public static void main(String[] args) {			

	int a=20;int b=2;
	System.out.println("Division of two numbers"+a/b);
	try {
		a=15;
		b=0;
		System.out.println(""+a/b);
		
	} catch (ArithmeticException e) {
System.out.println("Divisor should not be zero");
	}
}

}
