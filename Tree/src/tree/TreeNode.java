package tree;

import java.util.Scanner;

public class TreeNode {

	private Node root;

	Scanner sc = new Scanner(System.in);

	public TreeNode() {
		root = null;
	}
	
	public Node getRoot()
	{
		return root;
	}

	public Node createNode() {
		Node newNode = new Node();
		System.out.println("Enter data in new node : ");
		int data = sc.nextInt();

		newNode.setData(data);
		//newNode.setLeft(null);
		//newNode.setRight(null);
	
		return newNode;
	}

	public void CreateBinaryTree() {
		Node newNode = createNode();
		Node temp = root;
		if (root == null) {
			root = newNode;
			return ;
		} else {

			while (true) {
				if (newNode.getData() < temp.getData()) {

					if (temp.getLeft() == null) {
						temp.setLeft(newNode);
						System.out.println("Node set to left : " + temp.getData());
						break;
					} else {
						temp = temp.getLeft();
						continue;
					}
				} // current node is less than root node

				else if (newNode.getData() > temp.getData()) {

					if (temp.getRight() == null) {
						temp.setRight(newNode);
						System.out.println("Node set to right : " + temp.getData());
						break;
					} else {
						temp = temp.getRight();
						continue;
					}

				} else {
					System.out.println("Dublicate values : ");
				}

			}

		}

	}
	
	public void preOrder(	Node temp) {
	
		if(temp!=null) {
			System.out.print(temp.getData()+ " ");
			preOrder(temp.getLeft());
			preOrder(temp.getRight());
		}
	}
	
	public void inOrder(Node temp) {
		//System.out.println("first node is "+ temp.getData());
		if(temp!=null) {
		
			inOrder(temp.getLeft());
			System.out.print(temp.getData()+ " ");
			inOrder(temp.getRight());
		}
	}
	public void postOrder(	Node temp) {
		
		if(temp!=null) {
		
			postOrder(temp.getLeft());
			postOrder(temp.getRight());
			System.out.print(temp.getData()+ " ");
		}
	}
	

}
