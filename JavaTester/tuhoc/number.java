package tuhoc;

import java.util.Scanner;

public class number {
	public static void main(String[] args) {
//		Nhập num từ bàn phím
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int result = number.calculateNumber(num);
		System.out.println("Result: " + result);
	}

	public static int calculateNumber(int num) {
		if (num % 2 == 0) {
			return num * 2;
		} else if (num % 3 == 0) {
			return num * 3;
		} else {
			return num * 5;
		}
	}

}