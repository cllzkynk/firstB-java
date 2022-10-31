package week_07;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("isminiz: ");
		String name=scan.nextLine();
		
		System.out.println("Soyisminiz: ");
		String lastName=scan.nextLine();
		
		System.out.println("kimlik no: ");
		String id=scan.nextLine();
		
		
		
	kimlikGoster(name,lastName,id);

	}

	public static void kimlikGoster(String x, String y, String z) {
		x=x.trim();
		y=y.trim();

		x=x.substring(0, 1).toUpperCase()+x.substring(1, x.length());
		y=y.substring(0, 1).toUpperCase()+y.substring(1, y.length());
 
	 //kimlik no 11 haneli olacak son 4 u gorunecek demekki 7 tane yildiz lazim
		z= "*******"+z.substring(z.length()-4, z.length());
		////7tane//
	 
		System.out.println(x+" "+y+"\n"+z);
	}



}
