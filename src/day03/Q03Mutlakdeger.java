package day03;

import java.util.Scanner;

public class Q03Mutlakdeger {

				public static void main(String[] args) {
					// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
					Scanner input = new Scanner(System.in);
					System.out.println("Lutfen bir sayi giriniz");
					double sayi = input.nextDouble();
			​
					System.out.println(sayi < 0 ? "Girilen sayinin mutlak degeri : " + (sayi * (-1))
							: (sayi == 0 ? "Girilen sayinin mutlak degeri : " + (-1*sayi) : "Girilen sayinin mutlak degeri : " + sayi));
					input.close();
				}
}
