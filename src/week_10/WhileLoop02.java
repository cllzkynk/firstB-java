package week_10;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean tamamMiDevamMi = true;

		while (tamamMiDevamMi) {
			System.out.println("Alisveris yapildi odeme alindi");
			
			System.out.println("baska bir isteginiz varmi \nEvet icin E hayir icin H giriniz");
			
			char karar = scan.next().toUpperCase().charAt(0);
			
			if (karar == 'H') {
				
				tamamMiDevamMi = false;
				
			} else if (!(karar == 'E' || karar == 'H')) {

				while (!(karar == 'E' || karar == 'H')) {
					
					System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyiniz");
					
					System.out.println("Evet icin E hayir icin H giriniz");
					
					karar = scan.next().toUpperCase().charAt(0);
					
					if (karar == 'H') {
						
						tamamMiDevamMi = false;

					}

				}
			}

		}
		System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");

	}

}
