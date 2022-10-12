package week_04;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		/*
		 * Soru 9) Interview Question Kullanicidan artik yil olup olmadigini kontrol
		 * etmek icin yil girmesini isteyin. Kural 1: 4 ile bolunemeyen yillar artik yil
		 * degildir Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir Kural
		 * 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati
		 * olan yillar artik yildir
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("artik yil kontrolu icin bir yil girniz");
		int year = input.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0 || year % 400 == 0) {
			
					System.out.println("artik yildir");
				
			} else {
				System.out.println("artik yil degildir");
			}

		} else {
			System.out.println("artik yil degil");
		}

	}  // main sonu

} // class sonu
