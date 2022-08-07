
public class CCA {
	
	public String title;
	private String description;
	private int classSize;
	private String day;
	private String time;
	private String venue;
	public String instructor;
	private String category;
	
	public CCA(String title, String category , int classSize, String day, String time, String venue,
			String instructor, String description) {
		this.title = title;
		this.category = category;
		this.description = description;
		this.classSize = classSize;
		this.day = day;
		this.time = time;
		this.venue = venue;
		this.instructor = instructor;
	}
	
	public CCA(String title, String instructor) {
		this.title = title;
		this.instructor = instructor;
	}
	
	public CCA(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}
	
	public String getDescription() {
		return description;
	}

	public int getClassSize() {
		return classSize;
	}

	public String getDay() {
		return day;
	}

	public String getTime() {
		return time;
	}

	public String getVenue() {
		return venue;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	
	
	
}
