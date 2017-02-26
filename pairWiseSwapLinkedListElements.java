class Node
{
  int data;
  Node next;
  
  public Node(int data){
    this.data = data;
    next = null;
  }
}

public class LinkedList
{
  
  public static Node head;
  
  public static Node swapNodesPairwise(Node node)
  {
    if(node == null || node.next == null)
    {
      return null;
    }
    
    Node prev = node;
    Node curr = node.next;
    
    node = curr;// Changing head before proceeding for printing the linkedlist
    
    while(true)
    {
      Node next = curr.next;
      curr.next = prev;
      
      //If next is null or next is the last node
      if(next == null || next.next == null)
      {
        prev.next = next;
        break;
      }
      
      
      prev.next = next.next;
      prev = next;
      
      curr = prev.next;
    
    }
    
    return node;
  }
  
  void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    // Driver program to test above functions
    public static void main(String[] args) {
 
        /* The constructed linked list is:
         1->2->3->4->5->6->7 */
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
 
        System.out.println("Linked list before calling pairwiseSwap() ");
        list.printList(head);
        Node st = list.swapNodesPairwise(head);
        System.out.println("");
        System.out.println("Linked list after calling pairwiseSwap() ");
        list.printList(st);
        System.out.println("");
 
    }
}
