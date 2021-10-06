public class PosicioPuntXY {
	PuntXY paco = new PuntXY();

	public void algo(){
		System.out.println(paco.mostrar());
		
		paco.canviar(5, 8);

		System.out.println(paco.mostrar());
	}
}