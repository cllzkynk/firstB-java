package week_04;

import java.util.Scanner;

public class IfSatatement {

	public static void main(String[] args) {
		// if ksul operatorudur
		
	/*	
		
		if(kosulumuzu yaziyoruz) {
			kosul saglanirsa buradaki kodlar calisir
		}
		
		*/
		
		/*
		 * boolean isEmpty=true;
		if(!isEmpty) {
			System.out.println("Merhaba ben calistim");
		}else {
			System.out.println("Ali amca yanlis giris yaptin tekrar dene");
		}
		
		 */
		// veya baglaci      ||
		//ve baglaci         &&
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String name = scan.next();
		System.out.println("Lutfen soyisminizi giriniz");
		String lastName = scan.next();
		
		System.out.println("Lutfen dogum yilinizi giriniz");
		short year=scan.nextShort();   //1989/100 kalan neolu 89 :)  modules operatoru
		//25%10=5
		

		System.out.println("Lutfen memleketinizi giriniz");
		String city=scan.next();
		
		if(name.length()>=2 && lastName.length()>=2 && ( year<2022 && year>1800) && city.length()>=3 ) {
			StringManipulationPractise.createPass(name, lastName, year, city);
		} else {
			
			if(!(name.length()>=2)) {
				System.out.println("Girilen degerlerden name   yanlis ali amca");
			}
			if(!(lastName.length()>=2)  ) {
				System.out.println("Girilen degerlerden lastName   yanlis ali amca");
			}
			if(!(year>1800 && year <2022)) {
				System.out.println("Girilen degerlerden year   yanlis ali amca");
			}
			if(!( city.length()>=3)) {
				System.out.println("Girilen degerlerden city   yanlis ali amca");
			}
		}
		
		
		

	}

}
