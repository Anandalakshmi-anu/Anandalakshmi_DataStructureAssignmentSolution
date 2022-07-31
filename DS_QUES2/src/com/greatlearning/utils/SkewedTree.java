package com.greatlearning.utils;

public class SkewedTree {
	public Node node;
	static Node lastNode=null;
	static Node headNode=null;
	
	public static Node getSkewed(Node root) {
		if(root==null)
			return null;
		
		getSkewed(root.leftNode);
	    Node right = root.rightNode;
	    
	    if(headNode == null)
	    {
	        headNode = root;
	        root.rightNode=null;
	        lastNode = root;
	    }
	    else
	    {
	        lastNode.rightNode=root;
	        root.leftNode=null;
	        lastNode = root;
	    }
	    
	    getSkewed(right);
	    return headNode;
	}
	
	public static void display(Node root)
    {
        if(root == null)
            return;
        
        System.out.print(root.nodeData + " ");
        display(root.rightNode);       
    }

}
