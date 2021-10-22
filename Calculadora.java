public class Calculadora{
	public static int Factorial(int n){
		if(n > 1)
			return n * Factorial(n-1);
		else
			return 1;
	}

	public static void LesserEven(int n){
		for(int i = 2; i < n;i+=2){
			System.out.println(i);
		}
	}

	public static boolean IsPrime(int n){
		if(n > 3){
			for(int i = 1; i < n; i++){
				if((6*i)-1 == n || (6*i)+1 == n)
					return true;
				if((6*i)+1 > n)
					return false;
			}
		}

		return true;
	}
}