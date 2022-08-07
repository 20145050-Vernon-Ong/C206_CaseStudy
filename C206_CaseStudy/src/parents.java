
public class parents extends CCA {
	
	private String ParentName;
	private String ParentEmail;
	private int contactNo;

	public parents(String title, String category, int classSize, String day, String time, String venue,
			String instructor, String description, String ParentName, String ParentEmail, int contactNo) {
		super(title, category, classSize, day, time, venue, instructor, description);
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

}
