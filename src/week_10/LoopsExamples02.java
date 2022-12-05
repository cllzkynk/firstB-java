package week_10;

import java.util.Scanner;

public class LoopsExamples02 {
	public static void main(String[] args) {
		// girilen sayidan kucuk tum fibonacci sayilarini istediginiz bir loop kullanarak yazdiriniz.
		// deger iki loop ile yapmak odev / ( for loop / DoWhile Loop )
		
		
		//  1 1 2 3 5 8 13 21 34 55 89 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("sinir deger icin bir tam sayi giriniz");
		int sinir =scan.nextInt();
		int first=1;
		int second =1;
	
		int toplam=0;
		System.out.print("1 , 1 , ");
		while(toplam<sinir) {
			toplam=second+first;
			System.out.print(toplam+" , ");
			
			first=second;
			second=toplam;
			
		
			
		}
		
		
		
		scan.close();
	}

}
