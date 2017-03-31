//Given a binary search tree whose nodes are integers, find the frequency of occurrence of each digit in the tree.


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
  
  public static Node root;
  public static int[] freqCount = new int[10];
  
  public static void TreeFreq(Node root)
  {
    if(root == null)
    {
      return;
    }
    
    int number = root.data;
    do
    {
      freqCount[number % 10]++;  //eg : 15 % 10 = 5.. so freq of 5 = 1
      number /= 10;  // 15/10 = 1 ... so freq of 1 = 1;
    }while(number != 0);
    
    TreeFreq(root.left);
    TreeFreq(root.right);
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
    
 	TreeFreq(root);
    
    for(int i = 0 ; i < 10; i++)
    {
      System.out.println(freqCount[i]);
    }
 
    
  }  
  
  
}
