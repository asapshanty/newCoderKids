package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import org.w3c.dom.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

//import cis3365.application.core.Database;
//import cis3365.application.core.Information;


import java.awt.*;
import java.io.IOException;

public class MainController {

    @FXML
    private Button btnLogin;
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Label statusMessage;
    @FXML
    private BorderPane frame;
    @FXML
    private ImageView login;

   // private Scene scene;

    public void initialize(){
        try
        {

            btnLogin.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
               @Override
               public void handle(MouseEvent mouseEvent) {
                   toggleLogin();
                   attemptLogin(txtUserName.getText(), txtPassword.getText());
                   toggleLogin();
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
                updateStatus(s);
            }

        }
    }


    private void attemptLogin(String userName, String password) {
        if((userName.isEmpty()||(password.isEmpty())||password ==null)){
            updateStatus("The username or password field is empty -_-");
        }
        else{
            updateStatus(" ");
            //if(DBConnection.GetConnection(userName, password)!=null){
                if(userName.equals(Information.Username) && password.equals(Information.Password)){
                    System.out.println("Welcome!");
                    switchToViewScreen();

            }
                else{
                    String s = "Wrong Username or Password!";
                    updateStatus("Try Again");
                    System.out.println(s);
                }
        }
    }

    private void toggleLogin() {
        if(!txtUserName.isDisabled()
            && !txtPassword.isDisabled()){
            txtUserName.setDisable(true);
            txtPassword.setDisable(true);
            btnLogin.setDisable(true);
        }
        else{
            txtUserName.setDisable(false);
            txtPassword.setDisable(false);
            btnLogin.setDisable(false);
        }
    }

    //FIX SOMETHING HERE TO SWITCH SCREENS basically set scene in database controller
    private void switchToViewScreen() {
        //Parent root;
        try{


            /*
            root = FXMLLoader.load(getClass().getClassLoader().getResource("database.fxml"));
            Stage stage = new Stage();
            stage.setTitle("CoderKids");
            stage.setScene(new Scene(root, 700, 900));
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();*/

            Display display= new Display(frame.getScene());
            display.addScreen("database", FXMLLoader.load(getClass().getResource("database.fxml")));
            display.activate("database");
        }
        catch (Exception e){
            return;
        }
    }

    private void showMessage(String s){
        try{
            System.out.println(s);
        }
        catch(Exception e){

        }
    }

    private void updateStatus(String s) {
        if(!s.isEmpty()|| s!=null)
        {
            statusMessage.setText(s);
        }

        else{
            statusMessage.setText(":0");
        }

    }


/*
    public void doLogin(ActionEvent actionEvent) throws IOException {
       // Stage Parent = (Stage) ((Node))

    }*/
}
