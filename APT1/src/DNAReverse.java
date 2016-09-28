
public class DNAReverse {
	
	public String reverse(String dna) {
		String reversed = "";
		for (int i = dna.length() - 1; i > -1; i--) {
			reversed += dna.charAt(i);
		}
		return reversed;
	}
	
}
