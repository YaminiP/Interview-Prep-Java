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


public class Sum
{
  int sum = 0;
}
public class BinaryTree
{
  public static Node root;
  public static Sum summ = new Sum();
  
  public static void addGreaterUtil(Node node, Sum sum_ptr)
  {
    if(node == null)
    {
      return;
    }
    
    addGreaterUtil(node.right, sum_ptr);
    
    sum_ptr.sum = sum_ptr.sum + node.data;
    
    node.data = sum_ptr.sum;
    
    addGreaterUtil(node.left, sum_ptr);
    
  }
  
  public static Node addGreater(Node node)
  {
    addGreaterUtil(node, summ);
    return node;
  }
  
  public static void printInorder(Node node)
  {
    if(node == null)
    {
      return;
    }
    
    printInorder(node.left);
    System.out.println(node.data + " ");
    printInorder(node.right);
  
  }
  
  public static void main(String[] args)
  {
    BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(2);
        tree.root.right = new Node(13);
 
        System.out.println("Inorder traversal of given tree ");
        tree.printInorder(root);
        Node node = tree.addGreater(root);
        System.out.println("");
        System.out.println("Inorder traversal of modified tree ");
        tree.printInorder(node);
  }
}
