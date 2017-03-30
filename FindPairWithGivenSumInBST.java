import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
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
  
  public static boolean isPairPresent(Node root, int target)
  {
    Stack<Node> s1 = new Stack<Node>();
    Stack<Node> s2 = new Stack<Node>();
    
    boolean done1 = false;
    boolean done2 = false;
    
    int val1 = 0;
    int val2 = 0;
    
    Node curr1 = root;
    Node curr2 = root;
    
    while(true)
    {
      while(done1 == false)
      {
        if(curr1 != null)
        {
          s1.push(curr1);
          curr1 = curr1.left;
        }
        else
        {
          if(s1.isEmpty())
          {
            done1= true;
          }
          else
          {
            curr1 = s1.pop();
            val1 = curr1.data;
            curr1 = curr1.right;
            done1 = true;
          }
        }        
      }
      
      while(done2 == false)
      {
        if(curr2 != null)
        {
          s2.push(curr2);
          curr2 = curr2.right;
        }
        else
        {
          if(s2.isEmpty())
          {
            done2=true;
          }
          else
          {
            curr2 = s2.pop();
            val2 = curr2.data;
            curr2 = curr2.left;
            done2 = true;
          }
        }
       }
    
     if((val1 != val2) && ((val1 + val2) == target))
     {
       System.out.println("pair found" + val1 + "+" + val2 + "=" + target);
       return true;
     }
      
     if((val1 + val2) < target)
     {
       done1 = false;
     }
    
     if((val1 + val2) > target)
     {
       done2 = false;
     }
    
     if(val1 >= val2)
     {
       return false;
     }
    }
  }
  
  public static void main(String[] args)
  {
    /*
                   15
                /     \
              10      20
             / \     /  \
            8  12   16  25    */
    Node root =  new Node(15);
    root.left = new Node(10);
    root.right = new Node(20);
    root.left.left = new Node(8);
    root.left.right = new Node(12);
    root.right.left = new Node(16);
    root.right.right = new Node(25);
 
    int target = 33;
    if (isPairPresent(root, target) == false)
    {
        System.out.println("\n No such values are found\n");
    }
  }  
  
  
}
