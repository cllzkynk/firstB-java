package inheritance_02;

public class Yonetici extends Calisan {
	
	
	
	
	
	
	

	private int sorumlu_kisi;

	public Yonetici(String ad, int maas, String departman, int sorumlu_kisi) {
		super(ad, maas, departman); // super keywordu super class ile child class arasinda postacidir
		this.sorumlu_kisi = sorumlu_kisi;
	}

	

	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Sorumlu olunan kisi sayisi : " + sorumlu_kisi);
	}
	
	public void zamYap() {
		System.out.println("Yonetici zam yapiyor");
	}

}
