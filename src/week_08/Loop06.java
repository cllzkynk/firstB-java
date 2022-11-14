package week_08;

import java.util.Scanner;

public class Loop06 {

	public static void main(String[] args) {
		// Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
		// sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("10 dan kucuk bir tamsayi giriniz");
		int girilen = scan.nextInt();
		
		System.out.println(faktoriyel(girilen));
		
	}

	
	//recursive metod
	public static int  faktoriyel(int girilen) {
		
	if(girilen==0) return 1;
	if(girilen<0) return 0;
	
	System.out.println(girilen-1);
	
	return girilen*faktoriyel(girilen-1);
	
	
	
		
	
	}

}
