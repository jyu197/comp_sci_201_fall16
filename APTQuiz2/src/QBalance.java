import java.util.Stack;

public class QBalance {

	public final String left = "{[(";
	public final String right = "}])";
	
	public int bindex(String symbols) {
		Stack<Character> match = new Stack<>();
		for (int i = 0; i < symbols.length(); i++) {
			char c = symbols.charAt(i);
			if (left.indexOf(c) != -1) {
				match.push(c);
			}
			if (right.indexOf(c) != -1) {
				if (match.isEmpty()) {
					return i;
				}
				if (left.indexOf(match.pop()) != right.indexOf(c)) {
					return i;
				}
			}
		}
		return (match.isEmpty()) ? -1 : symbols.length();
	}
	
}
