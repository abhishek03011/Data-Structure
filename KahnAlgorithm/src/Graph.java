import java.util.*;
public class Graph {

	private int V;
	private ArrayList<Integer> adj[];
	
	public Graph(int V) {
		this.V = V;
		adj = new ArrayList[V];
		for(int i =0 ; i<V;i++)
			adj[i] = new ArrayList<Integer>();
		
		}
	
	public void addEdge(int u, int v)
	{
		adj[u].add(v);
	}
	
	
	public void topologicalSort()
	{
		int inorder[] = new int[V];
		
		for(int i =0 ; i< V;i++)
		{
			ArrayList<Integer> temp = (ArrayList<Integer>)adj[i];
			for(int node:temp)
			{
				inorder[node]++;
			}
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 0; i< V; i++)
		{
		if(inorder[i]==0)
			q.add(i);
		}
		
		Vector<Integer> list = new Vector<Integer>();
		int count = 0;
		while(!q.isEmpty())
		{
			int i = q.poll();
			list.add(i);
			
			for(int node : adj[i])
			{
				if(--inorder[node] == 0)
					q.add(node);
					
			}
			
			count++;
		}
		
		if(count!=V)
			System.out.println("The graph has cycle");
		
		for(int i : list)
			System.out.print(i + " ");
		
	}

	public static void main(String[] args) 
	{
		
		 Graph g=new Graph(6);
	        g.addEdge(5, 2);
	        g.addEdge(5, 0);
	        g.addEdge(4, 0);
	        g.addEdge(4, 1);
	        g.addEdge(2, 3);
	        g.addEdge(3, 1);
	        System.out.println("Following is a Topological Sort");
	        g.topologicalSort();
	}

}
