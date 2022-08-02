import java.time.LocalDateTime;

public class CCA {
	
	private String title;
	private String description;
	private int classSize;
	private String day;
	private LocalDateTime time;
	private String venue;
	private String instructor;
	
	public CCA(String title, String description, int classSize, String day, LocalDateTime time, String venue,
			String instructor) {
		this.title = title;
		this.description = description;
		this.classSize = classSize;
		this.day = day;
		this.time = time;
		this.venue = venue;
		this.instructor = instructor;
	}

	public String getTitle() {
		return title;
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

	public LocalDateTime getTime() {
		return time;
	}

	public String getVenue() {
		return venue;
	}

	public String getInstructor() {
		return instructor;
	}
	
	
}
