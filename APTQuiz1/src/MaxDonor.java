import java.util.HashMap;
import java.util.Map;

public class MaxDonor {

	public String generous(String[] orgs, int[] amount) {
		HashMap<String, Integer> donations = new HashMap<String, Integer>();
		for (int i = 0; i < orgs.length; i++) {
			String org = orgs[i];
			if (!donations.containsKey(org)) {
				donations.put(org, 0);
			}
			donations.put(org, donations.get(org) + amount[i]);
		}
		int highest = 0;
		String orgHighest = "";
		for (Map.Entry<String, Integer> entry : donations.entrySet()) {
			if (entry.getValue() > highest) {
				highest = entry.getValue();
				orgHighest = entry.getKey();
			}
		}
		return orgHighest + ":$" + Integer.toString(highest);
	}
	
}
