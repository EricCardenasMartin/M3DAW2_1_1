class Main {
  public static void main(String[] args) {
	
		System.out.println("Introduce una cantidad porfa UwU:");
		String input = System.console().readLine();

	  	int parsedInput = Integer.parseInt(input);

	  	Dineros dineros = new Dineros();

		System.out.println("");
		System.out.println("Desglose:");
		System.out.println("");

		dineros.Desglose(parsedInput);

		System.out.println("");
		System.out.println("Cambio:");
		System.out.println("");

		dineros.Cambio(parsedInput);

  }
}