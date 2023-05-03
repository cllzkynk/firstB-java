package dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_01 {

	public static void main(String[] args) {
		/*yy ==> Yilin son iki rakamini verir 
		 * yyyy ==> yilin tamamini verir
		 * y ==> yilin tamamini verir   
		 * M==> ay sirasini verisi ocak icin 1 subat icin 2
		 * MM ==> ay sirasini verisi ocak icin 01 subat icin 02
		 * MMM ocak icin Jan mayis May
		 * MMMM ay isiminin tamamini verir
		 */
		
		LocalDate bugun= LocalDate.now();
		LocalDate date= LocalDate.of(2023,05,13);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("d/MM/y");
		System.out.println(dtf.format(date));
		
		
		int fark=bugun.compareTo(date);
		
		System.out.println(bugun);
		System.out.println(fark);

	}

}
