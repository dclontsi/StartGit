package tp02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student student = new Student(1024, "Darelle", "Lontsi");
		//System.out.println(student);
		
		Promotion listStudent = new Promotion();
		listStudent.add("Charlotte", "Djoufack");
		listStudent.add("Héloise", "Douanla");
		listStudent.add("Emma", "Macron");
		listStudent.add("Brigitte", "Macron");
		listStudent.add("Héloise", "Douanla");
		listStudent.printToConsole();

	}

}
