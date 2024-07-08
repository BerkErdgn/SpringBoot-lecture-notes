package intro;

import java.util.Iterator;

public class Main {

	
	public static void main(String[] args) {
		System.out.println("Hello World");

		//Değişken tanımlama
		String metin = "ilginzi cekebilir";
		String altMetin = "Vade süresi";
		
		int vade = 25;
		
		double doubleBugum = 34;
		
		boolean dolarDustuMu = true;
		
		String okYonu = "down.svg";
		
		if (dolarDustuMu) {
			System.out.print(dolarDustuMu);
		} else {

		}
		
		//Array
		
		String[] krediler = {"Hızlı kredi", "MAaşını buradan alanlar","Mutlu emekli"};
		
		System.out.print(krediler[0]);
		System.out.print(krediler[1]);
		System.out.print(krediler[2]);
		
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.print(krediler[i]);
		}
		
	}

}
