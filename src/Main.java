import Model.*;
import View.SetupGUI;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.ArrayList;

import static com.sun.org.apache.bcel.internal.util.SecuritySupport.getResourceAsStream;
import static javafx.application.Application.launch;

/**
 * Created by Tyler Lima on 6/12/2017.
 */


public class Main extends Application {

    /**
     *
     * @param args
     *
     * Starts the initial program to run the gui from View
     */
    public static void main(String[] args) throws Exception {

//        Library MainLibrary = new Library();
//        MainLibrary.initializeLibrary();
        //initializeUsers();

        final ArrayList<Movie> emptyMovieList = new ArrayList<>(0);
        final ArrayList<TVShow> emptyTVShowList = new ArrayList<>(0);

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //initializes the movies needed and adds them to the AllMovies arrayList

        primaryStage.setTitle("MyFlix");
        primaryStage.setMaximized(true);
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("f"));
//        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("MyFlixIcon2.ico")));


        //aligning elements and display gui
        BorderPane all = new BorderPane();

        //Create list of users to instantiate MyFlix users
        Users allUsers = new Users();
//        allUsers.instantiateUsers();

//        for (User newUser : allUsers.getAllUsers()) {
//            String username = newUser.toString();
//            System.out.println(newUser);
//
//
//            //TODO: do stuff here eventually; too lazy to figure out exactly what. Good luck future me
//        }

        HBox userAccounts = new HBox(15);

        userAccounts.getChildren().addAll();
        userAccounts.setAlignment(Pos.BOTTOM_CENTER);

        VBox movieList = new VBox(10);

        Text MovieTitle = new Text("Welcome to MyFlix");
        MovieTitle.setFont(javafx.scene.text.Font.font("Verdana", FontWeight.BOLD, 100));
        MovieTitle.setTextAlignment(TextAlignment.CENTER);
        MovieTitle.setFill(Color.WHITE);
        movieList.getChildren().add(MovieTitle);
        movieList.setAlignment(Pos.TOP_CENTER);


        all.setPadding(new Insets(100, 10, 10, 50));
        all.setBottom(userAccounts);
        all.setCenter(movieList);
        Scene scene1 = new Scene(all);
        scene1.setFill(Color.DARKSEAGREEN);
        primaryStage.setScene(scene1);

        primaryStage.show();
    }

    public void getMyFlixLocation(){

    }
}