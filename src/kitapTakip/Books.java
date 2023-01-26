package kitapTakip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

	static Scanner scan=new Scanner (System.in);
	int kitapNo=999;
	String kitapAdi;
	String yazarAdi;
	double kitapFiyati;
	
	List<Books> kitapListesi=new ArrayList<>();
	
	// constructor (yapici metodlar) vardir.
	
public Books(int kitapNo,String kitapAdi,String yazarAdi,double kitapFiyati) {
		this.kitapNo=kitapNo;
		this.kitapAdi =kitapAdi;
		this.yazarAdi=yazarAdi;
		this.kitapFiyati=kitapFiyati;
		

	}

	public Books() {
		
// default
	}

	
	
	@Override
	public String toString() {
		return "\nKitap adi \t"+kitapAdi+"\nYazar adi \t"+yazarAdi+"\nFiyat \t"+kitapFiyati+"Kitap No \t"+kitapNo+"\n";
	}

	public  void kitapEkle() {
		this.kitapNo++;
		System.out.println("Kitabin adi: ");
		this.kitapAdi=scan.nextLine();
		scan.nextLine();
		System.out.println("Yazarin  adi: ");
		this.yazarAdi=scan.nextLine();
		System.out.println("Kitabin Fiyati : ");
		this.kitapFiyati=scan.nextDouble();
		
		Books kitap=new Books(  kitapNo, kitapAdi, yazarAdi,  kitapFiyati);
		
		kitapListesi.add(kitap);
		
		System.out.println("Kitap basariyla eklendi.");
		
		
		
	}
	
	
	public void numaraIleKitapListele() {
		System.out.println("Listelenecek kitabin numarasini gir : ");
		int no=scan.nextInt(); //dummy
		for (Books book : kitapListesi) {
			if(book.kitapNo==no) {
				System.out.println(book);
				break;
			}
			
		}
		
	}
	
	public void bilgilerIleKitabiGoruntule() {
		System.out.println("Listelemek istedigin kitabin adini yada yazarinin adini giriniz ");
		String kitapBilgisi=scan.nextLine();
		scan.nextLine();
		for (Books book : kitapListesi) {
			if(book.kitapAdi.equals(kitapBilgisi) || book.yazarAdi.equals(kitapBilgisi)) {
				System.out.println(book);
				break;
				
			}else { //elsenin calisma modu
				System.out.println("Girilen verilerle eslesen bir kitap bulunamadi.");
				break;
			}
			
						
		}
		
		System.out.println(kitapBilgisi);

		
	}
	
	public void numaraIleKitapSil() {
		System.out.println("Silinecek kitabin numarasi gir : ");
		int silinecekNo=scan.nextInt();
		
		
		for (Books book : kitapListesi) {
			if(book.kitapNo==silinecekNo) {
				kitapListesi.remove(kitapListesi.indexOf(book));
				System.out.println(book + "  Bu kitap tum bilgileri ile listeden silinmistir");
				break;
			}
			
		}
		// dommy
		
		
	}
	
	public void listele() {
		System.out.println(" \n---------------------------------------------------");
		if(kitapListesi.isEmpty()) {
			System.out.println("Kitap listeniz bostur");
			
		}else {
			for (int i = 0; i < kitapListesi.size(); i++) {
				System.out.println(kitapListesi.get(i));
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	

	 // main basi
	public static void main(String[] args) {  // main basi

}// main sonu

} // class sonu 
