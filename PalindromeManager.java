public class PalindromeManager {
	public static boolean IsPalindrome(String input){
		String temp = "";
		int halfLength = input.length() / 2;

		for(int i = 0; i < halfLength; i++){
			temp += input.charAt(input.length() - 1 - i);
		}

		System.out.println(input);

		input = input.substring(0,halfLength);

		System.out.println(input);
		System.out.println(temp);

		if (input.contains(temp))
			return true;
		else
			return false;
	}
}