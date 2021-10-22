public class Rect implements IShape{
	private int n;

	public Rect(int tempN){
		n = tempN;
	}

	public void Draw(){
		for(int y = 0; y<n;y++){
			for(int x=0;x<n/2;x++)
				System.out.print("*");
			System.out.println("");
		}
	}
}