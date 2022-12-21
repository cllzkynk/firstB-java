package week_12;

import java.util.ArrayList;

import java.util.List;

public class ForEachLoop02 {
	
	public static void main(String[] args) {
		/*
		 * iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each
		 * loop kullanarak bulunuz. Sonucu ekrana yazdiriniz. Ortak eleman yoksa ekrana
		 * “Ortak eleman yok” yazdiriniz
		 */

		String[] atakimi = { "A", "L", "C", "D", "E" };
		String[] btakimi = { "K", "L", "E", "N", "O" };

		List<String> abc = new ArrayList<>();

		for (String stringa : atakimi) {

			for (String stringb : btakimi) {

				if (stringa.equals(stringb)) {
					abc.add(stringa);

				}
			}

		}
		System.out.println(abc.size() == 0 ? "Ortak eleman yok" : abc);

		/*
		 * Bir String olusturunuz, bu String’deki character’leri for-each loop
		 * kullanarak yazdiriniz. ipucu: split()
		 */

		
		String str ="Ördü kader ağlarını kırdı yine kollarımı";
		
		String [] harfler=str.split("");
		
 for (String string : harfler) {
	 System.out.print(string+" ,");
	
}
		
		
		
	}// class sonu

}
