import java.util.Comparator;

public class MarksCompare implements Comparator<Student>{

	
	public int compare(Student o1, Student o2) {
		
		return o2.getMarks()-o1.getMarks();
	}

}
