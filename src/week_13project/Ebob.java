package week_13project;

import java.util.Scanner;

public class Ebob {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("En buyuk ortak bolenini bulmak istediginiz iki sayiyi giriniz");
		System.out.print("Birinici sayi : ");
		int num1=input.nextInt();
		System.out.print("Ikinici sayi  : ");
		int num2=input.nextInt();
		
		boolean test=true;
		
		for (int i = num1>num2? num2:num1; i > 1; i--) {
			if(num1%i==0 && num2%i==0){
				System.out.println(i);
				test=false;
				break;
				
			}
			
			
			
		}
		
		if(test) {
			System.out.println("Bu iki sayinin ortak boleni yoktur");
		};
		
		input.close();
		
		// iki sayinin ekok u nu bulan bir program yaziniz.
		
		
		
	}

}
