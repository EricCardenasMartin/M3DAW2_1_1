class Main {
  public static void main(String[] args) {
	  String input = "7531321231357";

	  boolean isPalindrome = PalindromeManager.IsPalindrome(input);

	System.out.println(input + (isPalindrome ? " si " : " no ") + "es un palindromo " + (isPalindrome ? ":D" : "D:"));
  }
}