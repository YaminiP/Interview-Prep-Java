// For two trees to be mirror images, the following three
        // conditions must be true
        // 1 - Their root node's key must be same
        // 2 - left subtree of left tree and right subtree
        //      of right tree have to be mirror images
        // 3 - right subtree of left tree and left subtree
        //      of right tree have to be mirror images

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
  public static boolean isMirror(Node node1, Node node2)
  {
    if(node1== null && node2 == null)
    {
      return true;
    }
    
    if(node1!=null && node2!=null && (node1.data == node2.data))
    {
      return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
    }
    
    return false;    
  }
  
  public static boolean isSymmetric(Node node)
  {
    return isMirror(root, root);
  }
  
  public static void main(String[] args)
  {
    BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        boolean output = tree.isSymmetric(tree.root);
    	System.out.println(output);
  }
}
