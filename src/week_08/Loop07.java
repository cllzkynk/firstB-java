package week_08;

import java.util.Scanner;

public class Loop07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir string giriniz");
		String str = scan.nextLine();

		System.out.println(tertenYaz(str));
		scan.close();
	}

	public static String tertenYaz(String str) {
		if (str.length() == 0 || str.length() == 1)
			return str;

		// System.out.println(str.substring(0,str.length()-1));

		return str.charAt(str.length() - 1) + tertenYaz(str.substring(0, str.length() - 1));
	}

}
