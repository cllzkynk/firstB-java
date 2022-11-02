package week_07;

import java.util.Scanner;

public class HesapMakinasi {

	public static void main(String[] args) {
	//	4 islemi yapan ve her islemi ayri metodlar  yapan  ve sonucun toplamaya gore tersini donduren, iki sayi ile calisan bir hesap makinasi kodlayiniz
		Scanner scan=new Scanner(System.in);
		System.out.println("birinci sayi : ");
		double a=scan.nextDouble();
		System.out.println("ikinci sayi : ");
		 
		double b=scan.nextDouble();
		
		
		/*
		 * System.out.println(toplama(a,b));
		System.out.println(cikarma(a,b));
		System.out.println(carpma(a,b));
		 System.out.println(bolme(a,b));
 
	 
		 */

		double goster=toplama(a,b);
		System.out.println(goster);
	}

	public static double bolme(double a, double b) {
		
		double sonuc;
		
		if(b!=0) {
			sonuc=a/b;
		}else {
			sonuc=0;
		}
		
	
	return (-1)*sonuc;	
	}

	public static double carpma(double a, double b) {


		return  (-1)*a*b;
		
	}

	public static double cikarma(double a, double b) {


		return (-1)*(a-b);
		
	}

	public static double toplama(double a, double b) {
		 
		
		
		return (-1)*(a+b);
	}



}
