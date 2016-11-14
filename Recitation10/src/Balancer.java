import java.util.Stack;

public class Balancer {

	private static String LEFTS = "{[(<";
	private static String RIGHTS = "}])>";
	
	public boolean isBalanced(String s) {
		Stack<Integer> st = new Stack<Integer>();
		for (int k = 0; k < s.length(); k++) {
			char ch = s.charAt(k);
			if (Character.isWhitespace(ch)) {
				continue;
			}
			int leftIndex = LEFTS.indexOf(ch);
			if (leftIndex >= 0) {
				st.push(leftIndex);
			}
			else {
				if (s.isEmpty()) {
					return false;
				}
				int rightIndex = RIGHTS.indexOf(ch);
				if (st.peek()!= rightIndex) {
					return false;
				}
				st.pop();
			}
		}
		if (!st.isEmpty()) {
			return false;
		}
		return true;
	}
	
}
