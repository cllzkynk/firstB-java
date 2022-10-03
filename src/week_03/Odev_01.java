package week_03;

import java.util.Scanner;

public class Odev_01 {

	public static void main(String[] args) {
		//Soru 1) kullanicidan 2 sayi alip toplam fark ve carpimlarini yazdiriniz
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Lutfen iki tamsayi giriniz giriniz :");
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		System.out.println("Toplamlari : " +   (num1+num2));
		System.out.println("Farklari : " +  (num1-num2));
		System.out.println("carppimlari : "+ (num1*num2));
		
		
		
		

	}

}
