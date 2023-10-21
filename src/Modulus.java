import java.util.Scanner;

public interface Modulus {
	static void mod() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();

		System.out.println("Division is" + (a % b));

	}

}
