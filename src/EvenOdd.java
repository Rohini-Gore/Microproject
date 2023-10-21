import java.util.Scanner;

public interface EvenOdd {
static void evenodd (){
		
		Scanner sc= new Scanner (System.in);
		int a=sc.nextInt();
		String result = null;
		int number = 0;
		if ((number % 2) == 0) {
		System.out.println("this is even number" + result);
			} else {
		System.out.println("this is odd number" + result);
			}
}

}
