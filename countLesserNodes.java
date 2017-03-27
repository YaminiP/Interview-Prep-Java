/*
Assuming you have a binary tree which stores integers, count the number of nodes whose value is lower than the value of its upper nodes.
*/

/*
In a binary tree there can be any value on any node, so we need to keep track of the Min. value found so far for that depth branch and propagate it until you reach the leafs, be aware not to count duplicates in the way back, a HashSet would help to avoid that, 
and the final HashSet will hold all Nodes which are lesser than all their possible parents.
*/
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
public class Node
{
  int data;
  Node left;
  Node right;
  Node(int data)
  {
    this.data = data;
    left = null;
    right = null;
  }
}


public class BinaryTree
{
  public static Node root;
  
  
  public static int countLesserNodes(Node root)
  {	
    if(root == null)
    {
      return 0;
    }
    
    Set<Node> set = new HashSet<Node>();
    
    countNumLesserNodes(root.left, root.data, set);
    countNumLesserNodes(root.right, root.data,set);
    
    return set.size();
        
  }
  
  public static void countNumLesserNodes(Node root, int pVal, Set<Node> set)
  {
    if(root == null)
    {
      return;
    }
    
    if(root.data < pVal)
    {
      set.add(root);
      
      pVal = root.data;
    }
    
    countNumLesserNodes(root.left, pVal, set);
    countNumLesserNodes(root.right, pVal, set);
  }
  
  
  public static void main(String[] args)
  {
   		
    BinaryTree tree = new BinaryTree();
         
        /* Constructed binary tree is
             10
            /  \
          8     2
         /
        3
        */
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
  
        int output = countLesserNodes(root);
    	System.out.println(output);
  
    
  }
}
