import java.util.ArrayList; 

public class C206_CaseStudy { 
	// ArrayList 
	ArrayList<Admin> adminList = new ArrayList<Admin>(); 

	ArrayList<Student> studentList = new ArrayList<Student>(); 

	ArrayList<ccaCordinator> ccaCordinatorList = new ArrayList<ccaCordinator>(); 

	ArrayList<CCA> ccaList = new ArrayList<CCA>(); 

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		C206_CaseStudy starting = new C206_CaseStudy(); 
		starting.start(); 
	}

	private void start() { 

		adminList.add(new Admin("Vernon Ong", "verC206DIT")); 
		//studentList.add(new Student("Earnest", 2003, 4, "C206")); 
		ccaCordinatorList.add(new ccaCordinator("Pearlyn", "Muay Thai", "pear3002"));
		ccaList.add(new CCA("BasketBall", "Sports", "BasketBall is a 10 player game", 20, "Wednesday", 5.00, "Sports Hall", "Pearlyn"));

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
		while (secondOption != 7) { 
			ASPMenu(); 
			secondOption = Helper.readInt("Enter option > "); 
			if (secondOption == 1) { 
				Admin login = getLoginAccount(adminList); 
				if (login != null) { 
					runSavingsProcess(login); 
				} 
			} else if (secondOption == 2) { 
				ccaCordinator loginCordinator = getCCACordinatorAccount(ccaCordinatorList); 
				if (loginCordinator != null) { 
					runSavingCordinatorProcess(loginCordinator); 
				}  
			} else if (secondOption == 3) { 
				Student loginStud = getStudAccount(studentList); 
				if (loginStud != null) { 
					runSavingStudentProcess(loginStud); 
				} 
			} else if (secondOption == 4) { 
				Student loginStud = getParentAccount(studentList); 
				if (loginStud != null) { 
					runSavingParentProcess(loginStud); 
				} 
			} else if (secondOption == 5) { 

			} else if (secondOption == 7) { 

			} else { 
				System.out.println("Invalid Option > "); 
			} 
		} 
	} 
	//menus 
	private static void ASPMenu() { 
		Helper.line(30, "=");
		System.out.println("Logging Page"); 
		Helper.line(30, "="); 
		System.out.println("1. Login as Admin"); 
		System.out.println("2. Login as CCA Cordinator"); 
		System.out.println("3. Login as Student (For P4 and Above)"); 
		System.out.println("4. Login as Parents (For P3 and Below)"); 
		System.out.println("5. Register Student Account"); 
		System.out.println("6. Register Parent Account"); 
		System.out.println("7. Go back to Main Page"); 
	} 

	private static void AdminMenu() { 
		Helper.line(30, "="); 
		System.out.println("CCA Registration System"); 
		Helper.line(30, "="); 
		System.out.println("1. Go to Student Page"); 
		System.out.println("2. Go to CCA Page"); 
		System.out.println("3. View CCA Cordinator");
		System.out.println("4. Log Out");
	} 

	private static void StudentMenu() { 
		Helper.line(30, "="); 
		System.out.println("CCA Registration System"); 
		Helper.line(30, "="); 
		System.out.println("1. Go to view CCA"); 
		System.out.println("2. Register for CCA"); 
		System.out.println("3. Log Out");
	} 

	private static void ParentsMenu() { 
		Helper.line(30, "="); 
		System.out.println("CCA Registration System"); 
		Helper.line(30, "="); 
		System.out.println("1. View Student Details"); 
		System.out.println("2. Register Student for CCA"); 
		System.out.println("3. View CCA Page"); 
		System.out.println("4. Log Out");
	} 

	private static void LoginMenu() { 
		Helper.line(30, "="); 
		System.out.println("CCA Registration System"); 
		Helper.line(30, "="); 
		System.out.println("1. Login"); 
		System.out.println("2. Quit"); 
	} 

	private static void ccaCordinatorMenu() { 
		Helper.line(30, "="); 
		System.out.println("CCA Registration System"); 
		Helper.line(30, "=");
		System.out.println("1. View CCA Details");
		System.out.println("2. Add CCA Details"); 
		System.out.println("3. Edit CCA Details"); 
		System.out.println("4. Delete CCA Details"); 
		System.out.println("5. Log Out"); 
	} 


	private void runSavingsProcess(Admin loginAccount) { 
		int memberOption = -1; 

		while (memberOption != 4) {
			memberOption = Helper.readInt("Enter choice > "); 

			if (memberOption == 1) { 
				StudentPage(); 
			} else if (memberOption == 2) { 
			
			} else if (memberOption == 3) {
				
			} else if (memberOption == 4) { 
				System.out.println("Logging out."); 

			} else { 
				System.out.println("Invalid Option"); 
			} 
		} 
	} 

	private void runSavingStudentProcess(Student loginAccount) { 
		int memberOption = -1; 

		while (memberOption != 4) { 
			memberOption = Helper.readInt("Enter choice > "); 
			if (memberOption == 1) { 

			} else if (memberOption == 2) { 


			} else if (memberOption == 3) { 


			} else if (memberOption == 4) {
				System.out.println("Logging Out."); 
			} else { 
				System.out.println("Invalid Option"); 
			} 
		} 
	} 

	private void runSavingParentProcess(Student loginAccount) { 
		int memberOption = -1; 

		while (memberOption != 4) { 
			memberOption = Helper.readInt("Enter choice > "); 
			if (memberOption == 1) { 

			} else if (memberOption == 2) { 

			} else if (memberOption == 3) { 

			} else if (memberOption == 4) { 
				System.out.println("Logging Out"); 
			} else { 
				System.out.println("Invalid Option"); 
			} 
		} 
	} 

	private void runSavingCordinatorProcess(ccaCordinator loginAccount) { 
		int memberOption = -1; 

		while (memberOption != 4) { 
			ccaCordinatorMenu();
			memberOption = Helper.readInt("Enter choice  > "); 
			if (memberOption == 1) { 
				viewCCADetails();
			} else if (memberOption == 2) { 
				addCCADetails();
			} else if (memberOption == 3) { 
				editCCADetails();
			} else if (memberOption == 4) {
				deleteCCADetails();
			} else if (memberOption == 5) { 
				System.out.println("Logging Out");
			} else { 
				System.out.println("Invalid Option"); 
			} 
		} 
	} 
	//logins 
	private static Admin getLoginAccount(ArrayList<Admin> adminList) { 
		Admin loginAccount = null; 
		for (Admin a : adminList) { 
			String enterName = Helper.readString("Enter Name > "); 
			String enterPass = Helper.readString("Enter password > "); 
			if (a.login(enterName, enterPass) == true) { 
				loginAccount = a; 
				AdminMenu(); 
				break;  
			} else if (a.login(enterName, enterPass) == false) { 
				System.out.println("Username or password entered is incorrect please login again !"); 
			} 
		}  
		return loginAccount; 
	} 
	//parent to register student for CCA 
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
	//parents to login 
	private static Student getParentAccount(ArrayList<Student> studentList) { 
		Student loginAccount = null; 
		for (Student s : studentList) { 
			String enterName = Helper.readString("Enter Name > "); 
			int enterID = Helper.readInt("Enter Student ID > "); 
			if (s.login(enterName, enterID) == true) { 
				loginAccount = s; 
				ParentsMenu(); 
				break;  
			}else if (s.login(enterName, enterID) == false) { 
				System.out.println("Name or ID entered is incorrect please login again !"); 
			} 
		} 
		return loginAccount; 

	} 

	private static ccaCordinator getCCACordinatorAccount(ArrayList<ccaCordinator> ccaCordinatorList) { 
		ccaCordinator loginAccount = null; 
		for (ccaCordinator c : ccaCordinatorList) { 
			String enterName = Helper.readString("Enter Name > "); 
			String password = Helper.readString("Enter password > "); 
			if (c.login(enterName, password) == true) { 
				loginAccount = c; 
				ccaCordinatorMenu(); 
				break; 
			} else if (c.login(enterName, password) == false) { 
				System.out.println("Name or Password entered is incorrect please login again !"); 
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
				RegisterStudent();
			} else if (option == 2) {
				viewStudent(); 
			} else if (option == 3) {
				deleteStudent();
			} else if (option == 4){ 
				AdminMenu(); 
			} else { 
				System.out.println("Invalid Option"); 
			} 
		} 

	}

	private void ccaCordinatorPage() {

		int option = -1;

		while (option != 5) {
			option = Helper.readInt("Enter option > ");
			if (option == 1) {
				viewCCADetails();
			} else if (option == 2) {
				addCCADetails();
			} else if (option == 3) {
				editCCADetails();
			} else if (option == 4) {
				deleteCCADetails();
			} else if (option == 5) {
				ccaCordinatorMenu();
			} else {
				System.out.println("Invalid Option");
			}
		}
	}

	private void RegisterStudent() {  
		int addGrade = Helper.readInt("Add Grade >"); 

		if (addGrade >= 4 && addGrade <= 6) { 
			String addName = Helper.readString("Add Student Name > "); 
			int addStudentID = Helper.readInt("Add Student ID > "); 
			String classRoom = Helper.readString("Add ClassRoom > ");
			String cca = Helper.readString("Enter CCA Name > ");
			studentList.add(new Student(addName, addStudentID, addGrade, classRoom, cca)); 
		} else if (addGrade <= 3 && addGrade >= 1) { 
			String addName = Helper.readString("Add Student Name > "); 
			int addStudentID = Helper.readInt("Add Student ID > "); 
			String classRoom = Helper.readString("Add ClassRoom > "); 
			String addParent = Helper.readString("Add Parent Name > "); 
			String addEmail = Helper.readString("Add Parent Email > "); 
			int contact = Helper.readInt("Add Contact Number > ");
			String cca = Helper.readString("Enter CCA Name > ");
			studentList.add(new Student(addName, addStudentID, addGrade, classRoom,  
					addParent, addEmail, contact, cca)); 
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
		int delStudentID = Helper.readInt("Enter Student ID > ");
		for (Student s : studentList) {
			if (delStudentID == s.getStudentID()) {
				studentList.remove(delStudentID);
			}
		}
	} 

	// CCA Section 


	//CCA Cordinator Section
	private void viewCCADetails() {
		String output = "";
		output += String.format("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %s\n", 
				"CCA TITLE", "CCA CATEGORY", "CCA DESCRIPTION", "CLASS SIZE",
				"CCA DAY", "CCA TIME", "CCA VENUE", "CCA INSTRUCTOR");
		for (CCA c : ccaList) {
			output += String.format("%-10s %-10s %-10s %-10d %-10s %-10.2f %-10s %s\n", c.getTitle(), 
					c.getCategory(), c.getDescription(), c.getClassSize(),
					c.getDay(), c.getTime(), c.getVenue(), c.getInstructor());
		}

		System.out.println(output);
	}

	private void addCCADetails() {
		System.out.println("ADD CCA DETAILS");
		String addTitle = Helper.readString("Enter CCA Title > ");
		String addCategory = Helper.readString("Enter CCA Category > ");
		String addDescribe = Helper.readString("Enter CCA Description > ");
		int addClassSize = Helper.readInt("Enter CCA Class Size > ");
		String addDay = Helper.readString("Enter CCA Day > ");
		double addTime = Helper.readDouble("Enter CCA Time > ");
		String venue = Helper.readString("Enter CCA Venue > ");
		String instructor = Helper.readString("Enter CCA instructor > " );
		ccaList.add(new CCA(addTitle, addCategory, addDescribe, addClassSize, addDay, addTime, venue, instructor));
	}

	private void editCCADetails() {
		int option = -1;
		for (CCA c : ccaList) {
			String ccaTitle = Helper.readString("Enter CCA Title > ");
			if (ccaTitle.equals(c.getTitle())) {
				while (option != 6) {
					System.out.println("1. Edit CCA Description");
					System.out.println("2. Edit CCA Day");
					System.out.println("3. Edit CCA Time");
					System.out.println("4. Edit CCA Venue");
					System.out.println("5. Edit CCA Instructor");
					System.out.println("6. Go Back to CCA Cordinator Page");
					if (option == 1) {
						String editDescribe = Helper.readString("Edit CCA Description > ");
						c.setDescription(editDescribe);
					} else if (option == 2) {
						String editDay = Helper.readString("Edit CCA Day > ");
						c.setDay(editDay);
					} else if (option == 3) {
						double editTime = Helper.readDouble("Edit CCA Time > ");
						c.setTime(editTime);
					} else if (option == 4) {
						String editVenue = Helper.readString("Edit CCA Venue > ");
					} else if (option == 5) {

					} else if (option == 6) {

					} else {
						System.out.println("Invalid Option");
					}
				}
			}
		}
	}

	private void deleteCCADetails() {

		String delCCATitle = Helper.readString("Enter CCA details to delete > ");
		for (CCA C : ccaList) {
			if (delCCATitle.equals(C.getTitle())) {
				ccaList.remove(delCCATitle);
			}
		}

	}


}