package day08_type_conversion_and_type_casting.reference_type_casting.upcasting;

/**
 * Parent class representing a general employee.
 */
class Employee{
    
    public void work(){
        System.out.println("Employee is working!");
    }
}

/**
 *  Child class representing a manager.
 */
class Manager extends Employee{
    
    @Override
    public void work(){
        System.out.println("Manager is managing the  team.");
    }
    
    public void conductMeeting(){
        System.out.println("Manager is conducting a meeting.");
    }
}

/**
 * Demonstrates upcasting from Manager to Employee.
 * <p>
 * A Manager is an Employee.
 * <p>
 * Therefore:
 * <p>
 * Manager object → Employee reference
 * <p>
 * is valid upcasting.
 */
public class ManagerEmployeeUpcasting {
    public static void main(String[] args) {
        
        // Create a Manager object.
        Manager manager = new Manager();
        
        /*
         * Upcasting:
         *
         * Manager object is assigned to Employee reference.
         *
         * No explicit casting is required.
         */
        Employee employee = manager;
        
        // Method inherited from Employee.
        employee.work();
        
        /*
         * The actual object is Manager.
         *
         * Therefore, the overridden work() method
         * from Manager is executed.
         */
        employee.work();
    }
}
