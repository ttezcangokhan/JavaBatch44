package Odevler;

import java.util.Scanner;

public class C12 {

	public static void main(String[] args) {
		
		
		/*  Problem Tanýmý
        Bir iþçinin iþi bitirme süresini ve toplam iþçi sayýsýný alarak, iþin bitme süresini
        hesaplayan kodu yazýnýz.
        Örneðin, Bir iþçi bir iþi 10 günde yapabilmektedir.
        Buna göre 2 iþçi ayný iþi kaç günde yapar?
        Örnek Ekran Çýktýsý
         Bir iþçi iþi kaç günde bitirmektedir? 10
         Toplam kaç iþçi çalýþacak? 2
        Ýþin bitme süresi 5 gündür.*/
    
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Bir Ýþçi Bir Ýþi Kaç Günde Bitirmektedir:");
		int isci=scan.nextInt();
		
		System.out.print("Toplam Kaç Kiþi Çalýþacak:");
		int sayi=scan.nextInt();
		
		double gün=isci/sayi;
		
		System.out.println("Ýþin Bitme Süresi"+gün+" Gündür");
		
		scan.close();
	}

}