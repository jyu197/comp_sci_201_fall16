import java.util.HashMap;
import java.util.Map;

public class BSTcount {
	
	private Map<Integer, Long> treeCounts = new HashMap<>();
	
	public long howMany(int[] values) {
 		if (values.length <= 1) {
			return 1;
		}
		long sum = 0;
		if (treeCounts.containsKey(values.length)) {
 			return treeCounts.get(values.length);
 		}
		for (int i = 0; i < values.length; i++) {
			int[] left = new int[i];
			int[] right = new int[values.length - i - 1];
			long leftTrees = howMany(left);
			treeCounts.put(left.length, leftTrees);
			long rightTrees = howMany(right);
			treeCounts.put(right.length, rightTrees);
			sum += leftTrees * rightTrees;
		}
		return sum;
	}
	
}
