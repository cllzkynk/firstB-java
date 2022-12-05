package week_11;

public class Scope {
	
        static	 String name="Turkiye Cumhuriyet";
	

	public static void main(String[] args) {
		String str="Ali";
		
		
		
		// scope ==Kapsam
		// bir class icinde olusturulan veriable icin scope o vrb. a nereden nasil
		// ulasabilecegimizi ve o vrb nin nerede gecerli oldugunun sinirlarini belirler
		//scope a uymazsan java CTE == compile time eror verir  (RTE) run time eror 
		// 4 farkli tur scope vardir
		/*
		 * 1 instance veriable  (object veriable)
		 *  
		 * 2 Static (class level )veriable
		 * 3 Local (method level ) veriable
		 * 4 loop veriable
		 */
		
		System.out.println(name);

		
		denemeMetodu(str);
		
		
	//	String str=null;
		
	//	System.out.println(str.length()); //rte
		
	  //   System.out.println(a); // cte
		
		System.out.println(denemeMetodu("xcfbdrfb fg ")+ "    En son ben calistim  ben  str2 yim ");

	}

	private static String denemeMetodu(String xxxxxxxxxyyyyyyyy) {
		String str2="Ayse";
		System.out.println(name);
		 
		System.out.println(xxxxxxxxxyyyyyyyy  );
		
		
		return str2;
		
	}

}
