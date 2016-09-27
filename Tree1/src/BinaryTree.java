import java.util.*;
public class BinaryTree 
{
	private BinaryNodeTree root;
	private static int size = 0; 
	
	public BinaryTree() 
	{
	
	}
	
	public static int increment()
	{
		return size++;
	}
	
	
	public void addNode(int data,String name)
	{
		BinaryNodeTree temp = new BinaryNodeTree(data,name);
		
		if(root==null)
			root = temp;
		else
		{
		BinaryNodeTree current = root;
		BinaryNodeTree parent;
		while (true)
		{
			parent = current;
			if(data<current.getData())
			{
			current = current.getLeft();
			if (current==null)
			{
				parent.setLeft(temp);
				return;
			}
			}
			else
			{
				current = current.getRight();
				if(current==null)
				{
					parent.setRight(temp);
					return;
				}
			}
		increment();
		}
		}
		}
	
	public void preOrder(BinaryNodeTree current)
	{
		if (current!=null)
		{
			System.out.println(current);
			preOrder(current.getLeft());
			preOrder(current.getRight());
		}
	}

	public void postOrder(BinaryNodeTree current)
	{
		if(current!=null)
		{
			postOrder(current.getLeft());
			postOrder(current.getRight());
			System.out.println(current);
		}
	}
	
	public void inOrder(BinaryNodeTree current)
	{
		if(current!=null)
		{
			inOrder(current.getLeft());
			System.out.println(current);
			inOrder(current.getRight());
		}
	}
	
	public BinaryNodeTree find(int key)
	{
		 BinaryNodeTree current = root;
		 
		 while(current.getData()!=key)
		 {
			 if(key<current.getData())
			 {
				 current = current.getLeft();
			 }
			 else
			 {
				 current = current.getRight();
			 }
		if(current == null)
			return null;
		 }
		 
		 return current;
	}
	
	public ArrayList<Integer> IterativePreOrder(BinaryNodeTree current)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<BinaryNodeTree> s = new Stack<BinaryNodeTree>();
		
		if (current==null)
			return res;
		
		s.push(current);
		
		while(!s.isEmpty())
		{
			BinaryNodeTree temp = s.pop();
		    res.add(temp.getData());
			if(temp.getRight()!=null)
				s.push(temp.getRight());
			if(temp.getLeft()!=null)
				s.push(temp.getRight());
		}
		return res;
	}
	
	public ArrayList<Integer> iterativeTraversal(BinaryNodeTree root)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<BinaryNodeTree> s = new Stack<BinaryNodeTree>();
		BinaryNodeTree currentNode = root;
		boolean done = false;
		while(!done)
		{
			if(currentNode!=null)
			{
				s.push(currentNode);
			currentNode = currentNode.getLeft();
			}
			else
			{
				if(s.isEmpty())
					done = true;
				else
				{
					currentNode = s.pop();
					res.add(currentNode.getData());
					currentNode = currentNode.getRight();
				}
			}
		}
		return res;
	}
	
	
	public ArrayList<Integer> iterativePostOrder(BinaryNodeTree node)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<BinaryNodeTree> s = new Stack<BinaryNodeTree>();
		BinaryNodeTree prev = null;
		if(root==null)
			return res;
		s.push(root);
		while(!s.isEmpty())
		{
			BinaryNodeTree current = s.peek();
			if(prev==null || prev.getLeft() == current || prev.getRight() == current)
			{
				if(current.getLeft()!=null)
					s.push(current.getLeft());
				else 
					if(current.getRight()!=null)
						s.push(current.getRight());
			}
			else if(current.getLeft() == prev)
			{
				if(current.getRight()!=null)
					s.push(current.getRight());
			}
			else
			{
				res.add(current.getData());
				s.pop();
			}
			prev = current;
		}
		
		return res;
	}
	
	public ArrayList<ArrayList<Integer>> levelOrder(BinaryNodeTree root)
	{
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(root == null)
			return res;
		Queue<BinaryNodeTree> q = new LinkedList<BinaryNodeTree>();
		q.offer(root);
		q.offer(null);
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(!q.isEmpty())
		{
			BinaryNodeTree current = q.poll();
			if(current!=null)
			{
				a.add(current.getData());
				if(current.getLeft()!=null)
					q.offer(current.getLeft());
				if(current.getRight()!=null)
					q.offer(current.getRight());
			}
			else
			{
			ArrayList<Integer> b = new ArrayList<Integer>(a);
			res.add(b);
			a.clear();
			if(!q.isEmpty())
				q.offer(null);;
			}
		}
			return res;
	}
	
	public int maxinBinaryTree(BinaryNodeTree root)
	{
		int maxValue = Integer.MIN_VALUE;
		if(root!=null)
		{
			int leftMax = maxinBinaryTree(root.getLeft());
			int rightMax = maxinBinaryTree(root.getRight());
			if(leftMax>rightMax)
				maxValue = leftMax;
			else
				maxValue = rightMax;
			
			if(root.getData()>maxValue)
				maxValue = root.getData();
		}
		return maxValue; 
	}
	
	public int iterativeMax(BinaryNodeTree root)
	{
		int max = Integer.MIN_VALUE;
		if (root==null)
			return Integer.MIN_VALUE;
		Queue<BinaryNodeTree> q = new LinkedList<BinaryNodeTree>();
		q.offer(root);
		while(!q.isEmpty())
		{
			BinaryNodeTree temp = q.poll();
			if(temp.getData()>max)
			{
				max = temp.getData();
			}
			if(temp!=null)
			{
				if(temp.getLeft()!=null)
					q.offer(temp.getLeft());
				if(temp.getRight()!=null)
					q.offer(temp.getRight());
			}
		}
		
		return max;
	}
	
	public static boolean findInBT(BinaryNodeTree root, int data)
	{
		if(root ==null)
			return false;
		if(root.getData()==data)
			return true;
		return findInBT(root.getLeft(),data)|| findInBT(root.getRight(),data);
	}
	
	public int findSizeofTree(BinaryNodeTree root)
	{
		int count = 0;
		if(root == null)
			return 0;
		Queue<BinaryNodeTree> q = new LinkedList<BinaryNodeTree>();
		q.offer(root);
		while(!q.isEmpty())
		{
			BinaryNodeTree temp = q.poll();
			count++;
			if(temp!=null)
			{
				if (temp.getLeft()!=null)
					q.offer(temp.getLeft());
				if (temp.getRight()!=null)
					q.offer(temp.getRight());
			}
		}
		
		
		return count;
	}
	
	public ArrayList<Integer> ReverseTreePrint(BinaryNodeTree root)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null)
			return res;
		Stack<BinaryNodeTree> s = new Stack<BinaryNodeTree>();
		Queue<BinaryNodeTree> q = new LinkedList<BinaryNodeTree>();
		q.offer(root);
		while(!q.isEmpty())
		{
			BinaryNodeTree temp = q.poll();
			if(temp.getLeft()!=null)
				q.offer(temp.getLeft());
			if(temp.getRight()!=null)
				q.offer(temp.getRight());
			s.push(temp);
		}
		while(!s.isEmpty())
			res.add(s.pop().getData());
			//System.out.println(s.pop().getData());
	return res;
	}
	
	public ArrayList<Integer> leafnodesdata(BinaryNodeTree root)
	{
		ArrayList<Integer> res= new  ArrayList<Integer>();
		if(root ==null)
			return res;
		Queue<BinaryNodeTree> q = new LinkedList<BinaryNodeTree>();
		q.offer(root);
		while(!q.isEmpty())
		{
			BinaryNodeTree temp = q.poll();
			
				if(temp.getRight()==null && temp.getLeft()==null)
					res.add(temp.getData());
				if(temp.getLeft()!=null)
					q.offer(temp.getLeft());
				if(temp.getRight()!=null)
					q.offer(temp.getRight());
			
		}
		
		return res;
	}
	
	public ArrayList<Integer> findFullNodes(BinaryNodeTree root)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		Queue<BinaryNodeTree> q = new LinkedList<BinaryNodeTree>();
		if(root == null)
			return null;
		q.offer(root);
		while(!q.isEmpty())
		{
			BinaryNodeTree temp = q.poll();
			
			if(temp.getRight()!=null && temp.getLeft()!=null)
				res.add(temp.getData());
			if(temp.getLeft()!=null)
				q.offer(temp.getLeft());
			if(temp.getRight()!=null)
				q.offer(temp.getRight());
		}
		
		return res;
	}
	
	public ArrayList<Integer> halfNodes(BinaryNodeTree root)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		Queue<BinaryNodeTree> q = new LinkedList<BinaryNodeTree>();
		if(root == null)
			return null;
		q.offer(root);
		while(!q.isEmpty())
		{
			BinaryNodeTree temp = q.poll();
			
			if((temp.getRight()==null && temp.getLeft()!=null) || (temp.getRight()!=null && temp.getLeft()==null))
				res.add(temp.getData());
			if(temp.getLeft()!=null)
				q.offer(temp.getLeft());
			if(temp.getRight()!=null)
				q.offer(temp.getRight());
		}
		
		return res;
	}
	
	public int sumOfaLevel(BinaryNodeTree root)
	{
		int currentsum = 0 , maxSum =  0;
		Queue<BinaryNodeTree> q = new LinkedList<BinaryNodeTree>();
		q.offer(root);
		q.offer(null);
		while(!q.isEmpty())
		{
			BinaryNodeTree temp = q.poll();
			if(temp != null)
			{
				currentsum = currentsum + temp.getData();
				if(temp.getLeft()!=null)
					q.offer(temp.getLeft());
				if(temp.getRight()!=null)
					q.offer(temp.getRight());
			}
			else
			{
				if(currentsum>maxSum)
					maxSum = currentsum;
				currentsum = 0;
				if(!q.isEmpty())
					q.offer(null);
			}
		}
		
		return maxSum;
	}
	
	public int sumOfthetree(BinaryNodeTree root)
	{
		int sum = 0;
		if(root ==null)
			return 0;
		Queue<BinaryNodeTree> q = new LinkedList<BinaryNodeTree>();
		q.offer(root);
		while(!q.isEmpty())
		{
			BinaryNodeTree temp = q.poll();
			if(temp!=null)
			{
				sum = sum + temp.getData();
				if(temp.getLeft()!=null)
					q.offer(temp.getLeft());
				if(temp.getRight()!=null)
					q.offer(temp.getRight());
			}
		}
	
		return sum;
	}
	
	public ArrayList<Integer> reverse(BinaryNodeTree root)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<Integer> s = new Stack<Integer>();
		Queue<BinaryNodeTree> q = new LinkedList<BinaryNodeTree>();
	    q.offer(root);
	    while(!q.isEmpty())
	    {
	    	 BinaryNodeTree temp = q.poll();
	     if(temp!=null)
	     {
	    	 res.add(temp.getData());
	    	 if(temp.getLeft()!=null)
	    		 q.offer(temp.getLeft());
	    	 if(temp.getRight()!=null)
	    		 q.offer(temp.getRight());
	     }
	    }
	   s.addAll(res);
	   res.clear();
	   while(!s.isEmpty())
		   res.add(s.pop());
	   
	  return res;
	}
	
	public BinaryNodeTree getRoot() 
	{
		return root;
	}


	public void setRoot(BinaryNodeTree root) 
	{
		this.root = root;
	}

}
