class Main {
  public static void main(String[] args) {
	int shapeN;

	// ########################################
	// #######   Escogemos la figura  #########
	// ########################################

	do {
		System.out.println("Que figura quieres dibujar? (1-3)");	
		System.out.println("1) Cuadrado");	
		System.out.println("2) Triangulo");	
		System.out.println("3) Rectangulo");
		System.out.println("");	
		shapeN = Integer.parseInt(System.console().readLine());
		if(shapeN < 0 || shapeN > 3){
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println(" Por favor introduce un numero del 1 al 3 UwU");
			System.out.println("");
			System.out.println("");
		}
	} while (shapeN < 0 || shapeN > 3);

	DrawShape.Shape shape = null;

	switch(shapeN){
		case 1:
			shape = DrawShape.Shape.Square;
		break;
		case 2:
			shape = DrawShape.Shape.Triangle;
		break;
		case 3:
			shape = DrawShape.Shape.Rect;
		break;
		default:
			System.out.println("Unexpected shape F");
			System.exit(0);
		break;
	}

	// ########################################
	// #######    Escogemos el lado   #########
	// ########################################

	System.out.println("");	
	System.out.println("Introduce el lado de la figura pls:");	
	System.out.println("");	
	int n = Math.abs(Integer.parseInt(System.console().readLine()));
	System.out.println("");	

	// ########################################
	// #######   Dibujamos la figura  #########
	// ########################################

	DrawShape.Draw(n, shape);
  }
}