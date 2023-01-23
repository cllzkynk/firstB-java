package week_13project;

import java.util.Scanner;

/*
 * sayi 2x olsun  . yarisi x     .. 2x /x =2   2x/2x=1
 */

public class IsPrime {

	public static void main(String[] args) {
		// x>=2 ve x /1=0 ve x/x=0 o.s x in sadece kendisi ve 1 tam boleni vardir.
		// 6 asal degildir. 6%2=0
		// 7 asaldir sadece 7%7=0 ve 7%1=0

		Scanner input = new Scanner(System.in);
		System.out.println("Kontrol edilecek pozitif tam sayiyi giriniz");
		double sayi = input.nextDouble();
		double sayac = 0; //count
		double kontrolSayisi=0;

		for (double i = 2; i <= sayi/2 ; i++) {
			if (sayi % i == 0) {
				sayac++;
				// sayac++ ===> sayac=sayac+1;
				kontrolSayisi=i;
				break;

			}

		}

		if (sayac > 0) {
			System.out.println("Sayi asal degildir.Cunku "+ kontrolSayisi+ "  na  bolunebilir");
		} else {
			System.out.println("Sayi asaldir");
		}

	
		input.close();
	}

}
