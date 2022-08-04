package mytry;

import java.util.ArrayList;

public class caseStudy {
	ArrayList<Admin> adminList = new ArrayList<Admin>(); 
	
	ArrayList<Student> studentList = new ArrayList<Student>(); 
  
    ArrayList<ccaCoordinator> ccaCordinatorList = new ArrayList<ccaCoordinator>(); 
  
    ArrayList<CCA> ccaList = new ArrayList<CCA>(); 
    ArrayList<Parent> ParentList= new ArrayList<Parent>();
    
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		caseStudy starting = new caseStudy(); 
	       starting.start(); 
	    }
	private void start() { 
		 
	       adminList.add(new Admin("Vernon Ong", "verC206DIT")); 
	       //studentList.add(new Student("Earnest", 2003, 4, "C206")); 
	       ccaCordinatorList.add(new ccaCoordinator("Pearlyn", "Muay Thai", "pear3002"));
	       ccaList.add(new CCA("BasketBall", "Sports", "BasketBall is a 10 player game", 20, "Wednesday", 5.00, "Sports Hall", "Pearlyn"));
	 
	       int option = -1; 
	       while (option != 2) { 
	    	   LoginMenu(); 
	    	   option = Helper.readInt("Enter option > "); 
	    	   if (option == 1) { 
	    		  // secondStart(); 
	    		   } else if (option == 2) { 
	    			   System.out.println("Closing...");
	    		   } else { 
	    			   System.out.println("Invalid Option."); 
	    		   } 
	      } 
	     } 
	    
//	    private void secondStart() { 
//	    	int secondOption = -1; 
//	    	while (secondOption != 7) { 
//	    		ASPMenu(); 
//	    	    secondOption = Helper.readInt("Enter option > "); 
//	    	    if (secondOption == 1) { 
//	    	        Admin login = loginAdmin(adminList); 
//	    	        if (login != null) { 
//	    	             runSavingsProcess(login); 
//	    	        } 
//	    	    } else if (secondOption == 2) { 
//	    	         ccaCoordinator loginCordinator = loginCCAcoord(ccaCordinatorList); 
//	    	         if (loginCordinator != null) { 
//	    	             runSavingCordinatorProcess(loginCordinator); 
//	    	         }  
//	    	   } else if (secondOption == 3) { 
//	    		   Student loginStud = loginStudent(studentList); 
//	    		   if (loginStud != null) { 
//	       	             runSavingStudentProcess(loginStud); 
//	       	       } 
//	    	   } else if (secondOption == 4) { 
//	    	       Student loginPar = loginParent(ParentList); 
//	    	       if (loginPar != null) { 
//	    	             runSavingParentProcess(loginPar); 
//	    	       } 
//	    	   } else if (secondOption == 5) { 
//	    	  
//	    	   } else if (secondOption == 7) { 
//	    	     
//	    	   } else { 
//	    	    System.out.println("Invalid Option > "); 
//	    	   } 
//	     } 
//	   } 
	  
	 
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
	  System.out.println("1. Add CCA Details"); 
	  System.out.println("2. Edit CCA Details"); 
	  System.out.println("3. Delete CCA Details"); 
	  System.out.println("4. Log Out"); 
	 } 
	 
	 private void runSavingsProcess(Admin loginAccount) { 
		  int memberOption = -1; 
		   
		  while (memberOption != 3) {
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
			  
			 private void runSavingCordinatorProcess(ccaCoordinator loginAccount) { 
			  int memberOption = -1; 
			   
			  while (memberOption != 4) { 
			   memberOption = Helper.readInt("Enter choice  > "); 
			   if (memberOption == 1) { 
				   addCCADetails();
			   } else if (memberOption == 2) { 
				   editCCADetails();
			   } else if (memberOption == 3) { 
				   deleteCCADetails();
			   } else if (memberOption == 4) { 
			    System.out.println("Logging Out"); 
			   } else { 
			    System.out.println("Invalid Option"); 
			   } 
			  } 
			 } 
	
	
	
	
	public static boolean loginCCAcoord(ArrayList<ccaCoordinator> arrList, String n, String p) {
		boolean isFound = false;
		for (ccaCoordinator c : arrList) {
			if (c.getName().equalsIgnoreCase(n) && c.getPassword().equalsIgnoreCase(p)) {
				isFound = true;
				break;
			}
		}
		return isFound;
		
	}
	public static boolean loginAdmin(ArrayList<Admin> arrList, String n, String p) {
		boolean isFound = false;
		for (Admin a : arrList) {
			if (a.getName().equalsIgnoreCase(n) && a.getPassword().equalsIgnoreCase(p)) {
				isFound = true;
				break;
			}
		}
		return isFound;
		
	}
	public static boolean loginStudent(ArrayList<Student> arrList, String n, int ID) {
		boolean isFound = false;
		for (Student s : arrList) {
			if (s.getName().equalsIgnoreCase(n) &&  ID == s.getStudentID()) {
				isFound = true;
				break;
			}
		}
		return isFound;
		
	}
	public static boolean loginParent(ArrayList<Parent> arrList, int rando, int ID) {
		boolean isFound = false;
		for (Parent p : arrList) {
			if (p.getStudentID() == ID && p.getRandomGenerate() == rando ) {
				isFound = true;
				break;
			}
		}
		return isFound;
		
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
		  
		 private void RegisterStudent() {  
		  int addGrade = Helper.readInt("Add Grade >"); 
		   
		 
		   String addName = Helper.readString("Add Student Name > "); 
		   int addStudentID = Helper.readInt("Add Student ID > "); 
		   String classRoom = Helper.readString("Add ClassRoom > ");
		   String cca = Helper.readString("Enter CCA Name > ");
		   studentList.add(new Student(addName, addStudentID, addGrade, classRoom, cca)); 
		  } 
		  	
		 public void RegisterParent() {

			 int addGrade = Helper.readInt("Add Grade >");
			 String addName = Helper.readString("Add Student Name > "); 
			 int addStudentID = Helper.readInt("Add Student ID > ");
			 String classRoom = Helper.readString("Add ClassRoom > "); 
			 String addParent = Helper.readString("Add Parent Name > "); 
			 String addEmail = Helper.readString("Add Parent Email > "); 
			 int contact = Helper.readInt("Add Contact Number > ");
			 String cca = Helper.readString("Enter CCA Name > ");
			 
			 ParentList.add(new Parent(addStudentID,addName ,addGrade, classRoom, addParent, addEmail, contact)); 
		  } 
		   
		 
		  
		 private void viewStudent() { 
		   
		  String output = String.format("%-10s %-10s %-10s %s\n", "Name", "Student ID", "Grade", "Class Room"); 
		  for (Student s : studentList) { 
		   
		    output += String.format("%-10s %-10d %-10d %s\n",  
		      s.getName(), s.getStudentID(), s.getGrade(), s.getClassRoom()); 
		 
		  } 
		   
		  System.out.println(output); 
		 } 
		  
		 public void ViewParentStudent() {
			 String output= String.format("%-10s %-10s %-10s %-10s %-20s %-50s %s\n","Student ID","Student Name","Student Grade","Student ClassRoom","Parent Name","Parent Email","Parent Contact");
			 for(Parent p :ParentList){
				 output += String.format("%-10d %-10s %-10d %-10s %-20s %-50s %d\n",p.getStudentID(),p.getName(),p.getGrade(),p.getClassRoom(),p.getParentName(),p.getParentEmail(),p.getContactNo());
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
			 
		 }

		 private void deleteCCADetails() {
			 
		 }

}


	


