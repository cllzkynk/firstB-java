package week_06;

import java.util.Scanner;

public class StringManipulation04 {
	
	
	public static void main(String[] args) {
		/*
		 * Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten
		 * yazdirin
		 */
		
		
		//Ayse
		Scanner scan=new Scanner(System.in);
		 
		   System.out.println("4 harfli bir kelime giriniz: ");
		String name=scan.nextLine();
		
		
		//1 yol
		System.out.println(""+name.charAt(3)+name.charAt(2)+name.charAt(1)+name.charAt(0));
		
		//3 yol
		String harf3=name.substring(3,4); //e
		String harf2=name.substring(2,3); //s
		String harf1=name.substring(1,2); //y
		String harf0=name.substring(0,1); //a
		System.out.println(harf3+harf2+harf1+harf0);
		
		
		 
		/*
		 * Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu
		 * yazdirin.
		 */
		
		System.out.println("isminiz : ");
		String name1=scan.nextLine();
		

		
		System.out.println("Soyisminiz : ");
		String name2=scan.nextLine();
		
		if(name1.length() >name2.length()){
			System.out.println("Isminiz daha uzun. uzunlugu : "+name1.length());
		}else {
			System.out.println("Soyisminiz daha uzun. uzunlugu : "+name2.length());
		}
		
		scan.close();
	}
}
