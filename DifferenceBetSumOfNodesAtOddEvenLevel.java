//You are given a function calcDifference which takes in the root pointer of a binary tree as it's input. 
//Complete the function to return the sum of values of nodes at odd height - sum of values of node at even height. 
//Consider the root node is at height 1 

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
  
  public static int calDiff(Node root)
  {
    if(root == null)
    {
      return 0;
    }
    
    int sum = 0;
    int flip = 1;
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    int size = q.size();
    while(size > 0)
    {
      for(int i = 0; i < size; i++)
      {
        Node node = q.remove();
        sum = sum + node.data * flip;
        if(root.left != null)
        {
          q.add(root.left);
        }
        if(root.right != null)
        {
          q.add(root.right);
        }
      }
        
        size = q.size();
        flip = flip * -1;
      
    }
    
    return sum;
    
  }
            
  public static void main(String[] args)
  {
    root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.left.right.right = new Node(15);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    root.right.left.right = new Node(8);
 
    System.out.println(calDiff(root));
    
  }    
}
