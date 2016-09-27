import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collections;

public class FileSort {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try 
		{
			reader = new BufferedReader(new FileReader("/Users/abhishekkumar/Desktop/input.txt"));
		} catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		 ArrayList<Student> studentRecords = new ArrayList<Student>();
		 
		 String currentLine = reader.readLine();
		while (currentLine!=null)
		{
			String[] studentDetail = currentLine.split(" ");
			String name = studentDetail[0];
			int marks = Integer.valueOf(studentDetail[1]);
			studentRecords.add(new Student(name,marks));
			currentLine = reader.readLine();
		}
		
		
		try{
			
		
		writer = new BufferedWriter(new FileWriter("/Users/abhishekkumar/Desktop/output.txt"));
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	
		Collections.sort(studentRecords, new NameCompare());
		
		for(Student stu:studentRecords)
		{
			writer.write(stu.getName());
			writer.write(" "+ stu.getMarks());
			writer.newLine();
		}
        
		
		reader.close();
		writer.close();
	}

}
