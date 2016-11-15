import java.util.Arrays;
import java.util.Comparator;

public class StringSort {

	public String[] sort(String[] words) {
		String[] sorted = words;
		Arrays.sort(sorted, new StrComp());
		return sorted;
	}
		
	public class StrComp implements Comparator<String> {

		public int compare(String a, String b) {
			if (a.length() == b.length()) {
				return a.compareTo(b);
			}
			return (a.length() < b.length()) ? -1 : 1;
		}
		
	}
	
}
