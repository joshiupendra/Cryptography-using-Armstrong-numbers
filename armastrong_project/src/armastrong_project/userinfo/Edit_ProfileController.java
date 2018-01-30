/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.userinfo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Upendra
 */
public class Edit_ProfileController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextArea address;
    @FXML
    private DatePicker dob;
    @FXML
    private TextField mo_num;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private PasswordField password1;
    @FXML
    private Button edit;
    @FXML
    private MenuItem edit_profile;
    @FXML
    private MenuItem add_re;
    @FXML
    private MenuItem update_re;
    @FXML
    private MenuItem delete_re;
    @FXML
    private MenuItem view_re;
    @FXML
    private MenuItem encry;
    @FXML
    private MenuItem decry;
    @FXML
    private MenuItem send;
    @FXML
    private MenuItem recieve;
    @FXML
    private MenuItem exit;
    @FXML
    private AnchorPane rootPane;
    
    public static String username;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        DataKeeper d = new DataKeeper();
        User_Fetcher uf = new User_Fetcher();
        d = uf.getall(username);
        name.setText(d.name);
        address.setText(d.address);
        mo_num.setText(d.mo_num);
        email.setText(d.email);
    }    

    @FXML
    private void handleEditButtonAction(ActionEvent event) 
    {
        //String un,String pw3,String name,String addr,String dob,String mob_num,String email
        if(!checkall())
        {
        User_Updator u = new User_Updator();
        String nam = name.getText();
        String addr = address.getText();
        String monum = mo_num.getText();
        String eid= email.getText();
        String pw1 = password.getText();
        String pwd = String.valueOf(pw1);
        String pw2 = password1.getText();
        String cpwd = String.valueOf(pw2);
        String db = dob.getEditor().getText();
        //System.out.println("\nName\t"+nam+"\naddress:\t"+addr+"\nMo No\t"+monum+"\nemail\t"+eid+"\nDOB\t"+db+"\nPW\t"+pwd+"\nCPW\t"+cpwd);
        if(pwd.equals(cpwd))
        {
            if(u.update(username, pwd, nam, addr, db, monum, eid))
            {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Success");
                alert.setHeaderText(null);
                alert.setContentText("User Updated Successfully");
                alert.showAndWait();
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("There is some Error\nPlease Try again later...");
                alert.showAndWait();
            }
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Field");
            alert.setHeaderText(null);
            alert.setContentText("Both Passwords  Do NOT Match");
            alert.showAndWait();
        }
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Field");
            alert.setHeaderText(null);
            alert.setContentText("Please Fill All Info");
            alert.showAndWait();
        }
    }
    
    public boolean checkall()
    {
        boolean flag = true;
        flag = name.getText().isEmpty() | address.getText().isEmpty() | mo_num.getText().isEmpty() | 
                email.getText().isEmpty() |  password.getText().isEmpty() |
                password1.getText().isEmpty() | dob.getEditor().getText().isEmpty();
        
        //System.out.println("\n\nFlag\t"+flag);
        
        return flag;
    }

    @FXML
    private void handleEditProfileAction(ActionEvent event) {
    }

    @FXML
    private void handleAddAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/reciever_operations/Add_Reciever.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Add Reciever");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleUpdateAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/reciever_operations/Update_Reciever.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Update Reciever");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleDeleteAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/reciever_operations/Delete_Reciever.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Delete Reciever");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleViewAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/reciever_operations/View_Reciever.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("View Reciever");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleEncryptAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/data_operations/Encrypt.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Encrypt File");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleDecryptAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/data_operations/Decrypt.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Decrypt File");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleSendAction(ActionEvent event) {
    }

    @FXML
    private void handleRecieveAction(ActionEvent event) {
    }

    @FXML
    private void handleExitAction(ActionEvent event) 
    {
         try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/Login.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("User Login");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in Edit_ProfileController\t"+ex);
        }
    }
    
}
