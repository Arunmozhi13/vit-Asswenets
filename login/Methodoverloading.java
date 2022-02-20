package org.login;

public class Methodoverloading {
public void Sum1(int a,int b) {
System.out.println("First Method Elements "+a+":"+b);
}
public void Sum1(int a,double b) {
	System.out.println("Second Methodoverloading Elements "+a+":"+b);
}	
public void Sum1(int a,double b,int c) {
	
	System.out.println("Third Methodoverloading Elements "+a+":"+b+":"+c);

}public static void main(String[] args) {
	Methodoverloading name = new Methodoverloading();	

name.Sum1(10, 20);
name.Sum1(10, 12.5); 
name.Sum1(10, 17.25,9);
 
 
 

}
	
}

