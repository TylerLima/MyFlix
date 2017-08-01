package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Tyler Lima on 6/25/2017.
 */

public class RemoveMovie {
    public static void display(){

        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Remove Movie");
        window.setMinHeight(250);
        window.setMinWidth(400);

        Label respond1 = new Label("Is the new movie in the same location as all of the other movies?");
        Button yesBttn = new Button("yes");
        yesBttn.setOnAction(e -> {
            String movieLocation = "C:\\Users\\tyler\\Desktop\\movies\\src\\resources\\";
            System.out.println("Enter new movie location title. i.e. \"Harry Potter and the Sorcerer's Stone.mp4\"");
        });

        Button noBttn = new Button("no");
        noBttn.setOnAction(e -> {
            System.out.println("Enter new movie title location. i.e. C:\\Users\\tyler\\Desktop\\movies\\src\\resources\\" +
                    "\"Harry Potter and the Sorcerer's Stone.mp4");

        });

        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(10, 10 ,10, 10));


        Button cancel = new Button("Cancel");
        cancel.setOnAction(event -> window.close());

        VBox optionBttn = new VBox(cancel);

        VBox movies = new VBox();

//        for (int i = 0; i <movieList ; i++) {}

        layout.setBottom(optionBttn);
        layout.setCenter(movies);

        //initialize scene and display
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        // movie newMovie = new movie(movieTitle, movieLocation, director, movieLength);



    }

}
