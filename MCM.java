public class MCM{
	public MCM(int x, int y){
		int xMCM = x;
		int yMCM = y;
		int multiplicadorX = 2;
		int multiplicadorY = 2;

		while(xMCM != yMCM){
			if(xMCM < yMCM){
				xMCM = x * multiplicadorX;
				multiplicadorX++;
			} else {
				yMCM = y * multiplicadorY;
				multiplicadorY++;
			}
		}

		System.out.println("El MCM de " + x + " y " + y + " es " + xMCM);
	}
}