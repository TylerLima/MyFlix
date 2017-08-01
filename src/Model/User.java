package Model;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyler Lima on 6/20/2017.
 */


public class User {

    private String userName;
    private String userPassword;
    private String maturityLevel;
    private ArrayList<Movie> usersAllList = new ArrayList<>();
    private ArrayList<Movie> usersMovieList = new ArrayList<>();
    private ArrayList<TVShow> usersShowList = new ArrayList<>();

    //lack a password for entering account
    public User(String userName, String maturityLevel, ArrayList usersAllList, ArrayList usersMovieList, ArrayList usersShowList){

        this.userName = userName;
        this.maturityLevel = maturityLevel;
        this.usersAllList = usersAllList;
        this.usersMovieList = usersMovieList;
        this.usersShowList = usersShowList;
    }

    public User(String userName, String maturityLevel, String userPassword, ArrayList usersAllList, ArrayList usersMovieList, ArrayList usersShowList){

        this.userName = userName;
        this.userPassword = userPassword;
        this.maturityLevel = maturityLevel;
        this.usersAllList = usersAllList;
        this.usersMovieList = usersMovieList;
        this.usersShowList = usersShowList;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setMaturityLevel(String maturityLevel) {
        this.maturityLevel = maturityLevel;
    }

    public String getMaturityLevel(){
        return maturityLevel;
    }

    public void setUsersMovieList(ArrayList<Movie> usersMovieList) {
        this.usersMovieList = usersMovieList;
    }

    public ArrayList<Movie> getUsersMovieList() {
        return usersMovieList;
    }

    public void setUsersShowList(ArrayList<TVShow> usersShowList) {
        this.usersShowList = usersShowList;
    }

    public ArrayList<TVShow> getUsersShowList() {
        return usersShowList;
    }

    public void setUsersAllList(ArrayList<Movie> usersAllList) {
        this.usersAllList = usersAllList;
    }

    public ArrayList<Movie> getUsersAllList() {
        return usersAllList;
    }



}
