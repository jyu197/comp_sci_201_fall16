import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SimpleWordGame {
	
	public int points(String[] player, String[] dictionary) {
		HashSet<String> uniques = new HashSet<String>(Arrays.asList(player));
		ArrayList<String> dict = new ArrayList<String>(Arrays.asList(dictionary));
		int score = 0;
		for (String word : uniques) {
			if (dict.contains(word)) {
				score += Math.pow(word.length(), 2);
			}
		}
		return score;
	}
	
}
