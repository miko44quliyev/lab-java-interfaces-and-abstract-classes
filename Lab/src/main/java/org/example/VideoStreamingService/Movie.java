package org.example.VideoStreamingService;

public class Movie extends Video{
    private double rating;
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nRating: "+rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
