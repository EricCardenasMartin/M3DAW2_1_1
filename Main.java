import java.util.Arrays;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {

		Eleccions.eleccions();
		int vots[] = Eleccions.getVots();
		Partit partits[] = Eleccions.getPartits();
		Congres congres = new Congres();
		
		System.out.println(Arrays.toString(partits));
		System.out.println(Arrays.toString(vots));
		System.out.println(Diputat.generarNombreAleatorio());
		
		//TODO Càlcul del valor de l'escon (formula a l'enunciat)

		double valorEscons = 0;

		for (int vot : vots) {
			valorEscons += vot;
		}

		System.out.println("Total votos: " + valorEscons);
		valorEscons = 150 / valorEscons;
		System.out.println("Votos por escaño: " + valorEscons);
		
		//TODO Elecció del congres

		int esconsAmount = 0;

		for(int i = 0; i < partits.length; i++){
			partits[i].setVots(vots[i]);
			partits[i].calculEscons(valorEscons);
			System.out.println("Escaños partido" + i + ": " + partits[i].getEscons());
			esconsAmount += partits[i].getEscons();
			System.out.println("Escaños ya ocupados: " + esconsAmount);
		}

		// Si faltan escaños los añadimos

		for(int i = 0; i < 150 - esconsAmount; i++){
			partits[i].setEscons(partits[i].getEscons() + 1);
		}

		esconsAmount = 0;
		
		System.out.println("");
		System.out.println("Escaños extras repartidos");
		System.out.println("");

		int partitAmbMesEsconsAmount = 0;
		int partitAmbMesEscons = 0;

		for(int i = 0; i < partits.length; i++){
			if(partits[i].getEscons() > partitAmbMesEsconsAmount){
				partitAmbMesEsconsAmount = partits[i].getEscons();
				partitAmbMesEscons = i;
			}


			System.out.println("Escaños partido" + partits[i] + ": " + partits[i].getEscons());
			esconsAmount += partits[i].getEscons();
			System.out.println("Escaños ya ocupados: " + esconsAmount);
		}

		//TODO Elecció del president i la presidencia

		congres.seleccionarPresident(partits[partitAmbMesEscons].getDiputats()[0]);
		congres.seleccionarPresidencia(partits[partitAmbMesEscons]);

		System.out.println("");
		System.out.println("El partido " + congres.getPresidencia() + " es el partido con mas escaños :D");
		System.out.println("El partido " + congres.getPresidencia() + " tiene un total de " + partitAmbMesEsconsAmount + " escaños :D");
		System.out.println("El partido " + congres.getPresidencia() + " tiene un como presidente a " + congres.getPresident() + " :D");
	}

}
