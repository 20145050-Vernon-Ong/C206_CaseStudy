
public class Student {
	
	private String name;
	private int studentID;
	private String grade;
	private String classRoom;
	private String parentName;
	private String parentEmail;
	private int contactNo;
	// P4 and Above
	public Student(String name, int studentID, String grade, String classRoom) {
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		this.classRoom = classRoom;
	}
	// P3 and Below
	public Student(String name, int studentID, String grade, String classRoom, String parentName, String parentEmail,
			int contactNo) {
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		this.classRoom = classRoom;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.contactNo = contactNo;
	}
	public String getName() {
		return name;
	}

	public int getStudentID() {
		return studentID;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public String getClassRoom() {
		return classRoom;
	}

	public String getParentName() {
		return parentName;
	}

	public String getParentEmail() {
		return parentEmail;
	}
	
	public int getContactNo() {
		return contactNo;
	}
	
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
