package week_11;

import java.util.Arrays;

public class Arrays_04 {

	public static void main(String[] args) {
		//Bir Stringi array e donusturmek,
		// split()  Stringe ait bir metoddur Stringi istedigin kosul ile arraya donusturmeni saglar
		
		String student[]= {"Ali","Ayse","Veli","Fatma","Can","Ay","Su"};
		
		String ogrenciler="Ali,Ayse,Veli,Fatma,Can,Ay,Su";
		
		String ogrenciler2[]= ogrenciler.split(",");
		
		
		String str="knfdasvkjvnaerfbvnaerfnvbdz,jvbrdsehb ";
		
		
		System.out.println(Arrays.toString(student));
		System.out.println(Arrays.toString(ogrenciler2));
		
	
		String str2[]=str.split("");
		
		System.out.println(Arrays.toString(str2));
		

	}

}
