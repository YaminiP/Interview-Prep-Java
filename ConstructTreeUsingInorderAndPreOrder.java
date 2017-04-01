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
  public static int preIndex;
  
  public static Node buildTree(int in[], int pre[], int inStrt, int inEnd)
  {
    if(inStrt > inEnd )
    {
      return null;
    }
    
    Node tNode = new Node(pre[preIndex++]);
    
    if(inStrt == inEnd)
    {
      return tNode;
    }
    
    int index = search(in, inStrt, inEnd, tNode.data);
    
    tNode.left = buildTree(in, pre, inStrt, index -1);
    tNode.right = buildTree(in,pre, index+1, inEnd);
    
    return tNode;
  
  }
  
  public static int search(int arr[], int inStrt, int inEnd, int data)
  {
    int i;
    for(i = inStrt; i < inEnd; i++)
    {
      if(arr[i] == data)
      {
        return i;
      }
    }
    return i;
  }
  
  public static void printInorder(Node node) 
  {
      if (node == null)
            return;
  
        /* first recur on left child */
        printInorder(node.left);
  
        /* then print the data of node */
        System.out.print(node.data + " ");
  
        /* now recur on right child */
        printInorder(node.right);
   }
  
  public static void main(String[] args)
  {
    BinaryTree tree = new BinaryTree();
        int in[] = new int[]{13,14,23,25,30,40,45,50,60};
        int pre[] = new int[]{30,13,23,14,25,50,45,40,60};
        int len = in.length;
        Node root = tree.buildTree(in, pre, 0, len - 1);
  
        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(root);
  }
  
  
}
