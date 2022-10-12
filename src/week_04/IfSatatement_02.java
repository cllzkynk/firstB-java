package week_04;

public class IfSatatement_02 {
	public static void main(String[] args) {
		
		//ternary operatoru
		/*
		 * sart ?   dogruysa  :  yanlissa 
		 */
		
		int x=11;
		
		System.out.println(x<10 ? "x 10dan kucuktur": "x 10dan buyuktur");
		
		if(x<10) {
			System.out.println("x 10dan kucuktur");
		}else {
			System.out.println("x 10dan buyuktur");
		}
		
		int not =30;
		
		//  61-85 BB   86-100 AA
		
		System.out.println(not<100&&not >85 ? "AA ile gectiniz":
			(not<86 && not >60 ? "BB ile gectiniz" :
				(not<60 && not >45 ? "CC ile gectiniz" :"kaldiniz")));
		
		 int age=11;
		
		String isElder=(age>18? "Elder":"Child");
		
		System.out.println(isElder);
		
	}

}
