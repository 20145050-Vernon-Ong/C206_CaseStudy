
public class StudentinCCA {
	private String name;
	private int studentID;
	private int grade;
	private String classRoom;
	private String parentName;
	private String parentEmail;
	private int contactNo;
	private String cca;
	public StudentinCCA(String name, int studentID, int grade, String classRoom, String cca) {
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		this.classRoom = classRoom;
		this.cca = cca;
	}
	public String getCca() {
		return cca;
	}
	public void setCca(String cca) {
		this.cca = cca;
	}
	// P3 and Below
	public StudentinCCA(String name, int studentID, int grade, String classRoom, String parentName, String parentEmail,
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
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentEmail() {
		return parentEmail;
	}
	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	

}
