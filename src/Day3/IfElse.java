package Day3;

import java.util.Scanner;

public class IfElse {
	public static void SoChanLe (int number)
	{
		String result;
		result = (number % 2 == 0) ? "Số chẵn" : "Số lẻ";
			System.out.println("Số vừa nhập vào là " + result);
	}
	public static void TimSoLonHon (double num1, double num2)
	{
		double result;
		result = (num1 > num2) ? num1 : num2;
		System.out.println("Số lớn hơn là" + result);
	}
	public static void main(String[] args) {
		boolean isEven;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số bất kỳ : ");
		int num = scanner.nextInt();
		if (num % 2 == 0) {
			isEven = true;
		} else {
			isEven = false;
		}
		System.out.println("Số chẵn là : " + isEven);

	}

}
