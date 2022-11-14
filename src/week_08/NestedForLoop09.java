package week_08;

import java.util.Iterator;

public class NestedForLoop09 {

	public static void main(String[] args) {
		 /*
	     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
	            Sonuç böyle olmalıdır;

	                   *
	                  * *
	                 * * *
	                * * * *
	               * * * * *
	               
	               
	               
	               
	               
	               *
	              * *
	             * * *
	               
	     */

		
		for (int satir = 1; satir < 7; satir++) {
			
			for (int bosluk = 1; bosluk < 7-satir; bosluk++) {
				System.out.print(" ");
			}
			for (int yildiz =1; yildiz <= satir; yildiz++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
