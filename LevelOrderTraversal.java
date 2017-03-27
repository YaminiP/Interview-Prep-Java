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
  
  public static void printLevelOrder()
  {
    if(root == null)
    {
      return;
    }
    
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    
    while(!q.isEmpty())
    {
      Node tempNode = q.poll();
      
      System.out.println(tempNode.data);
      
  	  if(tempNode.left != null)
      {
        q.add(tempNode.left);
      }
      
      if(tempNode.right != null)
      {
        q.add(tempNode.right);
      }
    }
  }
  
  public static void main(String[] args)
  {
   		BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    
    
  }
}
