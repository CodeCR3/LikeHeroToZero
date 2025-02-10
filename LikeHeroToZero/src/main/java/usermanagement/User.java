package usermanagement;

import java.io.Serializable;

public class User implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String firstName;
	private String lastName;
	private String passwort;
	
	public User (String userId, String firstName, String lastName, String passwort) {
		this.userId = userId; 
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.passwort = passwort;
	}
	
	// Getter und Setter 
	
	public String getUserId() { 
		return userId; 
		} 
	
	public void setUserId(String userId) { 
		this.userId = userId; 
		} 
	
	
	
	public String getFirstName() { 
		return firstName; 
		} 
	
	public void setFirstName(String firstName) { 
		this.firstName = firstName; 
		} 
	
	public String getLastName() { 
		return lastName; 
		} 
	
	public void setLastName(String lastName) { 
		this.lastName = lastName; 
		} 
	
	public String getPasswort() { 
		return passwort; 
		} 
	
	public void setPasswort(String passwort) { 
		this.passwort = passwort; 
		}

}
