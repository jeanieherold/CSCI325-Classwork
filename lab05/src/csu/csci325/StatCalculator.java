/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jeanieherold
 */
public class StatCalculator extends Application {
    
    private TextField numbers;
    private Label results;
    private Button close;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        Label directions = new Label("Enter your data separated by a comma, then select function to perform.");
        Label example = new Label("Ex: 12, 4,7, 32,3");
        VBox vboxDirections = new VBox(10, directions, example);
        vboxDirections.setAlignment(Pos.CENTER);
        
        Label data = new Label("Data:");
        numbers = new TextField();
        Button mean = new Button("Calculate Mean");
        Button median = new Button("Calculate Median");
        Button mode = new Button("Calculate Mode");
        Button meanMediMode = new Button("Calculate Mean, Median, and Mode");
        close = new Button("Close");
        
        //button handlers
        mean.setOnAction(new CalculateMeanHandler());
        median.setOnAction(new CalculateMedianHandler());
        mode.setOnAction(new CalculateModeHandler());
        meanMediMode.setOnAction(new CalculateMeanMedianModeHandler());
        close.setOnAction(new CloseHandler());
        
        results = new Label();
        
        HBox hboxRow1Btns = new HBox(10, data, numbers, mean, median, mode);
        hboxRow1Btns.setAlignment(Pos.CENTER);
        
        HBox hboxRow2Btns = new HBox(10, meanMediMode, close);
        hboxRow2Btns.setAlignment(Pos.CENTER);
        
        
        VBox vboxAll = new VBox(10, vboxDirections, hboxRow1Btns, hboxRow2Btns, results);
        vboxAll.setPadding(new Insets(20));
        vboxAll.setAlignment(Pos.CENTER);
         
         
        Scene scene = new Scene(vboxAll, 800, 500);
        
        //set scene on stage
        primaryStage.setTitle("Statistics Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    //Button Event Handlers - note they are classes so instatiated with 'new' keyword
    
    //calc mean
    class CalculateMeanHandler implements EventHandler<ActionEvent> {
        
        private ArrayList<Double> doubleNums = new ArrayList<>();
        
        @Override
        public void handle(ActionEvent event) {
            //get the numbers as array of numbers
            List<String> nums = Arrays.asList(numbers.getText().split("\\s*,\\s*"));
            
            //convert to doubles    
            for (int i = 0; i < nums.size(); i++) {
                doubleNums.add(Double.parseDouble(nums.get(i)));
            }
            
            Mean mean = new Mean(doubleNums);
            
            //display results
            results.setText("Mean: " + String.format("%,.2f", mean.calculateMean()));
            
            //empty the list so clear for next event
            doubleNums.clear();
        }
    }
    
    //calc median
    class CalculateMedianHandler implements EventHandler<ActionEvent> {
        
        private ArrayList<Double> doubleNums = new ArrayList<>();
        
        @Override
        public void handle(ActionEvent event) {
            //get the numbers as array of numbers
            List<String> nums = Arrays.asList(numbers.getText().split("\\s*,\\s*"));
            
            //convert to doubles
            for (int i = 0; i < nums.size(); i++) {
                doubleNums.add(Double.parseDouble(nums.get(i)));
            }

            Median median = new Median(doubleNums);
            
            results.setText("Median: " + median.calculateMedian());
            
            //empty the arraylist to ready for next set of data
            doubleNums.clear();
        }
    }
    
    //calc mode
    class CalculateModeHandler implements EventHandler<ActionEvent> {
        
        private ArrayList<Double> doubleNums = new ArrayList<>();
        
        @Override
        public void handle(ActionEvent event) {

            //get the numbers as array of numbers
            List<String> nums = Arrays.asList(numbers.getText().split("\\s*,\\s*"));
            
            for (int i = 0; i < nums.size(); i++) {
                doubleNums.add(Double.parseDouble(nums.get(i)));
            }
            
            Mode mode = new Mode(doubleNums);

            //display results
            results.setText("Mode: " + mode.calculateMode());
            
            //remove all items in the doubleNums for next button click
            doubleNums.clear(); 
        }
    }
    
    //calc mean median and mode
    class CalculateMeanMedianModeHandler implements EventHandler<ActionEvent> {
        
        private ArrayList<Double> doubleNums = new ArrayList<>();
            
        
        @Override
        public void handle(ActionEvent event) {

            //get the numbers as array of numbers
            List<String> nums = Arrays.asList(numbers.getText().split("\\s*,\\s*"));
            
            for (int i = 0; i < nums.size(); i++) {
                doubleNums.add(Double.parseDouble(nums.get(i)));
            }
            
            Mean mean = new Mean(doubleNums);
            Median median = new Median(doubleNums);
            Mode mode = new Mode(doubleNums);
            
            results.setText("Mean: " + String.format("%,.2f", mean.calculateMean())
                    + "\nMedian: " + median.calculateMedian()
                    + "\nMode: " + mode.calculateMode());
            
            //remove all items in the doubleNums for next button click
            doubleNums.clear(); 
        }
    }
    
    //close the stage window
    class CloseHandler implements EventHandler<ActionEvent> {
        
        @Override
        public void handle(ActionEvent event) {
            close.getScene().getWindow().hide();
        }
    }
    
}
