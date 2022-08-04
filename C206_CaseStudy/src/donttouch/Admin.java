package donttouch;

public class Admin {

	private String name;
	private String password;
	
	public Admin(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
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
