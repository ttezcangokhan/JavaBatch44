package Odevler;

import java.util.Scanner;

public class C12 {

	public static void main(String[] args) {
		
		
		/*  Problem Tan�m�
        Bir i��inin i�i bitirme s�resini ve toplam i��i say�s�n� alarak, i�in bitme s�resini
        hesaplayan kodu yaz�n�z.
        �rne�in, Bir i��i bir i�i 10 g�nde yapabilmektedir.
        Buna g�re 2 i��i ayn� i�i ka� g�nde yapar?
        �rnek Ekran ��kt�s�
         Bir i��i i�i ka� g�nde bitirmektedir? 10
         Toplam ka� i��i �al��acak? 2
        ��in bitme s�resi 5 g�nd�r.*/
    
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Bir ���i Bir ��i Ka� G�nde Bitirmektedir:");
		int isci=scan.nextInt();
		
		System.out.print("Toplam Ka� Ki�i �al��acak:");
		int sayi=scan.nextInt();
		
		double g�n=isci/sayi;
		
		System.out.println("��in Bitme S�resi"+g�n+" G�nd�r");
		
		scan.close();
	}

}