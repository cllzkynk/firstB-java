package week_05;

import java.util.Scanner;

public class SwitcExamples03 {

	public static void main(String[] args) {
		/*
		 * Soru3 : Kullanicidan bir sayi girmesini isteyin Girilen sayi 10 ise “Iki
		 * basamakli en kucuk sayi 100 ise “uc basamakli en kucuk sayi” 1000 ise “dort
		 * basamakli en kucuk sayi” diger durumlarda “Girdigin sayiyi degistir” yazdirin
		 */

		Scanner giris = new Scanner(System.in);
		System.out.println("Lutfen 10-100-1000 den birini giriniz");
		short num = giris.nextShort();

		// if else li cozum

		if (num == 10) {
			System.out.println("2 basamakli en kucuk sayi");
		} else if (num == 100) {
			System.out.println("3 basamakli en kucuk sayi");
		} else if (num == 1000) {
			System.out.println("4 basamakli en kucuk sayi");
		} else {
			System.out.println("10-100-1000 dedik agam");
		}

		// switch li cozum
		switch (num) {
		case 10:
			System.out.println("2 basamakli en kucuk sayi");
			break;
		case 100:
			System.out.println("3 basamakli en kucuk sayi");
			break;
		case 1000:
			System.out.println("4 basamakli en kucuk sayi");
			break;
		default:
			System.out.println("10-100-1000 dedik agam");
		}

		// ternary li cozum
		String sonuc = (num == 10) ? ("2 BEKS")
				: ((num == 100 ? "3 BEKS" : (num == 1000) ? "4 BEKS" : "10-100-1000 dedik agam"));

		System.out.println(sonuc);

	}

}
