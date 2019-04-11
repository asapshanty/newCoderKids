package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Inventory {

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
    public Inventory(String status,String type, String firstName, String lastName, String phoneNumber, String hireDate, String terminationDate){
       //this.id = id;
        this.status = new SimpleStringProperty(status);
        this.type = new SimpleStringProperty(type);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.hireDate = new SimpleStringProperty(hireDate);
        this.terminationDate = new SimpleStringProperty(terminationDate);
    }
    //Getters
    

    /*this is a constructor
    public Inventory(int id, String status, String type, String firstName, String lastName, String phoneNumber, String hireDate, String terminationDate) {
    this.id = id;
    this.status = status;
    this.type = type;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.hireDate = hireDate;
    this.terminationDate = terminationDate;

    }*/

    @Override
    public String toString(){return String.format("%s %s",status,type,firstName,lastName,phoneNumber,hireDate,terminationDate);}

 //   @Id if using these add repository
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
 //   @Column(name = "ID", nullable = false)
    public int getId(){return id;}
    public void setId(int id) {
        this.id = id;
    }

    //@Basic basically do this for each item on table
   // @Column(name = "STATUS", nullable = false, length = 24)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(String terminationDate) {
        this.terminationDate = terminationDate;
    }
    /*
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o== null) || getClass()! = o.getClass() return false;
        Inventory
    }*/






}
