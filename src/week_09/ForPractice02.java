package week_09;

import java.util.Scanner;

public class ForPractice02 {

	public static void main(String[] args) {
	 
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: JAva ogrenmek cok guzel. Harf :a
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
		
		Scanner input=new Scanner (System.in);
		System.out.println("Bir cumle gir");
		String cumle=input.nextLine().toUpperCase();
		System.out.println("Hedef harfi gir");
		char harf=input.nextLine().toUpperCase().charAt(0);
		
		int count=0;
		for (int i = 0; i <= cumle.length()-1; i++) {
			
			if(cumle.charAt(i)==harf) {
				
				count++;
				
			}
			
			
		}
		
		System.out.println("Girdiginiz cumle ; \n"+cumle+"\n Ve bu cumlede girilen harf : "+harf+" "+count+" defa bulunuyor");
		
		
		
		
		
		
input.close();
	}

}
