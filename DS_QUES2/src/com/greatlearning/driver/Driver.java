package com.greatlearning.driver;

import com.greatlearning.utils.SkewedTree;
import com.greatlearning.utils.Node;

public class Driver {

	public static void main(String[] args) {
		SkewedTree tree = new SkewedTree();
		tree.node = new Node(50);
		tree.node.leftNode = new Node(30);
		tree.node.rightNode = new Node(60);
		tree.node.leftNode.leftNode = new Node(10);
		tree.node.rightNode.leftNode= new Node(55);
       
        Node headNode =SkewedTree.getSkewed(tree.node);
        if(headNode!=null)
        	SkewedTree.display(headNode);

	}

}
