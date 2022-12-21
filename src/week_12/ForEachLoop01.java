package week_12;

import java.util.Arrays;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	
	for (int i = 0; i < arr.length; i++) {
	
		System.out.print(i + "<==>");
		

		//arr[i]+=1;//arr[i]+=1;   arr[i]=arr[i]+1;
	}
	System.out.println();
		System.out.println(Arrays.toString(arr));
		
		
		
		for(int each:arr) {
		
			System.out.print(each + " <=> ");
		}
		
	 //Soru 1:
	//	Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
	//	kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		
		System.out.println();
		
		int carpim=1;
		
		for (int i : arr) {
			carpim=carpim*i;
			
		}
		System.out.println(carpim);
 
		//Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each
		//loop kullanarak bulunuz. Sonucu ekrana yazdiriniz
		

		int toplam=0;
		
		for (int i : arr) {
			toplam=toplam+(i*i);
			
		}
		System.out.println(toplam);
		
		
		
		
		
		
		
		
		
	}// class sonu

}
