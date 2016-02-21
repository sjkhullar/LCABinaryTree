
package org.learn.Question;

public class LCA {
	public static Node lca(Node root, Node A ,Node B) {
		if(null == root) {
			return root;
		}
		if(root == A || root == B) {
			return root;
		}
		Node left = lca(root.left, A, B);
		Node right = lca(root.right, A, B);
		
		if(left != null && right != null) {
			return root;
		}
		if(left != null)
			return left;
		else return right;
	}
}
