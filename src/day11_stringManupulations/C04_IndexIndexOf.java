package day11_stringManupulations;

public class C04_IndexIndexOf {

	public static void main(String[] args) {
		String str="calisirsaniz java ogrenmek cok kolay";
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('J'));
        int index=str.indexOf("r");
        System.out.println(index);
        System.out.println();
        System.out.println(str.indexOf('e',15));
	}

}
