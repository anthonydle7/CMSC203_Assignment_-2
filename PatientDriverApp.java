/*
 * Class: CMSC203 
 * Instructor:
 * Assignment 2
 * Description: 
 * Due: 02/16/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Anthony Le
*/
package ALe_Assignment2_Complete;

public class PatientDriverApp {
	
	    public static void main(String[] args) {
	    	
	        // Patient instance
	        Patient patient = new Patient("James", "Wang", "Chu",
	                "123 Sesame Street", "Silver Spring", "MD", "20876",
	                "301-272-9591", "Eileen Chu", "240-090-8789");

	        // Three instances of the Procedure class
	        Procedure procedure1 = new Procedure("Physical Exam", "07/11/2020", "Dr. Billy", 175.0);
	        Procedure procedure2 = new Procedure("X-Ray", "07/11/2020", "Dr. Bob", 460.0);
	        Procedure procedure3 = new Procedure("Blood Test", "07/11/2020", "Dr. Joe", 999.0);

	        // Patient information
	        displayPatient(patient);

	        // Information about all three procedures
	        displayProcedure(procedure1);
	        displayProcedure(procedure2);
	        displayProcedure(procedure3);

	        // Total charges of the three procedures
	        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
	        System.out.printf("Total charges: %.2f%n", totalCharges);
	    }

	    public static void displayPatient(Patient patient) {
	        System.out.println("Patient Information:");
	        System.out.println("Full Name: " + patient.buildFullName());
	        System.out.println("Address: " + patient.buildAddress());
	        System.out.println("Phone Number: " + patient.getPhoneNumber());
	        System.out.println("Emergency Contact: " + patient.buildEmergencyContact());
	        System.out.println();
	    }

	    public static void displayProcedure(Procedure procedure) {
	        System.out.println("	Procedure Information:");
	        System.out.println("	Name: " + procedure.getName());
	        System.out.println("	Date: " + procedure.getDate());
	        System.out.println("	Practitioner: " + procedure.getPractitioner());
	        System.out.println("	Charges: " + procedure.getCharges());
	        System.out.println();
	    }

	    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
	        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
	    }
	    
	}


