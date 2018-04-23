import java.util.Scanner;

public class Homework6 {
	public static void conversation() {
		Scanner sc = new Scanner(System.in);
		
		
		int i = 0;
		while (true) {

			String chat;
			if (i % 2 == 0) {
				System.out.println("A: ");
				chat = sc.nextLine();
				//System.out.println(chat);
			} else {
				System.out.println("B: ");
				chat = sc.nextLine();
				//System.out.println(chat);
			}
			i++;
			if(chat.equals("Goodbye")) {
				System.out.println("End of the conservation!");
				break;
			} 

		}

	}
}
