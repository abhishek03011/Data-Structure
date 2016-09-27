
public class DigitSum 
{
	static void digit(int num)
	{
		int sum = 0;
		int copy = num;
		while(copy!=0)
		{
			int last = copy%10;
			sum = sum + last;
			copy= copy/10;
		}
		
		System.out.println("The sum of the digits are " + sum);
	}

	public static void main(String...args)
	{
	DigitSum.digit(12345);	
	}
	
}
