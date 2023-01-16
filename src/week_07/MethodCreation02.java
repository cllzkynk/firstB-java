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
		
		//id="12345678952"
		
		
		
 
	
	
	// System.out.println(kimlikGoster(name,lastName,id)  +   "\n"   +  karar(name,lastName,id));
	 
	 if(karar(name,lastName,id)) {
		 System.out.println("Kaymak musteri");
	 }else {
		 System.out.println("hesabini sil ");
	 }
	 
	 

	}

	public static  String kimlikGoster(String x, String y, String z) {
		x=x.trim();
		y=y.trim();

		x=x.substring(0, 1).toUpperCase()+x.substring(1, x.length()).toLowerCase();
		y=y.substring(0, 1).toUpperCase()+y.substring(1, y.length()).replaceAll("\\w", "*");
 
	 //kimlik no 11 haneli olacak son 4 u gorunecek demekki 7 tane yildiz lazim
		z= "*******"+z.substring(z.length()-4, z.length());
		////7tane//
		
		
		/// Hayir
	 
		return x +y+"\n"+z;
	}


	public static  boolean karar(String x, String y, String z) {
		
		
		
		
		
		boolean karar=true;
		double id=Double.parseDouble(z);
		
		if(id%2!=0) {
			karar=false;
		}
		
		
		

      return karar  ;
	}
	


}
