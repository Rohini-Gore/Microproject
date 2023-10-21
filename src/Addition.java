import java.util.Scanner;

public interface Addition {
	static void add (){
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		
		System.out.println("Sum is"+(a+b));
		

		
	}

}
