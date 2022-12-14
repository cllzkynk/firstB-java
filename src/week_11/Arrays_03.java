package week_11;

import java.util.Arrays;

public class Arrays_03 {
public static void main(String[] args) {
	//binarySearch bu metod
	// eger sana geri 0 donerse aradigin deger 0. indexte  bir donerse  1 . indexte  
	//negatif donerse aradigin value arrayde yok yada sen shor yapmayi unuttun
	// binarySearch metundan once mutlaka sort edilmelidir
	
	int arr[]= {0,45,1,51,13,2,65,22,48,17,7,0,0,-5};

	
	System.out.println(Arrays.binarySearch(arr,45));
	
	
	Arrays.sort(arr); //arr yi siraladik
	System.out.println(Arrays.toString(arr)); //arr nin siralanmis halini gorecegiz
	
	System.out.println(Arrays.binarySearch(arr,0));
	
	// iki arrayin esitligi equals metodu
	
	int arr1[]= {0,45,1,51,13,2,65,22,48,17,7,0,0,-5};
	int arr2[]= {0,45,1,51,13,2,65,22,48,17,7,0,0,-5};
	
	System.out.println(Arrays.equals(arr, arr1)); //false doner cunku arr yi daha once sort ettik.
	
	System.out.println(Arrays.equals(arr2, arr1));
	
	
	
	
}
}
