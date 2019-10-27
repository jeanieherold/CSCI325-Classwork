/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author jeanieherold
 */
public class GameBoard extends Application {
    
    //GameBoard fields
    private static final int NUM_SQUARES = 25;
    private static final int NUM_PER_ROW = 5;
    

    //GameBoard methods
    private Parent createContent() {
        //set the window scene and size
        Pane root = new Pane();
        root.setPrefSize(800,500);
        
        //learning with letters but will be using other objects later
        char c = 'A';
        //add tiles to the board
        List<Tile> tiles = new ArrayList<>();
        for (int i = 0; i < NUM_SQUARES; i++) {
            
            //arg is casting char to a String but could also do new Tile(c + "");
            tiles.add(new Tile(String.valueOf(c)));
            //increasing the value of a char will increase its ascii value adn become the next letter in the ascii chart;
            c++;
        }
        
        //shuffle the tiles
        Collections.shuffle(tiles);
        
        //display the tiles
        for (int i = 0; i < tiles.size(); i++) {
            //get the tile at i
            Tile tile = tiles.get(i);
            //place the tile at the position you want
            tile.setTranslateX(75 * (i % NUM_PER_ROW));
            tile.setTranslateY(75 * (i / NUM_PER_ROW));
            
            //add tiles to the scene graph
            root.getChildren().add(tile);
        }
        
        return root;
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        VBox container = new VBox(20, createContent());
        container.setAlignment(Pos.CENTER);
        container.setPadding(new Insets(20));
        
        Scene scene = new Scene(container);
        
        primaryStage.setTitle("RPG Game Board");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //CLASSES (used in the methods above the start)
    
    //use stackpane when we need to stack items
    private class Tile extends StackPane {
        
        //constructor
        public Tile(String value) {
            //border for each tile - rect with no fill
            Rectangle border = new Rectangle(75,75);
            //removes color from rectangle
            border.setFill(null);
            //add border color to each tile
            border.setStroke(Color.BLACK);
            
            //text for learning - change to object or image... not sure yet
            Text text = new Text(value);
            text.setFont(Font.font(30));
            
            //centers everything within the stackpane (single tile)
            setAlignment(Pos.CENTER);
            
            getChildren().addAll(border, text);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
