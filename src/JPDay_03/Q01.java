package JPDay_03;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanýcýdan alacaðýný bir stringde boþluk karakterinin olup olmadýðýný kontrol ediniz.
        

    	
    	Scanner scan=new Scanner(System.in);
    	System.out.print("bir string giriniz :");
    	String str=scan.nextLine();
    	
    	
    boolean varMi=	str.contains(" ");
    
    System.out.println("girilen stringde bosluk var mi ? :"+varMi);
    
        // Kullanýcýdan alacaðýný bir stringin bos olup olmadýðýný kontrol ediniz.
    
    
       System.out.println("girilen string bos mu ?:"+str.isEmpty());
    }
}
