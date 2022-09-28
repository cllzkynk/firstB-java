package week_02;

public class Veriable_Paractise {

	public static void main(String[] args) {

		char harf = 'c'; // bu sadece bi karakter tutabilir (gizli numerik)
		System.out.println(harf + 2 + "9.satir==>>  "); // c=99

		System.out.println("11 satir.==>>  " + harf + 2); // c2

		System.out.println("13 satir.==>>  " + (harf + 2)); // c=99

		System.out.println((" 15 satir. ==>>" + harf) + 2);

		// deger tip ve ref tip

		int kilo = 85;
		int yas = 40;
		
		// byte short int long float double char boolean deger tipli (primitive) ==> stack memory de tutulur 
		
		//String Array , List , map non-primitive ref tipli  heap memory bunlarin ref leri (adresleri) stack de tutulur
		
		

		degistir(kilo, yas);

		System.out.println(kilo);

		String name1 = "Dragon";
		String name2 = "Kevser";

		System.out.println(strSwap(name1, name2));

	}

	private static String strSwap(String name1, String name2) {
		String temp = name1;
		name1 = name2;
		name2 = temp;

		return name1;

	}

	private static void degistir(int kilo, int yas) {
		int temp = kilo; // temp 85
		kilo = yas; // kilo = 40
		yas = temp;

	}

}
