package Model;

import View.SetupGUI;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by Tyler Lima on 6/12/2017.
 */


public class Library {

    private String myflixLocation = SetupGUI.display() ;
    //    String myflixLocation = "C:\\Users\\tyler\\Desktop\\PersonalProjects\\Java\\MyFlix";
    FileWriter out = new FileWriter(myflixLocation + "\\videoFileInfo.txt");
    private File UsersInfoFile = new File( myflixLocation + "\\videoFileInfo.txt");
    private String MyFlixLoc = myflixLocation;
    private ArrayList<Movie> AllMovies = new ArrayList<Movie>();
    private ArrayList<TVShow> AllTVShows = new ArrayList<>();

    public Library() throws IOException {
    }

    public String getMyflixLocation() {
        return myflixLocation;
    }

    public void initializeLibrary() throws IOException {

        instantiateMovies();
        instantiateTVShows();

    }


    public ArrayList<Movie> getAllMovies() {
        return AllMovies;
    }

    public void setAllMovies(ArrayList<Movie> allMovies) {
        AllMovies = allMovies;
    }

    private void instantiateMovies() throws IOException {
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter(".mp4", ".mkv");

        File AllMovies = new File (MyFlixLoc + "\\resources\\Movies");

        int totalMovies = 0;
        for (File child : AllMovies.listFiles()){

            //System.out.println(child);
            out.write(child.toString());
            totalMovies++;

        }
        System.out.println("Movies: " + totalMovies);
    }

    private void instantiateTVShows() throws IOException{

        File AllShows = new File (MyFlixLoc + "\\resources\\TV Shows");
        int totalShows = 0;
        int totalEpisodes = 0;

        for (File show : AllShows.listFiles()){
            UsersInfoFile.canWrite();
            totalShows++;

            for (File season : show.listFiles()){

                for (File episode : season.listFiles()) {
                    System.out.println(episode);
                    totalEpisodes++;

                }
            }

        }
        System.out.println("Shows: " + totalShows);
        System.out.println("Episodes: " + totalEpisodes);
    }


    public static void refresh() {

//        String loc;
//
//        for (int i = 0; i < allMovies.size() ; i++) {
//
//            //keeping track of how many Movies are left to be refreshed
//            System.out.println(unrefreshedMovies.size());
//
//            //file location string
//            loc = "E:\\MyFlix\\Movies\\" + (allMovies.get(i).getFileLocationName());
//
//            try {
//                System.out.println(allMovies.get(i).getTitle() + " being refreshed...");
//                //executes the vlc player and opening Movie title starting that Movie
//                ProcessBuilder builder = new ProcessBuilder(
//                        //file location of vlc.exe
//                        "C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe", loc);
//                Process start = builder.start();
//
//                TimeUnit.SECONDS.sleep(10);
//
//                Runtime rt2 = Runtime.getRuntime();
//                rt2.exec("taskkill /IM vlc.exe");
//
//                unrefreshedMovies.remove(allMovies.get(i));
//
//            } catch (Exception e) {
//                System.out.println(e);
//                return;
//
//            }
//
//        }
//        if (unrefreshedMovies.size() != 0){
//            System.out.println("something went wrong not all Movies were refreshed");
//        }

    }

}
