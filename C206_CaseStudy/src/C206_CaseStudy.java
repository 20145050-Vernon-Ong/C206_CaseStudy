
public class C206_CaseStudy {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		
		while (option != 3) {
			LoginMenu();
			option = Helper.readInt("Enter option > ");
		}
		
	}
	
	private static void Menu() {
		Helper.line(30, "=");
		System.out.println("CCA Registration System");
		Helper.line(30, "=");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3. Go to Login Page");
	}
	
	private static void LoginMenu() {
		Helper.line(30, "=");
		System.out.println("CCA Registration System");
		Helper.line(30, "=");
		System.out.println("1. Login");
		System.out.println("2. Quit");
	}

}
