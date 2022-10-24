package week_05;
import java.util.Scanner;
public class SwitcExamples01 {


		public static void main(String[] args) {

			Scanner giris=new Scanner (System.in);
			System.out.println("Lutfen gun sirasini giriniz");
			int gunNo=giris.nextInt();
			
			switch(gunNo) {
			case 1 :
				
			case 2 :
				
			case 3 :
				
			case 4 :
				
			case 5 :
				System.out.println("Hafta ici");
				break;
			case 6 :
				
			case 7 :
				System.out.println("Hafta sonu");
				break;
				default:// case lerden herhangi biri saglanmazsa calisir
					System.out.println("Gecersiz gun numarasi girdiniz");
					
					System.out.println("Lütfen Haftanın Kaçıncı Gününde Olduğunuzu Belirtin"); 
			       

	}

}
}
