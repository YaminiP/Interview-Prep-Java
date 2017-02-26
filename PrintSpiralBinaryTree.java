import java.util.*;
class Node
{
  int data;
  Node left;
  Node right;
  public Node(int data)
  {
    this.data = data;
    left = null;
    right = null;
  }
}

public class SpiralTree
{
  static Node root;
  
  public static void PrintSpiral(Node node)
  {
    if(node == null)
    {
      return;
    }
    
    Stack<Node> s1 = new Stack<Node>();
    Stack<Node> s2 = new Stack<Node>();
    
    s1.push(node);
    
    while(!s1.empty() || !s2.empty())
    {
      while(!s1.empty())
      {
        Node temp = s1.peek();
        s1.pop();
        System.out.println(temp.data);
        
        if(temp.right != null)
        {
          s2.push(temp.right);
        }
        if(temp.left!=null)
        {
          s2.push(temp.left);
        }
      }
      
      while(!s2.empty())
      {
        Node temp = s2.peek();
        s2.pop();
        System.out.println(temp.data);
        
        if(temp.left!=null)
        {
          s1.push(temp.left);
        }
        
        if(temp.right!=null)
        {
          s1.push(temp.right);
        }
      }
    }
  }
  
  public static void main(String[] args) 
    {
        SpiralTree tree = new SpiralTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(4);
        System.out.println("Spiral Order traversal of Binary Tree is ");
        tree.PrintSpiral(root);
    }
  
}

