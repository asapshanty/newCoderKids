package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;



import java.awt.*;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
//import java.awt.event.ActionEvent;

public class DatabaseController  { //added implement Initializable

    private Scene returnScene;

    public void setReturnScene(Scene scene){this.returnScene = scene;}

    //EMPLOYEE TAB

    //Text fields
   // private List<TextField> fieldList;
    @FXML
    private TextField empFirstName;
    @FXML
    private TextField empLastName;
    @FXML
    private TextField empStatus;
    @FXML
    private TextField empType;
    @FXML
    private TextField empPhone;
    @FXML
    private TextField empHireDate;
    @FXML
    private TextField empTerminationDate;

    //Buttons in this window
    @FXML
    private Button btnClrEmp;



    @FXML
    private Button btnExitEmp;

       /* @FXML
        private void closeAction (ActionEvent actionEvent) {
            System.exit(0);
        } */

    @FXML
    private Button btnAddEmp;

    @FXML
    private Button btnDelEmp;

    @FXML
    private Button btnUpdEmp;

    @FXML
    private TableView empTable;

   /*
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        fieldList = Arrays.asList(empFirstName, empLastName, empStatus, empType, empPhone, empHireDate, empTerminationDate);
        clearFields();
    }*/

    


    //INVENTORY TAB



    //CLASSES TAB

    //Text fields
    @FXML
    private TextField className;
    @FXML
    private TextField classStatus;
    @FXML
    private TextField classTopic;
    @FXML
    private Button btnClrClass;
    @FXML
    private Button btnExitClass;
    @FXML
    private Button btnAddClass;
    @FXML
    private Button btnDelClass;
    @FXML
    private Button btnUpdClass;
    @FXML
    private TableView classTable;


    //SCHEDULE TAB

    //Text fields
    @FXML
    private TextField schedClassID;
    @FXML
    private TextField schedClassCap;

    //buttons

    @FXML
    private Button btnExitSch;

        /*@FXML
        private void closeAction (ActionEvent actionEvent) {
            System.exit(0);
        } */

    @FXML
    private Button btnClrSch;
    @FXML
    private Button btnAddSch;
    @FXML
    private Button btnDelSch;
    @FXML
    private Button btnUpdSch;
    @FXML
    private TableView schedTable;


    //STUDENTS TABLE

    @FXML
    private TableView studTable;

    //Text fields
    @FXML
    private TextField stuFirstName;
    @FXML
    private TextField stuLastName;
    @FXML
    private TextField stuGrade;
    @FXML
    private TextField stuStatus;
    @FXML
    private TextField stuDOB;

    //buttons
    @FXML
    private Button btnClrStu;
    @FXML
    private Button btnExitStu;

        /*@FXML
        private void closeAction (ActionEvent actionEvent) {
            System.exit(0);
        }*/

    @FXML
    private Button btnAddStu;
    @FXML
    private Button btnDelStu;
    @FXML
    private Button btnUpdStu;


    // REPORTS TAB



    //GUARDIANS TAB

    @FXML
    private TableView guarTable;

    //Text fields
    @FXML
    private TextField guarFirstName;
    @FXML
    private TextField guarLastName;
    @FXML
    private TextField guarStudent;
    @FXML
    private TextField guarStreetAdd;
    @FXML
    private TextField guarCity;
    @FXML
    private TextField guarState;
    @FXML
    private TextField guarZip;
    @FXML
    private TextField guarPhone;
    @FXML
    private TextField guarEmail;

    //buttons
    @FXML
    private Button btnClrGua;

    @FXML
    private Button btnExitGua;

        @FXML
        private void closeAction (ActionEvent actionEvent) {
            System.exit(0);
        }

    @FXML
    private Button btnAddGua;

    @FXML
    private Button btnDelGua;

    @FXML
    private Button btnUpdGua;











}
