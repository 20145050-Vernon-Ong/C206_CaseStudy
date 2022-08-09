
public class parents extends Student {
	
	private String ParentName;
	private String ParentEmail;
	private int contactNo;

	public parents(String ParentName, String ParentEmail, int contactNo, String name, int studentID,
			int grade, String classRoom, String Teacher) {
		super(name, studentID, grade, classRoom, Teacher);
		this.ParentName = ParentName;
		this.ParentEmail = ParentEmail;
		this.contactNo = contactNo;
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
	
	public boolean login(String ParentName, int ID) {
		if (ParentName.equals(getName()) && ID == getStudentID()) {
			return true;
		} else {
			return false;
		}
	}

}
