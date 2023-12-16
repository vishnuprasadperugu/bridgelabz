public class reverseOfString{

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name");
		
		String name = sc.next();
		String namereverse = "";
			        char[] charArray = name.toCharArray();
			        int i = 0;
			        int j = charArray.length - 1;

			        while (i < j) {
			           
			            char temp = charArray[i];
			            charArray[i] = charArray[j];
			            charArray[j] = temp;

			           
			            i++;
			            j--;
			        }

			        String reversedString = new String(charArray);
			        System.out.println(reversedString);
			    }
}
		
		