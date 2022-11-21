package week_10;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir tamsayi girmesini isteyin sayi negatif veya sifirsa
		 * "Lutfen pozitif bir tamsayi giriniz" yazdirin Girilen Sayinin rakamlar
		 * toplamini ayri bir method'da hesaplayin
		 * Main method icinde Kullanicidan bir sinir deger isteyin rakamlar toplami
		 * sinir degerden buyukse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 * degilse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 * yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi  gir");
		int num1 = scan.nextInt();

		int count = 0;

		while (num1 > 0) {
			int rakamToplami = 0;
			rakamToplami = rakamToplami + num1 % 10;
			System.out.println("Alinan sayi=" + num1 % 10);
			System.out.println("num1 before " + num1);
			num1 = num1 / 10;
			System.out.println("num1 after " + num1);
			count++;

		}
		System.out.println("Sayac " + count);
		scan.close();

	}

}
