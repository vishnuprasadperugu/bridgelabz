import java.util.Scanner;
import java.util.Arrays;
public class MaxInArray{

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of th array");
		int size = sc.nextInt();
		System.out.println("enter the elements of th array");
		int[] intarr = new int[size];
		for(int i=0; i< intarr.length;i++) {
			intarr[i] = sc.nextInt();
		}
	
		Arrays.sort(intarr);
		System.out.println("maximum in the array is :  "  +intarr[intarr.length-1]);
		
		
	}
}