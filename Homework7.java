import java.util.Scanner;

public class Homework7 {
	public static void cau_̃7() {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name = sc.nextLine();

		int age;
		System.out.println("Enter your age ");
		age = sc.nextInt();

		System.out.println("Enter your marital status");
		System.out.println("Select 0 : not married");
		System.out.println("Select 1 :married ");
		System.out.println("Nhap 2 : divorced");

		int a;
		System.out.println("Enter your choice : ");
		a = sc.nextInt();

		switch (a) {
		case 0:
			System.out.println("not married");
			break;
		case 1:
			System.out.println("married");
			break;
		case 2:
			System.out.println("divorced");
			break;
		default:
			System.out.println("Please enter your choice again !");

		}

		System.out.println("Nhap gioi tinh cua ban");
		System.out.println("Chon 0 : Nam");
		System.out.println("Chon 1 : Nu");

		int b;
		System.out.println("Gioi tinh cua ban la:");
		b = sc.nextInt();

		switch (b) {
		case 0:
			System.out.println("Gioi tinh : Nam");
			break;
		case 1:
			System.out.println("Gioi tinh : Nu");
			break;
		default:
			System.out.println("Nhap sai !");
			b = sc.nextInt();
			break;

		}

		if (b > 1 || a > 2) {
			System.out.println();
		} else if (b == 0 && age >= 22 && (a == 0 || a == 2)) {
			System.out.println("Ban ko dc tham gia ket ban");

		} else if (b == 1 && age >= 18 && (a == 0 || a == 2)) {
			System.out.println("Ban duoc phep tham gia ket ban");
		} else {
			System.out.println("Ban ko đươc tham gia ket ban");
		}

	}
}
