package Örnekler;
import java.util.Scanner;
public class Q08 {
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
			System.out.println("lutfen aldiginiz urunun adedini giriniz");
			int adet=scan.nextInt();
			System.out.println("urunun liste fiyatini yaziniz");
			int fiyat=scan.nextInt();
			System.out.println("musteri kartiniz varsa V yoksa Y ye basiniz");
			char kart=scan.next().toUpperCase().charAt(0);
			int toplamFiyat=0;
			
				if (kart=='V') {
					if (adet>10) {
						toplamFiyat=adet*(int) (fiyat*0.8);// Musteri karti varsa ve 10 urunden fazla alirsa %20,
						System.out.println("Toplam fiyat " + toplamFiyat);
						
					} else  {
						toplamFiyat=adet*(int) (fiyat*0.85);// Musteri karti varsa 10 urunden az alirsa %15 indirim yapin 
						System.out.println("Toplam fiyat " + toplamFiyat);
					}
				} else if (kart=='Y'){
					if (adet>10) {
						toplamFiyat=adet*(int) (fiyat*0.85);
						System.out.println("Toplam fiyat " + toplamFiyat);
						
					} else  {
						toplamFiyat=adet*(int) (fiyat*0.90);
						System.out.println("Toplam fiyat " + toplamFiyat);
					}

				}
			
				
			

			
		}

	}
