import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueNewYork {

	public int seen(String[] records) {
		ArrayList<String> plates = new ArrayList<String>();
		for (String record : records) {
			plates.addAll(Arrays.asList(record.split(",")));
		}
		HashSet<String> uniques = new HashSet<String>(plates);
		return uniques.size();
	}
	
}
