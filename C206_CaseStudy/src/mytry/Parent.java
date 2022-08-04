package mytry;
import java.util.Random;
public class Parent {
	private int studentID;
	private String name;
	private int grade;
	private String classRoom;
	private String ParentName;
	private String ParentEmail;
	private int ContactNo;
	private int randomReg; 
	public Parent(int studentID, String name, int grade, String classRoom, String parentName, String parentEmail,
			int contactNo) {
		this.studentID = studentID;
		this.name = name;
		this.grade = grade;
		this.classRoom = classRoom;
		ParentName = parentName;
		ParentEmail = parentEmail;
		ContactNo = contactNo;
		this.randomReg = randomGenerate(); 
	}

	public int getStudentID() {
		return studentID;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public String getParentName() {
		return ParentName;
	}

	public String getParentEmail() {
		return ParentEmail;
	}

	public int getContactNo() {
		return ContactNo;
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
	public int getRandomGenerate() {
		return randomReg;
	}
	
	
}
