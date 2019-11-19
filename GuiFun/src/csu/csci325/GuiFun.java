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
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jeanieherold
 */
public class GuiFun extends Application {
    //declare text fields here so event handlers can get to them from both places
    private TextField kiloTextField;
    //result label also needs to be accessible by event handler so goes here at top
    private Label resultLabel;
    
    @Override
    public void start(Stage primaryStage) {
        
        // 1. ADD CONTROLS NEEDED
        
        //create a label to display a prompt
        Label promptLabel = new Label("Enter a distance in kilometers");
        
        //create a text field so user can input things
        kiloTextField = new TextField();
        
        //create a button to perform the conversion
        Button calcButton = new Button("Convert");
        // **linking eventhandler code to this button called 'Registering the event handler'
        // associate each event to appropriate event handler as needed
        // register calcButton event handler:
        calcButton.setOnAction(new CalcButtonHandler());
        
        //create an empty label to display result - placeholder for our results output
        //instatiate with no text - is not visible until the event handler fires in convert button
        resultLabel = new Label();
        
        //put the promptLabel and the kiloTextField in an HBox
        //remember the 10 is spacing (margin between elements)
        HBox hbox = new HBox(10, promptLabel, kiloTextField);
        
        //put hbox, calcButton and resultLabel in a VBox
        VBox vbox = new VBox(15, hbox, calcButton, resultLabel);
        
        // 2. SET SOME STYLES
        
        //set vbox padding to 10px (think of padding in a div - the margin between the elements in the vbox div is set when hbox 
        // and vbox are created with the spacing param )
        vbox.setPadding(new Insets(15));
        
        //set alignment to center
        vbox.setAlignment(Pos.CENTER);
        
        // 3. SET SCENE
        
        // create a scene
        Scene scene = new Scene(vbox);
        
        // 4. SET THE STAGE    
        primaryStage.setTitle("Kilometer Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    // 5. Event Handlers - note they are classes so instatiated with 'new' keyword
    class CalcButtonHandler implements EventHandler<ActionEvent> {
        
        @Override
        public void handle(ActionEvent event) {
            
            // a. get the kilometers
            //the following parses the String entered in the text field to a double that we can use for math
            Double kilometers = Double.parseDouble(kiloTextField.getText());
            
            // b. convert the kilometers to miles
            Double miles = kilometers * 0.6214;
            
            // c. display the results - we are setting the text we want in the resultLabel that lives under the convert button
            // also formatting the result string to be displayed - .2 tells how many decimal places to format 'f' is for floating point
            // ** note - go checkout more about formatting**
            resultLabel.setText(String.format("%,.2f miles", miles));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
