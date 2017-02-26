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

public class SearchKthLargestElementInBST
{
  
 public static int maxNum = 0;
  
  public static Node findKLargest(Node root, int k)
	{
		if(root==null)
        {
          return null;
        }
    
		Node right=findKLargest(root.right, k);
    
        if(right!=null) 
        {
          return right;
        }
    
		maxNum++; 
    
		if(maxNum==k)
        {
          return root;
        }
    
		Node left=findKLargest(root.left, k);
		if(left!=null) 
        {
          return left;
        }
    
		return null; 
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

    
    SearchKthLargestElementInBST bst = new SearchKthLargestElementInBST();

   maxNum=0; 
   Node resultK=findKLargest(root, 2);
		System.out.println(resultK.data);
  }
}

