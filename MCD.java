public class MCD{
	public MCD(int x, int y){
		int xMCD = x;
		int yMCD = y;
		int multiplicadorX = 2;
		int multiplicadorY = 2;

		while(xMCD != yMCD){
			if(xMCD > yMCD){
				xMCD = x / multiplicadorX;
				multiplicadorX++;
			} else {
				yMCD = y / multiplicadorY;
				multiplicadorY++;
			}
		}

		System.out.println("El MCD de " + x + " y " + y + " es " + xMCD);
	}
}