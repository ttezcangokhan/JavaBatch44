package Odevler;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  Problem Tanimi
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadığını hesaplatan bir kod yazınız
        (Yardim: Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
        baglantisindan yararlanabilirsiniz)

        Ornek Ekran ciktisi
        birinci kenari giriniz: 2
        ikinci kenari giriniz 15
        ucuncu kenari giriniz: 7
        Bu bir dik ucgen degildir.

        Bu bir dik ucgendir
     */
    	
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Birinci kenari giriniz : ");
    	double kenar1=scan.nextDouble();
    	System.out.print("Ikinci kenari giriniz : ");
    	double kenar2=scan.nextDouble();
    	System.out.print("Ucuncu kenari giriniz : ");
    	double kenar3=scan.nextDouble();
    	
    	
    	
    	if (Math.pow(kenar1,2) + Math.pow(kenar2, 2) == Math.pow(kenar3, 2)) {
    		System.out.println("Bu bir dik ucgen dir");
    		
			
		} else {
			System.out.println("Bu bir dik ucgen degildir");

		}
    	
    	
    	scan.close();
       


    }
}