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
import javafx.scene.paint.Color;

/**
 *
 * @author riley
 */
public class CheckerboardFXMLController implements Initializable {

    @FXML private MenuBar menuBar;
    @FXML private Pane boardPane;
    
    private int paneWidth;
    private int paneHeight;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // nothing really
    }    
    
    public void start() {
        this.paneWidth = (int)boardPane.getWidth();
        this.paneHeight = (int)boardPane.getHeight();
        CheckerBoard checkerBoard = new CheckerBoard(8,8,this.paneWidth,this.paneHeight);
        boardPane.getChildren().add(checkerBoard.build());
    }
    
    @FXML
    private void handleColorActionDefualt(ActionEvent event) {
        
    }
    
    @FXML
    private void handleColorActionBlue(ActionEvent event) {

    }
    
    @FXML
    private void handleGridAction16(ActionEvent event) {

    }
    
    @FXML
    private void handleGridAction10(ActionEvent event) {

    }
    
    @FXML
    private void handleGridAction8(ActionEvent event) {

    }
    
    @FXML
    private void handleGridAction3(ActionEvent event) {

    }
    
    private void handleResize(ActionEvent event) {
        
    }
}
