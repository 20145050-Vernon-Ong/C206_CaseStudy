
public class ccaCordinator {
	
	private String name;
	private String CCAassigned;
	private String password;
	
	public ccaCordinator(String name, String cCAassigned, String password) {
		this.name = name;
		CCAassigned = cCAassigned;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getCCAassigned() {
		return CCAassigned;
	}

	public String getPassword() {
		return password;
	}

	public boolean login(String name, String password) {
		if (name.equals(getName()) && password.equals(getPassword())) {
			return true;
		} else {
			return false;
		}
	}
	
}
