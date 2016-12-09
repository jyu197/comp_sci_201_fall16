import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OlympicCandles {

	public int numberofNights(int[] candles) {
		int[] heights = candles;
		Arrays.sort(heights);
		List<Integer> heightsList = new ArrayList<>();
		for (int i = heights.length - 1; i >= 0; i--) {
			heightsList.add(heights[i] + (heights.length - i));
		}
		return Collections.min(heights);
	}
	
}
