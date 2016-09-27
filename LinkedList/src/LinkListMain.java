
public class LinkListMain {

	public LinkListMain() {
		
	}

	public static void main(String[] args) throws InterruptedException {
	LinkList list = new LinkList();
	list.addtostart("0");
	list.addtostart("1");
	list.insertAtEnd("2");
	list.insertAtEnd("12");
	list.insertinmiddle("15", 10);
	list.insertinmiddle("1100",3);
	list.insertAtEnd(null);
	//list.listCount();
	list.printList();
	System.out.println(Integer.MAX_VALUE);
	
	}

}
