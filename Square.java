public class Square implements IShape{
	private int n;

	public Square(int tempN){
		n = tempN;
	}

	public void Draw(){
		for(int y = 0; y<n;y++){
			for(int x=0;x<n;x++)
				System.out.print("*");
			System.out.println("");
		}
	}
}