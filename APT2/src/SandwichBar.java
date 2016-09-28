import java.util.ArrayList;
import java.util.Arrays;

public class SandwichBar {

	public int whichOrder(String[] available, String[] orders) {
		for (int i = 0; i < orders.length; i++) {
			String[] ingredients = orders[i].split(" ");
			boolean makeable = true;
			for (String ingredient : ingredients) {
				ArrayList<String> avail = new ArrayList<String>(Arrays.asList(available));
				if (!avail.contains(ingredient)) {
					makeable = false;
					break;
				}
			}
			if (makeable) {
				return i;
			}
		}
		return -1;
	}
	
}
	