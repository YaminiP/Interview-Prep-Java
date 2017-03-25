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
  
  public static int size()
  {
    return (size(root));
  }
  public static int size(Node node)
  {
    if( node ==  null)
    {
      return 0;
    }
    
    return (size(node.left) + 1 + size(node.right));
  }
    
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("The size of binary tree is : "
                            + tree.size());
    }
        
}
