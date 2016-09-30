import java.util.ArrayList;
import java.util.Arrays;

public class HashTaggery {

	public String maxTag(String[] tags, String[] messages) {
		double hasTag = 0;
		ArrayList<String> tagList = new ArrayList<String>(Arrays.asList(tags));
		for (String message : messages) {
			for (String word : message.split(" ")) {
				if (tagList.contains(word)) {
					hasTag++;
					break;
				}
			}
		}
		if ((hasTag / messages.length) >= 0.75) {
			return "tagged";
		}
		return "missed";
	}
	
}
