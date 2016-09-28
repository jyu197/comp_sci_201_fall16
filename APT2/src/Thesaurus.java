import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Thesaurus {

	public String[] edit(String[] entry) {
		ArrayList<HashSet<String>> entries = new ArrayList<HashSet<String>>();
		for (String s : entry) {
			entries.add(new HashSet<String>(Arrays.asList(s.split(" "))));
		}
		boolean edited = true;
		while (edited) {
			edited = false;
			for (int i= 0; i < entries.size(); i++) {
				for (int j = i + 1; j < entries.size(); j++) {
					HashSet<String> iSet = entries.get(i);
					HashSet<String> jSet = entries.get(j);
					HashSet<String> common = new HashSet<String>(iSet);
					common.retainAll(jSet);
					if (common.size() >= 2) {
						edited = true;
						iSet.addAll(jSet);
						entries.remove(j);
					}
				}
			}
		}
		String[] thes = new String[entries.size()];
		for (int i = 0; i < entries.size(); i++) {
			HashSet<String> iSet = entries.get(i);
			String[] words = iSet.toArray(new String[iSet.size()]);
			Arrays.sort(words);
			thes[i] = String.join(" ", words);
		}
		Arrays.sort(thes);
		return thes;
	}
	
}
