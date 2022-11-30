package week_10;

import java.util.Scanner;

public class DoWhileLoop07 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("𝔉𝔦𝔯𝔰𝔱 𝔅𝔯𝔦𝔠𝔨𝔰 𝔊𝔬𝔫𝔲𝔩𝔩𝔲𝔩𝔢𝔯 𝔎𝔢𝔯𝔪𝔢𝔰𝔦𝔫𝔢 ℌ𝔬𝔰𝔤𝔢𝔩𝔡𝔦𝔫𝔦𝔷");
		char karar;
		
		
		
		do {
			System.out.println("Size nasil yardimci olabilirim");
			
			
			
			
			System.out.println("Alisveris yapiliyor.......");
			double a;
           for (double i = 0; i <Integer.MAX_VALUE ; i++) {
        	   
				a=i*i;
			}
			
			
			System.out.println("Odeme aliniliyor.......");
		      for (double i = 0; i <Integer.MAX_VALUE ; i++) {
	        	   
					a=i*i;
				}
			
			System.out.println("Baska bir isteginiz varmi yada alisverise devam etmek istiyormusunuz\nEvet icin E hayir icin H girisniz");
		  karar=giris.next().toLowerCase().charAt(0);
			
			
		}while(karar=='e');
		System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");
		
		
	}

	

}
