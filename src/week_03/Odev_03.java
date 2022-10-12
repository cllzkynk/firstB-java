package week_03;

import java.util.Scanner;

public class Odev_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// System.out.println("Lutfen isminizi giriniz :");

		// String name=scan.nextLine();

		// Mehmet
		// System.out.println( name.charAt(name.length()-1));

		String str1 = "mehmet";
		String str2 = "Mehmet";

		String str3 = " ";

		// System.out.println(str3.isEmpty());

		// System.out.println(str2.indexOf('t'));
		str1.toLowerCase();

		// System.out.println(str2.lastIndexOf("met"));
		// System.out.println(str2.lastIndexOf('c'));
		// System.out.println(str2.contains("eht"));
		// System.out.println(str2.contains(" "));

		// System.out.println(str2.endsWith("ety"));
		// System.out.println(str2.toLowerCase().startsWith("me"));

		/*
		 * 1- charAt( ) Istenen indexdeki karakteri (char) dondurur. Index 0’dan baslar,
		 * maximum index (String’in uzunlugu – 1) dir 3-toUpperCase() 4-toLowerCase()
		 * Girilen String degiskendeki tum harfleri istenen bicime cevirir.
		 * 
		 * 5-equals Verilen iki String’in iceriginin birbirine esit olup olmadigini
		 * kontrol eder. Eger verilen Stringlerdeki tum karakterler (bosluk, buyuk harf,
		 * kucuk harf, ozel karakter ..) tamamen ayni ise TRUE doner, aksi durumda (bir
		 * karakter bile farkli olsa) FALSE doner.
		 * 
		 * 6-equalsIgnoreCase Verilen iki String degiskeni BUYUK HARF / kucuk harf farki
		 * gozetmeksizin karsilastirir. Buyuk / kucuk harf farkliligi disinda herhangi
		 * bir karakter farkliligi oldugunda equals methodunda oldugu gibi FALSE
		 * dondurur.
		 * 
		 * 7-length() Verilen String’deki karakter sayisini dondurur.
		 * 
		 * 
		 * indexOf() Verilen String’de istenen karakterin kullanildigi ilk index’i
		 * dondurur
		 * 
		 * 9-lastIndexOf() Verilen String’de istenen karakterin kullanildigi son index’i
		 * dondurur.
		 * 
		 * 10-contains() Verilen String’in istenen karakter(ler)i icerip icermedigini
		 * kontrol eder. Iceriyorsa TRUE, icermiyorsa FALSE dondurur. NOT contains()
		 * methodu char icin kullanilamaz, String kullanmak zorunludur.tek karakter
		 * sorgulamak istediginde o karakteri "" seklinde yazarsaniz onu string kabul
		 * eder
		 * 
		 * 
		 * 11-endsWith() Verilen String’in istenen karakter(ler) ile bitip bitmedigini
		 * kontrol eder. Istenen karakter(ler) ile bitiyorsa TRUE, yoksa FALSE dondurur.
		 * 12-startsWith() Verilen String’in istenen karakter(ler) ile baslayip
		 * baslamadigini kontrol eder. Istenen karakter(ler) ile basliyorsa TRUE, yoksa
		 * FALSE dondurur
		 * 
		 * 
		 * 13-isEmpty() Verilen String’in uzunlugu 0(sifir) ise (Hicbir karakter
		 * icermiyorsa) TRUE, yoksa FALSE dondurur.
		 * 
		 * 14- replace() Verilen String’deki istenen karakter(ler)i istenen yeni
		 * karakter(ler) ile degistirir.
		 * 
		 * 
		 * 15- replaceAll() replace() methodu ile benzer olarak verilen String’deki
		 * istenene karakter(ler)i istenen yeni karakter(ler) ile degistirir.
		 * Aralarindaki farklar 
		 * - replace() methodunda char kullanilabilir, replaceAll()’da char kullanilamaz
		*- replaceAll() methodunda Regular Expressions kullanilabilir
		*\\s ==>bosluk (space)
		*\\S ==>bosluk disindaki tum karakterler
		*\\w : harfler ve rakamlar (a-z , A-Z, 0-9)
		*\\W : harfler ve rakamlar disindaki tum karakterler
         *\\d : rakamlar (0-9)
       *\\D : rakamlar disindaki tum karakterler
       *
       *
       *16- replaceFirst()
	Verilen String’deki istenen karakter(ler)in ilkini, istenen yeni karakter(ler) ile degistirir
 
 
 17- substring()
Index kullanarak verilen String’in istenen parcasini almamizi saglar.
 
- Parametre olarak 1 sayi girilirse, girilen index’den String’in sonuna kadar bolumu
- Parametre olarak 2 sayi girilirse, girilen 1.sayidaki indexden (inclusive) baslayip,
2.sayiya kadar (exclusive) karakteri bize dondurur


18- trim()
Istedigimiz String’in basinda veya sonunda var olan bosluk / “space” leri temizler
		 */

		//String str4 = " Verilen String’deki istenen karakter(ler)i istenen yeni karakter(ler) ile degistirir.";
		// str4.replace('(', '{');
		// System.out.println(str4.replace('(', '{'));

		// System.out.println(str4.replace('e', 'a'));
		String str5 = "15- replaceAll() replace() methodu ile benzer olarak verilen String’deki\r\n"
				+ "		 * istenene karakter(ler)i istenen yeni karakter(ler) ile degistirir.\r\n"
				+ "		 * Aralarindaki farklar bosluk (space) \\\\D : rakamlar disindaki tum karakterler\r\n"
				+ "		 * \\\\d : rakamlar (0-9) \\\\W : harfler ve rakamlar disindaki tum karakterler \\\\w\r\n"
				+ "		 * : harfler ve rakamlar (a-z , A-Z, 0-9) \\\\S : bosluk disindaki tum karakterler\r\n"
				+ "		 * \\\\s : - replaceAll() methodunda Regular Expressions kullanilabilir -\r\n"
				+ "		 * replace() methodunda char kullanilabilir, replaceAll()’da char kullanilamaz\r\n"
				+ "		 * ";

		//System.out.println(str5.replaceAll("\\*", ""));
		
		String str7="X";
		String str8="e";
	 

		
		String str4 = "                          Verilen String’deki istenen karakter(ler)i istenen yeni karakter(ler) ile degistirir.    ";
		
		//System.out.println(str5.replaceAll("\\s","").replaceAll("\\W", "").replaceAll("\\d", ""));
		//System.out.println(str4.replaceFirst(str8, str7));
		
		//System.out.println(str4.substring(0));
		//System.out.println(str4.substring(1,9)); // ilk verilen  index dahil ikinci index dahil degil [x,y)
		
		/*
		 *Celil  Ozkaynak  1989 Bartin
		 *ismin ilk iki harfi kucuk sayismin ilk harfi buyuk dogum yilinin son iki rakami . Merleketin ilk ve son harfi kucuk halde
		 *ceO89.bn
		 */
		System.out.println(str4.length());
		System.out.println(str4 );
		System.out.println(str4.trim());
		
	}

}
