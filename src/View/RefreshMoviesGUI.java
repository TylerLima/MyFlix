package View;

import Controller.LibraryControls;
import Model.Library;
import Model.Movie;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by Tyler Lima on 6/26/2017.
 */


public class RefreshMoviesGUI {

    private Stage window;
    private ArrayList<Movie> AllMovies = new ArrayList<Movie>();
    private ArrayList<Movie> UnrefreshedMovies = new ArrayList<Movie>();


    public void display() {

        //initializes the Movies needed and adds them to the AllMovies arrayList
        Stage window = new Stage();
        window.setTitle("MyFlix");

        //Buttons and setting their on events
        Button addMovie = new Button("Add a Movie");
        Button removeMovie = new Button("Remove a Movie");
        Button refreshBttn = new Button("Refresh Movies");
        Button assembleMovies = new Button("Assemble Movies");

        addMovie.setOnAction(e -> {
            Movie newMovie = AddMovieGuiView.display();

            if(!newMovie.isCanceled()){

                AllMovies.add(newMovie);
                UnrefreshedMovies.add(newMovie);

                BorderPane newAll = new BorderPane();

                HBox MovieBttns = new HBox(15);
                MovieBttns.getChildren().addAll(refreshBttn, addMovie, removeMovie, assembleMovies);
                MovieBttns.setAlignment(Pos.BOTTOM_CENTER);

                VBox MovieList = new VBox(10);

                Text MovieTitle = new Text("Movies");
                MovieTitle.setFont(javafx.scene.text.Font.font("Verdana", FontWeight.BOLD, 40));
                MovieTitle.setUnderline(true);

                MovieList.getChildren().add(MovieTitle);

                //initialize All Movies in our system
                for (int i = 0; i <AllMovies.size() ; i++) {
                    Text A1 = new Text(AllMovies.get(i).getTitle());
                    MovieList.getChildren().add(A1);
                }

                newAll.setPadding(new Insets(10, 10, 10, 50));
                newAll.setBottom(MovieBttns);
                newAll.setCenter(MovieList);
//                Scene scene2 = new Scene(newAll,500, 600);
//                window.setScene(scene2);
//                window.show();

                Scene newScene = new Scene(newAll,500, 600 );
                window.setScene(newScene);
            }
            if (UnrefreshedMovies.size() == 0){
                System.out.println("no Movie added to MyFlix");

            }else if (UnrefreshedMovies.size() == 1){
                System.out.println("Movie added to MyFlix properly");
            }
        });

        removeMovie.setOnAction(e -> {
            RemoveMovie.display();
        });

        refreshBttn.setOnAction(event -> LibraryControls.refresh());

        assembleMovies.setOnAction(event -> LibraryControls.findMovies());

        //aligning elements and display gui
        BorderPane all = new BorderPane();

        HBox MovieBttns = new HBox(15);
        MovieBttns.getChildren().addAll(refreshBttn, addMovie, removeMovie, assembleMovies);
        MovieBttns.setAlignment(Pos.BOTTOM_CENTER);

        VBox MovieList = new VBox(10);

        Text MovieTitle = new Text("Movies");
        MovieTitle.setFont(javafx.scene.text.Font.font("Verdana", FontWeight.BOLD, 40));
        MovieTitle.setUnderline(true);
//        MovieTitle.setFill(javafx.scene.paint.Color.BLUE);
        MovieList.getChildren().add(MovieTitle);

        //initialize All Movies in our system
        for (int i = 0; i <AllMovies.size() ; i++) {
            Text A1 = new Text(AllMovies.get(i).getTitle());
            MovieList.getChildren().add(A1);
        }

        all.setPadding(new Insets(10, 10, 10, 50));
        all.setBottom(MovieBttns);
        all.setCenter(MovieList);
        Scene scene1 = new Scene(all,500, 600);
        window.setScene(scene1);
        window.show();
    }


}

