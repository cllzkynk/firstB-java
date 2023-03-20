package inheritance_02;

public class Calisan {
	
	
	
	
	
	private String ad;
	private int maas;
	private String departman;

	
	
	public Calisan(String ad, int maas, String departman) {
		
		this.ad = ad;
		this.maas = maas;
		this.departman = departman;
	}
	

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		
		
		this.maas=maas;
		
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public void calis() {
		System.out.println("Calisan calisiyor");
		}
	
	public void bilgileriGoster() {
		System.out.println("Isim x: "+ad);
		System.out.println("Maas x: "+maas);
		System.out.println("Departman x: "+ departman);
	}
	
	public void departmanDegirstir(String yeniDepartman) {
		System.out.println("Departman degisiyor..........");
		
		this.departman=yeniDepartman;
		System.out.println("Yeni derpartman : "+ yeniDepartman);
		
	}
	
	
	
}
