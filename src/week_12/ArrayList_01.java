package week_12;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_01 {

	public static void main(String[] args) {
		// array in uzunlugu esnek olan halidir.
		
		/*
		ArrayList’e nicin ihtiyac duyariz?
				 Biz array olustururken length’in en basta belirlemek zorundayiz ve daha sonra
				length’ini degistiremeyiz.Bu durum bizim esnek calismamiza engel olur.
				
				 Bir array’in uzunlugunu degistirmek istedigimizde yeni bir array olusturmamiz
				gerekir, ArrayList de gerekmez.
				 Bir array’den bir eleman silmek istedigimizde yeni bir array olusturmamiz
				gerekir, ArrayList de gerekmez
				*/
		
		int arr[]=new int[5];
		
		arr[0]=1;
		arr[1]=5;
		arr[2]=10;
		arr[3]=75;
		arr[4]=20;
		
		int arr1[]=new int[6];
		
		arr1[5]=30;
		
		for (int i = 0; i < arr.length; i++) {
			arr1[i]=arr[i];
			
		}
		
		System.out.println(Arrays.toString(arr1)+   "   arr1");
		// yaramaz yontem
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();
		List     <String> list3 = new ArrayList<>();  //en cok bu kullanilir
		
		
		ArrayList<Integer> list4 = new ArrayList<>();
		
		System.out.println(list1);
		
		//add() metodu arrayListe eleman ekler.
		
		
		list1.add("Zu");
		list1.add("Ali");
		list1.add("Can");
		list1.add("Su");
		list1.add("Ay");
		list1.add("Ha");
		list1.add("Hu");
		
		System.out.println(list1);
		System.out.println(list1.size()); //size() metodu ArrayListin eleman sayisini veriri
		
		
		list1.add("Ma");
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		
		list1.remove("Ma");
		System.out.println(list1);
		System.out.println(list1.size());
		
		list1.add(0,"Po");
		
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		
		
	System.out.println(	list1.remove("Po")+ "  list1.remove(pp)  ");
	
		System.out.println(list1);
		System.out.println(list1.size());
		
		// isEmpty()
		System.out.println(list1.isEmpty());
		
		//list1.clear();
		//System.out.println(list1.isEmpty());
		
		list1.set(6, "Huhu");
		System.out.println(list1);
		
		
		//get(index);   istenen indexteki elemani getirir
		System.out.println(list1.get(0));
		System.out.println(list1.get(6));
 
		//contains() arraylistte aradigimiz elamanin var olup olmadigini doner
		System.out.println(list1.contains("Can"));
		System.out.println(list1.contains("Canx"));
		
		
		//Collections.sort(); arraylisti siralamak icin kullanilir.
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		
		//equals(); iki farkli listeyi karsilastirmak  icin kullanabvilirz
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("Zu");
		list5.add("Ali");
		list5.add("Can");
		list5.add("Su");
		list5.add("Ay");
		list5.add("Ha");
		list5.add("Huhu");
		list5.add("Su");
		
		list1.add("Su");
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		Collections.sort(list5);
		
		System.out.println(list5);
		
		
		

		
		
	}

}
