package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;



import java.awt.*;
import java.awt.event.ActionEvent;

public class DatabaseController {

    private Scene returnScene;

    public void setReturnScene(Scene scene){this.returnScene = scene;}

    //Employee Tab
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

    @FXML
    private Button btnAddEmp;

    @FXML
    private Button btnDelEmp;

    @FXML
    private Button btnUpdEmp;

    @FXML
    private TableView empTable;

    


    //Inventory Tab

    //Classes Tab
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

    //Schedule Tab
    @FXML
    private TextField schedClassID;
    @FXML
    private TextField schedClassCap;
    @FXML
    private Button btnExitSch;
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

    //Students
    @FXML
    private TableView studTable;
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
    @FXML
    private Button btnClrStu;
    @FXML
    private Button btnExitStu;
    @FXML
    private Button btnAddStu;
    @FXML
    private Button btnDelStu;
    @FXML
    private Button btnUpdStu;


    // Reports
    //Guardians
    @FXML
    private TableView guarTable;
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
    @FXML
    private Button btnClrGua;
    @FXML
    private Button btnExitGua;
    @FXML
    private Button btnAddGua;
    @FXML
    private Button btnDelGua;
    @FXML
    private Button btnUpdGua;











}
