package week_09;

import java.util.Scanner;

public class ForPractice04 {

	public static void main(String[] args) {
		 /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program(metodla) yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
		
		Scanner input=new Scanner (System.in);
		System.out.println("Mukemmel sayi kontrolu icin Bir sayi gir");
		int num=input.nextInt();
		
		
		boolean flag=checkPerfectNumber(num );
		
		System.out.println(flag);
		
		String result=flag?"Mukemmel sayi":" Mukemmel sayi degildir";
		
		System.out.println(result);
		
 
		
		

	}

	public static boolean checkPerfectNumber(int num) {
		
		 int toplam=0;
		 boolean flag=false;
		 for (int i = 1; i <= num/2; i++) {
			 System.out.println(i);
			 
			 if(num%i==0) {
				 toplam=toplam+i;
				
			 }
			
		}
		 if(toplam==num) {
			 flag=true;
		 }
		
		
		return flag;
	}

}
