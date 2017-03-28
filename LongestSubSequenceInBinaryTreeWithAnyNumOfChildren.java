//in a tree any root can have any number of children. 
//Every node has an integer value. Find the maximum length on consecutive number sequence anywhere in the tree. 
//For example if root is 2 and one child is 3, its child is 4 its child is 6 then max length will be 3.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
public class Node
{
  private int data;
  private LinkedList<Node> children;
  public int getData()
  {
    return data;
  }
  public void setData(int data)
  {
    this.data = data;
  }
  
  public LinkedList<Node> getChildren()
  {
    return children;
  }
  
  public void setChildren(LinkedList<Node> children)
  {
    this.children = children;
  }  
}


public class BinaryTree
{
   
  public static int getLongest(Node root, List<Node> longestSoFar, List<Node> currentSequence)
  {
    if(root == null)
    {
      return 0;
    }
    
    for(Node child: root.getChildren())
    {
      if(child.getData() != 1 + root.getData())
      {
        currentSequence = new ArrayList<Node>();
      }
      else
      {
        longestSoFar.add(child);
      }
      
      if(currentSequence.size() > longestSoFar.size())
      {
        longestSoFar = currentSequence;
      }
      else
      {
        getLongest(child, longestSoFar, currentSequence);
      }
    }
    
    currentSequence.remove(currentSequence.get(currentSequence.size() - 1));
    return longestSoFar.size();
  }
  
  
  
  
  public static void main(String[] args)
  {
   		
    /**
		 *      3
		 *    / | \
		 *   2  5  8
		 *     / \
		 *    1   6
		 *         \
		 *          7
		 *           \
		 *            9
		 */
		Node n1 = new Node();
		n1.setData(1);
		Node n2 = new Node();
		n2.setData(2);
		Node n3 = new Node();
		n3.setData(3);
		Node n4 = new Node();
		n4.setData(4);
		Node n5 = new Node();
		n5.setData(5);
		Node n6 = new Node();
		n6.setData(6);
		Node n7 = new Node();
		n7.setData(7);
		Node n8 = new Node();
		n8.setData(8);
		Node n9 = new Node();
		n9.setData(9);
		
		LinkedList<Node> c1 = new LinkedList<Node>();
		c1.add(n2);
		c1.add(n5);
		c1.add(n8);
		n3.setChildren(c1);
		
		LinkedList<Node> c2 = new LinkedList<Node>();
		c2.add(n1);
		c2.add(n6);
		n5.setChildren(c2);
		
		LinkedList<Node> c3 = new LinkedList<Node>();
		c3.add(n7);
		n6.setChildren(c3);
		
		LinkedList<Node> c4 = new LinkedList<Node>();
		c4.add(n9);
		n7.setChildren(c4);
    
		List<Node> longestSoFar = new ArrayList<Node>();
    	List<Node> currentSequence = new ArrayList<Node>();
    	System.out.println(getLongest(n3, longestSoFar, currentSequence));
    	
  
    
  }
}
