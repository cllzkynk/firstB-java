package week_06;

public class StringManipulation02 {

	public static void main(String[] args) {
		   /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble()
			   Integer.pardeInt
        methodunu kullanabilirsiniz.
             */
		  String  str1= "%13.99";
		 // String  str1= "13.99";
		  
		  String  str2= "%10.55";
	 
		  
		System.out.println(str1.substring(1));
		System.out.println(str2.replace("%", ""));
		System.out.println(Double.parseDouble("13.99"));
		  
	  System.out.println(Double.parseDouble(str1.substring(1))+Double.parseDouble(str2.replace("%", "")));

	}

}
