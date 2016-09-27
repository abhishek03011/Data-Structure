
public class Dnode 
{
	private int data;
	private Dnode prev;
	private Dnode next;

	public Dnode(int data) 
		{
			this.data = data;
			this.prev = null;
			this.next =  null;
		}
	
	public Dnode(int data,Dnode prev,Dnode next)
		{
			this.data = data;
			this.prev = prev;
			this.next = next;
		}

	public int getData() 
		{
			return data;
		}

	public void setData(int data) 
		{
			this.data = data;
		}

	public Dnode getPrev() 
		{
			return prev;
		}

	public void setPrev(Dnode where) 
		{
			this.prev = where;
		}

	public Dnode getNext() 
		{
			return next;
		}

	public void setNext(Dnode where) 
		{
			this.next = where;
		}
}
