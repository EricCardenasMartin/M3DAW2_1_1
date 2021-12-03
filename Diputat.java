
public class Diputat {

	// Atributs
	private Partit partit;
	private String nom;

	//Constructor
	public Diputat(Partit partit) {
		this.partit = partit;
		nom = generarNombreAleatorio();
	}

	// Metodes
	
	public static String generarNombreAleatorio() {
		
		//Metode que genera aleatoriament els noms dels diferents diputats de cada partit
		String nombreAleatorio;

		String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
				"Caritina", "Carlota", "Baltazar", "Enrique", "Tomás" };
		String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
				"Carion", "Castillo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
				"Grigalva", "Perez", "Angulo" };

		nombreAleatorio = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
				+ apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
		return nombreAleatorio;
	}

	// TODO Getters and Setters
	
	// private Partit partit;

	public Partit getPartit(){
		return partit;
	}

	public void setPartit(Partit partitNuevo){
		partit = partitNuevo;
	}

	// private String nom;

	public String getNom(){
		return nom;
	}

	public void setNom(String nomNuevo){
		nom = nomNuevo;
	}

}
