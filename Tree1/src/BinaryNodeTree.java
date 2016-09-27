
public class BinaryNodeTree 
{
	private int data;
	private String name;
	private BinaryNodeTree left;
	private BinaryNodeTree right;

	public BinaryNodeTree(int data,String name) 
	{
	this.data = data;
	this.left = null;
	this.right = null;
	this.name = name;
	
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinaryNodeTree getLeft() {
		return left;
	}

	public void setLeft(BinaryNodeTree left) {
		this.left = left;
	}

	public BinaryNodeTree getRight() {
		return right;
	}

	public void setRight(BinaryNodeTree right) {
		this.right = right;
	}


	public String toString() {
		return name+" has the key "+data;
	}

	
}
