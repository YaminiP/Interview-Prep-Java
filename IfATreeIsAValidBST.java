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
  
  public static Node root;
  public static boolean isBST()
  {
    return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  
  public static boolean isBSTUtil(Node root, int min, int max)
  {
    if(root == null)
    {
      return true;
    }
    
    if(root.data < min || root.data > max)
    {
      return false;
    }
    
    return(isBSTUtil(root.left, min, root.data-1) && isBSTUtil(root.right, root.data+1, max));
    
  }
  
  public static void main(String[] args)
  {
    /*
                   15
                /     \
              10      20
             / \     /  \
            8  12   16  25    */
    root =  new Node(15);
    root.left = new Node(10);
    root.right = new Node(20);
    root.left.left = new Node(8);
    root.left.right = new Node(12);
    root.right.left = new Node(16);
    root.right.right = new Node(25);
    
 
 
    System.out.println(isBST());
  }  
  
  
}
