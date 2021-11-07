package Odevler;
import java.util.Scanner;
public class C06_ModulusTekrar {
    public static void main(String []args) {
    	
    	
    //Kullanicidan 5 basamakli sayi alin ve rakamlari tersten yazdirin	
    	
    	
    Scanner scan=new Scanner(System.in);	
    	
    System.out.println("lutfen 5 basamakli bir tam sayi giriniz");	
    	
    int sayi=scan.nextInt();
    
    int birlerBasamagi=sayi%10;//burada sayinin birler basamagi elimizde
    System.out.println("sayinin birler basamagi : "+birlerBasamagi);
    sayi/=10;
    System.out.println("sayi burada 4 basamakli kaldi : "+sayi);
    
    int onlarBasamagi=sayi%10;// onlar basamagini elde etiim 4
    
    System.out.println( onlarBasamagi);// sayi4
    
    sayi/=10;
    
    System.out.println("sayi burada 3 basamakli kaldi : "+sayi);
    
    
    int yuzlerBasamagi=sayi%10;// yuzker bamagini elde elde etiim 3
    
    System.out.println(yuzlerBasamagi);
    
    sayi/=10;
    System.out.println("sayi 2 basamakli kaldi : "+sayi);
    
    int binlerBasamagi=sayi%10; //binler basamagini elde ettik
    System.out.println(binlerBasamagi);
    
    sayi/=10;
    
    System.out.println("sayinin onbinler basamagi"+sayi);
    
    int onbinlerBasamagi=sayi;	
    
    System.out.println("onbinler bas. :"+sayi);
    
    
    
    // 5 basamakli sayinin rakamlarini tersten yazdiriniz
    
    System.out.println("5 Basamakli Sayinin Tersten Yazimi : "+birlerBasamagi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi+
    		onbinlerBasamagi	);
    System.out.print("5 Basamakli Sayilarin Toplami : ");
    System.out.println(birlerBasamagi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi+
    		onbinlerBasamagi	);
    
    
    	
    }
    
}