package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {

    ///////////////////// EMPLOYEE TAB /////////////////////

    private int id;
    private final StringProperty status;
    private final StringProperty type;
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty phoneNumber;
    private final StringProperty hireDate;
    private final StringProperty terminationDate;

    //Default constructor
    public Employee(String id, String status, String type, String firstName, String lastName, String phoneNumber, String hireDate, String terminationDate) {
        //this.id = new SimpleStringProperty(id);
        this.status = new SimpleStringProperty(status);
        this.type = new SimpleStringProperty(type);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.hireDate = new SimpleStringProperty(hireDate);
        this.terminationDate = new SimpleStringProperty(terminationDate);
    }

    //Getters
    public String getStatus() {
        return status.get();
    }

    public String getType() {
        return type.get();
    }
    public String getFirstName(){
        return firstName.get();
    }

    public String getLastName(){ return lastName.get();}
    public String getPhoneNumber(){return phoneNumber.get();}
    public String getHireDate(){return hireDate.get();}
    public String getTerminationDate(){return terminationDate.get();}

    //setters
    public void setStatus(String value) {
        this.status.set(value);
    }

    public void setType(String value) {
        this.type.set(value);
    }

    public void setFirstName(String value) {
        this.firstName.set(value);
    }

    public void setLastName(String value) {
        this.lastName.set(value);
    }

    public void setPhoneNumber(String value) {
        this.phoneNumber.set(value);
    }

    public void setHireDate(String value) {
        this.hireDate.set(value);
    }

    public void setTerminationDate(String value) {
        this.terminationDate.set(value);
    }

    //property values
    public StringProperty statusProperty(){return status;}
    public StringProperty typeProperty(){return type;}
    public StringProperty firstNameProperty(){return firstName;}
    public StringProperty lastNameProperty(){return lastName;}
    public StringProperty phoneNumberProperty(){return phoneNumber;}
    public StringProperty hireDateProperty(){return hireDate;}
    public StringProperty terminationDateProperty(){return terminationDate;}


    @Override
    public String toString() {
        return String.format("%s %s", status, type, firstName, lastName, phoneNumber, hireDate, terminationDate);
    }



}







