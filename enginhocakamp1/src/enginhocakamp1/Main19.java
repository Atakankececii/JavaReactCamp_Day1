package enginhocakamp1;

public class Main19 {

	public static void main(String[] args) {
		
		int number = 1;
		boolean asalMi = true;
		
		if (number==1) {
			System.out.println(" Sayı asal değildir.");
			return;
		}
		
		if (number<1) {
			System.out.println(" Geçersiz sayı.");
			
		}
		
		for (int i = 2; i <number; i++) {
			if (number % i == 0) {
				asalMi = false;
			}
		}
		
		if (asalMi == true) {
			System.out.println("Sayı asaldır.");
		}else {
			System.out.println("Sayı asal değildir.");
		}
	}

}
