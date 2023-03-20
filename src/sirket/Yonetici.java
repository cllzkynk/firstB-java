package sirket;

public class Yonetici extends Calisan {
	private int kacKisidenSorumlu;

	public Yonetici(String ad, String soyAd, int id, int kacKisidenSorumlu) {
		super(ad, soyAd, id);
		this.kacKisidenSorumlu = kacKisidenSorumlu;
	}

	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Sorumlu oldugu kisi sayisi : " + kacKisidenSorumlu);
	}

	public void zamYap(int zamMiktari) {
		System.out.println(getAd() + "Calisanlara " + zamMiktari + " lira kadar zam yazpiyor....");
	}

}
