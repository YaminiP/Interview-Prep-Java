import java.util.Stack;
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
  public static Node root1;
  public static Node root2;
  public static void merge(Node root1, Node root2)
  {
    Stack<Node> s1 = new Stack<Node>();
    Stack<Node> s2 = new Stack<Node>();
    
    Node curr1 = root1;
    Node curr2 = root2;
    
    while(curr1 != null || curr2 !=null || !s1.isEmpty() || !s2.isEmpty())
    {
      if( curr1 != null || curr2 != null)
      {
        	if(curr1 != null)
      		{
        		s1.push(curr1);
        		curr1= curr1.left;
      		}
      
      		if(curr2 != null)
      		{
        		s2.push(curr2);
        		curr2 = curr2.left;
      		}
      }
      else
      {
        if(s1.isEmpty())
        {
          while(!s2.isEmpty())
          {
            curr2 = s2.pop();
            curr2.left = null;
            inOrder(curr2);
          }
          return;
        }
        
        if(s2.isEmpty())
        {
          while(!s1.isEmpty())
          {
            curr1 = s1.pop();
            curr1.left = null;
            inOrder(curr1);
          }
        }
        
        curr1 = s1.pop();
        curr2 = s2.pop();
        
        if(curr1.data < curr2.data)
        {
          System.out.println(curr1.data);
          curr1 = curr1.right;
          s2.push(curr2);
          curr2 = null;
        }
        else
        {
          System.out.println(curr2.data);
          curr2 = curr2.right;
          s1.push(curr1);
          curr1 = null;
        }
      }    
    }
  }
  
  public static void inOrder(Node node)
  {
    if( node == null)
    {
      return;
    }
    
    inOrder(node.left);
    System.out.println(node.data);
    inOrder(node.right);
  }
  
  public static void main(String[] args)
  {
   
    BinaryTree tree1 = new BinaryTree();
    BinaryTree tree2 = new BinaryTree();
    
    tree1.root1 = new Node(3);
    root1.left = new Node(1);
    root1.right = new Node(5);
    
    tree2.root2 = new Node(4);
    root2.left = new Node(2);
    root2.right = new Node(6);
    
    merge(root1, root2);
    
  }
}
