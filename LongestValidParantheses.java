//Given a string containing just the characters ’(’ and ’)’, find the length of the longest valid (well-formed) parentheses substring.
//For "(()", the longest valid parentheses substring is "()", which has length = 2. An- other example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
import java.util.HashMap;
import java.lang.Character;
import java.util.Stack;
public class LongestValidParanthesis
{
  
  public static int LongestValid(String s)
  {
    int maxLen = 0;
    int last = -1;
    
    Stack<Integer> stack = new Stack<Integer>();
    
    for(int i = 0; i < s.length(); i++)
    {
      if(s.charAt(i) == '(')
      {
        stack.push(i);
      }
      else
      {
        if(stack.empty())
        {
          last = i;
        }
        else
        {
          stack.pop();
          if(stack.empty())
          {
            maxLen = Math.max(maxLen, i - last);
          }
          else
          {
            maxLen = Math.max(maxLen, i - stack.peek());
          }
        }
      }
    }
    return maxLen;
  }
  
  
  public static void main(String[] args)
  {
    System.out.println(LongestValid(")()"));
    System.out.println(LongestValid(")()())"));                  
  }
}
