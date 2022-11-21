package week_10;

import java.util.Scanner;

public class WhileLoop03_Code_Decode {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner((System.in));
		boolean tamamMiDevaMi= true;

		while (tamamMiDevaMi){
		System.out.println("Alisveris yapildi odeme alindi");
		System.out.println("baska bir isteginiz varmi \nEvet icin E hayir icin H girini ");
		char karar=scan.next().toUpperCase().charAt(0);
		if(karar=='H'){
		tamamMiDevaMi=false;
		}else if (!(karar=='E'|| karar =='H')){

		while (!(karar=='E'|| karar =='H')) {
		System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyiniz");
		System.out.println("Evet icin E Hayior icin H giriniz");
		karar = scan.next().toUpperCase().charAt(0);
		      }
		   }
		}
		System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");






		

}

}
