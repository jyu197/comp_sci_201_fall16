
public class HeightLabel {

	public TreeNode rewire(TreeNode t) {
		if (t == null) {
			return null;
		}
		TreeNode newLeft = rewire(t.left);
		TreeNode newRight = rewire(t.right);
		int newInfo = 1;
		if (newLeft != null) {
			newInfo = Math.max(newInfo, newLeft.info + 1);
		}
		if (newRight != null) {
			newInfo = Math.max(newInfo, newRight.info + 1);
		}
		return new TreeNode(newInfo, newLeft, newRight);
	}
	
}
