package week_06;

import java.util.Scanner;

public class StringManipulation01 {

	public static void main(String[] args) {
	/*
		 * Kullanicidan email girmesini isteyin,
		 * @ isareti icermiyorsa  gecerli bir email girin  yazdirin
		 * 
		 * @gmail.com seklinde @ ilk harf olamaz. @ den once en az 3 karakter olmali
		 * @ isaretinden sonra sadece  xx.com yaziyorsa  email onaylandi  yazdirin
		 * .com icermeli
		 * bosluk iceremez
		 * sadece harf ve rakam kullanabilir
		 */
     //abcd@bb.ali
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Email adresinizi giriniz: ");
		
		String mail=scan.next();
		int sayac=0;
		
		if(mail.contains("@")) {
			System.out.println("@ kontrolu basarili");
			sayac=sayac+1;
		} else {
			System.out.println("mailde @ olmali haci abi");
		}
		
		int  atinYeri=mail.indexOf('@');
		if(atinYeri>=3) {
			sayac=sayac+1;
			System.out.println("@ den oncesi kontrolu tamam ");
		}else {
			System.out.println("@ den once de bisiler olali haci abe");
		}
	int noktaninYeri=	mail.indexOf('.');
	 int aradakikaraktersayisi  = noktaninYeri-atinYeri;
	 if(aradakikaraktersayisi>=2) {
		 System.out.println("aradaki karakter testi tamam");
		 sayac=sayac+1;
	 }else {
		 System.out.println("@ ile . arasinda  bisiler olali abe ");
	 }
	 
		 
	 if((mail.substring(mail.length()-4, mail.length()).equals(".com"))) {
		 System.out.println(".com kontrolu tamam ");
		 sayac=sayac+1;
	 }else {
		 System.out.println("mail .com ile  bitmeli");
	 }
	  if(sayac==4) {
		  System.out.println("Basarili mail denemesi");
		  
	  }else {
		  System.out.println("Mail girisi basarisiz tekrar deneyiniz");
	  }
	 System.out.println(sayac);
	 System.out.println(atinYeri);
	 System.out.println(noktaninYeri);
	 System.out.println(aradakikaraktersayisi);
	 System.out.println(mail.substring(mail.length()-4, mail.length()-1));
		
		scan.close();
	}

}
