package emlak;

import java.util.Scanner;

public class Emlak {

	public int listeNo;
	public String evTipi;
	public String il;
	public int odaSayisi;
	private double fiyat;
	public String StokDurumu;

	public int getListeNo() {
		return listeNo;
	}

	public void setListeNo(int listeNo) {
		this.listeNo = listeNo;
	}

	public String getEvTipi() {
		return evTipi;
	}

	public void setEvTipi(String evTipi) {
		this.evTipi = evTipi;
	}

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public int getOdaSayisi() {
		return odaSayisi;
	}

	public void setOdaSayisi(int odaSayisi) {
		this.odaSayisi = odaSayisi;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public String getStokDurumu() {
		return StokDurumu;
	}

	public void setStokDurumu(String StokDurumu) {
		this.StokDurumu = StokDurumu;
	}

	Emlak(double ListeNo, String evTipi, String il, int odaSayisi, double fiyat, String StokDurumu ) {
		this.listeNo=(int)ListeNo;
		this.evTipi=evTipi;
		this.il=il;
		this.odaSayisi=odaSayisi;
		this.fiyat =fiyat;
		this.StokDurumu = StokDurumu;
		
	}
	Emlak(int ListeNo, String evTipi, String il, int odaSayisi, double fiyat, String StokDurumu) {
		
		Scanner scan = new Scanner(System.in);
		
		
		this.listeNo=ListeNo++;

		System.out.println("Ev tipi");
		this.evTipi = scan.next ();

		System.out.println("Il");
		this.il = scan.next();

		System.out.println("Oda sayisi");
		this.odaSayisi = scan.nextInt();

		System.out.println("Fiyat");
		this.fiyat = scan.nextDouble();

		System.out.println("Stock Durumu");
		this.StokDurumu = scan.next();

		//scan.close();
	}

	public void ListeleEmlak() {
		System.out.println("\nListe no    : "+ listeNo +"\nEv tipi     : "+evTipi+"\nil          : "+ il 
				+"\noda sayisi  : "+odaSayisi+ "\nFiyat       : "+fiyat+ "\nStok Durumu : "+StokDurumu);
	}

	
	

}
