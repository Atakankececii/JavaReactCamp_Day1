package enginhocakamp1;

public class Main18 {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj.replace(' ', '-'));
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2,4));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
	}

}
