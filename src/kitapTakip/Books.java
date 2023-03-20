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
		return "\nKitap :"+kitapAdi+"\nYazar adi :"+yazarAdi+"\nFiyat :"+kitapFiyati+"\nKitap No :"+kitapNo+"\n";
	}

	public  void kitapEkle() {
		this.kitapNo++;
		System.out.println("Kitabin adi :");
		this.kitapAdi=scan.next();
	

 
		System.out.println("Yazarin  adi :");
		this.yazarAdi=scan.next();
		System.out.println("Kitabin Fiyati :");
		this.kitapFiyati=scan.nextDouble();
		
		Books kitap=new Books(  kitapNo, kitapAdi, yazarAdi,  kitapFiyati);
		//public Books(int kitapNo,String kitapAdi,String yazarAdi,double kitapFiyati) {
		this.kitapNo=kitapNo;
		
		kitapListesi.add(kitap);
		
		System.out.println("Kitap basariyla eklendi.");
		
		
		
	}
	
	
	public void numaraIleKitapListele() {
		System.out.println("Listelenecek kitabin numarasini gir :");
		int no=scan.nextInt(); //dummy
		  boolean flag=false;
		for (Books book : kitapListesi) {
			if(book.kitapNo==no) {
				 flag=true;
				System.out.println(book);
				break;
			}
			
		}
		 if(flag==false) {
	        	System.out.println("Girilen bilgilerle ortusen kitap bulunamadi");
	        }
		
	}
	
	public void bilgilerIleKitabiGoruntule() {
		System.out.println("Listelemek istedigin kitabin adini yada yazarinin adini giriniz ");
		String kitapBilgisi=scan.next();
  boolean flag=false;
   
        
        for (Books book : kitapListesi) {
    		if(book.kitapAdi.equals(kitapBilgisi) || book.yazarAdi.equals(kitapBilgisi)) {
    	 flag=true;
    			System.out.println(book);
    			break;
    		      }
    		
    		}
        if(flag==false) {
        	System.out.println("Girilen bilgilerle ortusen kitap bulunamadi");
        }
        
        
		/* 
		for (int i = 0; i < kitapListesi.size(); i++) {
			if(kitapListesi.get(i).kitapAdi.equals(kitapBilgisi)||kitapListesi.get(i).yazarAdi.equals(kitapBilgisi)) {
				System.out.println(kitapListesi.get(i));
			 
				
		
				break;
				
			}
		 * 
		 */
	
		
		
	}
	
	public void numaraIleKitapSil() {
		System.out.println("Silinecek kitabin numarasi gir : ");
		int silinecekNo=scan.nextInt();
		boolean flag=false;
		
		for (Books book : kitapListesi) {
			if(book.kitapNo==silinecekNo) {
				 flag=true;
				kitapListesi.remove(kitapListesi.indexOf(book));
				System.out.println(book + "  Bu kitap tum bilgileri ile listeden silinmistir");
				break;
			}
			
		}
		 if(flag==false) {
	        	System.out.println("Girilen bilgilerle ortusen kitap bulunamadi");
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
