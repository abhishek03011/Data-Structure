
public class TestLinkList {

	public TestLinkList() {
		// TODO Auto-generated constructor stub
	}
public static void main(String... args)
{
	LinkedlistClass list = new LinkedlistClass();
	
	
	list.appendAtlast("1");
	list.appendAtlast("2");
	list.appendAtlast("23");
	list.appendAtlast("2");
	list.appendAtfirst("3");
    list.appendAtfirst("4");
	System.out.println(list);
	list.sizeOflist();
}
}
