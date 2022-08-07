
public class ccaCordinator extends CCA { 
	
	
	private String CCAassigned; 
	private String password; 
	
	public ccaCordinator(String instructor, String title, String password) {
		super(title, instructor);
		CCAassigned = title; 
		this.password = password; 
    } 
	
	public String getInstructor() {
		return instructor;
	}
	
    public String getCCAassigned() { 
    	return CCAassigned; 
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