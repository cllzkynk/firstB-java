package week_10;

import java.util.Scanner;

public class Project_01_Market {
	public static void main(String[] args) {
		/*
		 * SORU 1 Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun Musteri karti varsa ve 10 urunden fazla
		 * alirsa %20, 10dan az ise %15 indirim yapin Musteri karti yoksa ve 10 urunden
		 * fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin
		 */
		Scanner scan = new Scanner(System.in);
		boolean karar = true;
		int sonUrunAdedi = 0;
		double toplamTutar = 0;

		char kartVarMi = 'X';
		System.out.println("𝔉𝔦𝔯𝔰𝔱 𝔅𝔯𝔦𝔠𝔨𝔰 𝔊𝔬𝔫𝔲𝔩𝔩𝔲𝔩𝔢𝔯 𝔎𝔢𝔯𝔪𝔢𝔰𝔦𝔫𝔢 ℌ𝔬𝔰𝔤𝔢𝔩𝔡𝔦𝔫𝔦𝔷");

		do {
			System.out.println("Lutfen musteri kartiniz varsa E yoksa H girisi yapiniz");
			char kart = scan.next().toUpperCase().charAt(0);
			if (kart == 'E' || kart == 'H') {
				kartVarMi = kart;

				break;
			} else {
				System.out.println("yanlis giris yaptiniz. Lutfen Evet icin E hayir icin H giriniz");
			}
		} while (kartVarMi != 'E' || kartVarMi != 'H');

		if (kartVarMi == 'E') {
			do {
				int adet = 0;
				double fiyat = 0;
				double tutar = 0;
				
				System.out.println("Lutfen aldiginiz urun adediniz giriniz");
				adet = scan.nextInt();
				System.out.println("Lutfen aldiginiz urununu adet fiyatini giriniz");
				fiyat = scan.nextDouble();
				tutar = adet * fiyat;
				toplamTutar = toplamTutar + (adet * fiyat);
				sonUrunAdedi = sonUrunAdedi + adet;

				if (adet > 10) {

					System.out.println("urun adedi  :" + adet + " mevcut sepetin tutari :" + tutar
							+ "  TL.Urun adedi 10dan fazla oldugu icin %20  indirim uygulanmistir");

				} else {

					System.out.println("urun adedi  :" + adet + " mevcut sepetin tutari :" + tutar
							+ " Tl.urun adedi 10dan fazla olmadigi icin %15  indirim uygulanmistir");

				}

				char carar = 'x';
				System.out
						.println("\nAlisverise devam etmek Istiyormusunuz ? \nEvet icin E hayir icin H girisi yapiniz");
				do {
					carar = scan.next().toUpperCase().charAt(0);
					if (carar == 'H') {
						karar = false;
						if (sonUrunAdedi > 10) {
							System.out.println("Toplam Tutar : " + toplamTutar * 0.8
									+ "\n𝔉𝔦𝔯𝔰𝔱 𝔅𝔯𝔦𝔠𝔨𝔰 𝔊𝔬𝔫𝔲𝔩𝔩𝔲𝔩𝔢𝔯 𝔎𝔢𝔯𝔪𝔢𝔰𝔦𝔫i tercih ettiginiz icin tesekkur ederiz");
							break;
						} else {
							System.out.println("Toplam Tutar : " + toplamTutar * 0.85
									+ "\n𝔉𝔦𝔯𝔰𝔱 𝔅𝔯𝔦𝔠𝔨𝔰 𝔊𝔬𝔫𝔲𝔩𝔩𝔲𝔩𝔢𝔯 𝔎𝔢𝔯𝔪𝔢𝔰𝔦𝔫i tercih ettiginiz icin tesekkur ederiz");
							break;
						}

					} else if (carar == 'E') {
						break;
					} else {
						System.out.println("Yanlis giris yaptiniz evet icin E hayir icin H giriniz");
					}

				} while (carar != 'E' || carar != 'H');

			} while (karar);

		} else if (kartVarMi == 'H') {
			do {
				int adet = 0;
				double fiyat = 0;
				double tutar = 0;
				
				System.out.println("Lutfen aldiginiz urun adediniz giriniz");
				adet = scan.nextInt();
				System.out.println("Lutfen aldiginiz urununu adet fiyatini giriniz");
				fiyat = scan.nextDouble();
				tutar = adet * fiyat;
				toplamTutar = toplamTutar + (adet * fiyat);
				sonUrunAdedi = sonUrunAdedi + adet;

				if (adet > 10) {

					System.out.println("urun adedi  :" + adet + " mevcut sepetin tutari :" + tutar
							+ "  TL.Urun adedi 10dan fazla oldugu icin %15  indirim uygulanmistir");

				} else {

					System.out.println("urun adedi  :" + adet + " mevcut sepetin tutari :" + tutar
							+ " Tl.urun adedi 10dan fazla olmadigi icin %10  indirim uygulanmistir");

				}

				char carar = 'x';
				System.out
						.println("\nAlisverise devam etmek Istiyormusunuz ? \nEvet icin E hayir icin H girisi yapiniz");
				do {
					carar = scan.next().toUpperCase().charAt(0);
					if (carar == 'H') {
						karar = false;
						if (sonUrunAdedi > 10) {
							System.out.println("Toplam Tutar : " + toplamTutar * 0.85
									+ "\n𝔉𝔦𝔯𝔰𝔱 𝔅𝔯𝔦𝔠𝔨𝔰 𝔊𝔬𝔫𝔲𝔩𝔩𝔲𝔩𝔢𝔯 𝔎𝔢𝔯𝔪𝔢𝔰𝔦𝔫i tercih ettiginiz icin tesekkur ederiz");
							break;
						} else {
							System.out.println("Toplam Tutar : " + toplamTutar * 0.90
									+ "\n𝔉𝔦𝔯𝔰𝔱 𝔅𝔯𝔦𝔠𝔨𝔰 𝔊𝔬𝔫𝔲𝔩𝔩𝔲𝔩𝔢𝔯 𝔎𝔢𝔯𝔪𝔢𝔰𝔦𝔫i tercih ettiginiz icin tesekkur ederiz");
							break;
						}

					} else if (carar == 'E') {
						break;
					} else {
						System.out.println("Yanlis giris yaptiniz evet icin E hayir icin H giriniz");
					}

				} while (carar != 'E' || carar != 'H');

			} while (karar);

			
			
		}

	}

}
