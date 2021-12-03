import java.util.Random;

public class Eleccions {

	//Atributs
	static private Partit partits[] = new Partit[8];
	static private int vots[] = new int[8];

	//Metodes
	
	public static void eleccions() {
		partits();
		votacions();
	}
	private static void votacions() {
		// Metode que genera les votacions,
		// s'ha d'utilitzar solament al principi del programa
		Random rand = new Random();
		int maxim = 10000;

		for (int i = 0; i < vots.length; i++) {
			int resultat = rand.nextInt(maxim);
			vots[i] = resultat;
		}

	}
	
	private static void partits() {
		String noms[] = {"RF", "FFF", "BOX", "AC", "DC", "PM", "FL", "PP"};
		for (int i = 0; i<vots.length; i++) {
			partits[i] = new Partit(noms[i]);
		}
	}

	public static Partit[] getPartits() {
		return partits;
	}

	public static int[] getVots() {
		return vots;
	}
}
