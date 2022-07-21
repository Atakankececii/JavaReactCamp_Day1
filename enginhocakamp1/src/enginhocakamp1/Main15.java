package enginhocakamp1;

public class Main15 {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,1.4,3.5,6.7};
		double total=0;
		double max = myList[0];
		
		for (double number : myList) {
			System.out.println(number);
		}
		
		System.out.println("---------");
		for (int i = 0; i < myList.length; i++) {
			total = total+myList[i];
			System.out.println(myList[i]);
		}
		
		System.out.println(total);
		
		for(double number : myList) {
			if(max<number) {
				max = number;
			}
		}
		
		System.out.println(max);
		
		
		//for (int i = 0; i < myList.length; i++) {
			//System.out.println(myList[i]);
		//}
		

	}

}
