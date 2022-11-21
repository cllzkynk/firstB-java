package week_10;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayi isteyin
				// kullanici sifira basincaya kadar sayilari alip
				// toplamaya devap edin
				// kullanici sifira bastiginda, 
				// o ana kadar sifir haric kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		
		Scanner scan = new Scanner(System.in);

		double sayi=1;
		double toplam=0;
		int count=0;
		
		while(sayi!=0) {
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
