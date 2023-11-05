package Day2;

import java.util.Scanner;

public class Caculator {
	

	public static void main(String[] args) {
		double a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so thu nhat:");
		a = scanner.nextDouble();
		System.out.println("Nhap so thu hai:");
		b = scanner.nextDouble();
		double caculator = (a*b)/500;
		System.out.println("Kết quả là:" + caculator);
	}

}
