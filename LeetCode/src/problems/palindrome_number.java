package problems;

public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(111211));
	}

	public static boolean isPalindrome(int x) {
		String xs = String.valueOf(x);
		boolean valid = false;
		for (int i = 0; i < xs.length(); i++) {
			if( i < xs.length()-i && xs.charAt(i) != xs.charAt(xs.length()-i-1)) {
				valid = true;
				break;
			}
		}
	    return !valid;
	}
	
}
