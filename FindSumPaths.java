import java.util.LinkedList;

/**
 * You are given a binary tree in which each node contains a
 * value. Design an algorithm to print all paths which sum to
 * a given value. The path does not need to start or end at
 * the root or a leaf.
 */

class Node{
  
  int data;
  Node left;
  Node right;
  
  public Node(int data)
  {
    this.data = data;
    left = right = null;
  }
  
}

public class SumofAnyPath{
  
  public static LinkedList<LinkedList<Node>> findSumPaths(Node n, int target)
  {
		LinkedList<LinkedList<Node>> result = new LinkedList<LinkedList<Node>>();
    	findSumPaths(n, target, new LinkedList<Node>(), result);
    	return result;
  }
  
  
  @SuppressWarnings("unchecked")
  public static void findSumPaths(Node n, int target, LinkedList<Node> path, LinkedList<LinkedList<Node>> result)
  {
    if(n == null)
    {
      return;
    }
      
    int sum = 0;
    path.add(n);
    
    LinkedList<Node> nodes = new LinkedList<Node>();   
    for(int i = path.size() - 1; i >=0; --i)
    {
      Node node = path.get(i);
      nodes.add(node);
      sum += node.data;
      
      if(sum == target)
      {
        result.add((LinkedList<Node>) nodes.clone()); 
      }
      
    }
      
      findSumPaths(n.left, target, path, result);
      findSumPaths(n.right, target, path, result);
  }
  
  public static void main(String args[])
  {
    Node n1 = new Node(1), n2 = new Node(2), n3 = new Node(3),
                 n4 = new Node(4), n5 = new Node(5), n6 = new Node(6),
                 n7 = new Node(7), n8 = new Node(8), n9 = new Node(9);
        n4.left = n5; n4.right = n2; n5.left = n1; n5.right = n3; n1.right = n8;
        n3.left = n6; n2.right = n7; n7.left = n9;
        LinkedList<LinkedList<Node>> result = findSumPaths(n4, 9);
        printResult(result);
       // result = findSumPaths(n4, 6);
       // printResult(result);
  }
  
  public static void printResult(LinkedList<LinkedList<Node>> result)
  {
    for(LinkedList<Node> path : result)
    {
      for(Node n : path)
      {
        System.out.println(n.data + " ");
      }
      
      System.out.println("\n");
    }
  }
}
