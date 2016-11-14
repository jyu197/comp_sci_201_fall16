import java.util.ArrayList;
import java.util.Stack;

public class Leaves {
	
	public int[] getLeaves(TreeNode t) {
		if (t == null) {
			return new int[0];
		}
		Stack<TreeNode> nodes = new Stack<>();
		ArrayList<TreeNode> leaves = new ArrayList<>();
		nodes.add(t);
		while (!nodes.isEmpty()) {
			TreeNode current = nodes.pop();
			if (current.left == null && current.right == null) {
				leaves.add(current);
				continue;
			}
			if (current.left != null) {
				nodes.add(current.left);
			}
			if (current.right != null) {
				nodes.add(current.right);
			}
		}
		int[] leavesArr = new int[leaves.size()];
		for (int i = 0; i < leavesArr.length; i++) {
			leavesArr[i] = leaves.get(leavesArr.length - i - 1).info;
		}
		return leavesArr;
	}

}
