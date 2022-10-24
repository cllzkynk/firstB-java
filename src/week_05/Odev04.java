package week_05;

import java.util.Scanner;

public class Odev04 {
	public static void main(String[] args) {
		/* erkekler 65 yasinda emekli olabilmektedir kadinlar 63 yasinda her cocuk icin
		 * erkeklerde 2 yil avantaj kadinlarda 3 yil avantaj saglanmaktadir.
		 * kullanicinin yasini ve couck sayisini isteyip girilen yasta emekli olup
		 * olamayacagini hesaplayan bir program yaziniz.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen Cinsiyetinizi giriniz");
		char gender = input.next().toUpperCase().charAt(0);
		System.out.println("Lutfen yasinizi giriniz");
		int age = input.nextInt();
		System.out.println("Lutfen cocuk sayinizi giriniz");
		int kids = input.nextInt();
		int discount; // 9
		// age-discount>54 emekli olabilir
		// age+discount>=63
		//nested if 

		if (age > 0 && age < 125) {
			if (gender == 'K') {
				discount = kids * 3;
				if (age + discount >= 63) {
					System.out.println("Emekli olabilirsin");
				} else {
					System.out.println("Emekli olamazsin");
				}
			} else if (gender == 'E') {
				discount = kids * 2;
				if (age + discount >= 65) {
					System.out.println("Emekli olabilirsin");
				} else {
					System.out.println("Emekli olamazsin");
				}
			} else {
				System.out.println("Sistemimiz sadece KADIN ve ERKEK cinsiyetleri icin calismaktadir");
			}

		} else {
			System.out.println("Yasinizi duzgun girin lo");
		}
	}

}
