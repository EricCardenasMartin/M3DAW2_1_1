import java.util.*;

public class Parse {
	public static List<String> ToHexadecimal(int input){
		List<String> parsed = new ArrayList<String>();

		while(input > 16){
			parsed.add(0, Parse.HexEncode(Integer.toString(input%16)));

			input /= 16;
		}

		parsed.add(0,  Parse.HexEncode(Integer.toString(input)));

		System.out.println("");
		for (String i : parsed) {
			System.out.print(i);
		}
		System.out.println("");

		return parsed;
	}

	public static String HexEncode(String input){
		// Esto seria en bonito
		// switch(input){
		// 	case "10":
		// 		return "a";
		// 	case "11":
		// 		return "b";
		// 	case "12":
		// 		return "c";
		// 	case "13":
		// 		return "d";
		// 	case "14":
		// 		return "e";
		// 	case "15":
		// 		return "f";
		// 	default:
		// 		return input;
		// }

		// Esto es lo que pide el ejercicio

		String[] a = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

		return a[Integer.parseInt(input)];
	}
}