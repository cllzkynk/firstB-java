package week_11;

import java.util.Arrays;

public class Arrays_01 {

	public static void main(String[] args) {
		
		

		String ogretmen2="Serkan";
		int Serkanyas=36;
	
		
		boolean isTrue=true;
		
		char char1='c';
		 
		
		byte num1=1;
		
		short num2=2;
		int num3=3;  // primitive // ref yoktur. stack memory de tutulur.
		 
		Integer numx=5; // non-primitive
		
		//num primitive ler in metodlari vardir
		// heap memory de tutulur
		// stack memoryde ref leri tutulur
	 
		
		long num4=4;
		float num5=5;
		
		
		double num6=6;
		
		//data turu ismi kucuk harfle baslayanlar primitive data type dir
		
		
		String str1="dragon aksamlar aksamlar ahhh aksamlar";
		String str2="c";
		 
	
		//buyuk harfle baslayanlar non-primitive dir.
		
		
		String ogretmen="Ali";
		int Aliyas=35;
		
		
		// Arrays.
		//bunun icinde sadece primitive data typelar veya non primitive data teyplarin ref degerleri tutulabilir.
		//bir arrayin icinde tek tur data teyp olabilir.
		//bir array olusturulmadan once icinde kac adet data olacagi bastan deklare edilmelidir.
		//bu artrayin icindeki adet sayisi arrayin lenght i ni ifade eder.
		// bunlar non-primitive yani object 
		//run time olusturulur.
		
		
		//olusturulma
		
		int num10;

		
		int arr [];
		char [] arr2;
		
		int arr3[]=new int[5];
		
		arr3[0]=1;
		arr3[1]=5;
		arr3[2]=10;
		arr3[3]=15;
		arr3[4]=20;
		
		
		
		
		

		
		System.out.println(Arrays.toString(arr3)+   "   arr3");
		
		int arr4[]= {10,20,30,40,50,70};
		
		arr4[4]=60;
		
	
		
		
		System.out.println(Arrays.toString(arr4));
		
		String student[]= {"Ali","Ayse","Veli","Fatma","Can","Ay","Su"};
		student[2].toUpperCase();
		
		System.out.println(	student[2].toUpperCase());
		
		String students="Ali,Ayse,Veli,Fatma,Can,Ay,Su";
		students.substring(9, 13).toUpperCase();
		System.out.println(students.substring(9, 13).toUpperCase());
		System.out.println(student.length);
		
		
		int count=0;
		for (int i = 0; i < students.length(); i++) {
			if(students.charAt(i)==',') {
				count++;
			}		
		}
		System.out.println("students da ogtrenci sayisi "+(count+1));
		
		
		
		System.out.println(students.length()); //String olan 
		
		
		
		
		System.out.println(student.length);    // array olan
		
		System.out.println(Arrays.toString(student));
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
		
		for (String each : student) {
			// each=each.concat(" X");
		System.out.println(each);
		}
 
		
		
		
	}

}
