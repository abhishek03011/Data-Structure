
public class DlinkMain {

	public DlinkMain() {
	
	}

	public static void main(String...args)
	{
	 DLinkList list = new DLinkList();
     list.addfirst(60);
     list.addfirst(50);
     list.addfirst(40);
     list.addfirst(30);
     list.addfirst(20);
     list.addinBetween(100, 1);
     list.insertafterhead(2);
     list.printlist();
     list.listlength();
     System.out.println("The position of the item in the list is "+ list.findnodewithdata(100));
     System.out.println("The value of data before the searched node is: " + list.finddatabeforecurrent(60));
     System.out.println("\n");
	// list.deletefirstnode();
	 //list.printlist();
	 //list.addfirst(20);
	 //System.out.println("\n");
	 //list.printlist();
	 
	 list.deletefromlast();
	 list.printlist();
	 list.deletefromlast();
	 list.printlist();
	 list.listlength();
	 list.printtail();
	 list.deletefirstnode();
	 list.printhead();
	 list.printlist();
	 list.insertatlast(301190);
	 list.printtail();
	 list.printlist();
	 list.listlength();
	 
	 
	 System.out.println("******************");
	 list.deleteatposition(5);
	
	 list.printlist();
	 list.deleteatposition(2);
	 list.printlist();
	 
	 //list.deleteEntireList();
	// System.out.println("******************");
	 //list.printlist();
	 list.deletewithavalue(40);
	 list.printlist();
	 list.deletewithavalue(2);
	 list.printlist();
	 
	 list.printListinreverseorder();
	 }
	
}
