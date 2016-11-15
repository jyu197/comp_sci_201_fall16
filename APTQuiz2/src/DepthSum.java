
public class DepthSum {

	public int value(TreeNode tree) {
		return helper(tree, 1);
	}
	
	public int helper(TreeNode tree, int level) {
		if (tree == null) {
			return 0;
		}
		int sum = tree.info * level;
		sum += helper(tree.left, level + 1);
		sum += helper(tree.right, level + 1);
		return sum;
	}
	
}
