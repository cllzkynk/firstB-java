package week_09;

import java.util.Scanner;

public class ForPractice07 {

	public static void main(String[] args) {
		// kullanicidan alinan bir tamsayinin asal olup olmadigini belirleyen bir program yazininz.
		//asal sayi = sadece 1 e ve kendisine bolunenbilen sayidir ornek 2,3,5,7,11,13,17,19,23,29,31,37,41,47
		
		 Scanner scan= new Scanner(System.in);
		 System.out.println("Bir tamsayi giriniz");
		 int asalAday=scan.nextInt();
		 boolean flag=true;
		 
		 if(asalAday>1) {
		 
		 for (int i = 2; i <asalAday; i++) {
			 
			 System.out.println(i);
			 
			 if(asalAday%i==0) {
		
				 flag=false;
			break;
				 
			 } 
			 
			
		}
		 System.out.println(flag?"Asal":"Asal degil");
		 
		 }else {
			 System.out.println("Asal sayilar 2 den baslar. En aaz 2 giriniz");
		 }
		 
		 
	}

}
