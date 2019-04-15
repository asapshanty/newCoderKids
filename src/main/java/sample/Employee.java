package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {

    ///////////////////// EMPLOYEE TAB /////////////////////

    //private final StringProperty id;
    private final StringProperty status;
    private final StringProperty type;
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty phoneNumber;
    private final StringProperty hireDate;
    private final StringProperty terminationDate;
    private int empIdPk;
    private String empFirstName;
    private String empLastName;
    private String empPhone;
    private String empEmail;
    private String empAddress;
    private String empZipcode;
    //Specific constructor
    public Employee(String firstname, String lastName)
    {
        this.firstName = new SimpleStringProperty(firstname);
        this.lastName = new SimpleStringProperty(lastName);

        this.status = new SimpleStringProperty("");
        this.type = new SimpleStringProperty("");
        this.phoneNumber = new SimpleStringProperty("");
        this.hireDate = new SimpleStringProperty("");
        this.terminationDate = new SimpleStringProperty("");
    }
    public Employee(String firstName, String lastName, String status, String type, String phoneNumber, String hireDate, String terminationDate) {
        //this.id = new SimpleStringProperty(id);
        this.status = new SimpleStringProperty(status);
        this.type = new SimpleStringProperty(type);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.hireDate = new SimpleStringProperty(hireDate);
        this.terminationDate = new SimpleStringProperty(terminationDate);
    }

//    //Getters
//    public String getStatus() {
//        return status.get();
//    }
//
//    //setters
//    public void setStatus(String value) {
//        this.status.set(value);
//    }
//
//    public String getType() {
//        return type.get();
//    }
//
//    public void setType(String value) {
//        this.type.set(value);
//    }
//
//    public String getFirstName(){
//        return firstName.get();
//    }
//
//    public void setFirstName(String value) {
//        this.firstName.set(value);
//    }
//
//    public String getLastName(){ return lastName.get();}
//
//    public void setLastName(String value) {
//        this.lastName.set(value);
//    }
//
//    public String getPhoneNumber(){return phoneNumber.get();}
//
//    public void setPhoneNumber(String value) {
//        this.phoneNumber.set(value);
//    }

    @Basic
    @Column(name = "hire_date", nullable = true, length = 10)
    public String getHireDate(){return hireDate.get();}

    public void setHireDate(String value) {
        this.hireDate.set(value);
    }

    @Basic
    @Column(name = "termination_date", nullable = true, length = 10)
    public String getTerminationDate(){return terminationDate.get();}

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

    @Id
    @Column(name = "emp_id_pk", nullable = false)
    public int getEmpIdPk() {
        return empIdPk;
    }

    public void setEmpIdPk(int empIdPk) {
        this.empIdPk = empIdPk;
    }

    @Basic
    @Column(name = "emp_first_name", nullable = true, length = 20)
    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    @Basic
    @Column(name = "emp_last_name", nullable = true, length = 20)
    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    @Basic
    @Column(name = "emp_phone", nullable = true, length = 15)
    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    @Basic
    @Column(name = "emp_email", nullable = true, length = 50)
    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Basic
    @Column(name = "emp_address", nullable = true, length = 100)
    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Basic
    @Column(name = "emp_zipcode", nullable = true, length = 5)
    public String getEmpZipcode() {
        return empZipcode;
    }

    public void setEmpZipcode(String empZipcode) {
        this.empZipcode = empZipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empIdPk == employee.empIdPk &&
                Objects.equals(empFirstName, employee.empFirstName) &&
                Objects.equals(empLastName, employee.empLastName) &&
                Objects.equals(empPhone, employee.empPhone) &&
                Objects.equals(empEmail, employee.empEmail) &&
                Objects.equals(empAddress, employee.empAddress) &&
                Objects.equals(empZipcode, employee.empZipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empIdPk, empFirstName, empLastName, empPhone, empEmail, empAddress, empZipcode);
    }
}







