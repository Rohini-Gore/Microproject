import java.util.Scanner;

public class Calculator
		implements Addition, Subtraction, Multiplication, Division, Modulus, Square, Cube, Average, Factors, EvenOdd {

	public static void main(String[] args) {

		System.out.println("1. Addition of two numbers is");
		System.out.println("2. Subtraction of two numbers is");
		System.out.println("3. Multiplication of two numbers is");
		System.out.println("4. Division of two numbers is");
		System.out.println("5. Modulus of two numbers is");
		System.out.println("6. Square of a number is");
		System.out.println("7. Cube of a number is");
		System.out.println("8. Average of numbers is");
		System.out.println("9. Factors of numbers are");
		System.out.println("10. Find out even or odd number");
		System.out.println("0. Exits");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice  ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			Addition.add();
			break;

		case 2:
			Subtraction.sub();
			break;

		case 3:
			Multiplication.mult();
			break;

		case 4:
			Division.div();
			break;

		case 5:
			Modulus.mod();
			break;

		case 6:
			Square.square();
			break;

		case 7:
			Cube.cube();
			break;

		case 8:
			Average.avg();
			break;

		case 9:
			Factors.fact();
			break;

		case 10:
			EvenOdd.evenodd();
			break;

		default:
			System.out.println("Enter the valid choice");

		}

	}

}
