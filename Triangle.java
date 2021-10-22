public class Triangle implements IShape{
	private int n;

	public Triangle(int tempN){
		n = tempN;
	}

	public void Draw(){
		for(int y = 0; y<n;y++){
			for(int x=0;x<y+1;x++)
				System.out.print("*");
			System.out.println("");
		}
	}
}