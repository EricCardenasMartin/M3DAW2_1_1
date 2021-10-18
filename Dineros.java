public class Dineros{
	int[][] cambio = {{500,0},{200,0},{100,0},{50,0},{20,0},{10,0},{5,0},{2,0},{1,0}};

	void Desglose(int n){
		for(int[] value:cambio){
			System.out.println(n/value[0] + " x " + value[0] + "€");
		}
	}

	void Cambio(int n){
		int tempN = n;
		for(int[] value:cambio){
			value[1] = tempN/value[0];
			System.out.println(value[1] + " x " + value[0] + "€");
			tempN %= value[0];
		}
	}
}