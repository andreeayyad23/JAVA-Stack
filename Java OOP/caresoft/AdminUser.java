import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
//... imports class definition...


// Inside class:
private Integer employeeID;
private String role;
private ArrayList<String> securityIncidents;

// TO DO: Implement a constructor that takes an ID and a role
public AdminUser(Integer id, String role) {
	super(id);
	this.role = role;
	securityIncidents = new ArrayList<String>();
}

public void newIncident(String notes) {
	String report = String.format("Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", new Date(),
			this.id, notes);
	securityIncidents.add(report);
}

public void authIncident() {
	String report = String.format("Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", new Date(), this.id,
			"AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
	securityIncidents.add(report);
}

// TO DO: Implement HIPAACompliantAdmin!
@Override
public ArrayList<String> reportSecurityIncidents() {
	// return the ArrayList of incidents
	return this.securityIncidents;
}

// TO DO: Implement HIPAACompliantUser!
@Override
    public boolean assignPin(int pin) {
    	// TODO Auto-generated method stub
    	String pinString = Integer.toString(pin); 
		if (pinString.length() == 6) {
			this.setPin(pin);
			return true;
		} else {
			
			this.authIncident();
			return false;
		}
    }

@Override
public boolean accessAuthorized(Integer confirmedAuthID) {

	// check if the given id is a match and report an incident if it does not
	if (this.id != confirmedAuthID) {
		this.authIncident();
		return false;
	}
	return true;
}

// TO DO: Setters & Getters

public Integer getEmployeeID() {
	return employeeID;
}

public void setEmployeeID(Integer employeeID) {
	this.employeeID = employeeID;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public ArrayList<String> getSecurityIncidents() {
	return securityIncidents;
}

public void setSecurityIncidents(ArrayList<String> securityIncidents) {
	this.securityIncidents = securityIncidents;
}
}