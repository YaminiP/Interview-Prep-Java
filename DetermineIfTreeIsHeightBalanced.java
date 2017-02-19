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


public class Height{
  int height = 0;
}


public class BinaryTree{
  
  Node root;
  
  boolean isBalanced(Node root, Height height)
  {
    
    if(root == null)
    {
      height.height =0;
      return true;
    }
    
    Height lheight = new Height();
    Height rheight = new Height();
    
    boolean l = isBalanced(root.left, lheight);
    boolean r = isBalanced(root.right, rheight);
    
    int lh = lheight.height;
    int rh = rheight.height;
    
    height.height = (lh > rh ? lh : rh) +1;
    
    if((lh-rh) >= 2 || (rh-lh) >= 2)
    {
      return false;
    }
    
    return l && r;
    
  }
  
  
  public static void main(String[] args)
  {
    Height height = new Height();
 
        /* Constructed binary tree is
                   1
                 /   \
                2      3
              /  \    /
            4     5  6
            /
           7         */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        //tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(7);
 
        if (tree.isBalanced(tree.root, height))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
  }
  
}
