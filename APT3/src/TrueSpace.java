import java.util.Arrays;

public class TrueSpace {
	
	public long calculateSpace(int[] sizes, int clusterSize) {
		int[] mySizes = sizes.clone();
		long space = 0;
		Arrays.sort(mySizes);
		for (int i = 0; i < mySizes.length; i++) {
			space += mySizes[i] / clusterSize * clusterSize;
			int remainder = mySizes[i] % clusterSize;
			if (remainder != 0) {
				for (int j = 0; j < mySizes.length; j++) {
					if (mySizes[j] < remainder && mySizes[j] > 0) {
						remainder -= mySizes[j];
						mySizes[j] = 0;
					}
				}
				space += clusterSize;
			}
		}
		return space;
	}
	
}
