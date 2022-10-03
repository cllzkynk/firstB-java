package week_03;

import java.util.Scanner;

public class Odev_03 {

	public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
		
		//System.out.println("Lutfen isminizi giriniz :");
		
		//String name=scan.nextLine();
		
		//Mehmet
		//System.out.println(		name.charAt(name.length()-1));
		
		String   str1="mehmet";
		String   str2="Mehmet";
		
		System.out.println(str2.indexOf('t'));
		str1.toLowerCase();
		
		/*
		1- charAt( )
		Istenen indexdeki karakteri (char) dondurur. Index 0’dan baslar, maximum
		index (String’in uzunlugu – 1) dir
		3-toUpperCase()
		4-toLowerCase()
		Girilen String degiskendeki tum harfleri istenen bicime cevirir.
		
		5-equals
Verilen iki String’in iceriginin birbirine esit olup olmadigini kontrol eder.
Eger verilen Stringlerdeki tum karakterler (bosluk, buyuk harf, kucuk harf, ozel
karakter ..) tamamen ayni ise TRUE doner, aksi durumda (bir karakter bile farkli olsa)
FALSE doner.

6-equalsIgnoreCase
Verilen iki String degiskeni BUYUK HARF / kucuk harf farki gozetmeksizin
karsilastirir.
Buyuk / kucuk harf farkliligi disinda herhangi bir karakter farkliligi oldugunda equals
methodunda oldugu gibi FALSE dondurur.

7-length()
Verilen String’deki karakter sayisini dondurur.


indexOf()
Verilen String’de istenen karakterin kullanildigi ilk index’i dondurur
		*/
		
		
	
	}

}
