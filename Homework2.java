import java.util.Scanner;

public class Homework2 {
	public static void ptb2() {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Enter value of number a");
		a = sc.nextDouble();
		double b;
		System.out.println("Enter value of number b");
		b = sc.nextDouble();

		double c;
		System.out.println("Enter value of number c");
		c = sc.nextDouble();

		double denta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) {
			if (b == 0) {
				if (c == 0)
					System.out.println("Equation has many solution");
				else
					System.out.println("Equation has no solution");

			} else
				System.out.println("Pt has a solution x=" + (-c / b));

		} else {
			double x1, x2;
			if (denta > 0) {
				x1 = (-b + Math.sqrt(denta)) / (2 * a);
				x2 = (-b - Math.sqrt(denta)) / (2 * a);
				System.out.println("Equation has two solution" + x1 + " and " + x2);

			} else if (denta < 0) {
				System.out.println("Equation has no solution");
			} else

				System.out.println("PT has solutions x1=x2=" + (-b / 2 * a));
		}
	}

}
