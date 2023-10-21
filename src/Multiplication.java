import java.util.Scanner;

public interface Multiplication {
static void mult(){
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		
		System.out.println("Multiplication is"+(a*b));
		

		
	}


}
