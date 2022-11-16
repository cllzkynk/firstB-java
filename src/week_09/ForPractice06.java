package week_09;

import java.util.Scanner;

public class ForPractice06 {
	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
		 * olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf
		 * değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen
		 * harfi büyük yada küçüklüğüne duyarlıdır.)
		 * 
		 * String girilen="a"
		 * 
		 * 
		 * Sesli harfler: a,e,i,o,u
		 * 
		 * Test Data: a
		 * 
		 * Beklenen Çıktı: a harfi sesli harfdir.
		 * 
		 * Test Data: d
		 * 
		 * Beklenen Çıktı: d harfi sesiz harftir.
		 * 
		 * Test Data: we yada % yada 1
		 * 
		 * Beklenen Çıktı: Yanlis karakter girdiniz!
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz");
		String kelime = scan.nextLine(); // a

		String sesliHarfler = "aeouiıöüAEOUIİÜ"; // U
		String sessizHarfler = "zyvtşsrpnrmlkhjğgdçcbWRTYPSDFGHJKLZXCVBNMQŞĞÇ";
                                                  
		if (kelime.length() == 1  &&  (  (kelime.charAt(0)>=65 && kelime.charAt(0)<=90) || (kelime.charAt(0)>=97 && kelime.charAt(0)<=122)    )) {

			for (int i = 0; i < sesliHarfler.length(); i++) {

				if (kelime.charAt(0) == sesliHarfler.charAt(i)) {

					System.out.println("Sesli harf girdiniz");
					break;

				}
			}
			for (int i = 0; i < sessizHarfler.length(); i++) {
				

				if (kelime.charAt(0) == sessizHarfler.charAt(i)) {

					System.out.println("Sessiz harf girdiniz");
					break;

				}

			}
		} else {
			System.out.println("Yanlis karakter girdiniz!");
		}
		
		
		scan.close();

	}

}
