import java.util.Scanner;

public class Homework4 {
	public static void xapxep() {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of array");
		n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]");
			a[i] = sc.nextInt();
		}
		System.out.println("The array just entered is");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n" + "Arrays are sorted");
		sort(a);
	}

	public static void sort(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length ; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print("\n" + "a" + "[" + i + "]" + "=");
			System.out.println(a[i]);
		}
	}
}
