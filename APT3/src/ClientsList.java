import java.util.Arrays;

public class ClientsList {

	public String[] dataCleanup(String[] names) {
		ClientName[] clientNames = new ClientName[names.length];
		for (int i = 0; i < names.length; i++) {
			 if (names[i].indexOf(',') != -1) {
				 String[] splitName = names[i].split(", ");
				 clientNames[i] = new ClientName(splitName[1], splitName[0]);
			 }
			 else {
				 String[] splitName = names[i].split(" ");
				 clientNames[i] = new ClientName(splitName[0], splitName[1]);
			 }
		}
		Arrays.sort(clientNames);
		String[] formattedNames = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			formattedNames[i] = clientNames[i].toString();
		}
		return formattedNames;
	}
	
	public class ClientName implements Comparable<ClientName> {
		
		private String first;
		private String last;
		
		public ClientName(String first, String last) {
			this.first = first;
			this.last = last;
		}
		
		public int compareTo(ClientName other) {
			if (last.equals(other.last)) {
				return first.compareTo(other.first);
			}
			return last.compareTo(other.last);
		}
		
		public String toString() {
			return first + " " + last;
		}
	}
	
}
