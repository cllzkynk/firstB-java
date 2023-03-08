package tasKagitMakas;

import java.util.Scanner;

public class TasKagitMakas {
	public static void main(String[] args) {
 

		Scanner scan = new Scanner(System.in);
		int bilgisayarPuani = 0;
		int kisiPuani = 0;
		String ilkBaslama = "Evet";
		int secim = 0;
		int bilgiGostermeKosulu = 1;
		while (ilkBaslama.equalsIgnoreCase("evet")) {
			if (bilgiGostermeKosulu == 1) {

				System.out.println("==================================================");

				System.out.println("Tas Kagit Makas Oyununa Hosgeldiniz");

				System.out.println("==================================================");

				System.out.println("1 Tas 2 Kagit 3 Makas");

				System.out.println("==================================================");
			}
			byte bilgisayarinSecimi = (byte) (Math.random() * 4);
			//bilgiGostermeKosulu = 0;
			 
			System.out.println("Seciminiz  : ");
	 
			secim = scan.nextByte();
 
			
			

		 
			
	 

			if (secim == 1) {
				if (bilgisayarinSecimi == 1) {
					System.out.println("Bilgisayarim Secimi : TAS === Sonuc=>Berabere");
					System.out.println("Puaniniz " + kisiPuani + " Bilgisayarin Puani : " + bilgisayarPuani);
				}

				if (bilgisayarinSecimi == 2) {
					System.out.println("Bilgisayarim Secimi : KAGIT  === Sonuc=>Bilgisayar Kazandi");
					bilgisayarPuani++;
					System.out.println("Puaniniz " + kisiPuani + " Bilgisayarin Puani : " + bilgisayarPuani);
				}

				if (bilgisayarinSecimi == 3) {
					System.out.println("Bilgisayarim Secimi : MAKAS  === Sonuc=>Kullanici Kazandi");

					kisiPuani++;
					System.out.println("Puaniniz " + kisiPuani + " Bilgisayarin Puani : " + bilgisayarPuani);

				}
			}
			
		 
	
			if (secim == 2) {
				if (bilgisayarinSecimi == 1) {
					System.out.println("Bilgisayarim Secimi : TAS === Sonuc=>Kullanici Kazandi");
					kisiPuani++;
					System.out.println("Puaniniz " + kisiPuani + " Bilgisayarin Puani : " + bilgisayarPuani);
				}
				if (bilgisayarinSecimi == 2) {
					System.out.println("Bilgisayarim Secimi : KAGIT  === Sonuc=>Beraberlik");

					System.out.println("Puaniniz " + kisiPuani + " Bilgisayarin Puani : " + bilgisayarPuani);
				}

				if (bilgisayarinSecimi == 3) {
					System.out.println("Bilgisayarim Secimi : MAKAS  === Sonuc=>Bilgisayar Kazandi");
					bilgisayarPuani++;
					System.out.println("Puaniniz " + kisiPuani + " Bilgisayarin Puani : " + bilgisayarPuani);

				}
			}
			
		 
			
			if (secim == 3) {
				if (bilgisayarinSecimi == 1) {
					System.out.println("Bilgisayarim Secimi : TAS === Sonuc=>Bilgisayar Kazandi");
					bilgisayarPuani++;
					System.out.println("Puaniniz " + kisiPuani + " Bilgisayarin Puani : " + bilgisayarPuani);
				}
				if (bilgisayarinSecimi == 2) {
					System.out.println("Bilgisayarim Secimi : KAGIT  === Sonuc=>Kullanici Kazandi");
					kisiPuani++;
					System.out.println("Puaniniz " + kisiPuani + " Bilgisayarin Puani : " + bilgisayarPuani);
				}

				if (bilgisayarinSecimi == 3) {
					System.out.println("Bilgisayarim Secimi : KAGIT  === Sonuc=>Beraberlik");
					System.out.println("Puaniniz " + kisiPuani + " Bilgisayarin Puani : " + bilgisayarPuani);

				}

			}
			
			 

		 

		} // while sonu
	
	
	scan.close();
	}
}
