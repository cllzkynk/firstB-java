package week_03;

import java.util.Scanner;

public class Odev_02 {

	public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
		
		System.out.println("Lutfen karenin kenar uzunlugunu giriniz :");
		
		double kenar=scan.nextDouble();
		
		System.out.println("Cevresi : " +   (4*kenar));
		System.out.println("Alani : " +   (kenar*kenar));
		

	}

}
