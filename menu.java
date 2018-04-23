
import java.util.Scanner;

public class menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		do {
			System.out.println("Please enter your  choice !");

			System.out.println("Select 1: multi method solution 1");
			System.out.println("Select 2: multi method solution 2");
			System.out.println("Select 3: Show the day in the week ");
			System.out.println("Select 4: input 1 sequence and sort them");
			System.out
					.println("Select 5: enter a number from 1 to 10 but no display it from the sequence from 1 to 10");
			System.out.println("Select 6: Join a conversation");
			System.out.println("Select 7: Make Friends");
			System.out.println("Select 0: Exit from system ");
			n = sc.nextInt();
			switch (n) {

			case 1:

				do {
					Homework1.ptb1();
					System.out.println("Do you want to continue ");
					System.out.println("Chon 0 : No");
					System.out.println("Chon 1 : Yes");
					m = sc.nextInt();
				} while (m == 1);
				if (m == 0) {
					System.out.println("End of program");
				}

				break;
			case 2:
				int p;
				do {
					Homework2.ptb2();
					System.out.println("Do you want to continue ? ");
					System.out.println("Chon 0 : No");
					System.out.println("Chon 1 : Yes");
					p = sc.nextInt();
				} while (p == 1);
				if (p == 0) {
					System.out.println("End of Program");
				}
				break;

			case 3:

				HomeWork3.haha();
			case 4:

				Homework4.xapxep();
				break;
			case 5:
				Homework5.cau_5();
				break;
			case 6:
				Homework6.conversation();
				break;
			case 7:
				Homework7.cau_̃7();
				break;

			case 0:
				System.exit(0);
			default:

				System.out.println("Please enter your choice again");

			}

		} while (n != 0);
	}
}
