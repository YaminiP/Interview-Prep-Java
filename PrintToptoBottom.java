import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
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
  
  public static void printTopToBottom(Node curr, Map<Node,Node> parent)
  {
    Stack<Node> stack = new Stack<Node>();
    
    while(curr!= null)
    {
      stack.push(curr);
      curr = parent.put(curr);
    }
    
    while(!stack.isEmpty())
    {
      curr = stack.pop();
      //stack.pop();
      System.out.println(curr.data);
    }
  }
  
  public static void printRootToLeaf(Node root)
  {
    
    if(root == null)
    {
      return;
    }
    
    Stack<Node> stack = new Stack<Node>();
    
    stack.push(root);
    
    Map<Node,Node> parent = new HashMap<Node,Node>();
    
    parent.put(root) = null;
    
    while(!stack.isEmpty())
    {
      Node current = stack.pop();
      
      if(current.left == null && current.right == null)
      {
      	printTopToBottom(current,parent);
      }
    
      if(current.right!= null)
      {
      	parent.put(current.right) = current;
        stack.push(current.right);		     
      }
      
      if(current.left != null)
      {
        parent.put(current.left) = current;
        stack.push(current.left);
      }
    }
    
  }
  
  public static void main(String[] args)
  {
    /* Constructed binary tree is
         10
        /  \
       8    2
      / \   /
     3   5 2     */
    Node root = new Node(10);
    root.left = new Node(8);
    root.right = new Node(2);
    root.left.left = new Node(3);
    root.left.right = new Node(5);
    root.right.left = new Node(2);
 
    printRootToLeaf(root);
  }
  
  
}
