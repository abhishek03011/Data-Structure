
public class ListQueueMain {

	public ListQueueMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String...args) throws Exception
	{
		ListQueue q = new ListQueue();
		q.enqueqe(5);
		q.enqueqe(10);
		q.enqueqe(15);
		q.enqueqe(20);
		System.out.println(q);
		System.out.println(QueueRevarsal.reverse(q));
		
		
		QueueWithTwoStacks stacker = new QueueWithTwoStacks();
		stacker.enqueueWithStack(10);
		stacker.enqueueWithStack(12);
		stacker.enqueueWithStack(15);
		stacker.enqueueWithStack(18);
		System.out.println(stacker);
	
	}
}
