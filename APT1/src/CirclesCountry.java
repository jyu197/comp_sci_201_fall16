
public class CirclesCountry {
	
	public int leastBorders(int[] x, int[] y, int[] r, int x1, int y1, int x2, int y2) {
		int borders = 0;
		for (int i = 0; i < x.length; i++) {
			double dist1 = Math.sqrt(Math.pow(x[i] - x1, 2) + Math.pow(y[i] - y1, 2));
			double dist2 = Math.sqrt(Math.pow(x[i] - x2, 2) + Math.pow(y[i] - y2, 2));
			if ((dist1 < r[i]) != (dist2 < r[i])) {
				borders++;
			}
		}
		return borders;
	}
	
}
