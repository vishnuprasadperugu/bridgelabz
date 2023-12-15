import java.util.Scanner;
public class VowelOrConsonent {

	public static void main(String[] args) {
		
		  Scanner sc= new Scanner(System.in); System.out.println("enter any alphabet");
		  char alphabet = sc.next().charAt(0);
	 
		  if(alphabet == 'a'||alphabet == 'e'||alphabet == 'i'||alphabet ==
		  'o'||alphabet == 'u') { System.out.println("it is a vowel"); } else {
		  System.out.println("is is a consonent"); }
	}
}