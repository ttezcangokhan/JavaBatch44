package Örnekler;

public class Ucgen {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan 3 tene pozitif tam sayi alniz. bu uc sayinin ucgen olusturma
		 * durumunu kontrol ediniz eger ucgen olabiliyor ise, es kenar ucgen olma
		 * durumunu da kontrol edniz
		 * 
		 * ucgen olma sarti :herhangi iki kenar toplami diger kenardan buyuk, herhangi
		 * iki kenar farki diger kenardan buyuk olmali a+b>c>a-b a+c>b>a-c b+c>a>b-c
		 * a=b=c ise es kenar ucgen
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Sirayla  Uc Tane Pzotif sayi gir");
		
		
		if (scan.hasNextDouble()) {
			double sayi1 = scan.nextDouble();
			double sayi2 = scan.nextDouble();
			double sayi3 = scan.nextDouble();
			if (sayi1<=0||sayi2<=0||sayi3<=0) {
				System.out.println("hatali giris");
				return;//burdan asagiya yol yok 	
			}
			if (sayi1==sayi2&&sayi2==sayi3) {
				System.out.println("eskenar ucgen");
			} else if((sayi1+sayi2)>(sayi3)&&sayi3>(sayi1-sayi2)||
					(sayi1+sayi3)>(sayi2)&&sayi3>(sayi1-sayi3)||
					(sayi1+sayi3)>(sayi2)&&sayi3>(sayi1-sayi3)	) {
	                      System.out.println("ucgen");
			}else {
				System.out.println("gecersiz islem ");
			}
		} else {
               System.out.println("Luten 3 tane 0 dan buyuk  pozitif double sayi gir");
		}
		 scan.close();
	}

}
