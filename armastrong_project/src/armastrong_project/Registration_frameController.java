/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Upendra
 */
public class Registration_frameController implements Initializable {

    @FXML
    private DatePicker dob;
    @FXML
    private TextField name;
    @FXML
    private TextArea address;
    @FXML
    private TextField mo_num;
    @FXML
    private TextField email;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private PasswordField cpassword;
    @FXML
    private Button back;
    @FXML
    private Button submit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        submit.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        back.setStyle("-fx-background-color:blue;-fx-text-fill:white");
    }

    @FXML
    private void handleSubmitButtonAction(ActionEvent event) 
    {
        //Registration_frameController rf = new Registration_frameController();
        submit.setStyle("-fx-background-color:green;-fx-text-fill:white");
        if(!checkall())
        {
        String nam = name.getText();
        String addr = address.getText();
        String monum = mo_num.getText();
        String eid= email.getText();
        String un = username.getText();
        String pw1 = password.getText();
        String pwd = String.valueOf(pw1);
        String pw2 = cpassword.getText();
        String cpwd = String.valueOf(pw2);
        String db = dob.getEditor().getText();
        System.out.println("\nName\t"+nam+"\naddress:\t"+addr+"\nMo No\t"+monum+"\nemail\t"+eid+"\nDOB\t"+db+"\nUn\t"+un+"\nPW\t"+pwd+"\nCPW\t"+cpwd);
        User_Inserter ui = new User_Inserter();
        if(pwd.equals(cpwd))
        {
            //String un,String pw3,String name,String addr,String dob,String mob_num,String email
            if(ui.insert(un, pwd, nam, addr, db, monum, eid))
            {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Success");
                alert.setHeaderText(null);
                alert.setContentText("User Inserted Successfully!!!");
                alert.showAndWait();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error\nTry Again...");
            }
        }
        else
        {
            submit.setStyle("-fx-background-color:blue;-fx-text-fill:white");
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Validate Field");
            alert.setHeaderText(null);
            alert.setContentText("Both Passwords  Do NOT Match");
            alert.showAndWait();
        }
        
        
        }
        else
        {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Validate Field");
            alert.setHeaderText(null);
            alert.setContentText("Please Fill All Info");
            alert.showAndWait();
        }
    }
    
    private boolean checkall()
    {
        boolean flag = true;
        flag = name.getText().isEmpty() | address.getText().isEmpty() | mo_num.getText().isEmpty() | 
                email.getText().isEmpty() | username.getText().isEmpty() | password.getText().isEmpty() |
                cpassword.getText().isEmpty() | dob.getEditor().getText().isEmpty();
        
        //System.out.println("\n\nFlag\t"+flag);
        
        return flag;
    }

    @FXML
    private void handleBackButtonAction(ActionEvent event) 
    {
        back.setStyle("-fx-background-color:green;-fx-text-fill:white");
        try {
            Stage stage1 = (Stage) back.getScene().getWindow();
            stage1.close();
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("User Login");
        } 
        catch (Exception ex) {
            //Logger.getLogger(Registration_frameController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in Registration_framController\t"+ex);
        }
    }

    
    
}
