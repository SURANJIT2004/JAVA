
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first numbers: ");
		int a = input.nextInt();
		System.out.print("Enter the second number: ");
		int b = input.nextInt();
		
		int i;
		int sum_a = 0;
		
		for (i = 1; i < a; i++) {
			if (a % i == 0) {
				sum_a += i;
			}
		}
		
		int j;
		int sum_b = 0;
		
		for (j = 1; j < b; j++) {
			if (b % j == 0) {
				sum_b += j;
			}
		}
		
		if (sum_a == b && sum_b == a) 
			System.out.println(a + " and " + b + " are amicable numbers");
			
		else 
			System.out.println(a + " and " + b + " are not amicable numbers");
		
	}

}
