import java.util.ArrayList;

public class C206_CaseStudy {
	
	ArrayList<Admin> adminList = new ArrayList<Admin>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		
		while (option != 2) {
			try {
				runSavingsProcess(adminList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
				RePublicBank.doDeposit(loginAcct);
				
			} else if (memberOption == 2) {
				//Write code here to perform a withdrawal transaction.
				RePublicBank.doWithdraw(loginAcct);
				
			} else if (memberOption == 3) {
				//Write code here to display user's info.
				loginAcct.display();			
			} else if (memberOption == 4) {
				System.out.println("Logging out.");
			}
		}
	}
	
	private static  getLoginAccount(ArrayList<RePublicPay> accountList) {
		RePublicPay loginAcct = null;
		int numTries = 0;
		//Write code here to cycle through the ArrayList of RePublicPay objects and returns an RePublicPay object if the account number and pin is valid.
		while (loginAcct == null && numTries < MAX_NUM_TRIES) {
			int acctNum = Helper.readInt("Account number > ");
			int pin = Helper.readInt("Enter Pin > ");
			for(RePublicPay op : accountList) {
			if (op.login(acctNum, pin) == true) {
				loginAcct = op;
				System.out.println("Logged in");
				break;	
	
			   }
		   }
			numTries++;
			for (int i = 0; i < accountList.size(); i++) {
			   if (numTries == MAX_NUM_TRIES && accountList.get(i).getStatus() == 1) {
				   accountList.get(i).deactivate();
				   System.out.println("You have exceeded 3 login attempts!");
				   System.out.println("This account have been locked. Please contact RePublicPay Administrator.");
				   break;
				} else if (accountList.get(i).getStatus() == 0) {
					loginAcct = null;
					System.out.println("This account is locked. Please contact RePublicPay Administrator.");
				}
				
			}
			
	        //Continue to prompt the user to enter the account number and pin if there are no matches.
				
	        //The message "Incorrect account number or pin" should be displayed if no match is found.
			if (loginAcct == null && numTries < MAX_NUM_TRIES) {
				System.out.println("Incorrect account or pin");		
			}	
		}
		return loginAcct;
	}

}
