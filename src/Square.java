import java.util.Scanner;

public interface Square {
static void square (){
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int result=(num* num);
		
		System.out.println("Square is:" +result);
		

		
	}


}
