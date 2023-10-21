import java.util.Scanner;

public interface Division {
	static void div() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();

		try {

			int ans = a / b;
			System.out.println("Division is  " + ans);

		} catch (Exception e) {

			System.out.println("Cannot be divided by zero " + e);
		}

	}

}
