
package org.learn.Question;

public class LCA {
	public static Node lca(Node root, Node node1, Node node2) {
		if (null == root) {
			return root;
		}
		if (root == node1 || root == node2) {
			return root;
		}
		Node left = lca(root.left, node1, node2);
		Node right = lca(root.right, node1, node2);

		if (left != null && right != null) {
			return root;
		}
		if (left != null)
			return left;
		else
			return right;
	}
}
