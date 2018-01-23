/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    CheckerBoard checkerBoard;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // nothing really
    }    
    
    public void start() {
        getDimensions();
        this.checkerBoard = new CheckerBoard(8,8,this.paneWidth,this.paneHeight);
        boardPane.getChildren().add(checkerBoard.build());
        boardPane.widthProperty().addListener(listener);
        boardPane.heightProperty().addListener(listener);
    }
    
    @FXML
    private void handleColorActionDefault(ActionEvent event) {
        this.checkerBoard = new CheckerBoard(this.checkerBoard.getNumRows(),this.checkerBoard.getNumCols(),this.paneWidth,this.paneHeight);
        boardPane.getChildren().clear();
        boardPane.getChildren().add(checkerBoard.build());
    }
    
    @FXML
    private void handleColorActionBlue(ActionEvent event) {
        this.checkerBoard = new CheckerBoard(this.checkerBoard.getNumRows(),this.checkerBoard.getNumCols(),this.paneWidth,this.paneHeight,Color.SKYBLUE,Color.DARKBLUE);
        boardPane.getChildren().clear();
        boardPane.getChildren().add(checkerBoard.build());
    }
    
    @FXML
    private void handleGridAction16(ActionEvent event) {
        this.checkerBoard = new CheckerBoard(16,16,this.paneWidth,this.paneHeight,this.checkerBoard.getLightColor(),this.checkerBoard.getDarkColor());
        boardPane.getChildren().clear();
        boardPane.getChildren().add(checkerBoard.build());
    }
    
    @FXML
    private void handleGridAction10(ActionEvent event) {
        this.checkerBoard = new CheckerBoard(10,10,this.paneWidth,this.paneHeight,this.checkerBoard.getLightColor(),this.checkerBoard.getDarkColor());
        boardPane.getChildren().clear();
        boardPane.getChildren().add(checkerBoard.build());
    }
    
    @FXML
    private void handleGridAction8(ActionEvent event) {
        this.checkerBoard = new CheckerBoard(8,8,this.paneWidth,this.paneHeight,this.checkerBoard.getLightColor(),this.checkerBoard.getDarkColor());
        boardPane.getChildren().clear();
        boardPane.getChildren().add(checkerBoard.build());
    }
    
    @FXML
    private void handleGridAction3(ActionEvent event) {
        this.checkerBoard = new CheckerBoard(3,3,this.paneWidth,this.paneHeight,this.checkerBoard.getLightColor(),this.checkerBoard.getDarkColor());
        boardPane.getChildren().clear();
        boardPane.getChildren().add(checkerBoard.build());
    }
    
    private void handleResize() {
        getDimensions();
        this.checkerBoard = new CheckerBoard(   this.checkerBoard.getNumRows(),
                                                this.checkerBoard.getNumCols(),
                                                this.paneWidth,
                                                this.paneHeight,
                                                this.checkerBoard.getLightColor(),
                                                this.checkerBoard.getDarkColor());
        boardPane.getChildren().clear();
        boardPane.getChildren().add(checkerBoard.build());
    }
    
    private void getDimensions(){
        this.paneWidth = (int)boardPane.getWidth();
        this.paneHeight = (int)boardPane.getHeight();
    }
    
    InvalidationListener listener = (Observable observable) -> {
        handleResize();
    };
   
}
