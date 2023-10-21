import java.util.Scanner;

public interface Cube {
	
		static void cube (){
				
				Scanner sc= new Scanner (System.in);
				
				System.out.println("Enter a number");
				int num=sc.nextInt();
				
				int result=(num* num *num);
				
				System.out.println("Square is:" +result);
				

				
			}

}
