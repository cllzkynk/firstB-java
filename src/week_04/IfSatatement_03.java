package week_04;

import java.util.Scanner;

public class IfSatatement_03 {
public static void main(String[] args) {
	// Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin.
    // 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A” 
	
	Scanner scan = new Scanner(System.in);
	double not=scan.nextDouble(); //45
	
	if(not<100) {
		System.out.println("AA");
	}else if(not<80) {
		System.out.println("BB");
	}else if(not<60) {
		System.out.println("CC");
	}else if(not<50) {
		System.out.println("DD");
	}
	
	
	
}
}
