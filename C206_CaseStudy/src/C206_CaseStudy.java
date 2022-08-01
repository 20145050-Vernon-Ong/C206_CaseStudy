
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		
		while (option != 3) {
			Menu();
			option = Helper.readInt("Enter option > ");
		}
		
	}
	
	private static void Menu() {
		Helper.line(30, "=");
		System.out.println("CCA Registration System");
		Helper.line(30, "=");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3. Quit");
	}

}
