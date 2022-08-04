import java.util.ArrayList;
public class LoginToSystem {

	public static void main(String[] args) {
	}
	static ArrayList<StudentinCCA> studentincca = new ArrayList<StudentinCCA>();


		// TODO Auto-generated method stub

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

			int option = -1;

			if (option == 1) {
				addStudent();
			}else if (option == 2) {
				viewStudent();
			}










		}



//rui

		public static void addStudent() {
			// TODO Auto-generated method stub
			// for students with cca
			String name = Helper.readString("Enter name > ");
			int studentID = Helper.readInt("Enter student ID > ");
			int grade = Helper.readInt("Enter grade > ");
			String cca = Helper.readString("Enter CCA");
			String classRoom = Helper.readString("Enter classroom > ");
			studentincca.add(new StudentinCCA(name, studentID, grade, classRoom, cca));
		}
		public static void viewStudent() {
			// TODO Auto-generated method stub
			for (int i = 0; i < studentincca.size(); i++){
				System.out.println(studentincca.get(i));
			}


		}
	
}









