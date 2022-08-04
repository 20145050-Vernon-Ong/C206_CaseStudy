import java.util.ArrayList;

public class C206_CaseStudy {

	ArrayList<Admin> adminList = new ArrayList<Admin>();
	
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	ArrayList<Parents> parentList = new ArrayList<Parents>();
	
	ArrayList<CCA> ccaList = new ArrayList<CCA>();
	static ArrayList<StudentinCCA> studentincca = new ArrayList<StudentinCCA>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C206_CaseStudy starting = new C206_CaseStudy();
		starting.start();
	}

	private void start() {

		adminList.add(new Admin("Vernon Ong", "verC206DIT"));
		studentList.add(new Student("Earnest", 2003, 4, "C206"));

		int option = -1;
		while (option != 2) {
			LoginMenu();
			option = Helper.readInt("Enter option > ");
			if (option == 1) {
				secondStart();
			} else if (option == 2) {
				System.out.println("Closing...");
			} else {
				System.out.println("Invalid Option.");
			}
		}
	}
	
	private void secondStart() {
		int secondOption = -1;
		while (secondOption != 6) {
			ASPMenu();
			secondOption = Helper.readInt("Enter option > ");
			if (secondOption == 1) {
				Admin login = getLoginAccount(adminList);
				if (login != null) {
					runSavingsProcess(login);
				}
			} else if (secondOption == 2) {
				Student loginStud = getStudAccount(studentList);
				if (loginStud != null) {
					runSavingStudentProcess(loginStud);
				}
			} else if (secondOption == 3) {
				
			} else if (secondOption == 4) {
				
			} else if (secondOption == 5) {
				
			} else if (secondOption == 6) {
				
			} else {
				System.out.println("Invalid Option > ");
			}
		}
	}
	
	private static void ASPMenu() {
		Helper.line(30, "=");
		System.out.println("Logging Page");
		Helper.line(30, "=");
		System.out.println("1. Login as Admin");
		System.out.println("2. Login as Student (For P4 and Above)");
		System.out.println("3. Login as Parents (For P3 and Below)");
		System.out.println("4. Register Student Account");
		System.out.println("5. Register Parent Account");
		System.out.println("6. Go back to Main Page");
	}

	private static void AdminMenu() {
		Helper.line(30, "=");
		System.out.println("CCA Registration System");
		Helper.line(30, "=");
		System.out.println("1. Go to Student Page");
		System.out.println("2. Go to CCA Page");
		System.out.println("3. Log Out");
	}
	
	private static void StudentMenu() {
		Helper.line(30, "=");
		System.out.println("CCA Registration System");
		Helper.line(30, "=");
		System.out.println("1. Go to view CCA");
		System.out.println("2. Register for CCA");
		System.out.println("3. Log Out");
	}

	private static void LoginMenu() {
		Helper.line(30, "=");
		System.out.println("CCA Registration System");
		Helper.line(30, "=");
		System.out.println("1. Login");
		System.out.println("2. Quit");
	}

	private void runSavingsProcess(Admin loginAccount) {
		int memberOption = -1;
		
		while (memberOption != 6) {
			memberOption = Helper.readInt("Enter choice > ");

			if (memberOption == 1) {
				StudentPage();
			} else if (memberOption == 2) {
				
			} else if (memberOption == 3) {
				System.out.println("Logging out.");
					
			} else {
				System.out.println("Invalid Option");
			}
		}
	}
	
	private void runSavingStudentProcess(Student loginAccount) {
		int memberOption = -1;
		
		while (memberOption != 3) {
			memberOption = Helper.readInt("Enter choice > ");
			if (memberOption == 1) {

			} else if (memberOption == 2) {
				

			} else if (memberOption == 3) {
				System.out.println("Logging out.");
			} else {
				System.out.println("Invalid Option");
			}
		}
	}

	private static Admin getLoginAccount(ArrayList<Admin> adminList) {
		Admin loginAccount = null;
		for (Admin a : adminList) {
			String enterName = Helper.readString("Enter Name > ");
			String enterPass = Helper.readString("Enter password > ");
			if (a.login(enterName, enterPass) == true) {
				loginAccount = a;
				AdminMenu();
				break;	
			}	else if (a.login(enterName, enterPass) == false) {
				System.out.println("Username or password entered is incorrect please login again !");
			}
		}	
		return loginAccount;
	}
	
	private static Student getStudAccount(ArrayList<Student> studentList) {
		Student loginAccount = null;
		for (Student s : studentList) {
			String enterName = Helper.readString("Enter Name > ");
			int enterID = Helper.readInt("Enter Student ID > ");
			if (s.login(enterName, enterID) == true) {
				loginAccount = s;
				StudentMenu();
				break;	
			}else if (s.login(enterName, enterID) == false) {
				System.out.println("Name or ID entered is incorrect please login again !");
			}
		}
		return loginAccount;
		
	}
	// Student Section
	private void StudentPage() {
		int option = -1;
		
		while (option != 4) {
			Helper.line(30, "=");
			System.out.println("STUDENT PAGE");
			Helper.line(30, "=");
			System.out.println("1. Add Student");
			System.out.println("2. view Student");
			System.out.println("3. Delete Student");
			System.out.println("4. Go to Main Page");
			option = Helper.readInt("Enter option > ");
			if (option == 1) {
				addStudent();
			} else if (option == 2) {
				viewStudent();
			} else if (option == 3) {
				
			} else if (option == 4){
				AdminMenu();
			} else {
				System.out.println("Invalid Option");
			}
		}
		
		
	}
	
	private void addStudent() {	
		int addGrade = Helper.readInt("Add Grade >");
		
		if (addGrade >= 4 && addGrade <= 6) {
			String addName = Helper.readString("Add Student Name > ");
			int addStudentID = Helper.readInt("Add Student ID > ");
			String classRoom = Helper.readString("Add ClassRoom > ");
			studentList.add(new Student(addName, addStudentID, addGrade, classRoom));
		} else if (addGrade <= 3 && addGrade >= 1) {
			String addName = Helper.readString("Add Student Name > ");
			int addStudentID = Helper.readInt("Add Student ID > ");
			String classRoom = Helper.readString("Add ClassRoom > ");
			String addParent = Helper.readString("Add Parent Name > ");
			String addEmail = Helper.readString("Add Parent Email > ");
			int contact = Helper.readInt("Add Contact Number > ");
			studentList.add(new Student(addName, addStudentID, addGrade, classRoom, 
					addParent, addEmail, contact));
		} else {
			System.out.println("Invalid Grade");
		}
		
	}
	
	private void viewStudent() {
		
		String output = String.format("%-10s %-10s %-10s %s\n", "Name", "Student ID", "Grade", "Class Room");
		for (Student s : studentList) {
			if (s.getGrade() >= 4 && s.getGrade() <= 6) {
				output += String.format("%-10s %-10d %-10d %s\n", 
						s.getName(), s.getStudentID(), s.getGrade(), s.getClassRoom());
			} else if (s.getGrade() <= 3 && s.getGrade() >= 1) {
				output += String.format("%-10s %-10d %-10d %-10s %-10s %-10s %d\n", 
						s.getName(), s.getStudentID(), s.getGrade(), s.getClassRoom(),
						s.getParentName(), s.getParentEmail(), s.getContactNo());
			}
		}
		
		System.out.println(output);
	}
	
	private void deleteStudent() {
		
	}
	
	// CCA Section
	public static void addStudentinCCA() {
		// TODO Auto-generated method stub
		// for students with cca
		String name = Helper.readString("Enter name > ");
		int studentID = Helper.readInt("Enter student ID > ");
		int grade = Helper.readInt("Enter grade > ");
		String cca = Helper.readString("Enter CCA");
		String classRoom = Helper.readString("Enter classroom > ");
		studentincca.add(new StudentinCCA(name, studentID, grade, classRoom, cca));
	}
	public static void viewStudentinCCA() {
		// TODO Auto-generated method stub
		for (int i = 0; i < studentincca.size(); i++){
			System.out.println(studentincca.get(i));
			
		}
		


}
}
