package dia1;

public class TreeNode<T extends Comparable < T >> {  
	
	TreeNode <T> leftNode;
	T data;
	TreeNode <T> rightNode;
	
	public TreeNode (T nodeData){
		data = nodeData;
		leftNode = rightNode = null;
	}
	
    public synchronized void insert (T insertValue){
    	
    	if (insertValue.compareTo (data) < 0){
    		if(leftNode == null){
    			leftNode = new TreeNode<T>(insertValue);
    		}
    		
    		else{
    			leftNode.insert(insertValue);
    		}
    	}else{
    		if (rightNode == null){
    			rightNode = new TreeNode<T>(insertValue);
    		}else{
    			rightNode.insert(insertValue);
    		}
    	}
    }
	
}


