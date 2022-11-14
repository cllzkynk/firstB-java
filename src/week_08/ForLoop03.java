package week_08;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		// Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den
		// baslayarak
		// girilen sayiya kadar tum sayilari yazdirin. Ancak;
		// - Sayi 3’un kati ise sayi yerine “uc” yazdirin.
		// - Sayi 5’in kati ise sayi yerine “bes” yazdirin.
		// - Sayi hem 3’un hem 5’in kati ise sayi yerine “ujbej” yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Yuzden kucuk bir dogal giriniz");
		int girilen = scan.nextInt();
		for (int i = 1; i < girilen; i++) {

			if (i % 15 == 0) {
				System.out.print("ujbej ,");
			} else if (i % 5 == 0) {
				System.out.print("bej ,");

			} else if (i % 3 == 0) {
				System.out.print("uj ,");

			} else {
				System.out.print(i + ",");
			}

		}

		scan.close();

	}

}
