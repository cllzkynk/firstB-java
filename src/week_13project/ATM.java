package week_13project;

import java.util.Scanner;

public class ATM {
	
	static double bakiye=1000;
	static double bakiyebase=bakiye;
	static String kartNoBase="123456789";
	static int sifrem=4321;
	
	static Scanner scan=new Scanner (System.in);
	
	
	public static void main(String[] args) { // main motudun baslangici
		System.out.println("First Banka Hosgeldiniz");
		
		int sifre;
		String kartNo;

		do {
			System.out.println("Lutfen kart numaranizi giriniz");
			kartNo= scan.nextLine();
			
			
		       scan.nextLine();
			
			
			System.out.println("Lutfen sifrenizi giriniz");
			sifre=scan.nextInt();
			
				
				
				if(sifre!=sifrem || !kartNo.equals(kartNoBase)) {
					System.out.println("Islem basarisiz. Yanlis Giris yaptiniz. \nLutfen tekrar deneyiniz");
					
				}
			
			
			
		}while(sifre!=sifrem ||!kartNo.equals(kartNoBase));
		
		atmPanel();
		
		
		
	} // main sonu


	public static void atmPanel() {
		System.out.println("Sifre onaylandi");
		System.out.println("Hosgeldiniz");
		
		char islem=' ';
		do {
			System.out.println("Lutfen yapmak istediginiz islemi giriniz."
					+ "\nA->Bakiye sorgula"
					+ "\nB->Para yatirma "
					+ "\nC->Para Cekme"
					+ "\nD->Para Gonderme "
					+ "\nE->Sifre Degisitme"
					+ "\nF->Cikis");
			islem= scan.next().toUpperCase().charAt(0);
			
			
			switch (islem) {
			case 'A':
				bakiyeSorgulama();
				break;
			case 'B':
				paraYatirmama();
				break;
			case 'C':
				paraCekme();
				break;
			case 'D':
				paraGonderme();
				break;
			case 'E':
				sifreDegistir();
				break;
			case 'F':
			System.out.println("Bilgi fisi istermisiniz \nEvet icin E dogayi korumak icin H giriniz");
			char fis=scan.next().toUpperCase().charAt(0);
			if(fis=='E') {
				fatura();
				
			}else {
				System.out.println("Dogayi korudugunuz icin tesekkur ederiz  \nGule Gule");
			}
			
		
				break;





			default:
				System.out.println("Lutfen gecerli bir islem seciniz");
				break;
			}
			
	
			
		} while (islem !='F');
		
	}


	public static void fatura() {
		System.out.println("Islem esnasinda bakiye degisimi"+(bakiye-bakiyebase)) ;
		System.out.println("Son durum da bakiyeniz : "+ bakiye);
		
	}


	public static void sifreDegistir() {
		System.out.println("Lutfen yeni sifrenizi giriniz");
		
		int yeniSifrem=scan.nextInt();
		sifrem=yeniSifrem;
		System.out.println("Sifre degistirme islemi basarili");
	}


	public static void paraGonderme() {
		System.out.println("Lutfen gondermek istediginiz miktari giriniz");
		int gonderilecek=scan.nextInt();
		bakiye=bakiye-gonderilecek;
		System.out.println("Mevcut bakiyeniz"+bakiye);
	}


	public static void paraCekme() {
		System.out.println("Lutfen cekmek istediginiz miktari giriniz");
		int cekilecek=scan.nextInt();
		bakiye=bakiye-cekilecek;
		System.out.println("Mevcut bakiyeniz"+bakiye);
	}


	public static void paraYatirmama() {
		System.out.println("Lutfen yatirmak istediginiz miktari giriniz");
		int yatirilacak=scan.nextInt();
		bakiye=bakiye+yatirilacak;
		System.out.println("Mevcut bakiyeniz"+bakiye);
	}


	public static void bakiyeSorgulama() {
		System.out.println("Bakiyeniz : "+bakiye);
		
	}

} // class sonu
