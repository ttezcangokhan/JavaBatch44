package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii deðeri

    	
    	Scanner scan= new Scanner(System.in);
    	
    	System.out.println("Bir karakter giriniz");
    	
    	char harf=scan.next().charAt(0);
    
    	if (harf>='a' && harf<='z' || harf>='A' && harf<='Z') {
    		System.out.println(harf>= 'a' && harf <='z' ? "küçük harf" : "büyük harf");
    	}
    	else {
    		System.out.println("harf deðildir");
    	}
       
    }
}