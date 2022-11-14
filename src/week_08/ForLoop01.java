package week_08;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 * 
		double toplam=0;
	
		for (double i = 100; i >-1; i=i-0.5) {
			System.out.println("Mevcut toplam ==>"+toplam+"\n"+toplam+" + "+ i + " = "+(toplam+i));
			toplam=toplam+i;
			 
		}
		System.out.println(toplam);
		
		 */
		double carpim=1;
		for (double i = 10; i >0; i--) {
			
			System.out.println("Mevcut carpim ==>"+carpim+"\n"+carpim+" * "+ i + " = "+(carpim*i));
			carpim=carpim*i;
			
			
		}
		
		
		// Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin
		
		String name="ABUZETTIN";
		
		String bosluk="";
		 for (int i = name.length()-1; i >=0; i--) {
			 bosluk=bosluk+name.charAt(i);
			 System.out.println(name.charAt(i));
			
		}
		
		System.out.println(bosluk);
		
		
	
		
	//	i=i+1;   =>i++ pre increment
		// i=i-1;  i--;
		
		

	}

}
