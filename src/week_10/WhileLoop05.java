package week_10;

import java.util.Scanner;

public class WhileLoop05 {
public static void main(String[] args) {
	        // Kullanicidan toplanmak uzere sayilar isteyin
			// 0 girerse veya toplam 500'u gecerse
			// "Bu kadar sayi yeter"
			// ".. adet sayi girdin, toplami ..." yazdirin
	
	
	//do while loop
	

	Scanner scan = new Scanner(System.in);

	double sayi=1;
	double toplam=0;
	int count=0;
	
	while(sayi!=0 &&toplam<=500) {
		System.out.println("Toplanmak uzere sayi gir");
		sayi=scan.nextDouble();
		count++;
		toplam=toplam+sayi;
		
		
	}
	
	
	System.out.println("Girilen sayi adedi      : "+count);
	System.out.println("girilen sayilar toplami : "+toplam);
	
	scan.close();
	
	
}
}
