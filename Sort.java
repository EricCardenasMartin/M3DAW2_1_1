public class Sort {
	public static int[] Bubble(int[] sortMe){
		boolean isSorted = false;

		do{
			isSorted = true;
			for(int i = 0; i < sortMe.length-1; i++){
				if(sortMe[i] > sortMe[i+1]){
					int tempInt;
					tempInt = sortMe[i]; 
					sortMe[i] = sortMe[i+1]; 
					sortMe[i+1] = tempInt; 
					isSorted = false;
				}
			}
		}while(!isSorted);

		for (int i : sortMe) {
			System.out.print(i + " - ");
		}

		return sortMe;
	}

	public static int[] Reverse(int[] sortMe){
		int[] returnMe = new int[sortMe.length];

		for(int i = 0; i < sortMe.length; i++){
			returnMe[i] = sortMe[sortMe.length-1-i];
		}

		for (int i : returnMe) {
			System.out.print(i + " - ");
		}

		return returnMe;
	}
}