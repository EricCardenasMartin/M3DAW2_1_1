public class Restaurant{
	public static enum MenuItem {Aperitivos(0), Primeros(1), Segundos(2), Postres(3), bebidas(4), Cafes(5);
	
	public final int value;

	private MenuItem(int value){
		this.value = value;
	}}



	Llista[] menu;

	public Restaurant(){
		menu = new Llista[6];
	}

	public void SetMenuItem(Restaurant.MenuItem menuItem, Llista lista){
		menu[menuItem.value] = lista;
	}

	public Llista GetMenuItems(Restaurant.MenuItem menuItem){
		return menu[menuItem.value];
	}

	public Llista GetMenuItems(int menuItem){
		return menu[menuItem];
	}
}