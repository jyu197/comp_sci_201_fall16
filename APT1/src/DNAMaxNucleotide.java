
public class DNAMaxNucleotide {
	
	public String max(String[] strands, String nuc) {
		String maxStrand = "";
		int maxCount = 0;
		for (String strand: strands) {
			int count = 0;
			for (int i = 0; i < strand.length(); i++) {
				if (nuc.equals(Character.toString(strand.charAt(i)))) {
					count++;
				}
			}
			if (count == 0) {
				continue;
			}
			if (count > maxCount) {
				maxStrand = strand;
				maxCount = count;
			}
			else if (count == maxCount) {
				if (strand.length() > maxStrand.length()) {
					maxStrand = strand;
					maxCount = count;
				}
			}
		}
		return maxStrand;
	}
	
}
