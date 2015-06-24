package dia1;

import java.util.Random;

import dia1.TreeNode;
import dia1.Tree;



public class ArvoreJava {

	public static void main (String[] args){
		Thread[] t = new Thread[50];
		Tree <Integer> tree = new Tree <Integer> ();
		
		for (int i = 0; i<50 ; i++ ) {
			t[i] = new InsereT (tree);
			System.out.println(100000000);
			t[i].start();
		}
		
		
	}
}


