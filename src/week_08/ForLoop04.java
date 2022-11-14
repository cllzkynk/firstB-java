package week_08;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		//  Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
		//palindrome olup olmadigini kontrol eden bir program yazin.
		// palindrome ==> normal ve tersten yazimi ayni olanlar polindrome dir mesela  aya , amma
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Polindrome kontrolu icin giris yapiniz");
		String str=scan.nextLine();
		
		
		String tempStr="";
		
		
		for (int i = str.length()-1; i >=0; i--) {
			tempStr=tempStr+str.charAt(i);
			
		}
		
		System.out.print(tempStr+ "   "); System.out.println(str);
		
		
		System.out.println(str.equals(tempStr)? "polindromedir":"polindrome degildir");
		
		
	 

	}
	
	


}
