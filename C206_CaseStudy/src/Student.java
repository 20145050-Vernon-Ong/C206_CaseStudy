import java.util.Random;

public class Student extends CCA{
	
	private String name;
	private int studentID;
	private int grade;
	private String classRoom;
	private int contactNo;
	private String teacher;
	private int registerationID;
	private int ccaperWeek;
	private int ccaperDay;
	
	// P4 and Above
	public Student(String name, int studentID, int grade, String classRoom, String Teacher, String title, int registerationID,
			int ccaperWeek, int ccaperDay) {
		super(title);
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		this.classRoom = classRoom;
		this.teacher = Teacher;
		this.registerationID = randomGenerate();
		this.ccaperDay = ccaperDay;
		this.ccaperWeek = ccaperWeek;
	}
	
	public Student(String name, int studentID, int grade, String classRoom, String Teacher, int registerationID) {
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		this.classRoom = classRoom;
		this.teacher = Teacher;
		this.registerationID = randomGenerate();
	}

	public int getCcaperWeek() {
		return ccaperWeek;
	}

	public int getCcaperDay() {
		return ccaperDay;
	}

	public void setCcaperWeek(int ccaperWeek) {
		this.ccaperWeek = ccaperWeek;
	}

	public void setCcaperDay(int ccaperDay) {
		this.ccaperDay = ccaperDay;
	}

	public String getName() {
		return name;
	}

	public int getStudentID() {
		return studentID;
	}
	
	public int getRegisterationID() {
		return registerationID;
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
	
	public void setRegisterationID(int registerationID) {
		this.registerationID = randomGenerate();
	}
	
	public boolean login(int registerationID, int ID) {
		if (registerationID == randomGenerate() && ID == getStudentID()) {
			return true;
		} else {
			return false;
		}
	}
	
	private int randomGenerate() {
		int max = 10;
		String srandomGen ="";
		int randoGen = 0;
		Random rand = new Random();
		for (int i =0; i < 5; i ++) {
			srandomGen += String.valueOf(rand.nextInt(max));
		}
		randoGen = Integer.parseInt(srandomGen);
		return randoGen;
	}
	
}
