import java.util.Scanner;

public class HomeWork3 {
	public static void haha() {
		Scanner scan = new Scanner(System.in);

		int n;
		System.out.println("Enter n = ");
		n = scan.nextInt();

		switch (n) {
		case 2:
			System.out.println("Today is Monday");
			break;
		case 3:
			System.out.println("Today is Tuesday");
			break;
		case 4:
			System.out.println("Today is Wednesday");
			break;

		case 5:
			System.out.println("Today is Thursday");
			break;
		case 6:
			System.out.println("Today is Friday");
			break;
		case 7:
			System.out.println("Today is Saturday");
			break;
		case 8:
			System.out.println("Today is Sunday");
			break;

		default:
			System.out.println("Please enter your choice again !");
			break;
		}
	}
}
