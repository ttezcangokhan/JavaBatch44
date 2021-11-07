package day05;

public class C03_Modulus {

	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi gitiniz");
		int sayi=scan.nextInt();
		
		//sayi573
		
		int rakamlarToplami=0;
		
		int rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		sayi/=10;
		

	}

}
