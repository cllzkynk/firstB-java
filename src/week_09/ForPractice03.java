package week_09;

 
import java.util.Scanner;

public class ForPractice03 {

	public static void main(String[] args) {
		 /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
        hesaplayan kodu yazınız.

        Örnek Ekran Çıktısı
       Girilen sayı=4
       Kareler toplamı=30
    */

		Scanner input=new Scanner (System.in);
		System.out.println("Bir sayi gir");
		
		double num=input.nextDouble();
		int toplam=0;
		
		for (int i = 1; i <= num; i++) {
			toplam=toplam+(i*i);
			System.out.println("bu adimda i="+i+ "\n i^2="+i*i);
			System.out.println(toplam);
		}
		System.out.println(toplam);
		
		
	}

}
