package dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTime_01 {

	public static void main(String[] args) {
		
		LocalTime saat= LocalTime.now();
		
		System.out.println(saat);
		
		for (int i = 0; i <= 10000000; i++) {
			i+=1;
			
		}
		LocalTime saat1= LocalTime.now();
		
		System.out.println(saat1);
		
		
		
		System.out.println("==========================================");
		
		int i=0;
		int j=0;
		LocalTime saat2= LocalTime.now();
		System.out.println(saat2);
		while (i<=10000000) {
			
			i+=1;
			i++;
		}
		LocalTime saat3= LocalTime.now();
		System.out.println(saat3);
		
		
	//	164646414568974654
		System.out.println("Tam suan ki saat"+saat);
		
		System.out.println(saat.plusMinutes(5));
		System.out.println(saat.minusSeconds(55));
		
		System.out.println(saat.getMinute());
		
		
	System.out.println(saat.now(ZoneId.of("Germany/Berlin")));
		
		
		
		
		
	}

}
