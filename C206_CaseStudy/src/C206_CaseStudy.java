import java.util.ArrayList;
import java.util.regex.Pattern; 

public class C206_CaseStudy { 
	// ArrayList 
	ArrayList<Admin> adminList = new ArrayList<Admin>(); 

	ArrayList<Student> studentList = new ArrayList<Student>(); 

	ArrayList<ccaCordinator> ccaCordinatorList = new ArrayList<ccaCordinator>(); 

	ArrayList<CCA> ccaList = new ArrayList<CCA>(); 
	
	ArrayList<ccaCategory> ccaCategoryList = new ArrayList<ccaCategory>();
	
	ArrayList<parents> parentList = new ArrayList<parents>();

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		C206_CaseStudy starting = new C206_CaseStudy(); 
		starting.start(); 
	}

	private void start() {
		
		adminList.add(new Admin("Vernon Ong", "verC206DIT"));
		
		ccaCordinatorList.add(new ccaCordinator("Pearlyn", "Muay Thai", "pearlyn"));
		ccaCordinatorList.add(new ccaCordinator("Earnest", "Floorball", "earnest"));
		ccaCordinatorList.add(new ccaCordinator("Hew Rui", "Band", "rui"));
		ccaCordinatorList.add(new ccaCordinator("Sachin", "SOI CLub", "sachin"));
		
		ccaList.add(new CCA("Judo", "Sports", 30, "Thursday", "6.00-8.00", "Martial Arts Room", 
				"Chirs Lai", "Judo is a grappling style martial arts"));
		ccaList.add(new CCA("BasketBall", "Sports", 20, "Wednesday", "5.00-7.00", "Sports Hall", 
				"David Ng", "BasketBall is a 10 player game"));
		ccaList.add(new CCA("Archery", "Sports", 40, "Friday", "5.00-8.00", "Soccer Field",
				"George Lim", "Achery is about using Bow and Arrows"));
		
		parentList.add(new parents("Dave Lee", "dave123@gmail.com", 83214566, "Samuel Lee", 12345, 2, "C206", "Mr Low", 0));
		
		ccaCategoryList.add(new ccaCategory("Sports"));
		ccaCategoryList.add(new ccaCategory("Clubs & Societies"));
		ccaCategoryList.add(new ccaCategory("Performing Arts"));
		
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
				parents loginStud = getParentAccount(parentList); 
				if (loginStud != null) { 
					runSavingParentProcess(loginStud); 
				} 
			} else if (secondOption == 5) { 
				
			} else if (secondOption == 6) {
				regParent();
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
		System.out.println("2. Go to Parents Page"); 
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
		System.out.println("CCA Details Page"); 
		Helper.line(30, "=");
		System.out.println("1. View CCA Details");
		System.out.println("2. Add CCA Details"); 
		System.out.println("3. Edit CCA Details"); 
		System.out.println("4. Delete CCA Details"); 
		System.out.println("5. Go to CCA Cordinator Menu"); 
	} 
	
	private static void ccaCategoryMenu() {
		Helper.line(30, "="); 
		System.out.println("CCA Category Page"); 
		Helper.line(30, "=");
		System.out.println("1. View CCA Category");
		System.out.println("2. Add CCA Category"); 
		System.out.println("3. Delete CCA Category"); 
		System.out.println("4. Go to CCA Cordinator Menu");
	}
	
	private static void cordinatorMainMenu() {
		Helper.line(30, "="); 
		System.out.println("CCA Cordinator Menu"); 
		Helper.line(30, "=");
		System.out.println("1. View CCA Detail Page");
		System.out.println("2. View CCA Category Page"); 
		System.out.println("3. Log Out");
	}
	
	private static void regParentMenu() {
		Helper.line(30, "="); 
		System.out.println("Register Parent Page"); 
		Helper.line(30, "=");
	}


	private void runSavingsProcess(Admin loginAccount) { 
		int memberOption = -1; 

		while (memberOption != 4) {
			memberOption = Helper.readInt("Enter choice > "); 

			if (memberOption == 1) { 
				StudentPage(); 
			} else if (memberOption == 2) { 
				ParentsPage();
			} else if (memberOption == 3) {
				CCACordinatorPage();
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

	private void runSavingParentProcess(parents loginAccount) { 
		int memberOption = -1; 

		while (memberOption != 2) {
			memberOption = Helper.readInt("Enter choice > "); 
			if (memberOption == 1) { 
				regforCCAPage();
			} else if (memberOption == 2) { 
				System.out.println("Logging Out");
			} else { 
				System.out.println("Invalid Option"); 
			} 
		} 
	} 

	private void runSavingCordinatorProcess(ccaCordinator loginAccount) { 
		int memberOption = -1; 
		while (memberOption != 3) {
			memberOption = Helper.readInt("Enter choice  > "); 
			if (memberOption == 1) {
				cordinatorPage();
			} else if (memberOption == 2) { 
				categoryPage();
			} else if (memberOption == 3) { 
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
			Helper.line(50, "=");
			System.out.println("LOGIN AS ADMIN");
			Helper.line(50, "=");
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
			Helper.line(50, "=");
			System.out.println("LOGIN AS STUDENT");
			Helper.line(50, "=");
			int enterRegID = Helper.readInt("Enter CCA Registration ID > "); 
			int enterID = Helper.readInt("Enter Student ID > "); 
			if (s.login(enterRegID, enterID) == true) { 
				loginAccount = s; 
				StudentMenu(); 
				break;  
			}else if (s.login(enterRegID, enterID) == false) { 
				System.out.println("CCA Registeration ID or ID entered is incorrect please login again !"); 
			} 
		} 
		return loginAccount; 

	} 
	//parents to login 
	private static parents getParentAccount(ArrayList<parents> parentList) { 
		parents loginAccount = null; 
		for (parents p : parentList) {
			Helper.line(50, "=");
			System.out.println("LOGIN AS PARENTS");
			Helper.line(50, "=");
			int enterRegID = Helper.readInt("Enter Registeration ID > "); 
			int enterID = Helper.readInt("Enter Student ID > "); 
			if (p.login(enterRegID, enterID) == true) { 
				loginAccount = p; 
				System.out.println("1. Go to Register CCA Page");
				System.out.println("2. Log Out"); 
				break;  
			}else if (p.login(enterRegID, enterID) == false) { 
				System.out.println("CCA Registeration ID or ID entered is incorrect please login again !"); 
			} 
		} 
		return loginAccount; 

	} 

	private static ccaCordinator getCCACordinatorAccount(ArrayList<ccaCordinator> ccaCordinatorList) { 
		ccaCordinator loginAccount = null; 
		for (ccaCordinator c : ccaCordinatorList) {
			Helper.line(50, "=");
			System.out.println("LOGIN AS CCA CORDINATOR");
			Helper.line(50, "=");
			String enterName = Helper.readString("Enter Name > "); 
			String password = Helper.readString("Enter password > "); 
			if (c.login(enterName, password) == true) { 
				loginAccount = c;
				cordinatorMainMenu();
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
			System.out.println("Student PAGE"); 
			Helper.line(30, "="); 
			System.out.println("1. Add Student"); 
			System.out.println("2. View Student"); 
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
	
	private void ParentsPage() {
		int option = -1; 

		while (option != 4) { 
			Helper.line(30, "="); 
			System.out.println("Parents PAGE"); 
			Helper.line(30, "="); 
			System.out.println("1. View Parents"); 
			System.out.println("2. Delete Parents"); 
			System.out.println("3. Go to Main Page"); 
			option = Helper.readInt("Enter option > "); 
			if (option == 1) { 
				viewParent();
			} else if (option == 2) {
				deleteParent();
			} else if (option == 3){ 
				AdminMenu(); 
			} else { 
				System.out.println("Invalid Option"); 
			} 
		}
	}
	
	private void CCACordinatorPage() {
		int option = -1; 

		while (option != 4) { 
			Helper.line(30, "="); 
			System.out.println("CCA Cordinator PAGE"); 
			Helper.line(30, "="); 
			System.out.println("1. Add CCA Cordinator"); 
			System.out.println("2. View All CCA Cordinator"); 
			System.out.println("3. Delete CCA Cordinator");
			System.out.println("4. Go to Main Page"); 
			option = Helper.readInt("Enter option > "); 
			if (option == 1) { 
				addCCACordinator();
			} else if (option == 2) {
				viewAllCCACordinator();
			} else if (option == 3) {
				deleteCordinator();
			} else if (option == 4){ 
				AdminMenu(); 
			} else { 
				System.out.println("Invalid Option"); 
			} 
		}
	}
	
	private void cordinatorPage() {
		int memberOption = -1;
		while (memberOption != 5) {
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
				cordinatorMainMenu();
			} else { 
				System.out.println("Invalid Option"); 
			} 
		}
	}
	
	private void categoryPage() {
		int option = -1;
		
		while (option != 4) {
			ccaCategoryMenu();
			option = Helper.readInt("Enter choice > ");
			if (option == 1) {
				viewCCACategory();
			} else if (option == 2) {
				addCCACategory();
			} else if (option == 3) {
				deleteCCACategory();
			} else if (option == 4) {
				cordinatorMainMenu();
			} else {
				System.out.println("Invalid Option");
			}
		}
	}
	
	private void regforCCAPage() {
		int option = -1;
		
		while (option != 4) {
			ParentsMenu();
			option = Helper.readInt("Enter choice > ");
			if (option == 1) {
				viewStudent();
			} else if (option == 2) {
				RegisterStudent();
			} else if (option == 3) {
				viewCCADetails();
			} else if (option == 4) {
				System.out.println("1. Go to Register CCA Page");
				System.out.println("2. Log Out"); 
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
			for (Student s : studentList) {
				studentList.add(new Student(addName, addStudentID, addGrade, classRoom, cca, s.getRegisterationID()));
				System.out.println("CCA Registration ID is " + s.getRegisterationID());
				break;
			}
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
			}
			for (parents p : parentList) {
				output += String.format("%-10s %-10d %-10d %-10s %-10s %-10s %d\n",  
						p.getName(), p.getStudentID(), p.getGrade(), p.getClassRoom(), 
						p.getParentName(), p.getParentEmail(), p.getContactNo()); 
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
	private void viewCCADetails() {
		Helper.line(50, "=");
		System.out.println("View CCA DETAILS");
		Helper.line(50, "=");
		String output = "";
		output += String.format("%-10s %-13s %-13s %-13s %-13s %-20s %-15s %s\n", 
				"CCA TITLE", "CCA CATEGORY", "CLASS SIZE",
				"CCA DAY", "CCA TIME", "CCA VENUE", "CCA INSTRUCTOR", "CCA DESCRIPTION");
		for (CCA c : ccaList) {
			output += String.format("%-10s %-13s %-13d %-13s %-13s %-20s %-15s %s\n", c.getTitle(), 
					c.getCategory(), c.getClassSize(), c.getDay(), 
					c.getTime(), c.getVenue(), c.getInstructor(), c.getDescription());
		}

		System.out.println(output);
	}

	private void addCCADetails() {
		Helper.line(50, "=");
		System.out.println("ADD CCA DETAILS");
		Helper.line(50, "=");
		String addTitle = Helper.readString("Enter CCA Title > ");
		String addCategory = Helper.readString("Enter CCA Category > ");
		int addClassSize = Helper.readInt("Enter CCA Class Size > ");
		if (addClassSize > 50) {
			System.out.println("Class Size cannot be more than 50.");
		} else {
			String addDay = Helper.readString("Enter CCA Day > ");
			String regexDay = "(Mon|Tues|Wednes|Thurs|Fri|Satur|Sun)(day)";
			boolean matchDay = Pattern.matches(regexDay, addDay);
			if (matchDay == true) {
				String addTime = Helper.readString("Enter CCA Time > ");
				String venue = Helper.readString("Enter CCA Venue > ");
				String instructor = Helper.readString("Enter CCA instructor > " );
				String addDescribe = Helper.readString("Enter CCA Description > ");
				ccaList.add(new CCA(addTitle, addCategory, addClassSize, addDay, addTime, venue, instructor, addDescribe));
			} else {
				System.out.println("Invalid Day");
			}
		}
	}

	private void editCCADetails() {
		Helper.line(50, "=");
		System.out.println("Edit CCA DETAILS");
		Helper.line(50, "=");
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
					option = Helper.readInt("Enter option > ");
					if (option == 1) {
						String editDescribe = Helper.readString("Edit CCA Description > ");
						c.setDescription(editDescribe);
					} else if (option == 2) {
						String editDay = Helper.readString("Edit CCA Day > ");
						c.setDay(editDay);
					} else if (option == 3) {
						String editTime = Helper.readString("Edit CCA Time > ");
						c.setTime(editTime);
					} else if (option == 4) {
						String editVenue = Helper.readString("Edit CCA Venue > ");
						c.setVenue(editVenue);
					} else if (option == 5) {
						String editInstructor = Helper.readString("Edit CCA Instructor > ");
						c.setInstructor(editInstructor);
					} else if (option == 6) {
						cordinatorPage();
					} else {
						System.out.println("Invalid Option");
					}
				}
			}
		}
	}

	private void deleteCCADetails() {
		Helper.line(50, "=");
		System.out.println("Delete CCA DETAILS");
		Helper.line(50, "=");
		String delCCATitle = Helper.readString("Enter CCA details to delete > ");
		for (int i = 0; i < ccaList.size(); i++) {
			if (ccaList.get(i).getTitle().equals(delCCATitle)) {
				ccaList.remove(i);
				break;
			}
		}

	}

	//CCA Cordinator Section
	private void addCCACordinator() {
		Helper.line(50, "=");
		System.out.println("ADD CCA CORDINATOR");
		Helper.line(50, "=");
		String instructorName = Helper.readString("Enter Instructor Name > ");
		String CCAAssigned = Helper.readString("Enter Assigned CCA > ");
		String password = Helper.readString("Register Password > ");
		ccaCordinatorList.add(new ccaCordinator(instructorName, CCAAssigned, password));
	}
	
	
	private void viewAllCCACordinator() {
		Helper.line(50, "=");
		System.out.println("VIEW ALL CCA CORDINATOR");
		Helper.line(50, "=");
		String output = String.format("%-10s %-10s\n", "NAME", "CCA ASSIGNED");
		for (ccaCordinator c : ccaCordinatorList) {
			output += String.format("%-10s %-10s\n", c.getInstructor(), c.getCCAassigned());
		}
		System.out.println(output);
	} 
	
	private void deleteCordinator() {
		String askName = Helper.readString("Enter CCA Cordinator Name > ");
		String askCCA = Helper.readString("Enter CCA Assigned > ");
		for (int i = 0; i < ccaCordinatorList.size(); i++) {
			if (askName.equals(ccaCordinatorList.get(i).getInstructor()) && 
					askCCA.equals(ccaCordinatorList.get(i).getCCAassigned())) {
				ccaCordinatorList.remove(i);
			}
		}
	}
	
	private void addCCACategory() {
		String addCate = Helper.readString("Enter category > ");
		ccaCategoryList.add(new ccaCategory(addCate));
	}
	
	private void viewCCACategory() {
		String output = String.format("%-10s\n", "CATEGORY");
		for (ccaCategory c : ccaCategoryList) {
			output += String.format("%-10s\n", c.getCategory());
		}
		
		System.out.println(output);
	}
	
	private void deleteCCACategory() {
		String delCate = Helper.readString("Enter category > ");
		for (int i = 0; i < ccaCategoryList.size(); i++) {
			if (ccaCategoryList.get(i).getCategory().equals(delCate)) {
				ccaCategoryList.remove(i);
			}
		}
	}
	
	private void regParent() {
		regParentMenu();
		String regParentName = Helper.readString("Enter your name > ");
		String regParentEmail = Helper.readString("Enter your email > ");
		String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		boolean matchEmail = Pattern.matches(regex, regParentEmail);
		if (matchEmail == true) {
			int contactNo = Helper.readInt("Enter contact number > ");
			String childName = Helper.readString("Enter your child name > ");
			int studentID = Helper.readInt("Enter your child student ID > ");
			int studentG = Helper.readInt("Enter student grade > ");
			String classRoom = Helper.readString("Enter class room > ");
			String teacher = Helper.readString("Enter class room teacher > ");
			for (parents p : parentList) {
				parentList.add(new parents(regParentName, regParentEmail, contactNo, childName,
					studentID, studentG, classRoom, teacher, p.getRegisterationID()));
				System.out.println("CCA Registration ID is " + p.getRegisterationID());
				break;
			}
		}
		
	}
	
	private void viewParent() {
		String output = String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", 
				"Parent Name", "Parent Email", "Contact Number", "Child Name", "Student ID", "Grade", "Classroom", "Teacher");
		for (parents p : parentList) {
			output += String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n", 
					p.getParentName(), p.getParentEmail(), p.getContactNo(), p.getName(), p.getStudentID(), p.getGrade(),
					p.getClassRoom(), p.getTeacher());
		}
		System.out.println(output);
	}
	
	private void deleteParent() {
		String askName = Helper.readString("Enter Parent Name > ");
		String askEmail = Helper.readString("Enter Paretn Email > ");
		for (int i = 0; i < parentList.size(); i++) {
			if (askName.equals(parentList.get(i).getParentName()) && askEmail.equals(parentList.get(i).getParentEmail())) {
				parentList.remove(i);
			}
		}
	}
	
	private void regCCA() {
		String name = Helper.readString("Enter name > ");
		int grade = Helper.readInt("Enter grade > ");
		String CLASS = Helper.readString("Enter classroom > ");
		
		for (Student s : studentList) {
			if (name.equals(s.getName()) && (grade >= 4 && grade <= 6) && CLASS.equals(s.getClassRoom())) {
				int ccaweek = Helper.readInt("Enter how many cca per week > ");
				if (ccaweek > 0 && ccaweek < 4) {
					int ccaday = Helper.readInt("Enter how many cca per day > ");
					if (ccaday > 2 && ccaday < 0) {
						System.out.println("Only can take 2 cca per day");
					} else {
						s.setCcaperDay(ccaday);
						s.setCcaperWeek(ccaweek);
					}
				} else {
					System.out.println("Only can take 3 cca per week");
				}
			}
		}
	}

}