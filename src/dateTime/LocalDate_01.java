package dateTime;

import java.time.LocalDate;

public class LocalDate_01 {

	public static void main(String[] args) {
		
		
		LocalDate tarih=LocalDate.now();
		
		//Local date objesinde new keyword kullanilmaz
		
		
		System.out.println("Bugunun tarihi "+tarih);
		
		System.out.println("bugunden 25 gun sonra "+tarih.plusDays(25));
		
		System.out.println("bugunden 5 ay sonra "+tarih.plusMonths(3));
		
		System.out.println("Bugunden 3 yil 5 ay 28 gun sonra "+tarih.plusDays(28).plusMonths(5).plusYears(3));
		//metod+metod seklinde ilerleyen durumlara metot chain denir
		
		System.out.println("bugunden 5 ay once "+tarih.minusWeeks(10));
		
		
		System.out.println("Bugunun tarihinin ayinin  gunu "+tarih.getDayOfMonth());
		System.out.println("Bugunun tarihinin yilinin gunu "+tarih.getDayOfYear());
		
		LocalDate dogumGunu=LocalDate.of(2000, 5, 28);
		System.out.println(dogumGunu);
		System.out.println(dogumGunu.getDayOfWeek());
		
		LocalDate kritikTarih=tarih.minusYears(18);
		System.out.println(kritikTarih);
		System.out.println(!dogumGunu.isAfter(kritikTarih));
		
		System.out.println(dogumGunu.isBefore(kritikTarih));
		 
		
	}

}
