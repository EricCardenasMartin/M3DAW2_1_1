public class PalindromeManager {
	public static boolean IsPalindrome(String input){
		String temp = "";
		int halfLength = input.length() / 2;

		for(int i = 0; i < halfLength; i++){
			temp += input.charAt(input.length() - 1 - i);
		}

		input = input.substring(0,halfLength);

		if (input.contains(temp))
			return true;
		else
			return false;
	}
}