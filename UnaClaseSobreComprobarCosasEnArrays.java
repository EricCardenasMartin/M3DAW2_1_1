public class UnaClaseSobreComprobarCosasEnArrays {
	public static boolean IsMagic(int[][] input){
		int arrayLength = input[0].length;
		Integer targetValue = null;
		int value2Compare = 0;

		for(int y = 0; y < arrayLength; y++){
			value2Compare = 0;
			for(int x = 0; x < arrayLength; x++){
				value2Compare += input[y][x];
			}
			if(targetValue == null)
				targetValue = value2Compare;
			else
				if(value2Compare != targetValue)
					return false;
		}

		for(int y = 0; y < arrayLength; y++){
			value2Compare = 0;
			for(int x = 0; x < arrayLength; x++){
				value2Compare += input[x][y];
			}
			if(value2Compare != targetValue)
				return false;
		}

		value2Compare = 0;
		for(int i = 0; i < arrayLength; i++)
			value2Compare += input[i][i];
		if(value2Compare != targetValue)
			return false;

		value2Compare = 0;
		for(int i = 0; i < arrayLength; i++)
			value2Compare += input[arrayLength - 1 - i][i];
		if(value2Compare != targetValue)
			return false;

		return true;
	}
}