package tp02;

import java.util.ArrayList;

public class Promotion {
	
	private ArrayList<Student> studentList;

	public Promotion() {
		studentList = new ArrayList<Student>();
	}
	
	public int newId() {
		int studentCount = studentList.size();
		
		if (studentCount == 0 )
			return 0;
		
		int largerId = studentList.get(0).getId();
		
		for (int i = 1 ; i < studentCount ; i++) {
			int id = studentList.get(i).getId();
			if (id > largerId)
				largerId = id ;
			
		}
		
		return largerId + 1;
	}
	
	
	public int add(String pfirstName, String plastName)  {
		int id = newId();
		Student newStudent = new Student(id, pfirstName, plastName);
		studentList.add(newStudent);
		return id;
				
	}
	
	public void printToConsole() {
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		
	
	}
	
}
