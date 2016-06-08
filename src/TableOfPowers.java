import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String option = "yes";

		System.out.println("Learn your squares and cubes!");

		while (option.equalsIgnoreCase("yes") || option.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer : ");
			int myNum = scan.nextInt();

			System.out
					.println("Number\t\tSquared\t\tCubed\n=======\t\t=======\t\t=======");

			for (int i = 1; i <= myNum; i++) {
				System.out.println(i + "\t\t" + (int) Math.pow(i, 2) + "\t\t"
						+ (int) Math.pow(i, 3));
			}
			System.out.println("Continue?(y/n)");
			scan.nextLine();
			option = scan.nextLine();

		}
		System.out.println("Goodbye");
		scan.close();
	}
}