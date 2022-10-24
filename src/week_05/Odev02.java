package week_05;

public class Odev02 {

	public static void main(String[] args) {
		// Bir char variable olusturun ve bir buyuk harf deger atayin
		// Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi ise o gunleri yazdirin
		// Eger atanan deger, haftanin gunlerinden herhangi birinin ilk harfi degil ise 
		// ekrana "Boyle bir gun yok" yazdirin.
		
		char karakter='P';
		
		if(karakter=='P') {
			System.out.println("Pazar , Pazartesi, Persembe");
			
			
		}else if(karakter=='S') {
			System.out.println("Sali");
		}else if(karakter=='C') {
			System.out.println("Carsamba ,Cuma ,Cumartesi");
		}else {
			System.out.println("Boyle bir gun yok ");
		}

	}

}
