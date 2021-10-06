public class PuntXY{
	int coordX = 1, coordY = 2;

	public String mostrar(){
		return "X: " + coordX + " || Y: " + coordY;
	}

	public void canviar(int tempX, int tempY){
		coordX = tempX;
		coordY = tempY;
	}
}