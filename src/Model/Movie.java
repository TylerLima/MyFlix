package Model;

/**
 * Created by Tyler Lima on 6/12/2017.
 */

public class Movie {

    private String title, fileLocationName, Director;
    private double movieLength;
    private boolean canceled;

    public Movie(boolean canceled){
        this.canceled = canceled;
    }

    public Movie(boolean canceled, String title, String fileLocationName, double movieLength){

        this.canceled = canceled;
        this.title = title;
        this.fileLocationName = fileLocationName;
    }

    public Movie(boolean canceled, String title, String fileLocationName, String Director, double movieLength){

        this.canceled = canceled;
        this.title = title;
        this.fileLocationName = fileLocationName;
        this.Director = Director;
        this.movieLength = movieLength;
    }

    public double getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(double movieLength) {
        this.movieLength = movieLength;
    }

    public boolean isCanceled(){
        return canceled;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileLocationName() {
        return fileLocationName;
    }

    public void setFileLocationName(String fileLocationName) {
        this.fileLocationName = fileLocationName;
    }

}
