
public class ccaCordinator extends CCA { 
	
	 
	private String password; 
	
	public ccaCordinator(String instructor, String title, String password) {
		super(title, instructor); 
		this.password = password; 
    } 
	
	public String getInstructor() {
		return instructor;
	}
	
    public String getCCAassigned() { 
    	return title; 
    } 
    
    public String getPassword() { 
    	return password; 
    } 
    
    public boolean login(String name, String password) { 
    	if (name.equals(getInstructor()) && password.equals(getPassword())) { 
    		return true; 
    	} else { 
    		return false; 
    	} 
    } 
  
}