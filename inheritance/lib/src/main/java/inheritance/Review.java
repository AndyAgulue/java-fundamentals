package inheritance;

public class Review {
    String name;
    String body;
    String reviewer;
    String movie;
   Place place;
    int stars;

    public Review (String body, String reviewer, int rating, Place establishment){
        this.body = body;
        this.reviewer = reviewer;
        this.stars = stars;
        this.name = null;
        this.movie = null;
        this.place = establishment;
    }

    public String toString(){
        String message1 = String.format("Name: %s\n, Reviewer: %s\n, Rating: %d",
                name, body, reviewer, stars);
        String message2 = String.format("Name: %s\n, Review: %s\n, Reviewer: %s\n, Rating: %d\n, Movie: %s",
                name, body, reviewer, stars, movie);
        return place == Place.Theater ? message2 : message1;

    }
}
