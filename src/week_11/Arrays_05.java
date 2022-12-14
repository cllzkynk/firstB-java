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
		
		
		
	}

}
