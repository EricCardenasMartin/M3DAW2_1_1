import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Main {
  public static void main(String[] args) {
	  Restaurant restaurante = new Restaurant();

	  restaurante.SetMenuItem(Restaurant.MenuItem.Aperitivos, new Llista("canapes", "pates", "formatges"));
	  restaurante.SetMenuItem(Restaurant.MenuItem.Primeros, new Llista("amanida", "sopa", "pure"));
	  restaurante.SetMenuItem(Restaurant.MenuItem.Segundos, new Llista("canalons", "bistec", "bacalla"));
	  restaurante.SetMenuItem(Restaurant.MenuItem.Postres, new Llista("fruita", "gelat", "pastis"));
	  restaurante.SetMenuItem(Restaurant.MenuItem.bebidas, new Llista("aigua", "refresc", "vi"));
	  restaurante.SetMenuItem(Restaurant.MenuItem.Cafes, new Llista("cafe", "infusio", "licor"));

		String[] nombres = {"Aperituis", "Primers", "Segons", "Postres", "Begudes", "Cafes"};

	  for(int i = 0; i < 6; i++){
			System.out.println(" - " + nombres[i] + ": " + restaurante.GetMenuItems(i).GetItem(0) + ", " + restaurante.GetMenuItems(i).GetItem(1) + " i " + restaurante.GetMenuItems(i).GetItem(2));
	  }
  }
}