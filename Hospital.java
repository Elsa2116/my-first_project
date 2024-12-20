// Abstract base class for all hospital employees
abstract class HospitalEmployee {
    protected String name;
    protected String employeeID;

    public HospitalEmployee(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public abstract void performDuties(); // Abstract method to be implemented by subclasses

    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return employeeID;
    }
}

// Concrete subclasses for specific employee types
class Doctor extends HospitalEmployee {
    public Doctor(String name, String employeeID) {
        super(name, employeeID);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Doctor, " + employeeID + ") is examining a patient.");
    }
    public void performSurgery(){
        System.out.println(name + " (Doctor, " + employeeID + ") is performing surgery.");
    }
}

class Nurse extends HospitalEmployee {
    public Nurse(String name, String employeeID) {
        super(name, employeeID);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Nurse, " + employeeID + ") is assisting a doctor.");
    }
    public void administerMedication(){
        System.out.println(name + " (Nurse, " + employeeID + ") is administering medication.");
    }
}

class Administrator extends HospitalEmployee {
    public Administrator(String name, String employeeID) {
        super(name, employeeID);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Administrator, " + employeeID + ") is managing hospital operations.");
    }
    public void handlePatientRecords(){
        System.out.println(name + " (Administrator, " + employeeID + ") is handling patient records.");
    }
}

// ... other employee types (Surgeon, Receptionist, Janitor, etc.) would be similar subclasses ...


public class Hospital{
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr. Smith", "D123");
        Nurse nurse = new Nurse("Nurse Jones", "N456");
        Administrator admin = new Administrator("Mr. Brown", "A789");
        Surgeon surgeon = new Surgeon("Dr. Lee", "S001");

        doc.performDuties();
        nurse.performDuties();
        admin.performDuties();
        surgeon.performSurgery();
        nurse.administerMedication();
        admin.handlePatientRecords();
    }

}


class Surgeon extends Doctor{
    public Surgeon(String name, String employeeID) {
        super(name, employeeID);
    }
    @Override
    public void performDuties(){
        System.out.println(name + " (Surgeon, " + employeeID + ") is preparing for surgery.");
    }
}
