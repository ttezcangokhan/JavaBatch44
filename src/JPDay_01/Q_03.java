package as;

import java.util.Scanner;

public class Q_03 {
	public static void main(String[] args) {
		/*
    	 * kullanicinin ad soyad yas boy kilosunu alt alata yazdiriniz
    	 */

	
	
	
	Scanner scan =new Scanner(System.in);
	
	System.out.print("adinizi giriniz :");//kullanicya ad�n� grmesinin bildirimini yazd�rd�k
	//System.out.print--> girilen veriyi ayni satira yazdirir
	//System.out.println--> girilen veriyi bir alt  satira yazdirir
	String name=scan.nextLine();
	
	System.out.print("soyadinizi giriniz :");
	String surName=scan.nextLine();
	
	System.out.print("yasinizi giriniz :");
	int age=scan.nextInt();
	
	System.out.print("boyunuzu giriniz :");
	int boy=scan.nextInt();
	
	System.out.print("kilonuzu giriniz :");
	int kilo=scan.nextInt();
	
	System.out.println("benim ad�m:"+name+"\n"
	        +"soyad�m :"+surName+"\n"
			+"yasim:"+age+"\n"
			+"boyum:"+boy+"cm"+"\n"
			+"kilom:"+kilo+"kg");
	
	/*
	    adinizi giriniz :mehmet
		soyadinizi giriniz :yi�it
		yasinizi giriniz :35
		boyunuzu giriniz :188
		kilonuzu giriniz :70
		benim ad�m:mehmet
		soyad�m :yi�it
		yasim:35
		boyum:188cm
		kilom:70kg

	 */
	
	
	}

}