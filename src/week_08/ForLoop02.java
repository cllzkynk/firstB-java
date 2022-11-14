package week_08;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {

		// 10 ile 30 arasindaki sayilari aralarinda virgule olarak ayni satirda yazdirin
		// for (int i = 10; i < 30; i++) {
		// System.out.print(i+",");
		// }

		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen
		// sayiya kadar
		// 3’un kati olan sayilari yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Yuzden kucuk bir dogal giriniz");
		int girilen = scan.nextInt();

		if (girilen >= 0 && girilen <= 100) {

//for (int i = 3; i < girilen; i=i+3) {

//	System.out.print(i+",");

//}

			for (int i = 0; i < girilen; i++) {

				if (i % 3 == 0) {
					System.out.print(i + ",");
				}
			}

		} else {
			System.out.println("Yanlis giris yaptiniz lutfen istenen aralikta bir deger giriniz");
		}

	}

}
