/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author riley
 */
public class CheckerBoard {
    
    private int numRows;
    private int numCols;
    private double boardWidth;
    private double boardHeight;
    private Color lightColor;
    private Color darkColor;
    private double rectangleWidth;
    private double rectangleHeight;
    private AnchorPane anchorPane;
    
    public CheckerBoard(int numRows, int numCols, double boardWidth, double boardHeight){
        this(numRows,numCols,boardWidth,boardHeight,Color.RED,Color.BLACK);
    }
    
    public CheckerBoard(int numRows, int numCols, double boardWidth, double boardHeight, Color lightColor, Color darkColor){
        this.numRows = numRows;
        this.numCols = numCols;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.lightColor = lightColor;
        this.darkColor = darkColor;
    }
    
    public AnchorPane build(){
        this.rectangleWidth = this.boardWidth/this.numCols;
        this.rectangleHeight = this.boardHeight/this.numRows;
        AnchorPane builtAnchorPane = new AnchorPane();
        int i,j;
        for(i=0;i<numRows;i++)
            for(j=0;j<numCols;j++){
                Rectangle rectangle = new Rectangle(j*rectangleWidth,i*rectangleHeight,rectangleWidth,rectangleHeight);
                if((i+j)%2 == 0)
                    rectangle.setFill(lightColor);
                else
                    rectangle.setFill(darkColor);
                builtAnchorPane.getChildren().add(rectangle);
            }
        this.anchorPane = builtAnchorPane;
        return this.anchorPane;
    }
    
    public AnchorPane getBoard(){
        return this.anchorPane;
    }
    
    public int getNumRows(){ return this.numRows; }
    public int getNumCols(){ return this.numCols; }
    public double getBoardWidth(){ return this.boardWidth; }
    public double getBoardHeight(){ return this.boardHeight; }
    public Color getLightColor(){ return this.lightColor; }
    public Color getDarkColor(){ return this.darkColor; }
    public double getRectangleWidth(){ return this.rectangleWidth; }
    public double getRectangleHeight(){ return this.rectangleHeight; }
    
}
