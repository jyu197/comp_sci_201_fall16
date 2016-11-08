
public class Isomorphic {

	public String sameShape(TreeNode s, TreeNode t) {
		if ((s == null) != (t == null)) {
			return "different";
		}
		if (s == null && t == null) {
			return "same";
		}
		if (sameShape(s.left, t.left).equals("different")) {
			return "different";
		}
		return sameShape(s.right, t.right);
	}
	
}
