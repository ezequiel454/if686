package dia1;
import java.util.Random;

import dia1.TreeNode;


public class Tree<T extends Comparable <T> > {    
	
	private TreeNode< T > root;
	
	
	
	public Tree (){
		root = null;
	}
	
	public void insertNode (T insertValue){
		if (root == null){
			root = new TreeNode<T>(insertValue);
		}else{
			root.insert(insertValue);
		}
	}
	
	public void inorderTraversal(){
		inorderHelper(root);
	}
	
	
	
	
	private void inorderHelper (TreeNode < T > node){
		if (node == null){
			return;
		}
		
		inorderHelper(node.leftNode);
		System.out.printf("%s ", node.data);
		inorderHelper(node.rightNode);
	}
	   
}

