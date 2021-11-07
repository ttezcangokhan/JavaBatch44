package Odevler;

public class C01_VariablesConclusions {

	public static void main(String[] args) {
		
		//Variables from homework
		
		String str1="java";
		String str2="guzel";
		int sayi1=5;
		int sayi2=4;
		
		
		
		/*
		 * istenen yazýlar
		 * 
		 * 1-java guzel 54
		 * 2-java 5 guzel
		 * 3-java 94
		 * 4-java 19
		 * 5-54 guzel
		 */
		
		
		//1-java guzel 54
		
		System.out.println(str1 + " " + str2 + " " + sayi1 + "" + sayi2);
		
		//2-java 5 guzel
		
		System.out.println(str1 + " " + sayi1 + " " + str2);
		
		//3-java 94
		
		System.out.println(str1 + " " + (sayi1+sayi2) + "" +sayi2);
		
		//4-java 19
		
		System.out.println(str1+ " " + (sayi1-sayi2) + (sayi1+sayi2));
		
		//5-54 guzel
		
		System.out.println(sayi1+""+sayi2+ " " + str2);
		
	}
	
	
}