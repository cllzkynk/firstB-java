package kitapTakip;

import java.util.Scanner;

import week_05.SwitchCaseStatement;

public class Main {
	/*
	 * 
	 * Bir kitapci icin program yapalim Kitap no 1000'den baslayarak sirali no olsun
	 * Her kitap icin kitapAdi, yazarAdi,fiyati bilgilerini girelim
	 * 
	 * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
	 * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
	 * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6- cikis
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Books bk = new Books();
		System.out.println("Hosgeldin Agam");
		int secim = 0;

		do {
			System.out.println("\n------------------------------------------------\n1-\t Kitap ekle"
					+ " \n2- \tNumara ile  kitap goruntule \n3 \tBilgi ile Kitap Goruntule\n"
					+ "4- \tNumara ile kitap sil\n5- \t Tum kitaplari listele \n6- \tCikis ");

			secim = scan.nextInt();
			switch (secim) {

			case 1:
				int islem = 0;
				do {
					bk.kitapEkle();
					System.out.println("Eklemek istediginiz baska kitap varmi  evet icin 1 hayir icin 0 ");
					islem = scan.nextInt();
					scan.nextLine();
					 

				} while (islem != 0);

				break;

			case 2:
				bk.numaraIleKitapListele();

				break;

			case 3:
				bk.bilgilerIleKitabiGoruntule();
				scan.nextLine();
				break;

			case 4:

				do {
					bk.numaraIleKitapSil();
					System.out.println("Silmek istediginiz baska kitap varmi evet icin 1 hayir icin 0 giriniz");
					islem = scan.nextByte();

				} while (islem != 0);

				break;

			case 5:
				bk.listele();

				break;

			case 6:
				System.out.println("By bye hepiness");

				break;

			default:
				System.out.println("Duzgun gir");
				break;
			}

		} while (secim != 6);
	}

}
