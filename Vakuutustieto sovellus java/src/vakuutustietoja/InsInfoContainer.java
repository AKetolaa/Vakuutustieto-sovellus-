package vakuutustietoja;

import java.util.ArrayList;
import java.util.Scanner;

public class InsInfoContainer {
	
	private ArrayList<InsuranceInfo> info;
	
	public InsInfoContainer() {
		info = new ArrayList<InsuranceInfo>();
	}
	
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Property type: ");
		String type = sc.next();
		System.out.print("Enter property location: ");
		String location = sc.next();
		Property property = new Property(type, location);
		System.out.print("Enter Propertys insured value: ");
		double value = sc.nextDouble();
		while(value < 0) {
			System.out.println("Insured value cannot be lesser than 0 try again");
			value = sc.nextDouble();
		}
		InsuranceInfo insuranceInfo = new InsuranceInfo(property, value);
		info.add(insuranceInfo);
		
	}
	
	public void printAll() {
		for (InsuranceInfo in: info) {
			System.out.println(in.toString());
		}
	}
	
	public void greater(double x) {
		for (InsuranceInfo in: info) {
			if (in.getValue() > x) {
				System.out.println(in.toString());
			}
		}
	}
	
	public void lesser(double y) {
		for (InsuranceInfo in: info) {
			if (in.getValue() < y) {
				System.out.println(in.toString());
			}
		}
	}

}