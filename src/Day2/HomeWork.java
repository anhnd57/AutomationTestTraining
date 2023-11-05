package Day2;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		int n, sum = 0;
	    Scanner btvn	 = new Scanner(System.in);
	    System.out.println("Nhập vào số phần tử của mảng: ");
	        n = btvn.nextInt();
	         
	    // khởi tạo và cấp phát bộ nhớ cho mảng
	    int array[] = new int[n];
	         
	    System.out.println("Nhập các phần tử cho mảng: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhập phần tử thứ " + i + ": ");
	        array[i] = btvn.nextInt();
	    }
	         
	    // Hiển thị mảng vừa nhập
	    System.out.println("Mảng vừa nhập: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(array[i] + "\t");
	    }
	         
	    // tính tổng các phần tử có trong mảng
	    for (int i = 0; i < n; i++) {
	        sum += array[i];
	    }
	    System.out.println("\nTổng các phần tử có trong mảng : " + sum);
	}

	}

