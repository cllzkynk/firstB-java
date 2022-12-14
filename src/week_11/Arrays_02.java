package week_11;

import java.util.Arrays;

public class Arrays_02 {

	public static void main(String[] args) {
		// Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma
		//tasiyacak bir program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
		
		int arr[]= {1,2,3};
		
		int temp=0;
		
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=arr[2];
		arr[2]=temp; // temp=arr[0]
		System.out.println(Arrays.toString(arr));
		
	//	Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		int arr2[]= {1,2,3,5,7,9,15,21,44};
		
		int toplam=0;
		
		for (int i : arr2) {
			toplam=toplam+i;
		}
System.out.println(toplam);


int arr3[]= {45,1,51,13,2,65,22,48,17,7,0,-5};
// bu arrayin en buyuk elemanini yazdiriniz.
// en kucuk sayiyi yazdiralim 

Integer maxInt=Integer.MIN_VALUE;

for (int i : arr3) {
	if(maxInt <i) {
		maxInt=i;		
	}
}

System.out.println(maxInt);


Integer minInt=Integer.MAX_VALUE;

for (int i : arr3) {
	if(minInt >i) {
		minInt=i;		
	}
}

System.out.println(minInt);

int a=5;
//a^2
//a^21

System.out.println(Math.pow(a, 21));


Arrays.sort(arr3);  // dogal siralama yapar 
System.out.println(Arrays.toString(arr3));
System.out.println(arr3[arr3.length-1]);
System.out.println(arr3[0]);




int arr4[]=new int[arr3.length];

 
//siralamayi buyukten kucuge yapiniz
for (int i =arr3.length-1; i >= 0; i--) {

	//System.out.println(arr3.length-1-i+"   Formuldeki degisim");
	//System.out.println(i+"   i deki degisim");
	
	
     arr4[arr3.length-1-i]=arr3[i];
	
}

System.out.println(Arrays.toString(arr4));



int arr5[]=arr4;


arr5[0]=111;

System.out.println(Arrays.toString(arr4));


char charr []= {'z','j', 'k','a','f'};
System.out.println(Arrays.toString(charr));

Arrays.sort(charr);

System.out.println(Arrays.toString(charr));

	}

}
