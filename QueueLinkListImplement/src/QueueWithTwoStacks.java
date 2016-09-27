import java.util.Stack;
public class QueueWithTwoStacks 
{

private Stack<Integer> stack1 = new Stack<Integer>();	
private Stack<Integer> stack2 = new Stack<Integer>();	

public void enqueueWithStack(int data)
{
	
	stack1.push(data);
}

public int dequeueWithStack()
{
	if(stack2.isEmpty())
		while(!stack1.isEmpty())
		{
			stack2.push(stack1.pop());
		}
	return stack2.pop();
}


public String toString() {
	String result = "[";
    Stack<Integer> stack3 = stack1;
    int count = 0; 
    while(!stack3.empty())
    {
    	result += stack3.pop();
    	if(count<stack3.size() + 2)
    		result +=",";
    	count++;
    }
    result +="]";
	return result;
}

public String dequeueString()
{
	Stack<Integer> stack4 = stack2;
	
	String result = "[";
	int count = 0; 
    while(!stack4.empty())
    {
    	result += stack4.pop();
    	if(count<stack4.size() + 2)
    		result +=",";
    	count++;
    }
    result +="]";
	return result;
}


}
