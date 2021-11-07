package day06_wrapper;

import java.util.Scanner;

public class dsadasd {

	public static void main(String[] args) {
		
		// Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		//         ve dikdortgenin kare olup olmadigini yazdirin
       Scanner scan = new Scanner(System.in);
       System.out.println("Lütfen Dikdörtgenin bir kanrini giriniz");
       double kenar1=scan.nextDouble();
       System.out.println("Lutfen dikdortgenin diger kenaaiini girin");
       double kenar2=scan.nextDouble();
		if(kenar1==kenar2) {System.out.println("girilen dikdortgen kare");}
        if(kenar1!=kenar2) {System.out.println("girilen dikdortgen karedegildir lan");}
		
		
	
		

	} // main method sonu

} // class sonu