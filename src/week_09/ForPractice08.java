package week_09;

import java.util.Scanner;

public class ForPractice08 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse 
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("Bir tamsayi  gir");
		int num1=scan.nextInt();
		System.out.println("Sinir deger icin Bir tamsayi  gir");
		int sinir=scan.nextInt();
		
		if(num1<=0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
		}else {
			
			System.out.println(sinir>rakamlariTopla(num1)?" sinir   degeri rakamlar toplamindan buyuk esit  " :"rakamlar toplami sinirdan buyuk");
				
			}
			
			 
			
		}

	public static int rakamlariTopla(int num1) {
		int rakamToplami=0;
		String num1String=num1+"";
		for (int i = 0; i <num1String.length(); i++) {
			rakamToplami=rakamToplami+num1%10;
			num1=num1/10;
			
		}
		return rakamToplami;
	}

	

}
