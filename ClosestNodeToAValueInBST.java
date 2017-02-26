import java.lang.*;
class Node
{
  int data;
  Node left;
  Node right;
  public Node(int item)
  {
    data = item;
    left = null;
    right = null;
  }
}

public class ClosestNodeToAValueInBST
{
   public static int min = Integer.MAX_VALUE;
  public static Node findClosest(Node root, int k)
  {
    Node pClosest = null;
	Node node = root;
    while(node != null)
    {
      int distance = Math.abs(node.data - k);
      if(distance < min)
      {
        min = distance;
        pClosest = node;
      }

      if(distance == 0)
      {
        break;
      }
      
      if(node.data < k)
      {
        node = node.right;
      }
      else if( node.data > k)
      {
        node = node.left;
      }
    }
    
    return pClosest;
    

  }
	
  
  public static void main(String args[])
  {
    Node root = new Node(50);
    Node n30 = new Node(30);
    Node n70 = new Node(70);
    Node n20 = new Node(20);
    Node n40 = new Node(40);
    Node n60 = new Node(60);
    Node n80 = new Node(80);
    
    root.left = n30;
    root.right = n70;
    
    n30.left = n20;
    n30.right = n40;
    
    n70.left = n60;
    n70.right = n80;

    
    ClosestNodeToAValueInBST bst = new ClosestNodeToAValueInBST();

   
   Node result=findClosest(root, 24);
   System.out.println(result.data);
  }
}

