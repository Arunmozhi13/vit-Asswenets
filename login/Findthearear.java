package org.login;

import java.util.Scanner;

public class Findthearear {
  static int r;
  static int r1;
  static double Area;
  static double Area1;
	public static void main(String[] args) {
	//Area of the circle A=3.14*r2
   Scanner s =new Scanner(System.in);
	r=s.nextInt();
	r1=r*r;
	Area=3.14*r1; 
	String c="Cm";
	
	System.out.println("Area of the Circle :"+Area+c);
	
	}
}
