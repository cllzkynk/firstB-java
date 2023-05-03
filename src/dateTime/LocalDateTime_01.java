package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime_01 {

	public static void main(String[] args) {
		LocalDateTime ldt= LocalDateTime.now();
		
		System.out.println(ldt);
		
		System.out.println(ldt.getDayOfMonth()+"/"+ldt.getMonth()+"/"+ldt.getYear());
		
		
		
		
		
		
		LocalDate d=LocalDate.of(2000, 1,10);
		LocalTime t=LocalTime.of(17, 2);
		
		LocalDateTime ldt1= LocalDateTime.of(d, t);
		System.out.println(ldt1);
		
		String time=ldt1.toString();
		System.out.println(time);
		System.out.println(time.startsWith("2021"));
		
	}

}
