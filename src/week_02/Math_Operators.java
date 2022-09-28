package week_02;

public class Math_Operators {

	public static void main(String[] args) {
		// Matematiksel islemler icin kullanilan semboller
		// + , - , * , / sirasiyla toplama cikarma carpma bolme
		// % == > kalani verir ornek 5%2=1;
		// 158 ==>158%10=8; int son2Rakam =158 % 100 ; % modulus kalani verir

		// 1 ustel islem 2 parantez isi 3 carpma -bolme 4 toplama cikarma

		// “Java” + 30 + 20

		System.out.println("Java" + 30 + 20); // Java3020

		System.out.println("Java" + (30 + 20)); // Java50

		System.out.println(30 + 20 + "Java"); // 50Java

		System.out.println("" + 30 + 20 + "Java"); // 3020Java ?

		// byte shot int ........

		String str = "";
		Integer kilo = 15;
		int kilo2 = 20;

		double d1 = 10.2;
		Double d2 = 10.5;
		// Wrapper class primitive data turleri ile javanin metodlarinin kullanmak
		// istersek o datanin wrapper clasina basvurruruz

		long l1 = 15;
		Long l2 = 25L;
		
		
		byte ortalama;
		
		byte not1=85;
		byte not2=92;  //not1+not2=177
		
		ortalama=(byte) ((not1+not2)/2);
		
	/*
	 * 	
		System.out.println(ortalama);
		
		byte b1=55;
		byte b2=75;
		int toplam =b1+b2;
	double  toplam2 =b1+b2;
	long  toplam3 =b1+b2;
	
	int i1=4555578;
	int i2=5465434;
	float top5=i1+i2;
	short top6=(short) (i1+i2);
	System.out.println(top6);
			
		
	 */
		//Bu islemlere Data Casting denir
		
		

	}

}
