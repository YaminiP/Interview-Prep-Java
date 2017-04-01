import java.util.Queue;
import java.util.LinkedList;
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
  
  public static void mirror()
  {
     root= mirror(root); 
  }
  
  public static Node mirror(Node node)
  {
    if(node == null)
    {
      return node;
    }
        
    Node left = mirror(node.left);
    Node right = mirror(node.right);
    
    node.left = right;
    node.right = left;
    
    return node;
  }
  
  public static void inOrder()
    {
        inOrder(root);
    }
 
  public static void inOrder(Node node)
    {
        if (node == null)
            return;
 
        inOrder(node.left);
        System.out.print(node.data + " ");
 
        inOrder(node.right);
    }
            
  public static void main(String[] args)
  {
    BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :");
        tree.inOrder();
        System.out.println("");
 
        /* convert tree to its mirror */
        tree.mirror();
 
        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : ");
        tree.inOrder();
    
  }    
}
