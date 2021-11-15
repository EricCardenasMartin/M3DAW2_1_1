import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Main {
  public static void main(String[] args) {
	  int[] a = new int[10];

	  for(int i = 0; i < a.length; i++){
		  a[i] = ThreadLocalRandom.current().nextInt(0, 65000 + 1);
	  }
  
		a = Sort.Bubble(a);

		int b = a[a.length-1];

		List<String> aHex = Parse.ToHexadecimal(a[a.length-1]);

		int[] reversedA = Sort.Reverse(a);
  }
}