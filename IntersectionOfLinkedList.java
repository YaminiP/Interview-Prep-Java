public class ListNode{
  int value;
  ListNode next;
  ListNode(int x)
  {
    value = x;
    next = null; 
  }
}

public class Solution{
ListNode getIntersection(ListNode head1, ListNode head2)
{
    if(head1 == null || head2 == null)
    {
      return;
    }
    
    ListNode p1 = head1;
    ListNode p2 = head2;
    int len1;
    int len2;
    while(p1!=null)
    {
      len1++;
      p1 = p1.next;
    }
    
    while(p2!=null)
    {
      len2++;
      p2 = p2.next;
    }
    
    p1 = head1;
    p2 = head2;
    
    if(len1 > len2)
    {
      int i = 0;
      int diff = len1 - len2;
      while( i < diff)
      { 
        p1 = p1.next;
        i++;
      }
    }
    else
    {
      int i = 0;
      int diff = len2 - len1;
      while(i < diff)
      { 
        p2 = p2.next;
        i++;
      }
    }
    
    while(p1!= null || p2!= null)
    {
      if(p1.value == p2.value)
      {
        return p1;
      }
      
      p1= p1.next;
      p2 =p2.next;
    }

  return null;
}
}
