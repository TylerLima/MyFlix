package View;

import Model.Movie;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Tyler Lima on 6/16/2017.
 */

public class AddMovieGuiView {

    public static Movie display(){

        Stage window = new Stage();

        final Movie[] newMovie = new Movie[1];

        //find a way to handle illegal close the window but also return a Movie
        window.setOnCloseRequest(event ->{
            newMovie[0] = new Movie(true);
            window.close();
        });


        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("New Movie");
        window.setMinHeight(250);
        window.setMinWidth(400);


        //TextFields for user input to assign String values to be used in creating a Movie object
        TextField MovieName = new TextField();
        MovieName.setPromptText("Movie Title");

        TextField MovieDirector = new TextField();
        MovieDirector.setPromptText("Director of Movie");

        TextField MovieLeng = new TextField();
        MovieLeng.setPromptText("1.8 (time in hours)");
        //MovieLeng.setPromptText("Movie time length (in hours)");

        TextField MovieLoc = new TextField();
        MovieLoc.setPromptText("Harry Potter 3 and the Prisoner of Azkaban.mp4");

        Button AddButton = new Button("Add Movie");
        AddButton.setOnAction(event ->{
            newMovie[0] = new Movie(false, MovieName.getText(), MovieLoc.getText(), Double.parseDouble(MovieLeng.getText()));
            window.close();
        } );

        Button cancelBttn = new Button("Cancel");
        cancelBttn.setOnAction(e -> {
            newMovie[0] = new Movie(true);
            window.close();
        });

        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(40, 10, 10, 10));

        //adding text fields for creating a new Movie
        VBox textFields = new VBox(10);
        textFields.getChildren().addAll(MovieName, MovieDirector, MovieLoc, MovieLeng);

        HBox submitBttns = new HBox(10,cancelBttn, AddButton);
        submitBttns.setAlignment(Pos.CENTER);

        //Setting the option buttons in the bottom section of the BorderPane and textFields in the center section
        layout.setCenter(textFields);
        layout.setBottom(submitBttns);

        //initialize scene and display
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return newMovie[0];
    }

}
