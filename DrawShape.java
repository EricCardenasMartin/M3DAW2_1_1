public class DrawShape{
	public static enum Shape {Square,Triangle,Rect}

	public static void Draw(int n, DrawShape.Shape shape){
		IShape object = null;

		switch(shape){ //Creamos la figura que toque
			case Square:
				object = new Square(n);
			break;
			case Triangle:
				object = new Triangle(n);
			break;
			case Rect:
				object = new Rect(n);
			break;
			default:
				System.out.println("Unexpected shape F");
				System.exit(0);
			break;
		}

		if(object == null){
			System.out.println("Null shape object reference F");
			System.exit(0);
		}

		object.Draw(); // y la dibujamos
	}
}