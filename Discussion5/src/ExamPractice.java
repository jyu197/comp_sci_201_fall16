import java.util.Map;
import java.util.TreeMap;

public class ExamPractice {
	public static String topSong(String[] playlists) {
		TreeMap<String, Integer> countSongs = new TreeMap<String,Integer>();
		for (String playlist : playlists) {
			String[] songs = playlist.split(",");
			for (String song: songs) {
				if (!countSongs.containsKey(song)) {
					countSongs.put(song, 0);
				}
				countSongs.put(song, countSongs.get(song) + 1);
			}
		}
		int maxVal = 0;
		String maxKey = "";
		for (Map.Entry<String, Integer> entry : countSongs.entrySet()) {
			int val = entry.getValue();
			if (val > maxVal) {
				maxVal = val;
				maxKey = entry.getKey();
			}
		}
		return maxKey;
	}
	
	public static void main(String[] args) {
		String[] playlists = {"Tik Tok,Imma Be,Bad Romance,Who Are You", "How Low,Tik Tok,Thunder Road",
				"Need You Now,Tik Tok,Stupidity"}; 
		System.out.println(topSong(playlists));
	}
}
