package day03;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi al�niz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol ediniz
	     
	     ��gen olma sarti :herhangi iki kenar toplami diger kenardan b�y�k, herhangi iki kenar fark� diger kenardan b�y�k olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Pozitif bir tam say� giriniz : ");
		int sayi1=scan.nextInt();
		
		System.out.print("2. Pozitif tam say� giriniz : ");
		int sayi2=scan.nextInt();
		
		System.out.print("3. Pozitif tam say� giriniz : ");
		int sayi3=scan.nextInt();
		
		if((sayi1+sayi2>sayi3 && (sayi1-sayi2<sayi3)) || ((sayi2+sayi3>sayi1) && (sayi2-sayi3<sayi1)) || ((sayi1+sayi3>sayi2)&& (sayi1-sayi3<sayi2))) {
			if(sayi1==sayi2 && sayi2==sayi3) {
				System.out.println("e�kenar ��gen");
			}
			else {
				System.out.println("e�kenar ��gen de�il");
			}
		}
		else {
			System.out.println("girdi�iniz de�erler bir ��gene ait de�ildir");
		}

			scan.close();	

	}

}