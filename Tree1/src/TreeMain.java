import java.util.ArrayList;
import java.util.Iterator;

public class TreeMain {

	public TreeMain() 
	{
		// TODO Auto-generated constructor stub
	}
	
	

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
	tree.addNode(1, "Boss");
	tree.addNode(3, "susan");
	tree.addNode(2, "Manager");
	tree.addNode(4, "salesManager");
	tree.addNode(6, "kelly");
	tree.addNode(5, "Manager");
	tree.addNode(7, "john");
	
    System.out.println("The level order traversal: "+tree.levelOrder(tree.getRoot()));
    System.out.println("The reverse tree order: "+tree.ReverseTreePrint(tree.getRoot()));
    System.out.println("The leaf nodes: "+tree.leafnodesdata(tree.getRoot()));
    System.out.println("The full nodes in the tree: "+tree.findFullNodes(tree.getRoot()));
    System.out.println("The half full nodes are: "+ tree.halfNodes(tree.getRoot()));
    System.out.println("The sum of the largest level is: "+ tree.sumOfaLevel(tree.getRoot()));
    System.out.println("The Sum of the entire tree is: "+ tree.sumOfthetree(tree.getRoot()));
    System.out.println("The reverse print is"+tree.reverse(tree.getRoot()));
    //tree.reverse(tree.getRoot());
    ArrayList<String> a = new ArrayList<String>();
    a.add("Hello");
    a.add("world");
    Iterator<String> b = a.iterator();
    while(b.hasNext())
    {
    	System.out.println(b.next());
    }
}
}