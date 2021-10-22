public class TestCalculadora{
	public TestCalculadora(int n){
		System.out.println("Factorial de " + n + ": " + Calculadora.Factorial(n));

		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");
		System.out.println("Pares menores a " + n + "n");
		Calculadora.LesserEven(n);

		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("");
		System.out.println(n + (Calculadora.IsPrime(n)?"":" no ") + " es un numero primo");
	}
}