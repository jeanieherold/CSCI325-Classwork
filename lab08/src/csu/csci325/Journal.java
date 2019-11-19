/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jeanieherold
 */
public class Journal extends Application {
    
    private Button close;
    private Button submit;
    private TextField book;
    private TextField verse;
    private TextField notes;
    private String bookStr;
    private String verseStr;
    private String notesStr;
    private QtimeNote qnote;
    private Qtime entries;
    private Label showEntry;
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Label h1 = new Label("My Quiet Time Journal");
        h1.setId("h1");
        h1.setAlignment(Pos.CENTER);
        
        Label lblBook = new Label("Bible Book:");
        lblBook.setAlignment(Pos.CENTER);
        
        Label lblVerse = new Label("Bible Verse:");
        lblVerse.setAlignment(Pos.CENTER);
        
        Label lblNotes = new Label("Notes:");
        lblNotes.setAlignment(Pos.CENTER);
        
        book = new TextField();
        verse = new TextField();
        notes = new TextField();
        
        submit = new Button("Submit");
        submit.setPadding(new Insets(5));
        submit.setOnAction(new Journal.SubmitHandler());
        

        showEntry = new Label();
        entries = new Qtime(qnote);
        
        GridPane inputs = new GridPane();
        inputs.setAlignment(Pos.TOP_CENTER);
        inputs.setHgap(12);
        inputs.setVgap(12);
        inputs.setPadding(new Insets(10, 10, 10, 10));
        
        inputs.add(lblBook, 0, 0);
        inputs.add(lblVerse, 0, 1);
        inputs.add(lblNotes, 0, 2);
        inputs.add(book, 1, 0);
        inputs.add(verse, 1, 1);
        inputs.add(notes, 1, 2);
        inputs.add(submit, 0, 3);
        
        GridPane.setHalignment(submit, HPos.LEFT);
        
        
        close = new Button("Close Journal");
        close.setPadding(new Insets(5));
        close.setOnAction(new Journal.CloseBtnHandler());
      
        VBox container = new VBox(30, h1, inputs, showEntry, close);
        container.setPadding(new Insets(10));
        container.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(container, 700, 500);
        scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Actor");
        scene.getStylesheets().add("journal.css");
        
        primaryStage.setTitle("My Bible Journal");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    
    //Event Handlers 
    
    //close the stage window
    class CloseBtnHandler implements EventHandler<ActionEvent> {
        
        @Override
        public void handle(ActionEvent event) {
            close.getScene().getWindow().hide();
        }
    }
    class SubmitHandler implements EventHandler<ActionEvent> {
        
        @Override
        public void handle(ActionEvent event) {
            bookStr = book.getText();
            verseStr = verse.getText();
            notesStr = notes.getText();
            qnote = new QtimeNote(bookStr, verseStr, notesStr);
            System.out.println(qnote.getDate());
            System.out.println(qnote.getBookOfBible());
            System.out.println(qnote.getVerseRef());
            System.out.println(qnote.getUserNotes());
            
            entries.setNote(qnote);
            
//            showEntry.setText(entries.getNoteList());

            System.out.println(entries.toString());
            
            //reset for next entry
            book.clear();
            verse.clear();
            notes.clear();
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
