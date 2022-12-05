package week_10;

import java.util.Scanner;

public class LoopsExamples {

	public static void main(String[] args) {
		// while kullanarak girilen sayinin asal olup olmadigini test eden bir program yazininz.
		// do while ile asallik kontrolu odev
		
		
		
		// girilen sayidan kucuk tum fibonacci sayilarini istediginiz bir loop kullanarak yazdiriniz.
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Asalligi kontrol edilecek bir tam sayi giriniz");
		
		  boolean flag=true;
		
		
		if(scan.hasNextInt()){
			int num=scan.nextInt();
		    int	control=2;
		  
		    
			while(num>=2  &&   control<num) {
				
			if(num%2==0) {
				
				flag=false;
				
				break;
			}
			control++;
				
			}                                             
			
		}else {
			System.out.println("Tam sayi dedik amca");
		}
		
		System.out.println(flag?"Asaldir":"Asal degildir");

	}

}
