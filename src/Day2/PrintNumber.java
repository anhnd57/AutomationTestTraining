package Day2;

import java.util.Scanner;

public class PrintNumber {
	public static void printLargerNumber (double num1, double num2) {
		if(num1>num2)
		{
			System.out.println("So lon hon la: " +num1);
		}
		
		else {
			System.out.println("So lon hon la: " +num2);
		}
		}
	public static void main(String[] args) {
		double num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so thu nhat:");
		num1 = scanner.nextDouble();
		System.out.println("Nhap so thu hai:");
		num2 = scanner.nextDouble();
		printLargerNumber(num1, num2);

	}

}
