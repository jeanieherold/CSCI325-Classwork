/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jeanieherold
 */
public class Flags extends Application {
    
    Button amerFlagBtn = new Button("American Flag");
    Button canFlagBtn = new Button("Canadian Flag");
    Button fraFlagBtn = new Button("French Flag");
    Button germFlagBtn = new Button("German Flag");
    Button mexFlagBtn = new Button("Mexican Flag");

    //put images in memory
    Image amerFlag = new Image("file:flags/America.png");
    Image canFlag = new Image("file:flags/Canada.png");
    Image fraFlag = new Image("file:flags/France.png");
    Image germFlag = new Image("file:flags/German.png");
    Image mexFlag = new Image("file:flags/Mexico.png");

    //put flags in an array
    Image[] flags = new Image[5];

    ImageView flagView;
        
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
    @Override
    public void start(Stage primaryStage) {
        //set up controls
        Label select = new Label("Select Button to Display a Flag.");
        flags[0] = amerFlag;
        flags[1] = canFlag;
        flags[2] = fraFlag;
        flags[3] = germFlag;
        flags[4] = mexFlag;
        
       
        flagView = new ImageView();
        flagView.setFitWidth(300);
        flagView.setFitHeight(175);
        
        amerFlagBtn.setOnAction(new AmerFlagBtnHandler());
        canFlagBtn.setOnAction(new CanFlagBtnHandler());
        fraFlagBtn.setOnAction(new FraFlagBtnHandler());
        germFlagBtn.setOnAction(new GermFlagBtnHandler());
        mexFlagBtn.setOnAction(new MexFlagBtnHandler());
        
        //put flag btns in a VBox
        VBox vboxBtns = new VBox(10, amerFlagBtn, canFlagBtn, fraFlagBtn, germFlagBtn, mexFlagBtn);
        
        //make a hbox for the flag display
        VBox vboxAll = new VBox(25, select, flagView, vboxBtns);
        
        //set some styles
        amerFlagBtn.setMinWidth(120);
        canFlagBtn.setMinWidth(120);
        fraFlagBtn.setMinWidth(120);
        germFlagBtn.setMinWidth(120);
        mexFlagBtn.setMinWidth(120);
        
        vboxAll.setPadding(new Insets(20));
        
        vboxAll.setAlignment(Pos.CENTER);
        vboxBtns.setAlignment(Pos.CENTER);
        
        //create a scene
        Scene scene = new Scene(vboxAll, 700, 500);
        
        //add scene to the stage
        primaryStage.setScene(scene);
        
        //set stage title
        primaryStage.setTitle("Flags Across the Globe");
        
        //show the window
        primaryStage.show(); 
    }
        
    //Button Event Handlers - note they are classes so instatiated with 'new' keyword
    class AmerFlagBtnHandler implements EventHandler<ActionEvent> {
        
        @Override
        public void handle(ActionEvent event) {
            flagView.setImage(flags[0]);
        }
    }
    class CanFlagBtnHandler implements EventHandler<ActionEvent> {
        
        @Override
        public void handle(ActionEvent event) {
            flagView.setImage(flags[1]);
        }
    }
    class FraFlagBtnHandler implements EventHandler<ActionEvent> {
        
        @Override
        public void handle(ActionEvent event) {
            flagView.setImage(flags[2]);
        }
    }
    class GermFlagBtnHandler implements EventHandler<ActionEvent> {
        
        @Override
        public void handle(ActionEvent event) {
            flagView.setImage(flags[3]);
        }
    }
    class MexFlagBtnHandler implements EventHandler<ActionEvent> {
        
        @Override
        public void handle(ActionEvent event) {
            flagView.setImage(flags[4]);
        }
    }
    
}
