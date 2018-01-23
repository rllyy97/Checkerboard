/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.Pane;

/**
 *
 * @author riley
 */
public class CheckerboardFXMLController implements Initializable {

    @FXML private MenuBar menuBar;
    @FXML private Pane boardPane;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    public void getDimensions() {
        System.out.println("Width: " + boardPane.getWidth());
        System.out.println("Height: " + boardPane.getHeight());
    }
    
    @FXML
    private void handleColorActionDefualt(ActionEvent event) {
        System.out.println("DEFUALT");
    }
    
    @FXML
    private void handleColorActionBlue(ActionEvent event) {
        System.out.println("BLUE");
    }
    
    @FXML
    private void handleGridAction16(ActionEvent event) {
        System.out.println("16");
    }
    
    @FXML
    private void handleGridAction10(ActionEvent event) {
        System.out.println("10");
    }
    
    @FXML
    private void handleGridAction8(ActionEvent event) {
        System.out.println("8");
    }
    
    @FXML
    private void handleGridAction3(ActionEvent event) {
        System.out.println("3");
    }
    
}
