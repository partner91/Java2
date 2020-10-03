/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author programer10
 */
public class UsersController implements Initializable {

    @FXML
    private Label lbFirstNameError;
    @FXML
    private Label lbLastNameError;
    @FXML
    private TextField tfFirstName;
    @FXML
    private TextField tfLastName;
    @FXML
    private ComboBox<?> cbAge;
    @FXML
    private TextArea taInfo;
    @FXML
    private RadioButton rbFemale;
    @FXML
    private ToggleGroup tgGender;
    @FXML
    private RadioButton rbMale;
    @FXML
    private CheckBox chbSingle;
    @FXML
    private ListView<?> lvUsers;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void add() {
        
    }
    @FXML
    private void update() {
        
    }
    @FXML
    private void delete() {
        
    }
    
    
    
}