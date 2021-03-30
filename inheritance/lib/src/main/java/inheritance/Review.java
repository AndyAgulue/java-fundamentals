package inheritance;

public class Review {
    String body;
    String reviewer;
    int rating;

    public Review (String body, String reviewer, int rating){
        this.body = body;
        this.reviewer = reviewer;
        this.rating = rating;
    }

    public String toString(){
        return String.format("Restaurant review: Body: %s, Reviewer: %s, Rating: %d",
                body, reviewer, rating);
    }
}
