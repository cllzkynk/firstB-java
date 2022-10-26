package week_06;

public class StringManipulation03 {

	public static void main(String[] args) {
		/*
		Asagidaki String degiskenini kullanarak  konsolda A L I yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int whereA=pickName.indexOf("A");
		int whereL=pickName.indexOf("L");
		int whereI=pickName.indexOf("I");
		
		System.out.println(""+pickName.charAt(whereA)+pickName.charAt(whereL)+pickName.charAt(whereI));
		
		
		
	}

}
