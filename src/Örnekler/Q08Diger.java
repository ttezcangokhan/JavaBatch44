package Örnekler;

import java.util.Scanner;

public class Q08Diger {
	/*
	 * Problem tanimi : 
	 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen urun adedi girniz");
		int adet=scan.nextInt();
		System.out.println("urunun liste fiyatini yaziniz");
		int fiyat=scan.nextInt();
		System.out.println("musteri kartiniz varsa V yoksa Y ye basiniz");
		char kart=scan.next().toUpperCase().charAt(0);
		int toplamFiyat=0;
		if(kart=="V") {fiyat=adet*fiyat*0,80;
		System.out.println("musteri karti var 10 urunden az aldiniz " + "%20 indirim kazandiniz fiyatuniz:" + fiyat+"Tl");}
		else { fiyat=adet*fiyat*0,85;
		System.out.println("musteri karti var 10 urunden az aldiniz" + "yuzde 15 indiirm kazandiniz"+ fiyat +"TL");
		}
		else if(kart=="H";) {
			if(adet>10) {fiyat=adet*fiyat*0,85;
			System.out.println("mustei akrti yok 10 urunden fazla aldiniz" + "yuzde 10 indiirm kazandiniz fiyat" + fiyat + "TL");
			}else {adet<10 ; fiyat=adet*fiyat*0,90;}
		}
		}
		
	}

}
