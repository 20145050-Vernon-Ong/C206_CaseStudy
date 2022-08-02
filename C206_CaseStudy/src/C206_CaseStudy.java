import java.util.ArrayList;

public class C206_CaseStudy {
	
	ArrayList<Admin> adminList = new ArrayList<Admin>();

	adminList.add(new Admin("Vernon Ong", "verC206DIT"));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = -1;
		
		while (option != 2) {
			Admin login = getLoginAccount(adminList);
			if (login != null) {
			C206_CaseStudy.runSavingsProcess(login);
			}
			option = Helper.readInt("Enter password > ");
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
	
	private static void runSavingsProcess(Admin adminList) {
		int memberOption = -1;

		while (memberOption != 4) {
			Menu();
			memberOption = Helper.readInt("Enter choice > ");

			if (memberOption == 1) {
				
				//Write code here to perform a deposit transaction.
				//C206_CaseStudy
				
			} else if (memberOption == 2) {
				//Write code here to perform a withdrawal transaction.
				//C206_CaseStudy
				
			} else if (memberOption == 3) {
				//Write code here to display user's info.
				//loginAcct.display();			
			} else if (memberOption == 4) {
				System.out.println("Logging out.");
			}
		}
	}
	
	private static Admin getLoginAccount(ArrayList<Admin> adminList) {
		Admin loginAccount = null;
		while (loginAccount == null) {
			String enterName = Helper.readString("Enter Name > ");
			String enterPass = Helper.readString("Enter password > ");
			for (Admin a : adminList) {
				if (a.login(enterName, enterPass) == true) {
					loginAccount = a;
					System.out.println("Logged In");
					break;
				}
			}
			
			
		}
		return loginAccount;
	}

}
