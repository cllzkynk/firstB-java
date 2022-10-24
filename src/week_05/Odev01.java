package week_05;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
	// 4) Kullanicidan bir sayi alin
	// Girilen sayı hem 2 ile hem de 3 ile tam bölünebiliyorsa “2 ve 3’ün katı”,
	// sadece 2 ile bölünebiliyorsa “2’nin katı”,
	// sadece 3 ile bölünebiliyorsa “3’ün katı”,
	// ne 2’ye ne de 3’e bölünmüyorsa “2 veya 3’ün katı değil” mesajı veren program
	// yazin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int num1=scan.nextInt();
		//13
		
		
		
		if(num1%6==0) {
			System.out.println("6 nin kati");
		}else if(num1%3==0){
			System.out.println("3 nin kati");
		}else if(num1%2==0) {
			System.out.println("2 nin kati");
		}else {
			System.out.println("2 veya 3’ün katı değil");
		}
		
		
		
		
	
		

	}

}
