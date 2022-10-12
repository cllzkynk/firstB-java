package week_04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class StringManipulationPractise {

	public static void main(String[] args) {
		/*
		 * Celil Ozkaynak 1989 Bartin ismin ilk iki harfi kucuk sayismin ilk harfi buyuk
		 * dogum yilinin son iki rakami . Merleketin ilk ve son harfi kucuk halde
		 * ceO89.bn
		 */

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
		
	 createPass(name, lastName, year, city);
	 //veritabani baglantisi
	 LocalDateTime current=LocalDateTime.now();
	current.getYear();
	 
		System.out.println(	current.getYear()-year);
		
	}

	public static void createPass(String name, String lastName,short year,String city) {
		
		
		String password=name.substring(0,2).toLowerCase()
				+lastName.substring(0, 1).toUpperCase()
				+year%100
				+
				("."+city.substring(0, 1)+city.substring(city.length()-1)).toLowerCase();
		

		System.out.println(password);
		
	}

}
