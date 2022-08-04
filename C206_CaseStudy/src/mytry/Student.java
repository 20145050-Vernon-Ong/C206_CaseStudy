package mytry;

public class Student extends CCA{
	private String name;
	private int studentID;
	private int grade;
	private String classRoom;
	// P4 and Above
	public Student(String name, int studentID, int grade, String classRoom, String title) {
		super(title);
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		this.classRoom = classRoom;
	}
	
	public String getName() {
		return name;
	}

	public int getStudentID() {
		return studentID;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getClassRoom() {
		return classRoom;
	}

	
	
	
	
}

