package week_05;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
	//If else ile cozdugumuz sorularda kontrol etmemiz gereken sart sayisi cok oldugunda
		//switch Statement kullanilir.	
		Scanner input = new Scanner(System.in);
		System.out.println("haftanin gunu icin bir harf giriniz");
		String letter=input.next().toLowerCase();
		
		switch(letter) { 
		case "pazartesi" :
			System.out.println("haftanin ilk gunu");
			break;
		case "sali" :
			System.out.println("Sali sallanir ");
			break;
		case "carsamba" :
			System.out.println("Dolanir");
			break;
		case "persembe" :
			System.out.println("Perisan olur");
			break;
		case "cuma" :
			System.out.println("Mubarek gun ");
			break;
		case "cumartesi" :		
		case "pazar" :
			System.out.println("tatil");
			break;
		default  :
			System.out.println("Yanlis giris .Tekrar dene ");
			
		}

	}

}
