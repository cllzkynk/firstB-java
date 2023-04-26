package sirket;

public class Yazilimci extends Calisan {

	private String diller;


	public Yazilimci(String ad, String soyAd, int id, String diller) {
		super(ad, soyAd, id);
		this.diller = diller;
		
		//constructor
	}
	
	
	public void formatAt(String isletimSistemi) {
		System.out.println(getAd() + " " +isletimSistemi+ " yukluyor");
		
	}
	
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Yazilimcinin bildigi diller : "+ diller);
	}
	
	
	
	
	
	
}
