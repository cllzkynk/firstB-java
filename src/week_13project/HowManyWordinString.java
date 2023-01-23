package week_13project;

import java.util.Scanner;

public class HowManyWordinString {
public static void main(String[] args) {
	// kullanicidan alinan bir string icinde kac kelime oldugunu bulan bir program yaziniz.
	Scanner input = new Scanner(System.in);
	System.out.println("kelime sayisi bulunacak stringi gir");
	String str=input.nextLine();
	
	int count=0;
	
	
	for (int i = 0; i < str.length(); i++) {
		
		if (str.substring(i, i+1).equals(" ")) {
			
			count++;
			
		}
		
	}
	
	
	System.out.println("Girilen cumlede :  "+  (count+1) +" adet kelime vardir");
	
	
	
	
}
}
