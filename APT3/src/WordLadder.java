import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public String ladderExists(String[] words, String from, String to) {
		Queue<String> qu = new LinkedList<>();
		Set<String> set = new HashSet<>();
		boolean usesWords = false;
		qu.add(from);
		while (qu.size() > 0) {
			String current = qu.remove();
			if (usesWords == true) {
				if (oneAway(current, to)) {
					return "ladder";
				}
			}
			for (String s : words) {
				if (!set.contains(s) && oneAway(current, s)) {
					qu.add(s);
					set.add(s);
					usesWords = true;
				}
			}
		}
		return "none";
	}
	
	private boolean oneAway(String from, String to) {
		int diffs = 0;
		for (int i = 0; i < from.length(); i++) {
			if (from.charAt(i) != to.charAt(i)) {
				diffs++;
			}
			if (diffs > 1) {
				return false;
			}
		}
		return true;
	}
	
}
