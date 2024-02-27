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

public class Procedure {
	    private String name;
	    private String date;
	    private String practitioner;
	    private double charges;

	    // no-arg constructor
	    public Procedure() {
	    }

	    // parametrized constructor that initializes procedure’s name and date to the given values
	    public Procedure(String name, String date) {
	        this.name = name;
	        this.date = date;
	    }

	    // parametrized constructor that initializes all attributes of the procedure to the given values
	    public Procedure(String name, String date, String practitioner, double charges) {
	        this.name = name;
	        this.date = date;
	        this.practitioner = practitioner;
	        this.charges = charges;
	    }

	    // accessor for each attribute & a mutator for each attribute 
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDate() {
	        return date;
	    }

	    public void setDate(String date) {
	        this.date = date;
	    }

	    public String getPractitioner() {
	        return practitioner;
	    }

	    public void setPractitioner(String practitioner) {
	        this.practitioner = practitioner;
	    }

	    public double getCharges() {
	        return charges;
	    }

	    public void setCharges(double charges) {
	        this.charges = charges;
	    }

	    // toString method that display all information of a procedure
	    public String toString() {
	        return "Procedure{" +
	                "name='" + name + '\'' +
	                ", date='" + date + '\'' +
	                ", practitioner='" + practitioner + '\'' +
	                ", charges=" + charges +
	                '}';
	    }

	}

