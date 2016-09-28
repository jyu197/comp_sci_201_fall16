import java.util.Arrays;
import java.util.HashSet;

public class MemberCheck {

	public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
		HashSet<String> club1Set = new HashSet<String>(Arrays.asList(club1));
		HashSet<String> club2Set = new HashSet<String>(Arrays.asList(club2));
		HashSet<String> club3Set = new HashSet<String>(Arrays.asList(club3));
		HashSet<String> club1SetCopy = new HashSet<String>(Arrays.asList(club1));
		club1Set.retainAll(club2Set);
		club1SetCopy.retainAll(club3Set);
		club2Set.retainAll(club3Set);
		HashSet<String> dishonest = new HashSet<String>(club1Set);
		dishonest.addAll(club1SetCopy);
		dishonest.addAll(club2Set);
		String[] sorted = dishonest.toArray(new String[dishonest.size()]);
		Arrays.sort(sorted);
		return sorted;
	}
	
}
