package tree;

public class BST_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head= new TreeNode();
		head.CreateBinaryTree();
		head.CreateBinaryTree();
		head.CreateBinaryTree();
		head.CreateBinaryTree();
		head.CreateBinaryTree();
		head.CreateBinaryTree();
		head.CreateBinaryTree();
		head.CreateBinaryTree();
		head.CreateBinaryTree();
		head.CreateBinaryTree();
	
	
		System.out.println("preorder \n");
		head.preOrder(head.getRoot());
		
		
		System.out.println("Inorder \n");
		head.inOrder(head.getRoot());
		
		System.out.println("postorder \n");
		head.postOrder(head.getRoot());
		
	}
	

}
