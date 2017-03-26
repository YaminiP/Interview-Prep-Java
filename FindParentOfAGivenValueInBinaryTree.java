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
  public static int findParent(Node node, int value)
  {
    if(node == null || node.data == value)
    {
      return 0;
    }
    
    LinkedList<Node> queue = new LinkedList<Node>();
    
    queue.add(node);
    
    while(!queue.isEmpty())
    {
      Node p = queue.pollFirst();
      
      if(p.left!= null)
      {
        if(p.left.data == value)
        {	
          return p.data;
        }
        else
        {
          queue.add(p.left);
        }
      }
      
      if(p.right!=null)
      {
        if(p.right.data == value)
        {
          return p.data;
        }
        else
        {
          queue.add(p.right);
        }
      }
    }
    return 0;
  }
  
  public static void main(String[] args)
  {
   
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(5);
        tree.root.left = new Node(2);
        tree.root.right = new Node(13);
    
    int output = findParent(root, 13);
    System.out.println(output);
  }
}
