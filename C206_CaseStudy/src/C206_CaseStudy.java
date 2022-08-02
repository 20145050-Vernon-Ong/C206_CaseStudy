import java.util.ArrayList;

public class C206_CaseStudy {

	ArrayList<Admin> adminList = new ArrayList<Admin>();

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
				Admin login = getLoginAccount(adminList);
				if (login != null) {
					C206_CaseStudy.runSavingsProcess(login);
				}
			} else if (option == 2) {
				System.out.println("Closing...");
			} else {
				System.out.println("Invalid Option.");
			}
		}
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

	private static void runSavingsProcess(Admin loginAccount) {
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
		String enterName = Helper.readString("Enter Name > ");
		String enterPass = Helper.readString("Enter password > ");
		for (Admin a : adminList) {
			if (a.login(enterName, enterPass) == true) {
				loginAccount = a;
				break;
			}
		}

		return loginAccount;
	}
	
	private static void StudentPage() {
		int option = -1;
		
		while (option != 4) {
			System.out.println("1. Add Student");
			System.out.println("2. view Student");
			System.out.println("3. Delete Student");
			System.out.println("4. Go to Main Page");
			option = Helper.readInt("Enter option > ");
		}
	}

}
