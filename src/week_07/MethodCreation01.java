package week_07;

import java.util.Scanner;

public class MethodCreation01 {

	public static void main(String[] args) {

		/*
		 * 		  Scanner scan=new Scanner(System.in);
		System.out.println("isminiz: ");
		String name=scan.nextLine();
		
		System.out.println("Soyisminiz: ");
		String lastName=scan.nextLine();
		
		System.out.println("kimlik no: ");
		String id=scan.nextLine();
		
		
		name=name.trim();
		lastName=lastName.trim();

		name=name.substring(0, 1).toUpperCase()+name.substring(1, name.length());
		lastName=lastName.substring(0, 1).toUpperCase()+lastName.substring(1, lastName.length());
 
	 //kimlik no 11 haneli olacak son 4 u gorunecek demekki 7 tane yildiz lazim
		id= "*******"+id.substring(id.length()-4, id.length());
		 */
		int a=10;
		String str="Merhaba";
		kimlikGoster();
		System.out.println("metodlar arasi1");
		kimlikGoster(a);
		System.out.println("metodlar arasi2");
		kimlikGoster(str);
		System.out.println("metodlar arasi3");
		kimlikGoster(str,a);
		System.out.println("metodlar arasi4");
		kimlikGoster(a,str);
		
		
	
		
		
		System.out.println("main sonu");
	}

	public static void kimlikGoster(int a, String str) {
		System.out.println(str +" kere "+a);
		
	}

	public static void kimlikGoster(String str, int a) {
		   System.out.println(a+"kere "+  str );
		
	}

	public static void kimlikGoster(String str) {
		   System.out.println(str);
		
	}

	public static void kimlikGoster() {
      System.out.println("celil");
		
	}
	
	public static void kimlikGoster(int a) {
	      System.out.println(a);
			
		}

}
