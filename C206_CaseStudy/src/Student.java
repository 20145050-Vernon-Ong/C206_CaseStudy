
public class Student extends CCA{
	
	private String name;
	private int studentID;
	private int grade;
	private String classRoom;
	private int contactNo;
	private int registerationID;
	private String teacher;
	
	// P4 and Above
	public Student(String name, int studentID, int grade, String classRoom, String Teacher, String title) {
		super(title);
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		this.classRoom = classRoom;
		this.teacher = Teacher;
		
	}
	
	public Student(String name, int studentID, int grade, String classRoom, String Teacher) {
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		this.classRoom = classRoom;
		this.teacher = Teacher;
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
	
	public String getTeacher() {
		return teacher;
	}
	
	public int getContactNo() {
		return contactNo;
	}
	
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	public boolean login(String name, int ID) {
		if (name.equals(getName()) && ID == getStudentID()) {
			return true;
		} else {
			return false;
		}
	}
	
}
