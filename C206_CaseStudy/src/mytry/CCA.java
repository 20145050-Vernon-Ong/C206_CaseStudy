package mytry;




public class CCA {
	
	private String title;
	private String description;
	private int classSize;
	private String day;
	private String time;
	private String venue;
	private String instructor;
	private String category;
	
	public CCA(String title, String category, String description, int classSize, String day, String time, String venue,
			String instructor) {
		this.title = title;
		this.category = category;
		this.description = description;
		this.classSize = classSize;
		this.day = day;
		this.time = time;
		this.venue = venue;
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
	
	
}
