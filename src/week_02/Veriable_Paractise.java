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
		int temp = kilo; // temp 85
		kilo = yas; // kilo = 40
		yas = temp;

		System.out.println(kilo);

		 
 

	}

	 
}
