import java.util.Stack;

public class QueueRevarsal {
	
public static ListQueue reverse(ListQueue queue) throws Exception
{
	Stack<Integer> stack = new Stack<Integer>();
	while(!queue.isEmpty())
	{
		stack.push(queue.dequeue());
	}
	while (!stack.isEmpty())
	{
		queue.enqueqe(stack.pop());
	}
	return queue;
}
}
