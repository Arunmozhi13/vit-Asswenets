package org.login;

public class Array {
public static void main(String[] args) {
int []arr=new int [10];
arr[0]=5;
arr[1]=3;
arr[2]=6;
arr[3]=8;
arr[4]=12;
arr[5]=15;
arr[6]=18;
arr[7]=4;
arr[8]=1;
arr[9]=1;
System.out.println("Below The Number Are Only Divided by 3");
for (int i = 1; i < arr.length; i++) {
	if (arr[i]%3==0) {
		System.out.println(arr[i]); 
	
}
}


}}