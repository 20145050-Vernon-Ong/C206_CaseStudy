import java.util.ArrayList;

public class C206_CaseStudy {

	ArrayList<Admin> adminList = new ArrayList<Admin>();
	
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	ArrayList<Parents> parentList = new ArrayList<Parents>();
	
	ArrayList<CCA> ccaList = new ArrayList<CCA>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C206_CaseStudy starting = new C206_CaseStudy();
		starting.start();
	}

	private void start() {

		adminList.add(new Admin("Vernon Ong", "verC206DIT"));

		int option = -1;
		while (option != 2) {
			LoginMenu();
			option = Helper.readInt("Enter option > ");
			if (option == 1) {
				ASPMenu();
				Admin login = getLoginAccount(adminList);
				if (login != null) {
					runSavingsProcess(login);
				}
			} else if (option == 2) {
				System.out.println("Closing...");
			} else {
				System.out.println("Invalid Option.");
			}
		}
	}
	
	private static void ASPMenu() {
		System.out.println("1. Login as Admin");
		System.out.println("2. Login as Student (For P4 and above)");
		System.out.println("3. Login as Parents (For P3 and below)");
		System.out.println("4. Go back to Login Page");
	}

	private static void Menu() {
		Helper.line(30, "=");
		System.out.println("CCA Registration System");
		Helper.line(30, "=");
		System.out.println("1. Go to Student Page");
		System.out.println("2. Go to CCA Page");
		System.out.println("3. Go to CCA Category Page");
		System.out.println("4. Go to Paretns Page");
		System.out.println("5. Go to Student Registered Page");
		System.out.println("6. Go to Login Page");
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
			Menu();
			memberOption = Helper.readInt("Enter choice > ");

			if (memberOption == 1) {
				//Write code here to perform a deposit transaction.
				//C206_CaseStudy
				StudentPage();
			} else if (memberOption == 2) {
				//Write code here to perform a withdrawal transaction.
				//C206_CaseStudy

			} else if (memberOption == 3) {
				//Write code here to display user's info.
				//loginAcct.display();	
				
			} else if (memberOption == 4) {
				
			} else if (memberOption == 5) {
				
			} else if (memberOption == 6) {
				System.out.println("Logging out.");
			} else {
				System.out.println("Invalid Option");
			}
		}
	}

	private static Admin getLoginAccount(ArrayList<Admin> adminList) {
		Admin loginAccount = null;
		int enterOption = Helper.readInt("Enter Option > ");
		for (Admin a : adminList) {
			while (enterOption != 4) {
				String enterName = Helper.readString("Enter Name > ");
				String enterPass = Helper.readString("Enter password > ");
				if (enterOption == 1) {
					if (a.login(enterName, enterPass) == true) {
						loginAccount = a;
						break;
					}
				} else if (enterOption == 2) {
					if (a.login(enterName, enterPass) == true) {
						loginAccount = a;
						break;
					}
				} else if (enterOption == 3) {
					if (a.login(enterName, enterPass) == true) {
						loginAccount = a;
						break;
					}	
				} else if (enterOption == 4){
				
				} else {
					System.out.println("Invalid Option");
				}
			}
		}	
		return loginAccount;
	}
	
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
	

}
