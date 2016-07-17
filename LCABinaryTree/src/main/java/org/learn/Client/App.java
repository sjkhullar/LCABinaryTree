package org.learn.Client;

import org.learn.Question.LCA;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		// root level 0
		Node A = Node.createNode(50);
		// Level 1
		Node B = Node.createNode(25);
		Node C = Node.createNode(75);
		// Level 2
		Node D = Node.createNode(15);
		Node E = Node.createNode(40);
		Node F = Node.createNode(60);
		Node G = Node.createNode(95);

		// Level 3
		Node H = Node.createNode(10);
		Node I = Node.createNode(20);
		Node J = Node.createNode(30);
		Node K = Node.createNode(45);
		Node L = Node.createNode(55);
		Node M = Node.createNode(65);

		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		// connect level 2 and level 3
		D.left = H;
		D.right = I;
		E.left = J;
		E.right = K;
		F.left = L;
		F.right = M;

		Node lca = LCA.lca(A, D, H);
		String message = String.format("1. LCA[Node D (%d) & Node H (%d)] = %d",
													D.data,H.data,lca.data);
		System.out.println(message);

		lca = LCA.lca(A, I, K);
		message = String.format("2. LCA[Node I (%d) & Node K (%d)] = %d", 
													I.data, K.data, lca.data);
		System.out.println(message);

		lca = LCA.lca(A, I, M);
		message = String.format("3. LCA[Node I (%d) & Node M (%d)] = %d", 
													I.data, M.data, lca.data);
		System.out.println(message);
	}
}
