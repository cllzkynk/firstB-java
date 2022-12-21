package week_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_02 {

	public static void main(String[] args) {
	//	1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz
		
		List<String> abc=new ArrayList<>();
		abc.add("A");
		abc.add("C");
		abc.add("E");
		abc.add("F");
		System.out.println(abc);
		//2) indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
		abc.add("B");
		//index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz
		abc.add(1,"L");
		System.out.println(abc);
		//3) set() methodu kullanarak, E’yi D yapiniz.
		abc.set(3, "D");
		System.out.println(abc);
		//remove() methodu kullanarak, F’yi siliniz.
		abc.remove(4);
		System.out.println(abc);
		
		//sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
		Collections.sort(abc);
		System.out.println(abc);
		//contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var
		//olmadigini dogrulayiniz
		
		System.out.println(abc.contains("L"));
		System.out.println(abc.contains("M"));
		//size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.
		System.out.println(abc.size());
		
		//clear() methodu kullanarak, list’deki tum elemanlari siliniz.
		abc.clear();
		System.out.println(abc);
		
		//isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz
		System.out.println(abc.isEmpty());
		
		
		
		//array i arrayliste donusturme.
		
		String [] hayvanlar= {"Ali","Can"};
		
		List<String> hayvanlarList=Arrays.asList(hayvanlar);
		
		System.out.println(Arrays.toString(hayvanlar));
		System.out.println(hayvanlarList);

	}

}
