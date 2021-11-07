package day06;

public class Q_01 {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("adinizi giriniz:");
	String name=scan.next();
	System.out.println("soyadinizi gitiniz:");
	String surName=scan.nextLine();
	System.out.println("yasinizi giriniz:");
	int age=scan.nextInt();
	System.out.println("boyubuzu giriniz:");
    int boy=scan.nextInt();
    System.out.println("kilonuzu gitiniz:");
    int kilo=scan.nextInt();
    System.out.println("benim adim"+name+"\n"
    		+"soyadim:"+surName+"\n"
    		+"yasim"+ age+"\n"
    		+"boyum"+ boy+"cm"+"\n"
    		+ "kilom"+ kilo+"kg");
	
	}

}
