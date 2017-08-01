package View;

import Model.Movie;
import Model.MyFlixLoc;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by Tyler Lima on 7/10/2017.
 */
public class SetupGUI {
    public static String display(){
        Stage window = new Stage();

        final String[] MovieLocation = {"C:\\Users\\tyler\\Desktop\\PersonalProjects\\Java\\MyFlix"};
        String MyflixLocation = "C:\\Users\\tyler\\Desktop\\PersonalProjects\\Java\\MyFlix";

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("All Movies");
        window.setMinHeight(250);
        window.setMinWidth(400);

        Label respond1 = new Label("Where are you running MyFlix from?");

        //TODO: figure out why i can't instantiate a location object here
        //MyFlixLoc MyflixLocation = new MyFlixLoc("C:\\Users\\tyler\\Desktop\\PersonalProjects\\Java\\MyFlix");

        Button seagateBttn = new Button("Seagate Expansion drive");
        seagateBttn.setOnAction(e -> {
            MovieLocation[0] = "E:\\MyFlix";
//            MyflixLocation.setMyFlixLocation("E:\\MyFlix");
            window.close();
        });

        Button computerBttn = new Button("My computer");
        computerBttn.setOnAction(e -> {
            MovieLocation[0] = "C:\\Users\\tyler\\Desktop\\PersonalProjects\\Java\\MyFlix";
//            MyflixLocation.setMyFlixLocation("C:\\Users\\tyler\\Desktop\\PersonalProjects\\Java\\MyFlix");
            window.close();
        });

        Button wifiBttn = new Button("MyFlix on \"Protected\" Wifi");
        wifiBttn.setOnAction(event -> {
            MovieLocation[0] = "This PC\\R7000\\Video\\Folders\\MyFlix";
//            MyflixLocation.setMyFlixLocation("This PC\\R7000\\Video\\Folders\\MyFlix");
            window.close();
        });

        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(30, 40 ,10, 40));


        Button cancel = new Button("Exit");
        cancel.setOnAction(event -> window.close());

        VBox question = new VBox(10, respond1);
        HBox optionBttn = new HBox(10, computerBttn, seagateBttn, wifiBttn);
        VBox mainStuff = new VBox(15, question, optionBttn);

        ArrayList<Movie> AllMovies = new ArrayList<Movie>();

        //initialize All Movies in our system
        for (int i = 0; i <AllMovies.size() ; i++) {
            Text A1 = new Text(AllMovies.get(i).getTitle());
            question.getChildren().add(A1);
        }


        layout.setCenter(mainStuff);
        layout.setBottom(cancel);

        //initialize scene and display
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return MovieLocation[0];

    }
}
