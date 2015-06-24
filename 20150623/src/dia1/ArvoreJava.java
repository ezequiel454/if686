package dia1;

import java.util.Random;

import dia1.TreeNode;
import dia1.Tree;



public class ArvoreJava {

	public static void main (String[] args){
		Thread[] t = new Thread[50];
		Tree <Integer> tree = new Tree <Integer> ();
		
		for (int i = 0; i<2 ; i++ ) {
			t[i] = new InsereT (tree);
			System.out.println(100000000);
			t[i].start();
		}
		
		for(int i = 0; i < 2; i++){
			try {
				t[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}


class InsereT extends Thread {
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
			System.out.println(value + "/n");
			System.out.println("ok ne so me da 1 plx ");
			tree.insertNode(value);
			System.out.println("espaco e bom");
			tree.inorderTraversal();
		}

	}
}

