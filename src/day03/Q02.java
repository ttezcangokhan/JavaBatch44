package day03;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alıniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol ediniz
	     
	     Üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Pozitif bir tam sayı giriniz : ");
		int sayi1=scan.nextInt();
		
		System.out.print("2. Pozitif tam sayı giriniz : ");
		int sayi2=scan.nextInt();
		
		System.out.print("3. Pozitif tam sayı giriniz : ");
		int sayi3=scan.nextInt();
		
		if((sayi1+sayi2>sayi3 && (sayi1-sayi2<sayi3)) || ((sayi2+sayi3>sayi1) && (sayi2-sayi3<sayi1)) || ((sayi1+sayi3>sayi2)&& (sayi1-sayi3<sayi2))) {
			if(sayi1==sayi2 && sayi2==sayi3) {
				System.out.println("eşkenar üçgen");
			}
			else {
				System.out.println("eşkenar üçgen değil");
			}
		}
		else {
			System.out.println("girdiğiniz değerler bir üçgene ait değildir");
		}

			scan.close();	

	}

}