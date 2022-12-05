package week_11;

public class Tekrar {

	public static void main(String[] args) {
		
		
		String name="      CA  Burh   ane   ttin       ";
		String name1="blabalaboalanalaj";
		//tek sayida harf varsa ortadaki harfi X ile degistir cif sayida harf varsa tam artaya 5 space yerlestiriniz
		
		System.out.println(name.trim());
		System.out.println(name.stripLeading());
		System.out.println(name.strip());
		System.out.println(name.stripTrailing());
		
	
		System.out.println(name1.length());
		System.out.println(ortadayiBul(name1));
		
		System.out.println(ortadayiBul("mehmet"));
		System.out.println(ortadayiBul("fatma" ));
		
		//  if else 
		//  switch 
		//String manupulation
		
		System.out.println(maasHesapla("mehmet"));
		System.out.println(maasHesapla("fatma"));
		
		int maasSon=(int)maasHesapla("mehmet");
		
		System.out.println(maasSon);
		
		
		//3tip loop var 1 for loop  2 while lopp 3 do while loop
		
		for (int i = 0; i < name.length(); i++) {
			
		}
		
		
		int deneme=name.length();
		
		
		while(deneme>100000000) {
			
			// sart saglanmazsa bi kere bile calismaz 
			
			deneme=0;
			
		}
		
		
		
		
		
		do {
			
			/// her turlu bir kere calisir
			
		}while(deneme>100000000);
		

		

	//main sonu 
		}


	
	
	
	public static double maasHesapla(String string) {
		// uzun uzun hesaplamalarini yazarsin
		double maas =string.length()%2==0 ? 10050.9 :10000;
	
		return maas;
	}





	public static String ortadayiBul(String aga ) {
		
		
		
		
		int uzunluk=aga.length();
		
		if(uzunluk %  2==0    ) {
			
			
			aga=aga.substring(0, uzunluk/2)+"     "+aga.substring( uzunluk/2,uzunluk);
			
			
		}else {
			//celil ==>ceXil==> uzunluk 5/2=2.5 int virgullu almaz onu tama yuvarlar 2 yapar 
			
			aga=aga.substring(0, uzunluk/2)+"X"+aga.substring( uzunluk/2+1,uzunluk);
			
		}
		
		
		
		
		
		return aga ;
	}

}
