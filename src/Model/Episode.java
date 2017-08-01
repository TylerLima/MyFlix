package Model;

/**
 * Created by Tyler Lima on 6/20/2017.
 */


public class Episode {
    private String episodeTitle;
    private String tvShow;
    private int episodeNumber;
    private int episodeSeason;

    public Episode(String episodeTitle, String tvShow, int episodeSeason, int episodeNumber){
        this.episodeTitle = episodeTitle;
        this.tvShow = tvShow;
        this.episodeSeason = episodeSeason;
        this.episodeNumber = episodeNumber;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public String getTvShow() {
        return tvShow;
    }

    public int getEpisodeSeason() {
        return episodeSeason;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

}

