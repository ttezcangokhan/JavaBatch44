package JPDay_03;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullan�c�dan alaca��n� bir stringde bo�luk karakterinin olup olmad���n� kontrol ediniz.
        

    	
    	Scanner scan=new Scanner(System.in);
    	System.out.print("bir string giriniz :");
    	String str=scan.nextLine();
    	
    	
    boolean varMi=	str.contains(" ");
    
    System.out.println("girilen stringde bosluk var mi ? :"+varMi);
    
        // Kullan�c�dan alaca��n� bir stringin bos olup olmad���n� kontrol ediniz.
    
    
       System.out.println("girilen string bos mu ?:"+str.isEmpty());
    }
}
