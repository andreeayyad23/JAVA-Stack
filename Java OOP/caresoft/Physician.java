import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {

    private ArrayList<String> patientNotes; // ArrayList to store patient notes

    // Constructor that takes an ID and initializes the superclass
    public Physician(Integer id) {
        super(id);
        this.patientNotes = new ArrayList<>(); // Initialize patientNotes ArrayList
    }

    // Method to add new patient notes
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format("Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.getId()); // Using getId() from superclass
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    // Override method from HIPAACompliantUser interface to assign PIN
    @Override
    public boolean assignPin(int pin) {
        // Check if PIN is exactly 4 digits
        if (String.valueOf(pin).length() != 4) {
            return false;
        }
        this.pin = pin; // Set the pin
        return true;
    }

    // Override method from HIPAACompliantUser interface to check authorization
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        return this.getId().equals(confirmedAuthID); // Using getId() from superclass
    }

    // Getters and setters for patientNotes ArrayList
    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }
}
