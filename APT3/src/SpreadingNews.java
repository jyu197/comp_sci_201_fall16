import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SpreadingNews {
	
	private Map<Integer, List<Integer>> subs;
	
	public int minTime(int[] supervisors) {
		if (supervisors.length <= 1) {
			return 0;
		}
		subs = new HashMap<>();
		for (int i = 1; i < supervisors.length; i++) {
			if (!subs.containsKey(supervisors[i])) {
					subs.put(supervisors[i], new LinkedList<>());
			}
			subs.get(supervisors[i]).add(i);
		}
		return howLong(0);
	}
	
	private int howLong(int supervisor) {
		List<Integer> mySubs = new LinkedList<>(subs.get(supervisor));
		List<Integer> times = new LinkedList<>();
		for (int sub : mySubs) {
			if (subs.containsKey(sub)) {
				times.add(howLong(sub) + 1);
			}
			else {
				times.add(1);
			}
		}
		Collections.sort(times, Collections.reverseOrder());
		int min = 0;
		for (int i = 0; i < times.size(); i++) {
			if (times.get(i) + i > min) {
				min = times.get(i) + i;
			}
		}
		return min;
	}
	
}
