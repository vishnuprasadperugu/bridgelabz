import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
	int year = sc.nextInt();
	if(year%4 == 0) {
		if(year%100 ==0) {
			if(year % 400 ==0) {
				System.out.println("leap");
			}
			else {
				System.out.println("not a leap");
			}
		}
		else {
			System.out.println("leap");
		}
	}
	else {
		System.out.println("not a leap");
	}
	}
}