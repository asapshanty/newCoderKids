
package sample;

import com.mysql.jdbc.Connection;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//import java.awt.event.ActionEvent;

public class DatabaseController  { //added implement Initializable

    private Scene returnScene;

    public void setReturnScene(Scene scene){this.returnScene = scene;}

   //////////////EMPLOYEE TAB///////////////

    //Text fields
   // private List<TextField> fieldList;
    @FXML
    private TextField empId;
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
    private TableColumn<Employee,String> idColumn;
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

    LinkedList<Employee> employeeList;

    private ObservableList<Employee> data;
    //private DBConnection dc;


    public void initializeDis(){
        try
        {
            btnAddEmp.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>()
            {
                @Override
                public void handle(MouseEvent mouseEvent) {


//                    employeeList.add(new Employee(empFirstName.getText(), empLastName.getText(),
//                            empStatus.getText(),empType.getText(),
//                            empPhone.getText(),empHireDate.getText(),
//                            empTerminationDate.getText()));
//                    System.out.println(employeeList.size());
//                    System.out.println(employeeList.get(0).getFirstName() + " ----- FAIL?");

                    empFirstName.getText();
                    empLastName.getText();
                    empStatus.getText();
                    empType.getText();
                    empPhone.getText();
                    empHireDate.getText();
                    empTerminationDate.getText();

                    System.out.println(empFirstName.getText()
                            + "\n" + empLastName.getText()
                            + "\n" + empStatus.getText()
                            + "\n" + empType.getText()
                            + "\n" + empPhone.getText()
                            + "\n" + empHireDate.getText()
                            + "\n" + empTerminationDate.getText());


//                    empTable = new TableView();
//
//                    fnameColumn = new TableColumn<>("First Name");
//                    fnameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
//
//
//                    lnameColumn = new TableColumn<>("Last Name");
//                    lnameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
//
//
//                    empTable.getColumns().add(fnameColumn);
//                    empTable.getColumns().add(lnameColumn);

                    empTable.getItems().add(new Employee(empFirstName.getText(), empLastName.getText()));
                    //empTable.setItems(new Employee(empFirstName.getText(), empLastName.getText()));


//                    VBox vbox = new VBox(empTable);
//
//                    Scene scene = new Scene(vbox);
//
//                    primaryStage.setScene(scene);
//
//                    primaryStage.show();
                }
            });
        }


        catch (Exception e ){
            if(!e.getMessage().isEmpty()||e.getMessage()!=null){
                System.out.println("Loading Error: " + e.getMessage());
            }
            else{
                String s = "Loading Error!";
                System.out.println(s);

            }

        }
    }





/*

    @Override
    public void initialize(URL url, ResourceBundle rb){
        dc = new DBConnection();
    }


    @FXML
    private void loadDataFromDatabase(ActionEvent event){
//        Connection conn= dc.Connect();
//        data=FXCollections.observableArrayList();
//        //execute query and store result
//        ResultSet rs=conn.createStatement().executeQuery("SQL CODE HERE");
//        while(rs.next()){
//            data.add(new Employee(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
//
//        }
//    }
//    catch(SQLException ex){
//        //Logger.getLogger(FXMLDatabaseController.class.getName()).log(Level.SEVERE, null, ex);
//        System.err.println("Error" + ex);
//    }


//    ObservableList<Person> data = ...
//    TableView<Person> tableView = new TableView<Person>(data);
//
//    TableColumn<Person,String> firstNameCol = new TableColumn<Person,String>("First Name");
// firstNameCol.setCellValueFactory(new Callback<CellDataFeatures<Person, String>, ObservableValue<String>>() {
//        public ObservableValue<String> call(CellDataFeatures<Person, String> p) {
//            // p.getValue() returns the Person instance for a particular TableView row
//            return p.getValue().firstNameProperty();
//        }
//    });
//
// tableView.getColumns().add(firstNameCol);} 

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









    empTable = new TableView<>();


    //if(empTable)

    public ObservableList<Inventory> getInventory(){

        ObservableList<Inventory> inventory = FXCollections.observableArrayList();
        inventory.add(new Inventory(1, "status", "test","test", "test", "test","test","test"));
        //here we put database inventory OR hard code stuff here instead of this ^
        return inventory;
    }


*/

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

        initializeDis();
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



    @FXML
    private Button btnAddStu;
    @FXML
    private Button btnDelStu;
    @FXML
    private Button btnUpdStu;


    //////////////REPORTS TAB//////////////

        //connect to database to see if it works//
    @FXML
    private Button btnSqlClear;
    @FXML
    private Button btnClearReport;
    @FXML
    private Button btnSqlRun;
    @FXML
    private TextArea txtSql;
    @FXML
    private TableView tableReport;

    private ResultSet lastResult;

    //clear button functionality for SQL input
    public void doClearSql(){
        btnSqlClear.addEventFilter(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent r){txtSql.clear();}
        });

    }

    //clearing report box
    public void doClearReport(){
        btnClearReport.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try{
                    tableReport.getItems().clear();
                    //listReport.getColumns().clear();
                }
                catch (Exception ex){

                }
            }
        });

    }

    //run button
    public void doRunSql(){
        btnSqlRun.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent yuh) {
                try{
                    btnSqlRun.setDisable(true);
                    if(!txtSql.getText().isEmpty()||txtSql.getText()!=null){
                        /////////////////////////////////////ONCE CONNECTED UNCOMMENT////////////////////////////////
                       formatResults(DBConnection.GetConnection());
                        //Class.forName("com.mysql.jdbc.Driver");
                        lastResult = DBConnection.GetConnection().createStatement().executeQuery(txtSql.getText());
                        System.out.println("yuh");
                    }
                    else
                    {
                       String m = "The SQL input box is empty";
                       showMessage(m);
                    }

                }
                catch(Exception ex){
                     btnSqlRun.setDisable(false); //removed finally before btnSqlRun.setDisable(false);
                }

            }
        });
    }

    //SQL Output

    private ObservableList<ObservableList> dataSql;
    private void formatResults(Connection c)
    {
        try {
            dataSql = FXCollections.observableArrayList();
            if (txtSql.getText().isEmpty() || txtSql.getText() != null)
            {
                ResultSet rs = c.createStatement().executeQuery(txtSql.getText());

                //table column added dynamically
                tableReport.setTableMenuButtonVisible(true);
                tableReport.getItems().clear();
                tableReport.getColumns().clear();
                int i;
                for (i = 0; i < rs.getMetaData().getColumnCount(); i++)
                {
                    final int j = i;
                    TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1));
                    col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>()
                    {
                        //@Override
                        public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param)
                        {
                            return new SimpleStringProperty(param.getValue().get(j).toString());
                        }
                    });

                    tableReport.getColumns().addAll(col);
                }
                System.out.println(i + "Column(s) in this table result.");

                //data added to the observable list
                int r = 0;
                while (rs.next())
                {
                    ObservableList<String> row = FXCollections.observableArrayList();
                    for (int v = 1; v == rs.getMetaData().getColumnCount(); v++)
                    {
                        //iterate column
                        row.add(rs.getString(v));
                    }
                    data.add((Employee) row);
                    r += 1;
                }
                System.out.println(r + " row(s) return as a result.");
                tableReport.setItems(data);
            }
        }
            catch(Exception ex)
            {
                showMessage("Error on query execution: "+ ex.getMessage());
            }
    }

    //showing message
    private void showMessage(String message){
        try{
            System.out.println(message);
        }
        catch(Exception ex) {}
    }

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
