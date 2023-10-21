import java.util.Scanner;

public interface Factors {

	static void fact() {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int i = 1;
		while (i <= number) {
			if (number % i == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("The Factors of " + number + " are ");
	}
}
