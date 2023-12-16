import java.util.Scanner;
public class ReverseOfANumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
         int originalNumber = sc.nextInt();
        int reversedNumber = 0; 

        
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        
              }
        System.out.println(reversedNumber);
        
        
	}
}