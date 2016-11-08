
public class TreeCount {
	
	public int count(TreeNode tree) {
		return (tree == null) ? 0 : 1 + count(tree.left) + count(tree.right);
	}
	
}
