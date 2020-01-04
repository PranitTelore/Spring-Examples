
public class ReverseString {

	public static void main(String[] args) {
		String x = "Nashik Exploring";
		String reverse = reverseString(x);
		System.out.println(reverse);
		
	}

	public static String reverseString(String x) {
		
		if(x.isEmpty())
			return x;
		
		//calling function recursively until the string is not empty
		return reverseString(x.substring(1))+x.charAt(0);
	}

}
