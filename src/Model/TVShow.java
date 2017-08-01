package Model;

/**
 * Created by Tyler Lima on 6/25/2017.
 */


public class TVShow {

    private String showName;
    private int numbOfSeasons;
    private int numbOfEpisodes;

    public TVShow(String showName, int numbOfSeasons, int numbOfEpisodes ){
        this.showName = showName;
        this.numbOfSeasons = numbOfSeasons;
        this.numbOfEpisodes = numbOfEpisodes;

    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowName() {
        return showName;
    }

    public void setNumbOfSeasons(int numbOfSeasons) {
        this.numbOfSeasons = numbOfSeasons;
    }

    public int getNumbOfSeasons() {
        return numbOfSeasons;
    }

    public void setNumbOfEpisodes(int numbOfEpisodes) {
        this.numbOfEpisodes = numbOfEpisodes;
    }

    public int getNumbOfEpisodes() {
        return numbOfEpisodes;
    }

}
