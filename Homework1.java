

import java.util.Scanner;

public class Homework1 {
	
	public static void ptb1() {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter value of number a");
		a = sc.nextInt();
		int b;
		System.out.println("Enter value of number b");
		b = sc.nextInt();
		if (a != 0 && b != 0) {
			System.out.println("Equation ax + b=0 has only solution x=" + (-b / a));
		} else if (a == 0 && b != 0) {
			System.out.println("Equation ax + b = 0 has no solution");
		} else {
			System.out.println("Equation ax + b = 0 has many solution");

		}

	}

}