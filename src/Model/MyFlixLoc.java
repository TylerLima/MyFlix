package Model;

/**
 * Created by Tyler Lima on 7/19/2017.
 */

public class MyFlixLoc {

    String MyFlixLocation = "C:\\Users\\tyler\\Desktop\\PersonalProjects\\Java\\MyFlix";

    public MyFlixLoc(String MyFlixLocation){
        this.MyFlixLocation = MyFlixLocation;
    }

    public String getMyFlixLocation() {
        return MyFlixLocation;
    }

    public void setMyFlixLocation(String myFlixLocation) {
        MyFlixLocation = myFlixLocation;
    }

}
