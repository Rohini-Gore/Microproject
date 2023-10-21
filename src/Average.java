import java.util.Scanner;

public interface Average {
	
static void avg (){
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the first number :");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number :");
		int num2=sc.nextInt();
		
		System.out.println("Enter the third number :");
		int num3=sc.nextInt();
		
		System.out.println("Enter the fourth number :");
		int num4=sc.nextInt();
		
		System.out.println("Enter the fifth number :");
		int num5=sc.nextInt();
		
		int sum = (num1+ num2+ num3+ num4+ num5);
		int result= sum/ 5;
		
		System.out.println("Total is :" +sum);
		System.out.println("Average is:" +result);
    }		
}





