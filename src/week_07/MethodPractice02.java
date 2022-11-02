package week_07;

import java.util.Scanner;

public class MethodPractice02 {

	public static void main(String[] args) {

		/*
		 * name1 ve name2 degiskenlerini olusturun. name1 degiskeninin karakter sayisi
		 * cift ise kelimenin ortasina name2 yi yerlestirin. name1 degiskeninin karakter
		 * sayisi tek ise tam ortadaki karakteri silip name2 yi oraya yerlestirin
		 * 
		 * ayse ak ===> ayakse celil ay ===>ceayil
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki isim giriniz\nIsim1 :");
		String name1 = scan.next();
		System.out.println("Isim2:  ");
		String name2 = scan.next();

		System.out.println(yerlestir(name1, name2));

		scan.close();

	}

	public static String yerlestir(String name1, String name2) {
		if (name1.length() % 2 == 0) {

			return name1.substring(0, name1.length() / 2) + name2 + name1.substring(name1.length() / 2, name1.length());

		} else { // celil
			return name1.substring(0, (int) (name1.length() / 2)) + name2
					+ name1.substring((int) (name1.length() / 2 + 1), name1.length());

		}

	}
}
