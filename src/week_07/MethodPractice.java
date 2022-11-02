package week_07;

public class MethodPractice {

	public static void main(String[] args) {
		 /*
        Problem Tanımı :
        farklı 4 öğrencinin sırasıyla 3 yazılı notlarının ortalamasını
        yazdıran parametreli method yazınız
         */
		
		int not1;
		int not2;
		int not3;
		String name ; 
		String lastName;
		
		
		ortalamaHesapla("Ali"  , "Veli" , 50 , 70, 93);
		ortalamaHesapla("Ali1" , "Veli2" , 45 , 75, 77);
		ortalamaHesapla("Ali2" , "Veli3" , 2 , 33, 11);
		ortalamaHesapla("Ali3" , "Veli4" , 0 , 70, 93);
		ortalamaHesapla("Ali4" , "Veli5" , 50 , 1, 93);
		ortalamaHesapla("Ali5" , "Veli6" , 50 , 7, 55);
		ortalamaHesapla("Ali6" , "Veli7" , 50 , 88, 93);
		ortalamaHesapla("Ali7" , "Veli8" , 66 , 70, 44);
		ortalamaHesapla("Ali8" , "Veli9" , 73 , 15, 93);
		
		
		ortalamaHesapla("ozel" , "ozel" , 73 , 15);
		ortalamaHesapla(73 , 15,"takilmaca" , "ozel"  );

	}

	public static void ortalamaHesapla(int not1, int not2, String name, String lastName) {
		System.out.println(name+" . "+lastName+" takil "+      (     (  not1+not2 )/2   )                                   );
	}

	public static void ortalamaHesapla(String name, String lastName,  int not1, int not2) {
		System.out.println(name+" . "+lastName+" "+      (     (  not1+not2 )/2   )                                   );
		
		
	}

	
	
	public static void ortalamaHesapla(String name, String lastName, int not1, int not2, int not3) {
		
		
		System.out.println(name+" "+lastName+" "+      (     (  not1+not2+not3  )/3   )                                   );
		
	}

}
