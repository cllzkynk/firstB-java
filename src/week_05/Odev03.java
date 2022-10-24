package week_05;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		//2)* Soru 3) Kullanicidan gun ismini alin ve 
		//* haftaici veya hafta sonu oldugunu yazdirin 
		  // Ornek:      gun=Pazar output = “Hafta sonu”
		           //    gun=Sali output = “Hafta ici”
		//*** String icin equals method’unu kullanin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun adi  giriniz");
		String dayName=scan.nextLine().toUpperCase();

		
		if(dayName.equals("PAZAR") ||dayName.equals("CUMARTESI")) {
			System.out.println("Hafta Sonu");
			
		}else if(dayName.equals("PAZARTESI") ||dayName.equals("SALI") ||dayName.equals("CARSAMBA") ||dayName.equals("PERSEMBE")
				||dayName.equals("CUMA") ) {
			System.out.println("Hafta ICI");
		}else {
			System.out.println("Boyle bir gun yok ");
		}
		
		
		
	}

}
