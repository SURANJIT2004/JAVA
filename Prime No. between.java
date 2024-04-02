import java.util.Scanner;
	public class Q3 {

		public static void main(String[] args) 
		{
			int count=0;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the first number: ");
			int a = input.nextInt();
			System.out.println("Enter the second number: ");
			int b = input.nextInt();
			
			int i,j;
			
			System.out.println("The prime numbers between " + a + " and " + b + " are: ");
			
			for (i = a; i <= b; i++) {
				for (j = 2; j < i; j++) {
					if (i % j == 0) {
						break;
						
					}
				}
				if ( i == j) {
					System.out.println(i + "  ");
					count = count+1;
				}
			
			}
			System.out.println("count is " + count);
		}

	}


