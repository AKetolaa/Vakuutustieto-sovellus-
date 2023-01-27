package vakuutustietoja;

import java.util.Scanner;

public class Vt4main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		InsInfoContainer obj = new InsInfoContainer();
		System.out.println("Enter property data > ");
		for (int i = 0; i < 5; i++) {
			obj.add();
		}
		
		System.out.println("\n\nIn container");
		obj.printAll();
		System.out.print("\n\nEnter number to display all greater values > ");
		double greater = sc.nextDouble();
		while(greater < 0) {
			System.out.println("Must be greater than 0 try again");
			greater = sc.nextDouble();
		}
		obj.greater(greater);
		System.out.println("\n\nEnter number to display lesser values > ");
		double lesser = sc.nextDouble();
		while(lesser < 0) {
			System.out.println("Must be greater than 0 try again");
			lesser = sc.nextDouble();
		}
		obj.lesser(lesser);
		sc.close();
	}

}
