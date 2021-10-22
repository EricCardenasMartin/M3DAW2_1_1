class Main {
  public static void main(String[] args) {
	System.out.println("Introduce un numero porfa UwU:");	
	String input = System.console().readLine();

	int n = Math.abs(Integer.parseInt(input));

	TestCalculadora paco = new TestCalculadora(n);
  }
}