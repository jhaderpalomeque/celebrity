import java.util.ArrayList;
import java.util.List;

public class KnowsCelebrity {

	public static int [][] matrix= {
			{0, 0, 1, 0},
			{0, 0, 0, 0},
			{0, 0, 1, 0},
			{0, 0, 0, 0},
			{0, 0, 1, 0}
	};
	
	public static List<Integer> thisIsCelebrity() {
		int count = 0;
		List<Integer> celebrities = new ArrayList<Integer>();
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j] == 0) {
					count++;
				}else {
					count = 0;
					break;
				}
					
			}
			
			if(count == matrix[i].length) {
				celebrities.add(i+1);	
			}
		
		}
		return celebrities;
	}

}
