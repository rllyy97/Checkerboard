/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author riley
 */
public class CheckerboardMain extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("CheckerboardFXML.fxml"));
        Parent root = fxmlloader.load();
        CheckerboardFXMLController controller = (CheckerboardFXMLController) fxmlloader.getController();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        controller.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
