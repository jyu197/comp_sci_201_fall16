import java.util.Arrays;
import java.util.HashSet;

public class Starter {

	public int begins(String[] words, String first) {
		HashSet<String> uniques = new HashSet<String>(Arrays.asList(words));
		int numBegin = 0;
		for (String word : uniques) {
			if (word.substring(0, 1).equals(first)) {
				numBegin++;
			}
		}
		return numBegin;
	}
	
}
