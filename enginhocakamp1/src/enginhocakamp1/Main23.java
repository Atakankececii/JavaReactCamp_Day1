package enginhocakamp1;

import java.util.Iterator;

public class Main23 {

	public static void main(String[] args) {
		int [] sayilar = {1,3,7,9};
		int aranacak = 5;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayı mevcuttur.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}

	}

}
