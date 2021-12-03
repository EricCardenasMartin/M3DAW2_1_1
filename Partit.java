
public class Partit {

	// Atributs
	private String nom;
	private int vots;
	private int escons;
	private Diputat diputats[] = new Diputat[100];

	//Constructor
	public Partit(String nom) {
		this.nom = nom;
		generarDiputats();
	}

	// Metodes
	
	public void calculEscons(double votsPerEscon) {
		/*
		 * TODO metode que calcula els escons obtinguts a partir dels vots necessaris
		 */
		
		//this.escons = ...

		escons = (int)((double)vots * votsPerEscon);
	}
	
	public Diputat diputatSeleccionat(Diputat diputat) {
		// TODO metode que selecciona un Diputat del partit i el retorna

		return new Diputat(new Partit("Borrame :D"));
	}
	
	public Diputat[] diputatsSeleccionats() {
		//TODO metode que selecciona els diputats guanyadors i el retorna

		return new Diputat[1];

	}

	private void generarDiputats() {

		for (int i = 0; i < diputats.length; i++) {
			diputats[i] = new Diputat(this);
		}
	}

	// TODO Getters y Setters

	// private String nom;

	public String getNom(){
		return nom;
	}

	public void setNom(String nomNuevo){
		nom = nomNuevo;
	}

	// private int vots;

	public int getVots(){
		return vots;
	}

	public void setVots(int votsNuevo){
		vots = votsNuevo;
	}
	// private int escons;

	public int getEscons(){
		return escons;
	}

	public void setEscons(int esconsNuevo){
		escons = esconsNuevo;
	}

	// private Diputat diputats[] = new Diputat[100];

	public Diputat[] getDiputats(){
		return diputats;
	}

	public void setDiputats(Diputat[] diputatsNuevo){
		diputats = diputatsNuevo;
	}
}
