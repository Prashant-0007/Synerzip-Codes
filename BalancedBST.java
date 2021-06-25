/*
What is BST ?
-> It must be binary tree first
->then,First starting node is root node.
->Left child of root node must be less than equal to root node
->Right child of root node must be greater than equal to root node.

What is height of tree?
->number of edges from root node to leaf node.Leaf node dont have any child.

what is Balanced Binary Search Tree?
->Height of left subtree or right subtree of BST from root node must be differ max 1 or 0 then 
it called as balanced BST.

how to traversing tree or BST?
->there are 3 differ ways to traverse each node of tree by using that we can check weather tree balanced or not.
->1.Preorder:Root Left Right
->2.Inorder:Left Root Right
->3.Postorder:Left Right Root

***Strategy for Balanced BST:
	1.Calculate mid of sorted array.
	2.Recursive call ,do same for subtrees
		a.start index to mid-1 for left subtree.
		b.mid+1 to End index for right subtree.

*/
import java.util.*;
import java.lang.*;
import java.io.*;

//Create Binary tree,
class Node {
    
	// data must be int type	
    int data;
	//
    Node left, right;	//doubly linked list  -> left|data|right
    
	
    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinarySearchTree {
      
    static Node root;
  
    
    Node sortedArrayToBST(int arr[], int start, int end) {
  
       
        if (start > end) {
            return null;
        }
  
       
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
  
       
        node.left = sortedArrayToBST(arr, start, mid - 1);
  
        
        node.right = sortedArrayToBST(arr, mid + 1, end);
          
        return node;
    }
  
    
    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
      
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
		//for to pass sorted array.
        int arr[] = new int[]{6, 7, 8, 9, 10, 11, 12};
        int n = arr.length;
        root = tree.sortedArrayToBST(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed Balanced BST");
        tree.preOrder(root);
    }
}

/*Code OUTPUT:
C:\Users\hp\Desktop\Synerzip\Codes>javac BalancedBST.java

C:\Users\hp\Desktop\Synerzip\Codes>java BinarySearchTree
Preorder traversal of constructed Balanced BST
9 7 6 8 11 10 12
C:\Users\hp\Desktop\Synerzip\Codes>

Tree Representation of above output
					9
				7			11
			6		8	10		12	
						

*/

  
  