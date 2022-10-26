package week_06;

import java.util.Scanner;

public class StringManipulation05 {

	public static void main(String[] args) {
		/*
		 1)Kullanicidan ad ve soyadini ve 11 haneli kimlik numarasini aliniz.
		 2)Kulanici ad ve soyadini yazarken hatayla bas ve sona space koyarsa siliniz
		 3)Ad ve soyadin ilk harfleri buyuk diger harfleri kucuk olmali
		 4)Kimlik numarasinin son 4 rakami haric hepsi * yapilmali
		 			Ornek: Ali Can *******1234
		 			12345678 9778
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("isminiz: ");
		String name=scan.nextLine();
		
		System.out.println("Soyisminiz: ");
		String lastName=scan.nextLine();
		
		System.out.println("kimlik no: ");
		String id=scan.nextLine();
		
		
		name=name.trim();
		lastName=lastName.trim();

		name=name.substring(0, 1).toUpperCase()+name.substring(1, name.length());
		lastName=lastName.substring(0, 1).toUpperCase()+lastName.substring(1, lastName.length());
 //////
	
		id=     id.substring(id.length()-4, id.length());
		System.out.println(id);
		
	}

}
