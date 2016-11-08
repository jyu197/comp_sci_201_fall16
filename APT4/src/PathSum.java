
public class PathSum {
	
	public int hasPath(int target, TreeNode tree) {
		if (tree == null) {
			return 0;
		}
		int remain = target - tree.info;
		if (remain < 0) {
			return 0;
		}
		if (tree.left == null && tree.right == null) {
			if (remain == 0) {
				return 1;
			}
		}
		return Math.max(hasPath(remain, tree.left), hasPath(remain, tree.right));
	}
	
}
