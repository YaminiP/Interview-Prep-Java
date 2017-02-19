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

public class BinaryTree{
   
  static Node root;
  public static Node SortedArrayToBST(int [] A, int start, int end)
  {
    if(start > end)
      return null;
    
    int mid = (start + end) / 2;
    
    Node node = new Node(A[mid]);
    
    node.left = SortedArrayToBST(A, start, mid -1);
    node.right = SortedArrayToBST(A, mid +1, end);
    
    return node;
  }
  
  public static void preOrder(Node node)
  {
    if(node == null)
    	return;
    System.out.println(node.data);
    preOrder(node.left);
    preOrder(node.right);
  }
  
  public static void main(String[] args)
  {
    BinaryTree bi = new BinaryTree();
    int[] A = {1,2,3,4,5,6,7};
    int n = A.length;
    
    root = bi.SortedArrayToBST(A, 0, n-1);
    preOrder(root);   
    
  }
}

// Time complexity O(n)
