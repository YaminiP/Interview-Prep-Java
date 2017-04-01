import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Node
{
  int data;
  Node left;
  Node right;
  Node(int data)
  {
    this.data = data;
  }  
}

public class BinaryTree
{
  public static Node root;
  
  public static ArrayList<Node> getExtremeNodes(Node root)
  {
    ArrayList<Node> result = new ArrayList<Node>();
    Queue<Node> q = new LinkedList<Node>();
    
    int expectedCurrLevel = 1; 
    int expectedNextLevel = 0;
    int nodesCurrentLevel = 0;
    boolean toggleDirection = false;
    
    q.add(root);
    while(!q.isEmpty())
    {
      Node node = q.poll();
      nodesCurrentLevel++;
      
      if(node.left!=null)
      {
        q.add(node.left);
        expectedNextLevel++;
      }
      
      if(node.right!=null)
      {
        q.add(node.right);
        expectedNextLevel++;
      }
      
      if(nodesCurrentLevel == 1 && nodesCurrentLevel != expectedCurrLevel)
      {
        if(!toggleDirection)
        {
          result.add(node);
        }
        
      }
      else if( nodesCurrentLevel == expectedCurrLevel)
      {
        if(toggleDirection)
        {
          result.add(node);
        }
        toggleDirection = !toggleDirection;
        expectedCurrLevel = expectedNextLevel;
        nodesCurrentLevel = 0;
        expectedNextLevel = 0;
      }
    }
    
    return result;
  }
  
  public static void main(String[] args)
  {
    BinaryTree tree = new BinaryTree();
    
    tree.root = new Node(10);
    root.left = new Node(5);
    root.right = new Node(11);
    root.left.left = new Node(9);
    root.left.right = new Node(20);
    root.right.left = new Node(15);
    root.right.right = new Node(25);
    
    
    ArrayList<Node> result = getExtremeNodes(root);
    
    for(Node n : result)
    {
      System.out.println(n.data);
    }
    
  }
  
  
}
