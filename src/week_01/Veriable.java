package week_01;

public class Veriable {

	public static void main(String[] args) {
		/*
		 * 2^0=1 2^1=2
		 * 
		 */

		// numerik veriables
		// byte -128 127 8 bit
		byte yas = 38;
		byte kilo;
		kilo=95;
		
		System.out.println(kilo);
		System.out.println(yas);
		
		
		
	 
        //-32.768 den 32.767’e (dahil) 
		// short ~32bin 16 bit [0-1] --> 1 bit
		short nufus = 28755;

		
		
		
		// int integer -2.147.483.648 den 2.147.483.647’e 32 bit
		int nufus3 = 370000000;

		long yildizAdedi = 4546444454844645464L; // -9,223,372,036,854,755,808 den ,223,372,036,854,755,807’e 64 bit

		/*
		 * virgullu sayilar
		 * 
		 * 1 float floatin sonuna longdaki gibi f sonuna f konur
		 * 
		 * 2 double
		 * 
		 * 2 side 64 bit
		 */

		float price = 3.2F;
		double boyMetre = 1.8;

		// for letter

		char harf = 'c'; // bu sadece bi karakter tutabilir (gizli numerik)
	System.out.println(harf + 2+"  ===>chardan gelen  ==>>51 "); // c=99
	System.out.println("  ===>chardan gelen  ==>>52 "+harf + 2); 
	
	boolean isValid=true;
	boolean isEmpty=false;  //1 bit    [0-1]

		String name = "Ali";  
		// byte short int long float double char  boolean primitive data type // ilkel  // deger tiplidir
		//String non-primitive    referans type.   // ilkel olmayan  //  
		

		
		
		int num1=32;
 
		int num2=num1;
 
		num1=35;
	 
	/*
	 * 	
		
		String name1="Ali";
		String name2=name1;
		System.out.println("Name 2-1: "+name2); 
		name1="Veli";
		System.out.println("Name 1-2: "+name2); 
		System.out.println("Name 1-2: "+name1); 
	 */
		
		//String refarens uzerinden islem yapiliyor  birbirine esit ref`lera sahip olan veriable larda biriindeki degisim digerini etkiler
		

	}

}
