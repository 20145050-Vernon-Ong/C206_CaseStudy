import java.util.Random;

public class parents extends Student {
	
	private String ParentName;
	private String ParentEmail;
	private int contactNo;
	private int registerationID;

	public parents(String ParentName, String ParentEmail, int contactNo, String name, int studentID,
			int grade, String classRoom, String Teacher) {
		super(name, studentID, grade, classRoom, Teacher);
		this.ParentName = ParentName;
		this.ParentEmail = ParentEmail;
		this.contactNo = contactNo;
		this.registerationID = randomGenerate();
		// TODO Auto-generated constructor stub
	}

	public String getParentName() {
		return ParentName;
	}

	public String getParentEmail() {
		return ParentEmail;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setParentName(String parentName) {
		ParentName = parentName;
	}

	public void setParentEmail(String parentEmail) {
		ParentEmail = parentEmail;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public int getRegisterationID() {
		return registerationID;
	}

	public void setRegisterationID(int registerationID) {
		this.registerationID = registerationID;
	}

	public boolean login(String ParentName, int ID) {
		if (ParentName.equals(getParentName()) && ID == getStudentID()) {
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
