import java.util.*;
public class Graph {

	private int V;
	private LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	public Graph(int v) 
	{
		V=v;
		adj = new LinkedList[V];
		for(int i =0;i<V;i++)
		adj[i] = new LinkedList<Integer>();
	}

	 void addEdge(int v,int w) 
	 { 
		 adj[v].add(w); 
	 }
	 
	 public void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack)
	 {
		 visited[v] = true;
		 int i;
		 
		 Iterator<Integer> it = adj[v].iterator();
		 while(it.hasNext())
		 {
			 i = it.next();
			 if(!visited[i])
				 topologicalSortUtil(i,visited,stack);
		 }
		 
		 stack.push(new Integer(v));
	 }
	 
	 public void topologicalSort()
	 {
		 Stack<Integer> stack = new Stack<Integer>();
		 
		 boolean visited[] = new boolean[V];
		 for(int i =0 ; i< V;i++)
			 visited[i] = false;
		 
		 for(int i =0 ; i<V;i++)
			 if(!visited[i])
				 topologicalSortUtil(i,visited,stack);
		 
		 while(!stack.isEmpty())
			 System.out.print(stack.pop() + " ");
			 
		 
		 
	 }
	public static void main(String[] args) 
	{
		 Graph g = new Graph(6);
	        g.addEdge(5, 2);
	        g.addEdge(5, 0);
	        g.addEdge(4, 0);
	        g.addEdge(4, 1);
	        g.addEdge(2, 3);
	        g.addEdge(3, 1);
	 
	        System.out.println("Following is a Topological " + "sort of the given graph");
	        g.topologicalSort();

	       int indices[] = new int[10];
	       System.out.println("");
	       System.out.println(indices[0]);
	}

}
