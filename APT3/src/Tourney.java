import java.util.LinkedList;
import java.util.Queue;

public class Tourney {

	public String winner(String[] bracket, String results) {
		if (results.length() == 0) {
			if (bracket[0].equals("bye")) {
				return bracket[1];
			}
			return bracket[0];
		}
		Queue<String> games = new LinkedList<>();
		for (String team : bracket) {
			games.add(team);
		}
		for (char result : results.toCharArray()) {
			String higher = games.remove();
			String lower = games.remove();
			while (higher.equals("bye") || lower.equals("bye")) {
				if (higher.equals("bye")) {
					games.add(lower);
				}
				else {
					games.add(higher);
				}
				higher = games.remove();
				lower = games.remove();
			}
			if (result == 'H') {
				games.add(higher);
			}
			else {
				games.add(lower);
			}
		}
		return games.remove();
	}
	
}
