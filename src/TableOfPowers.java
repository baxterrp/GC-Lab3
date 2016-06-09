import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// set option to yes
		String option = "yes";

		System.out.println("Learn your squares and cubes!");

		// while option is yes or y, continue
		while (option.equalsIgnoreCase("yes") || option.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer : ");

			// get user input for number
			int myNum = scan.nextInt();

			// organize table using tabs
			System.out
					.println("Number\t\tSquared\t\tCubed\n=======\t\t=======\t\t=======");

			// loop 1 - input outputting i, i^2, and i^3 using Math.pow()
			for (int i = 1; i <= myNum; i++) {
				System.out.println(i + "\t\t" + (int) Math.pow(i, 2) + "\t\t"
						+ (int) Math.pow(i, 3));
			}

			// get user input for continuing
			System.out.println("Continue?(y/n)");
			scan.nextLine();
			option = scan.nextLine();

		}
		System.out.println("Goodbye");
		scan.close();
	}
}