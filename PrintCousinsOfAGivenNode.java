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
  
  public static int getLevel(Node root, Node target, int level)
  {
    if(root == null || target == null)
    {
      return 0;
    }
    
    if(root == target)
    {
      return level;
    }
    

    int downLevel = getLevel(root.left, target,level+1);
    if(downLevel!=0)
    {
      return downLevel;
    }
    
    return(getLevel(root.right,target,level+1));
  }
  
           
  public static void printLevelNodes(Node root, Node node, int level)
  {
    if(root == null || level < 2)
    {
      return;
    }
    
    if(level == 2 )
    {
      if(root.left == node || root.right == node)
      {
        return;
      }
      
      if(root.left!=null)
      {
        System.out.println(root.left.data);
      }
      if(root.right!=null)
      {
        System.out.println(root.right.data);
      }
    }
      
      if(level > 2)
      {
        printLevelNodes(root.left,node,level-1);
        printLevelNodes(root.right,node,level-1);
      }
    }
                     
  public static void printCousins(Node root, Node target)
  {
        
    int level = getLevel(root, target, 1);
    
    //System.out.println(level);
    printLevelNodes(root, target, level);
  }
            
  public static void main(String[] args)
  {
    root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.left.right.right = new Node(15);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    root.right.left.right = new Node(8);
 
    printCousins(root, root.left.right);
    
  }    
}
