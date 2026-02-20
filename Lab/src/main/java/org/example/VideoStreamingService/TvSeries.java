package org.example.VideoStreamingService;

public class TvSeries extends Video{
    private int episodes;
    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }
    @Override
    public String getInfo() {
        return super.getInfo()+"\nEpisodes: "+episodes;
    }
    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
