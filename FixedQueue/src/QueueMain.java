
public class QueueMain {

	public QueueMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		FixedSizeArrayQueue q = new FixedSizeArrayQueue(16);
		q.enqueue(10);
		q.enqueue(5);
		q.enqueue(50);
		System.out.println(q);
	}

}
