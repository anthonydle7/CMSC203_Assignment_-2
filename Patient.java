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

public class Patient {
	    private String firstName;
	    private String middleName;
	    private String lastName;
	    private String streetAddress;
	    private String city;
	    private String state;
	    private String zipCode;
	    private String phoneNumber;
	    private String emergencyContactName;
	    private String emergencyContactPhone;

	    // no-arg constructor
	    public Patient() {
	    }

	    // parametrized constructor that initializes patient’s first, middle and last name to the given values
	    public Patient(String firstName, String middleName, String lastName) {
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	    }

	    // parametrized constructor that initializes all attributes of the patient to the given values
	    public Patient(String firstName, String middleName, String lastName, String streetAddress,
	                   String city, String state, String zipCode, String phoneNumber,
	                   String emergencyContactName, String emergencyContactPhone) {
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	        this.streetAddress = streetAddress;
	        this.city = city;
	        this.state = state;
	        this.zipCode = zipCode;
	        this.phoneNumber = phoneNumber;
	        this.emergencyContactName = emergencyContactName;
	        this.emergencyContactPhone = emergencyContactPhone;
	    }

	    // accessor for each attribute & mutator for each attribute 
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getMiddleName() {
	        return middleName;
	    }

	    public void setMiddleName(String middleName) {
	        this.middleName = middleName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getStreetAddress() {
	        return streetAddress;
	    }

	    public void setStreetAddress(String streetAddress) {
	        this.streetAddress = streetAddress;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getZipCode() {
	        return zipCode;
	    }

	    public void setZipCode(String zipCode) {
	        this.zipCode = zipCode;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public String getEmergencyContactName() {
	        return emergencyContactName;
	    }

	    public void setEmergencyContactName(String emergencyContactName) {
	        this.emergencyContactName = emergencyContactName;
	    }

	    public String getEmergencyContactPhone() {
	        return emergencyContactPhone;
	    }

	    public void setEmergencyContactPhone(String emergencyContactPhone) {
	        this.emergencyContactPhone = emergencyContactPhone;
	    }

	    // method name buildFullName that returns a String which is the concatenation of first, middle and last name separated by space.
	    public String buildFullName() {
	        return firstName + " " + middleName + " " + lastName;
	    }

	    // method name buildFullName that returns a String which is the concatenation of first, middle and last name separated by space.
	    public String buildAddress() {
	        return streetAddress + " " + city + " " + state + " " + zipCode;
	    }

	    // method named buildEmergencyContact that returns a String which is the concatenation of emergency name and emergency phone separated by space.
	    public String buildEmergencyContact() {
	        return emergencyContactName + " " + emergencyContactPhone;
	    }

	    // toString method that display all information of a patient; use the above build methods in your toString method to display the information.
	    public String toString() {
	        return "Patient{" +
	                "fullName='" + buildFullName() + '\'' +
	                ", address='" + buildAddress() + '\'' +
	                ", phoneNumber='" + phoneNumber + '\'' +
	                ", emergencyContact='" + buildEmergencyContact() + '\'' +
	                '}';
	    }

	}


