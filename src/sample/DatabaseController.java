package sample;

import com.mysql.jdbc.Connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
//import java.awt.event.ActionEvent;

public class DatabaseController  { //added implement Initializable

    private Scene returnScene;

    public void setReturnScene(Scene scene){this.returnScene = scene;}

   //////////////EMPLOYEE TAB///////////////

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

    private List<TextField> fieldList;



    //Buttons in this window
    @FXML
    private Button btnExitEmp;

    @FXML
    private Button btnAddEmp;

    @FXML
    private Button btnDelEmp;

    @FXML
    private Button btnUpdEmp;

//table and columns
    @FXML
    private TableView<Employee> empTable;
    @FXML
    private TableColumn<Employee, String> idColumn;
    @FXML
    private TableColumn<Employee,String> statusColumn;
    @FXML
    private TableColumn<Employee,String> typeColumn;
    @FXML
    private TableColumn<Employee,String> phoneColumn;
    @FXML
    private TableColumn<Employee,String> fnameColumn;
    @FXML
    private TableColumn<Employee,String> lnameColumn;
    @FXML
    private TableColumn<Employee,String> hdateColumn;
    @FXML
    private TableColumn<Employee,String> tdateColumn;

    private ObservableList<Employee> data;
    private DBConnection dc;
/*
    @Override
    public void initialize(URL url, ResourceBundle rb){
        dc = new DBConnection();
    } */
/*
    @FXML
    private void loadDataFromDatabase(ActionEvent event){
        Connection conn= dc.Connect();
        data=FXCollections.observableArrayList();
        //execute query and store result
        ResultSet rs=conn.createStatement().executeQuery("SQL CODE HERE");
        while(rs.next()){
            data.add(new Employee(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));

        }
    }
    catch(SQLException ex){
        //Logger.getLogger(FXMLDatabaseController.class.getName()).log(Level.SEVERE, null, ex);
        System.err.println("Error" + ex);
    }

    //setting cell value factory to table view
    idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
    statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
    phoneColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
    fnameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
    lnameColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
    hdateColumn.setCellValueFactory(new PropertyValueFactory<>("hireDate"));
    tdateColumn.setCellValueFactory(new PropertyValueFactory<>("terminationDate"));

    empTable.setItems(null);
    empTable.setItems(data);
    */

    /*





    empTable = new TableView<>();



    //if(empTable)

    public ObservableList<Inventory> getInventory(){

        ObservableList<Inventory> inventory = FXCollections.observableArrayList();
        inventory.add(new Inventory(1, "status", "test","test", "test", "test","test","test"));
        //here we put database inventory OR hard code stuff here instead of this ^
        return inventory;
    }*/




    private void clearFields(){
        fieldList.forEach(textField -> textField.setText(null));
        classesFieldList.forEach(textField -> textField.setText(null));
        schedFieldList.forEach(textField -> textField.setText(null));
        studFieldList.forEach(textField -> textField.setText(null));
        guarFieldList.forEach(textField -> textField.setText(null));
    }

    public void handleClearSelection (ActionEvent actionEvent){
        clearFields();
    }

    // to populate fieldList
    public void initialize(){
        fieldList = Arrays.asList(empFirstName, empLastName, empStatus, empType, empPhone, empHireDate, empTerminationDate);
        //inventoryFieldList = Arrays.asList();
        classesFieldList = Arrays.asList(className,classStatus,classTopic);
        schedFieldList = Arrays.asList(schedClassID,schedClassCap);
        studFieldList = Arrays.asList(stuFirstName,stuLastName,stuGrade,stuStatus,stuDOB);
        guarFieldList = Arrays.asList(guarFirstName,guarLastName,guarStudent,guarStreetAdd,guarCity,guarState,guarZip,guarPhone,guarEmail);
        clearFields();
    }




    //////////////INVENTORY TAB//////////////

    private List<TextField> inventoryFieldList;



    //////////////CLASSES TAB//////////////

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

    private List<TextField> classesFieldList;


    //////////////SCHEDULE TAB//////////////

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

    private List<TextField> schedFieldList;


    //////////////STUDENTS TABLE//////////////

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
    private List<TextField> studFieldList;

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


    //////////////REPORTS TAB//////////////



    //////////////GUARDIANS TAB//////////////

    private List<TextField> guarFieldList;
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
