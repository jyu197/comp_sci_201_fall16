
public class QuasiIsomorphic {

	public String sameShape(TreeNode s, TreeNode t) {
		if ((s == null) != (t == null)) {
			return "different";
		}
		if (s == null && t == null) {
			return "same";
		}
		if (sameShape(s.left, t.left).equals("same") && sameShape(s.right, t.right).equals("same")) {
			return "same";
		}
		if (sameShape(s.left, t.right).equals("same") && sameShape(s.right, t.left).equals("same")) {
			return "same";
		}
		return "different";
	}
	
}
