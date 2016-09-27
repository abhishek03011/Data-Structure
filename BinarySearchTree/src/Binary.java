
public class Binary {

	public BinarySearchTree node;
	
	public Binary() {}

	public BinarySearchTree find(int data, BinarySearchTree root)
	{
		if(root==null)
			return null;
		if(data<root.getdata())
			return find(data,root.getLeft());
		else if(data>root.getdata())
			return find(data,root.getRight());
		return root;
	}
	
	public BinarySearchTree finder(int data,BinarySearchTree root)
	{
		if (root==null)
			return null;
		while(root!=null)
		{
			if(data==root.getdata())
				return root;
			else if (data>root.getdata())
				root = root.getRight();
			else
				root = root.getLeft();		
		}
		return null;
	}
	
	public BinarySearchTree FindMin(BinarySearchTree root)
	{
		if(root==null)
			return null;
		else
			if(root.getLeft() == null)
				return root;
			else
				return FindMin(root.getLeft());
	}

	public BinarySearchTree FindMinimum(BinarySearchTree root)
	{
		if(root == null)
			return null;
		while(root.getLeft()!=null)
			root = root.getLeft();
		return root;
	}

	public BinarySearchTree FindMax(BinarySearchTree root)
	{
		if (root == null)
				return null;
		else
			if(root.getRight()==null)
				return root;
			else
				return FindMax(root.getRight());
	}
	
	public BinarySearchTree FindMaximum(BinarySearchTree root)
	{
		if(root == null)
			return null;
		
		while(root.getRight()!=null)
			root = root.getRight();
		return root;
	}

	public BinarySearchTree Insert(BinarySearchTree root,int data)
	{
		if (root == null)
		{
			root = new BinarySearchTree();
				root.setData(data);
				root.setLeft(null);
				root.setRight(null);
		}
		else
		{
			if(data<root.getdata())
				root.setLeft(Insert(root.getLeft(),data));
			if(data>root.getdata())
				root.setRight(Insert(root.getRight(),data));
		}
		return root;
	}


	
}
