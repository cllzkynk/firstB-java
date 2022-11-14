package week_08;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		// Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
		// sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		Scanner scan = new Scanner(System.in);
		System.out.println("10 dan kucuk bir tamsayi giriniz");
		int girilen = scan.nextInt();
		int faktoriyel = 1;

		for (int i = girilen; i > 0; i--) {

			
			
			faktoriyel = faktoriyel * i;
			System.out.println("Adim adim i   "+i);
			System.out.println("Adim adim faktoriyel   "+ faktoriyel);
		}
		System.out.println(faktoriyel);

		
		scan.close();
	}

}
