package week_02;

import java.util.Scanner;

import week_04.StringManipulationPractise;

public class Scanner_01 {

	public static void main(String[] args) {
		
		//Scanner kullanicidan veri almamizi saglar.
		

		Scanner                            scan     =      new     Scanner     (System.in);
		
		
//degeri getirecegimiz class ismi         isim         yeni bir obje uretim keywordu
		// her new yeni bir obje olusturur;
	/*
	 * 	
		System.out.print("Lutfen kilonuzu giriniz :");
		
		int kilo=scan.nextInt();
		
		String name="Ali";

		System.out.println(kilo);
		
	 */
		//System.out.print("Lutfen adinizi giriniz :");
		//String ad=scan.nextLine();
		//System.out.println(ad);
		
		
		StringManipulationPractise.createPass("Fatma", "SAKIR", (short) 1996, "Berlin");
		
		
		
		
	}

}
