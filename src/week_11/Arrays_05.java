package week_11;

import java.util.Arrays;

public class Arrays_05 {

	public static void main(String[] args) {
		// cok katli arrayler  === multi dimensional Arrays
		
		
		int [][] arr= {    {1,2,3,4}    ,       {5,6,7,8,9,10,11}      } ;
		System.out.println(arr[1].length);
		
		
		int [][][] arr1= {    {     {1,2} ,{88,99,33,44}   }  ,       {{5,6,7,8,9,10,11}  }    } ;
		
		
		System.out.println(arr1[0][0].length);
		System.out.println(Arrays.toString(arr1[1][0])) ;
		
		Arrays.sort(arr1[0][1]);
		System.out.println(Arrays.toString(arr1[0][1])) ;
		
		// arraydaki tum elemanlari yazdirmak 
		// for ile odev
		
		System.out.println(Arrays.deepToString(arr1)) ;
		
		//odevler
		//1  Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin ==arrays yardimiyla
		
		
		//2  Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
		//   Array olarak yazdiran bir method yaziniz
		
		//3  Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
		//   elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
		//arr1 = { {1,2},{3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }  sonuc 8,10,13,15,18 donecek
		
		
		// 4 Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
		//birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i
		//ekrana yazdiran bir program yaziniz 
		// { {1,2,3}, {4,5}, {6,7} }
		//Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
		
		
		//5 Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
		// ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
		
		// kolay gelsin
		
		
		
		
	}

}
