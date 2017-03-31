 /*         1
          /  \
        2    6
       /        \
     3          7
    /  \
  4    5
  
  
  1
   \
     2
       \
         3
           \
             4
               \
                5
                  \
                    6
                      \
                       7 */
 //Given a binary tree. Modify it in such a way that after modification you can have a preorder traversal of it using only right pointers. 
 //During modification you can use right as well as left pointers. 
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
  
  public static Node transform(Node root)
  {
    Node right = root.right;
    Node rightMost = root;
    
    if(root.left!= null)
    {
      rightMost = transform(root.left);
      root.right = root.left;
      root.left = null;
    }
    
    if( right == null)
    {
      return rightMost;
    }
    
    rightMost.right = right;
    rightMost = transform(right);
    return rightMost;
    
  }
  
  public static void main(String[] args)
  {
    /*
                   15
                /     \
              10      20
             / \     /  \
            8  12   16  25    */
    root =  new Node(15);
    root.left = new Node(10);
    root.right = new Node(20);
    root.left.left = new Node(8);
    root.left.right = new Node(12);
    root.right.left = new Node(16);
    root.right.right = new Node(25);

    
	Node result = transform(root);
    System.out.println(result.data);
 
    
  }  
  
  
}
