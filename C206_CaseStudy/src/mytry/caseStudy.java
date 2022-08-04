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
	
	

}


	


