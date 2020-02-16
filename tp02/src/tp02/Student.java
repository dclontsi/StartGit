package tp02;

public class Student {
	private final int id ;
	private String firstName ;
	private String lastName ;
	
	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final int getId() {
		return id;
	}

	public Student(int pid, String pfirstName, String plastName) {
		super();
		this.id = pid;
		this.firstName = pfirstName;
		this.lastName = plastName;
	}

	@Override // redefinition d'une méthode héritée, utile pour visualiser les caractéristiques d'un objet
	public String toString() {
		//return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		return firstName + " " + lastName + "  (" + id + ')';
	}

}
