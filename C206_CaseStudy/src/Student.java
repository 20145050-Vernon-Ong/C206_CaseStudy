
public class Student extends CCA{
	
	private String name;
	private int studentID;
	private int grade;
	private String classRoom;
	private String parentName;
	private String parentEmail;
	private int contactNo;
	private int registerationID;
	// P4 and Above
	public Student(String name, int studentID, int grade, String classRoom, String title) {
		super(title);
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		this.classRoom = classRoom;
	}
	// P3 and Below
	public Student(String name, int studentID, int grade, String classRoom, String parentName, String parentEmail,
			int contactNo, String title) {
		super(title);
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
	
	public int getGrade() {
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
	
	public boolean login(String name, int ID) {
		if (name.equals(getName()) && ID == getStudentID()) {
			return true;
		} else {
			return false;
		}
	}
	
}
