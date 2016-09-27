
public class Heap {

	public int[] array;
	public int count;
	public int capacity;
	public int heap_type;
	
	public Heap(int capacity,int heapType) 
	{
	this.capacity = capacity;
	this.count = 0;
	this.heap_type =  heap_type;
	this.array = new int[this.capacity];
	}

	public int Parent(int i)
	{
		if(i <=0 || i == this.count)
			return -1;
	return (i-1)/2;	
	}
	
	public int rightChildren(int i)
	{
		int right = 2*i +1;
		
		if(right>=this.count)
			return -1;
	return right;
	}
	
	public int leftChildern(int i)
	{
		int left = 2*i + 2;
		if(left > this.count)
			return -1;
		return left;
	}
	
	public int GetMaximum()
	{
		if(this.count==0)
			return -1;
		return this.array[0];
	}
	
	public void percolateDown(int i)
	{
		int max,temp,l,r;
		 r = rightChildren(i);
		 l = leftChildern(i);
		 
		 if(l!=-1 && this.array[l]>this.array[i])
			 max = l;
		 else 
			 max = i;
		 if(r!=-1 && this.array[r]>this.array[max])
			 max = r;
		 
		 if(max!=i)
		 {
			 temp = this.array[i];
			 this.array[i]= this.array[max];
			 this.array[max] = temp;
		 }
		 
		 percolateDown(max);
	}
	
	public int deleteMax()
	{
		 int max;
		 if(this.count == 0)
			 return -1;
		 max = this.array[0];
		 this.array[0] = this.array[count-1];
		 this.count--;
		 percolateDown(0);
		 return max;
	}
	
	public void insert(int data)
	{
	int i;
	if(this.capacity == this.count)
	{
		resizeHeap();
	}
	
	this.count++;
	
	i = this.count-1;

	while(i>=0 && data > this.array[(i-1)/2])
	{
		this.array[i] = this.array[(i-1)/2];
		i = (i-1)/2;
	}
	this.array[i] = data;
	}
	
	public void resizeHeap()
	{
		int[] old_array = new int[this.capacity];
		System.arraycopy(array, 0, old_array, 0,this.count-1);
		this.array = new int[this.capacity*2];
		if(this.array == null)
		{
			System.out.println("memory error");
			return;
		}
		for(int i = 0; i<this.capacity;i++)
		{
			array[i]= old_array[i];
		}
		this.capacity*=2;
		old_array = null;
	}
	
	public void print()
	{
		System.out.print("[");
		for(int i = 0; i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}
	
	public void DestroyHeap()
	{
		this.count = 0;
		this.array = null;
	}
	
	public void check(int i)
	{
		System.out.println((i-1)/2);
	}
	
	public void builHeap(Heap h,int[] a,int n)
	{
		if(h==null)
			return;
		while(n>this.capacity)
			h.resizeHeap();
		for(int i = 0; i<n; i++)
			h.array[i] = a[i];
		this.count = n;
		for(int i = (n-1)/2;i>0;i--)
			h.percolateDown(i);
	}
	
	
	public static void main(String[] args) 
	{
	Heap a = new Heap(20,1);
	int []ar = {21,4,56,2,1,33,42,11,10,12};
	a.insert(0);
	//a.insert(1);
	a.print();
//a.check(20);
	}

}
