import java.util.ArrayList;

public class Anonymous {

	public int howMany(String[] headlines, String[] messages) {
		ArrayList<Character> letters = new ArrayList<Character>();
		for (String headline : headlines) {
			char[] chars = headline.toLowerCase().toCharArray();
			for (char c : chars) {
				letters.add(c);
			}
		}
		int writable = 0;
 		for (String message : messages) {
 			ArrayList<Character> avail = new ArrayList<Character>(letters);
			char[] chars = message.toLowerCase().toCharArray();
 			for (char c : chars) {
 				if (c == ' ') {
 					continue;
 				}
				if (!avail.contains(c)) {
					writable--;
					break;
				}
				avail.remove((Character) c);
			}
			writable++;
 		}
		return writable;
	}
	
}
