class TreeNode
{
  int value;
  TreeNode left;
  TreeNode right;
  
  public TreeNode(int data)
  {
    value = data;
    left = right = null;
  }
}

public class BinaryTree{
  public static boolean isSubTree(TreeNode n1, TreeNode n2)
  {
    if(n2 == null)
    {
      return true;
    }
    
    if(n1 == null)
    {
      return false;
    }
    
    if(isIdentical(n1,n2))
    {
      return true;
    }
    else
    {
      return (isSubTree(n1.left, n2)) || (isSubTree(n1.right, n2)) ;                     
    }
  }
  
 public static boolean isIdentical(TreeNode n1, TreeNode n2)
  {
    if(n1 == null && n2 == null)
    {
      return true;
    }
    
    if(n1 == null || n2 == null)
    {
      return false;
    }
    
    if(n1.value != n2.value)
    {
      return false;
    }
    else
    {
      return (isIdentical(n1.left, n2.left)) && (isIdentical(n1.right, n2.right)) ; 
    }
  }
  
  public static void main(String args[])
  {
    TreeNode n1 = new TreeNode(1), n2 = new TreeNode(2), n3 = new TreeNode(3),
                 n4 = new TreeNode(4), n5 = new TreeNode(5), n6 = new TreeNode(6),
                 n7 = new TreeNode(7);
        n2.left = n1; n2.right = n3; n4.left = n2; n4.right = n5; n3.left = n6;
        n5.right = n7;
        System.out.println(isSubTree(n4, n2));
        System.out.println(isSubTree(n2, n5));
  }
}
