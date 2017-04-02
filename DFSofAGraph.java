import java.util.*;
import java.io.*;

public class Graph
{
   private int V;
  private LinkedList<Integer> adj[];
  
  Graph(int v)
  {
    V=v;
    adj = new LinkedList[v];
    for(int i =0; i< v; ++i)
    {
      adj[i] = new LinkedList();
    }
  }

public void addEdge(int v, int w)
{
  adj[v].add(w);  
}

public void DFSUtil(int s, boolean visited[])
{
 
   visited[s] = true;
   System.out.println(s);
  

    
    Iterator<Integer> i = adj[i].listIterator();
    while(i.hasNext())
    {
      int n = i.next();
      if(!visited[n])
      {
        DFSUtil(n,visited);
      }
    }
  
}
  
public void DFS()
{
  boolean visited[] = new boolean[V];
  
  for(int i = 0; i< V ; ++i)
  {
    DFSUtil(i,visited);
  }
  
}

public static void main(String[] args)
{
  Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal");
 
        g.DFS();
}
}
