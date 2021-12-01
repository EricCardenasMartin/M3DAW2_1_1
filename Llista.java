public class Llista{

	String[] items = new String[3];

	public Llista(String item1, String item2, String item3){
		items[0] = item1;
		items[1] = item2;
		items[2] = item3;
	}

	public String GetItem(int item){
	 	return items[item];
	}
}