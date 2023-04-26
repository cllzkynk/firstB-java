package sirket;

import java.util.Scanner;

public class SirketRunner {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Calisan programina hosgeldiniz");
		String islemler="Islemler .....\n"
				+ "1=Yazilimci islemleri\n"
				+ "2=Yonetici islemleri\n"
				+ "Cikis icin X girisi yapiniz";
		
		
		while(true) {
			System.out.println(islemler);
			System.out.println("Islem seciniz ");
			String islem=scan.nextLine();
			if(islem.equals("X")) {
				System.out.println(" Programdan cikiliyor..........");
				break;
			}else if(islem.equals("1")) {
				Yazilimci yazilimci=new Yazilimci("Ibrahim ","Javaci ",1,"Java, Pyhton , C,C#,C+,C++ ");
				Yazilimci yazilimci2=new Yazilimci("Ibrahim ","Javaci ",1,"Java, Pyhton , C,C#,C+,C++ ");
				String yazilimciIslemleri="Yazilimci Islemleri \n"
						+ "1=Format at\n"
						+ "2=Bilgileri Goster\n"
						+ "Cikis icin X giriniz";
						
	 
		while(true) {
			System.out.println(yazilimciIslemleri);
			System.out.println("Islem seciniz ");
			String yIslem=scan.nextLine();
			if(yIslem.equals("X")) {
				System.out.println(" Yazilimci Islemlerinden cikiliyor..........");
				break;
		}else if(yIslem.equals("1")) {
			System.out.println("Isletim sistemini giriniz");
			String isletimSistemi=scan.nextLine();
			yazilimci.formatAt(isletimSistemi);
			
		}else if(yIslem.equals("2")) {
			yazilimci.bilgileriGoster();
		}else {
			System.out.println("Yanlis giris yaptiniz Tekrar deneyiniz");
		}
			
		}
				
				
			}else if(islem.equals("2")) {
				Yonetici yonetici=new Yonetici("Celil ","Uzunbacak",5,5);
				String yIslemleri="Yonetici islemleri\n"
						+ "1=Zam Yap\n"
						+ "2=Bilgileri Goster\n"
						+ "Cikis icin X giriniz";
				
				while(true) {
					System.out.println(yIslemleri);
					System.out.println("Islem seciniz ");
					String yoneticiIslem=scan.nextLine();
					if(yoneticiIslem.equals("X")) {
						System.out.println(" Yazilimci Islemlerinden cikiliyor..........");
						break;
				}else if(yoneticiIslem.equals("1")) {
					System.out.println("Yoneticinin ne kadar zam yapmasini istiyorsunuz");
					int zam=scan.nextInt();
					scan.nextLine();
					yonetici.zamYap(zam);
				 }else if(yoneticiIslem.equals("2")){
                     yonetici.bilgileriGoster();
                 }else{
                     System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz");
                 }
             }

         }else{
             System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz...");
         }
     }
     
 }
 
}
