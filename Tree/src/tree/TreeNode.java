package tree;

import java.util.Scanner;

public class TreeNode {

	private Node root;

	Scanner sc = new Scanner(System.in);

	public TreeNode() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public Node createNode() {
		Node newNode = new Node();
		System.out.println("Enter data in new node : ");
		int data = sc.nextInt();

		newNode.setData(data);
		// newNode.setLeft(null);
		// newNode.setRight(null);

		return newNode;
	}

	public void CreateBinaryTree() {
		Node newNode = createNode();
		Node temp = root;
		if (root == null) {
			root = newNode;
			return;
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

	public void preOrder(Node temp) {

		if (temp != null) {
			System.out.print(temp.getData() + " ");
			preOrder(temp.getLeft());
			preOrder(temp.getRight());
		}
	}

	public void inOrder(Node temp) {
		// System.out.println("first node is "+ temp.getData());
		if (temp != null) {

			inOrder(temp.getLeft());
			System.out.print(temp.getData() + " ");
			inOrder(temp.getRight());
		}
	}

	public void postOrder(Node temp) {

		if (temp != null) {

			postOrder(temp.getLeft());
			postOrder(temp.getRight());
			System.out.print(temp.getData() + " ");
		}
	}

	public boolean findNodeInBST(int value) {
		Node temp = root;
		Node tag = root;
		while (temp != null) {
			if (temp.getData() == value) {
				return true;

			} else if (value < temp.getData()) {
				tag = temp;
				temp = temp.getLeft();
			} else if (value > temp.getData()) {
				tag = temp;
				temp = temp.getRight();
			}

		}

		return false;
	}
	
	public void deleteNode(int value)
	{
	    Node temp=root;
	    Node tag=root;
	    
	   if(temp==null)
	   {
		   System.out.println("NULL tree exists...");
	   }
	   else
	   {
		   //search value in tree
		   while(temp!=null)
		   {
			   if(temp.getData()==value)
			   {
				   //node found
				   break;
			   }
			   else if(value < temp.getData()) 
			   {
				   //search for value on LHS of tree
				   tag = temp;
				   temp = temp.getLeft();
			   }
			   else if(value > temp.getData())
			   {
				   //search for value on RHS of tree
				   tag = temp;
				   temp = temp.getRight();
			   }
		   }//while search
		   if(temp==null)
		   {
			   System.out.println("\tNODE NOT FOUND....!!!!");
			   return;
		   }
		   else
		   {
			   //Type 1: leaf node
			   if(temp.getLeft()==null && temp.getRight()==null)
			   {
				   if(tag.getLeft()==temp) //temp is left child of parent
					   tag.setLeft(null);
				   else if(tag.getRight()==temp) //temp is right child of parent
					   tag.setRight(null);
			   }
			   //Type 2: Node have LHS child/sub-tree and no RHS
			   else if(temp.getLeft()!=null && temp.getRight()==null)
			   {
				   if(tag.getLeft()==temp)//temp is left child of parent
					   tag.setLeft(temp.getLeft());
				   else if(tag.getRight()==temp)//temp is right child of parent
					   tag.setRight(temp.getLeft());
			   }
			   //Type 3: Node have RHS child/sub-tree and no LHS
			   else if(temp.getLeft()==null && temp.getRight()!=null)
			   {
				   if(tag.getLeft()==temp)//temp is left child of parent
					   tag.setLeft(temp.getRight());
				   else if(tag.getRight()==temp) //temp is right child of parent
					   tag.setRight(temp.getRight());
			   }
			   //Type 4: Node is parent node for both LHS & RHS child/sub-tree
			   else if(temp.getLeft()!=null && temp.getRight()!=null)
			   {
				   //Step 1:
				   //connect tag with temp's RHS
				   if(tag.getLeft()==temp) //temp is left child of parent
				   {
					   tag.setLeft(temp.getRight());
					   //Step 2:
					   //shift tag to LHS of tag after connecting subtree
					   tag = tag.getLeft();
				   }
				   else if(tag.getRight()==temp)//temp is right child of parent
				   {
					   tag.setRight(temp.getRight());
					   //Step 2:
					   //shift tag to RHS of tag after connecting subtree
					   tag = tag.getRight();
				   }
				   
				  
				   //traverse tag to left-most node of its LHS subtree
				   while(tag.getLeft()!=null)
				   {
					   tag = tag.getLeft();
				   }
				   
				   //Step 3::
				   //connect tag's LHS with LHS of temp
				   tag.setLeft(temp.getLeft());				   
			   }
			   
			   //d-link temp from its LHS and RHS
			   temp.setLeft(null);
			   temp.setRight(null);
			   
			   System.out.println("\tNode deleted...!!!\n");
		   }//node is found
		   
	   }//else !null tree
	}//delete()
	

}
