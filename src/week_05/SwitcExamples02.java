package week_05;

import java.util.Scanner;

public class SwitcExamples02 {

	public static void main(String[] args) {
		Scanner giris=new Scanner (System.in);
		System.out.println("Lutfen harf notunusu  giriniz");
		char harf=giris.nextLine().toUpperCase().charAt(0);
		
		switch(harf) {
		case 'A' :
			System.out.println("85-100 arasi");
			break;
		case 'B' :
			System.out.println("70-85 arasi");
			break;
		case 'C' :
			System.out.println("45-70 arasi");
			break;
		case 'D' :
			System.out.println("0-45 arasi");
			break;
		default:
			System.out.println("Lutfen A-B-C-D notlarindan  birini giriniz  giriniz");
		
		}
		
	}

}
