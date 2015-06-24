package dia1;

import java.util.Random;
import dia1.*;


public class InsereT extends Thread {
	Tree <Integer> tree = new Tree <Integer> ();
	int value;
	Random randomNumber = new Random();

	/*
	public InsereT (){
		for (int i = 0; i < 5 ; i++) {
			value = randomNumber.nextInt(1000);
			//System.out.println(value);
			tree.insertNode(value);
			//tree.inorderTraversal();
		}
		
	}
*/
	public InsereT (Tree <Integer> tre){
		tree = tre;
	}
	
	
	public void run (){
		
		for (int i = 0; i < 5 ; i++) {
			value = randomNumber.nextInt(1000);
			System.out.println(value);
			tree.insertNode(value);
		//	tree.inorderTraversal();
		}

	}
}