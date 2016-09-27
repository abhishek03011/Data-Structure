
public class FixedSizeArrayQueue 
{

	private int[] queueRep;
	private int size,front,rear;
	private int capacity;
	
	public FixedSizeArrayQueue(int cap) 
	{
	queueRep = new int[cap];	
	size = 0;
	front = 0;
	rear = 0;
	capacity = cap;
	}

	public void enqueue(int data) throws NullPointerException,IllegalStateException
	{
		if(size == capacity)
		{
			throw new IllegalStateException("Queue is full: Overflow");
		}
		else
		{
			size++;
			queueRep[rear] = data;
			rear = (rear+1) % capacity;
		}
	}
	
	public int dequeue()
	{
		if(size== 0)
		{
			throw new IllegalStateException("Queue is empty:Underflow");
		}
		else
		{
			size--;
			int data = queueRep[front % capacity];
			queueRep[front] = Integer.MIN_VALUE;
			front = (front + 1) % capacity;
			return data;
		}
	}
	
	public boolean isEmpty()
	{
		return(size == 0);
	}
	
	public boolean  isFull()
	{
		return (size == capacity);
	}
	
	public int size()
	{
		return size;
	}

	public String toString() {
		String result = "[";
		for(int i = 0; i < size ; i++)
		{
			result += Integer.toString(queueRep[(front + i) % capacity]);
			
			if(i <size-1)
			{
				result += ",";
			}
		
		}
		result += "]";
		return result;
	}
	
	
}
