import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Congres {

	// Atributs
	private Diputat diputats[] = new Diputat[150];
	private int escons; // Compte dels escons ocupats
	private Diputat president;
	private Partit presidencia;

	// Metodes

	public void addDiputat(Diputat diputat) {
		// TODO Metode que afegeix un diputat al congres
		
		diputats[escons] = diputat;
		escons++;
	}

	public void delDiputat(Diputat diputat) {
		// TODO Metode que elimina un diputat
		escons--;
		diputats[ArrayUtils.indexOf(diputats, diputat)] = diputats[escons];
		diputats[escons] = null;
	}
	
	public void seleccionarPresident(Diputat nouPresident) {
		// TODO Metode que selecciona el president del congres
		
		president = nouPresident;
	}

	public Diputat getPresident(){
		return president;
	}
	
	public void seleccionarPresidencia(Partit novaPresidencia) {
		// TODO Metode que selecciona el Partit que te la presidencia

		presidencia = novaPresidencia;
	}

	public Partit getPresidencia(){
		return presidencia;
	}
}
