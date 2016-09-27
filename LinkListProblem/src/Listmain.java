
public class Listmain {

	public Listmain() 
	{
	}
public static void main(String...args)
{
	Linklist link = new Linklist();
	link.addfirstolist(1);
	link.addtolast(2);
	link.addfirstolist(3);
	link.inmiddle(31,1);
	link.addtolast(45);
	link.addtolast(4);
	link.addfirstolist(0);
	link.printlist();
	//System.out.println(link.alternateevensum());
	System.out.println(link.alternateoddsum());
}
}
