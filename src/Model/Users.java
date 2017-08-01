package Model;

import View.SetupGUI;
import com.sun.xml.internal.bind.v2.model.runtime.RuntimeMapPropertyInfo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.*;
import java.util.List;
import java.util.SplittableRandom;


/**
 * Created by Tyler Lima on 6/26/2017.
 */

public class Users {

    private ArrayList<User> allUsers;

    public void instantiateUsers(){
        try {



            //create array list of users from UsersInfo text file storing users info in csv format
            ArrayList<String> linesOfUsers = (ArrayList<String>) Files.readAllLines(Paths.get( "\\UsersInfo"));

            for (String line:linesOfUsers) {
                line.split(",");
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public ArrayList<User> getAllUsers() {
        return allUsers;
    }
}
