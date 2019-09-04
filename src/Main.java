import java.util.List;

public class Main {
	
public static void main(String ...args) {
		
		if(KnowsCelebrity.thisIsCelebrity().size() == 0) {
			System.out.println("There is no celebrity");
		}else {
			List<Integer> celebrities = KnowsCelebrity.thisIsCelebrity();
			celebrities.forEach(position -> {
				System.out.println("The row "+position+" is a celebrity");
			});
		}
		
	}

}
