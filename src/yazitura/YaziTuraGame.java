package yazitura;

import java.util.Random;
import java.util.Scanner;

public class YaziTuraGame {
	public static void main(String[] args) {

		System.out.println("Hosgeldiniz Kurmar haram ama biz egitim yapiyoz");

		Scanner input = new Scanner(System.in);

		Random emre = new Random();

		System.out.println("Kac para yatiriyorsun");

		int para = input.nextInt();
		int ilkPara = para;

		System.out.println("Her oyun 10 lira \nKazanirsan 15 alirsin\nKac el oynayacaksin");
		int elSayisi = input.nextInt();

		if (elSayisi * 10 <= para) {

			while (elSayisi > 0) {
				int atis = emre.nextInt(20);
				System.out.println("Tahminini gir : ");
				int tahmin = input.nextInt();
				para = para - 10;
				if (atis == tahmin) {
					para = para + 15;
					System.out.println("Kazandin");
					System.out.println("Olmasi gereken : " + atis);
					System.out.println("Mevcut paran : " + para);
				} else {
					System.out.println("Kaybettin");
					System.out.println("Olmasi gereken : " + atis);
					System.out.println("Mevcut paran : " + para);
				}
				elSayisi = elSayisi - 1;
			}
			System.out.println("El bitti");
			System.out.println("Toplam paran : " + para);
			System.out.println("Kazancin : " + (para - ilkPara));

		} else {
			System.out.println("Ne kadar para o kadar kofte emmi");
		}

	}

}
