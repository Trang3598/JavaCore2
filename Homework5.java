import java.util.Scanner;

public class Homework5 {
	public static void cau_5() {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Enter a number from 1 to 10");
		n = scanner.nextInt();

		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		while (n < 0 || n > 10) {
			System.out.println("The number you entered exceeds the limit of 1 to 10!");
			System.out.println("Please Enter again.");
			n = scanner.nextInt();
		}

			for (int i = 0; i < array.length; i++) {
				if (array[i] == n) {
					for (int a = 0; a < i; a++)
						System.out.print(array[a] + " ");
					for (int b = i + 1; b < array.length; b++)
						System.out.print(array[b] + " ");
				}
		
		}
	}

}
