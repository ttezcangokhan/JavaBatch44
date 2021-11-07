package JPDay_01;

import java.util.Scanner;

public class Q_04 {
	public static void main(String[] args) {
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		

		Scanner scan =new Scanner(System.in);
		
		System.out.print("1. sayiyi giriniz :");//kullaniciya 1. sayi  girmesinin bildirimini yazdýrdýk
		
		int sayi1=scan.nextInt();
		
        System.out.print("2. sayiyi giriniz :");//kullaniciya 2. sayi  girmesinin bildirimini yazdýrdýk
		
		int sayi2=scan.nextInt();
		
		System.out.println("girilen sayilarin toplami :"+(sayi1+sayi2));
		System.out.println("girilen sayilarin farki :"+(sayi1-sayi2));
		System.out.println("girilen sayilarin carpimi :"+(sayi1*sayi2));
		System.out.println("girilen sayilarin bolumu :"+(sayi1/sayi2));
		
	}

}