package enginhocakamp1;

public class Main {

	public static void main(String[] args) {
		//Değişken isimleri camelCase olarak yazılır.
		String internetSubeButonu = "İnternet şube butonu";
		System.out.println(internetSubeButonu);
		
		double dolarDun = 8.15;
		double dolarBugun = 8.15;
		int vade = 36;
		boolean dustuMu = false;
		
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar düştü");
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi.");
		}else {
			System.out.println("Eşittir");
		}
		
		String[] krediler = {
		"Hızlı kredi","Mutlu emekli kredisi","Konut kredisi"
	};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
				
		
		
		
		
}}
